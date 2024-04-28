package PRACTICAS.practica03.Ejercicio4;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class App {

    public static ArrayList<Libro> librosBiblioteca = new ArrayList<Libro>();
    public static ArrayList<Autor> autoresLibros = new ArrayList<Autor>();
    public static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    public static ArrayList<Prestamo> prestamosLibros = new ArrayList<Prestamo>();

    public static void main(String[] args) {
        int opcion=0;
        while (true) {
            opcion=EntradaNumeroEntero(
                "Menu:\n"+
                "1) Ingresar nuevo libro al sistema\n"+
                "2) Ingresar nuevo Autor\n"+
                "3) Ingresar nuevo Usuario\n"+
                (((librosBiblioteca.size()>0 && usuarios.size()>0)) ? "4) Solicitar prestamo de un libro\n":"")+
                ((prestamosLibros.size()>0)?"5) Devolucion de libro\n":"")+
                "0) Salir programa"
            );
            if (opcion==0){
                break;
            }else if (opcion==1){
                nuevoLibro();
            }else if (opcion==2){
                NuevoAutor();
            }else if (opcion==3){
                NuevoUsuario();
            }else if (opcion==4 && librosBiblioteca.size()>0 && usuarios.size()>0){
                NuevoPrestamo();
            }else if (opcion==5 && prestamosLibros.size()>0){
                DevolverLibro();
            }else if ((opcion==4 && librosBiblioteca.size()<=0 && autoresLibros.size()<=0) || (opcion==5 && prestamosLibros.size()<=0)){
                JOptionPane.showMessageDialog(null,"Ingrese una opcion valida");
            }else{
                JOptionPane.showMessageDialog(null,"Ingrese una opcion valida");
            }
        }
    }

    public static void DevolverLibro(){
        String listaPrestamos="",tab="\t\t";
        listaPrestamos+="Lista de libros:\n"+
            "N"+tab+"Titulo"+tab+"Usuario"+tab+"Fecha devolucion"+"\n";
        for (int i=0;i<librosBiblioteca.size();i++){
            listaPrestamos+=(i+1)+tab+prestamosLibros.get(i).getLibroPrestado().getTitulo()+tab+prestamosLibros.get(i).getUsuarioPrestado().getNombre()+tab+prestamosLibros.get(i).getFechaDevolucionPrevista()+"\n";
        }
        listaPrestamos+="Elije uno de los prestamos:";
        int opcion=0;
        Prestamo prestamo = null;
        while (true) {
            opcion=EntradaNumeroEntero(listaPrestamos);
            if (opcion>=1 && opcion<=prestamosLibros.size()){
                prestamo=prestamosLibros.get(opcion-1);
                break;
            }
            JOptionPane.showMessageDialog(null,"Elija una opcion valida");
        }
        prestamo.realizarTransaccion();
        prestamosLibros.remove(prestamosLibros.indexOf(prestamo));
    }

    public static void NuevoPrestamo(){
        Usuario usuario = elegirUsuario();
        Libro libro = elegirLibro();
        String fechaPrestamo = EntradaFecha("Ingrese la fecha de prestamo: (dd/mm/aaaa)");
        String fechaDevolucion = EntradaFecha("Ingrese la fecha de devolucion prevista: (dd/mm/aaaa)");
        Prestamo prestamo = new Prestamo(fechaPrestamo, fechaDevolucion, libro, usuario);
        prestamo.realizarTransaccion();
        prestamosLibros.add(prestamo);
    }

    public static Libro elegirLibro(){
        String listaLibros="",tab="\t\t";
        listaLibros+="Lista de libros:\n"+
            "N"+tab+"Titulo"+tab+"Autor"+tab+"ISBN"+tab+"Genero"+tab+"Disponible\n";
        for (int i=0;i<librosBiblioteca.size();i++){
            listaLibros+=(i+1)+tab+librosBiblioteca.get(i).getTitulo()+tab+librosBiblioteca.get(i).getAutor().getNombre()+tab+librosBiblioteca.get(i).getISBN()+tab+librosBiblioteca.get(i).getGenero()+tab+(librosBiblioteca.get(i).getDisponible()?"si":"no")+"\n";
        }
        listaLibros+="Elije uno de los libros:";
        int opcion=0;
        while (true) {
            opcion=EntradaNumeroEntero(listaLibros);
            if (opcion>=1 && opcion<=librosBiblioteca.size() && librosBiblioteca.get(opcion-1).getDisponible()){
                return librosBiblioteca.get(opcion-1);
            }
            JOptionPane.showMessageDialog(null,"Elija una opcion valida");
        }
    }

    public static Usuario elegirUsuario(){
        String listaUsuario="",tab="\t\t";
        listaUsuario+="Lista usuarios:\n"+
            "N"+tab+"Nombre"+tab+"Apellido"+tab+"Direccion\n";
        for (int i=0;i<usuarios.size();i++){
            listaUsuario+=(i+1)+tab+usuarios.get(i).getNombre()+tab+usuarios.get(i).getApellido()+tab+usuarios.get(i).getDireccion()+"\n";
        }
        listaUsuario+="Elije a uno de los usuarios";
        int opcion=0;
        while (true) {
            opcion=EntradaNumeroEntero(listaUsuario);
            if (opcion>=1 && opcion<=librosBiblioteca.size()){
                return usuarios.get(opcion-1);
            }
            JOptionPane.showMessageDialog(null,"Elija una opcion valida");
        }
    }

    public static void NuevoUsuario(){
        String nombre=JOptionPane.showInputDialog("Ingrese el nombre del nuevo usuario");
        String apellido=JOptionPane.showInputDialog("Ingrese el apellido del nuevo usuario");
        String direccion=JOptionPane.showInputDialog("Ingrese la direccion del nuevo usuario");
        Usuario usuario = new Usuario(nombre, apellido, direccion);
        usuarios.add(usuario);
    }

    public static void nuevoLibro(){
        String titulo = JOptionPane.showInputDialog("Ingrese el titulo del libro nuevo:");
        Autor autor = EnlazarAutor();
        int ISBN = EntradaNumeroEntero("Ingrese el ISBN del libro");
        String genero = JOptionPane.showInputDialog("Ingrese el el genero del libro "+titulo);
        Libro libro = new Libro(titulo, autor, ISBN, genero);
        librosBiblioteca.add(libro);
    }

    public static Autor EnlazarAutor(){
        int opcion=0;
        String listaAutores="";
        if (autoresLibros.size()>0){
            int opcionAutor = EntradaNumeroEntero("Desea darle un autor existente o crear un nuevo autor\n1) Nuevo\n2) Existente");
            if (opcionAutor==2){
                listaAutores+="Lista de autores existentes:\n";
                for (int i=0;i<autoresLibros.size();i++){
                    listaAutores+=(i+1)+") "+autoresLibros.get(i).getNombre()+" "+autoresLibros.get(i).getApellido()+" de nacionalidad "+autoresLibros.get(i).getNacionalidad()+"\n";
                }
                listaAutores+="Selecciones un autor existente para el nuevo libro";
                while (true) {
                    opcion=EntradaNumeroEntero(listaAutores);
                    if (opcion>=1 && opcion<=autoresLibros.size()){
                        return autoresLibros.get(opcion-1);
                    }
                    JOptionPane.showMessageDialog(null,"Selecciones una opcion valida");
                }
            }else{
                return NuevoAutor();
            }
        }else{
            return NuevoAutor();
        }
    }

    public static Autor NuevoAutor(){
        Autor autor = null;
        String nombre=JOptionPane.showInputDialog("Creado autor\nIngresar el nombre del autor");
        String apellido=JOptionPane.showInputDialog("Creando autor\nIngrese el apelllido del autos");
        String nacionalidad=JOptionPane.showInputDialog("Creando autor\nIngrese la nacionalidad del autor");
        autor = new Autor(nombre, apellido, nacionalidad);
        autoresLibros.add(autor);
        return autor;
    }

    public static int EntradaNumeroEntero(String mensaje){
        int n=0;
        while (true) {
            try {
                n=Integer.parseInt(JOptionPane.showInputDialog(mensaje));
                return n;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Ingrese unicamente valores numericos enteros");
            }
        }
    }

    public static String Botones(String mensaje,String[] botones){
        int opcion=0;
        opcion=JOptionPane.showOptionDialog(null,mensaje,"Selecciones una opcion", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null, botones,0);
        return botones[opcion];
    }

    public static String EntradaFecha(String mensaje){
        int c=0;
        String fecha="";
        while (true) {
            fecha=JOptionPane.showInputDialog(mensaje);
            for (int i=0;i<fecha.length();i++){
                if (fecha.charAt(i)=='/')
                    c+=1;
            }
            if (c==2){
                break;
            }
            JOptionPane.showMessageDialog(null,"Ingrese una fecha en el formato correcto (dd/mm/aaaa)");
        }
        return fecha;
    }
}

