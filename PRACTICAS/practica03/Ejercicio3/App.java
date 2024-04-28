package PRACTICAS.practica03.Ejercicio3;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class App {
    public static String numExcepcion = "Ingrese unicamente valores numericos";
    public static void main(String[] args) {
        int opcion=0;
        String mensajeMenu = "Que empleado es del que dea calcular su salario?:\n"+
            "1) Profesor de tiempo completo.\n"+
            "2) Profesor de hora catedra.\n"+
            "3) Recursos huamanos.\n"+
            "4) Matenimiento.";
        JOptionPane.showMessageDialog(null,"Bienvenido a la calculadora de salarios");
        String nombre=JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
        int cedula=EntradaNumeroEntero("ingrese la cedula de identidad del empleado.");
        String[] facultades = {"Economia","Ingenieria","Derecho"};
        String dependencia = Botones("A que facultad pertenece el empleado?",facultades);
        while (true) {
            opcion=EntradaNumeroEntero(mensajeMenu);
            switch(opcion){
                case 1:
                    ProfesorTiempoCompleto(nombre,cedula,dependencia);
                    break;
                case 2:
                    ProfesorHoraCatedra(nombre,cedula,dependencia);
                    break;
                case 3:
                    RecursosHumanos(nombre,cedula,dependencia);
                    break;
                case 4:Matenimiento(nombre,cedula,dependencia);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Ingrese una opcion valida.");
            }
            if (opcion>=1 && opcion<=4)
                break;
        }
        JOptionPane.showMessageDialog(null,"Gracias por utilizar la calculadora de salarios :)");
    }

    public static void ProfesorTiempoCompleto(String nombre,int cedula,String dependencia){
        String[] nivelesEstudio = {"Pregrado","Maestria","Doctorado"};
        String nivelEstudio = Botones("Que enivel de estudio tiene el profesor?", nivelesEstudio);
        double calificacionAsignada = EntradaNumeroDecimal("Ingrese la calificacion del profesor");
        int totalHorasInvestigacion = EntradaNumeroEntero("Total de horaas de investigacion");
        double salario=0.00;
        if (nivelEstudio.equals("Pregrado")){
            salario=10000.00;
        }else if (nivelEstudio.equals("Maestria")){
            salario=18000.00;
        }else if (nivelEstudio.equals("Doctorado")){
            salario=25000.00;
        }
        ProfesorTiempoCompleto profesor = new ProfesorTiempoCompleto(nombre, cedula, dependencia, calificacionAsignada, salario, totalHorasInvestigacion);
        JOptionPane.showMessageDialog(null,
            "Empleado: "+profesor.getNombre()+"\n"+
            "Cedula: "+profesor.getCedula()+"\n"+
            "Dependencia: "+profesor.getDependencia()+"\n"+
            "Calificacion asignada: "+profesor.getCalificacionAsignada()+"\n"+
            "Horas asignadas: "+profesor.getTotalHorasInvestigacion()+"\n"+
            "Salario: "+profesor.SalarioFinal());
    }

    public static void ProfesorHoraCatedra(String nombre,int cedula,String dependencia){
        double calificacionAsignada = EntradaNumeroDecimal("Ingrese la calificacion del porfesor");
        double salario=0;
        int horasAsignadas=EntradaNumeroEntero("Ingrese las horas que se les fueron asignadas");
        ProfesorHoraCatedra profesor = new ProfesorHoraCatedra(nombre, cedula, dependencia, calificacionAsignada, salario, horasAsignadas);
        JOptionPane.showMessageDialog(null,
            "Empleado: "+profesor.getNombre()+"\n"+
            "Cedula: "+profesor.getCedula()+"\n"+
            "Dependencia: "+profesor.getDependencia()+"\n"+
            "Calificacion asignada: "+profesor.getCalificacionAsignada()+"\n"+
            "Horas asignadas: "+profesor.getHorasAsignadas()+"\n"+
            "Salario: "+profesor.SalarioFinal());
    }

    public static void RecursosHumanos(String nombre,int cedula,String dependencia){
        String[] tipos = {"Tesoreria","Secretaria"};
        double salarioBase=5000.00;
        String tipo = Botones("Que tipo de recursos humanos es?", tipos);
        RecursosHumanos recursosHumanos = new RecursosHumanos(nombre, cedula, dependencia, salarioBase, tipo);
        JOptionPane.showMessageDialog(null,
            "Empleado: "+recursosHumanos.getNombre()+"\n"+
            "Cedula: "+recursosHumanos.getCedula()+"\n"+
            "Dependencia: "+recursosHumanos.getDependencia()+"\n"+
            "Tipo: "+recursosHumanos.getTipo()+"\n"+
            "Salario: "+recursosHumanos.SalarioFinal());
    }

    public static void Matenimiento(String nombre,int cedula,String dependencia){
        int n=EntradaNumeroEntero("Ingrese el numero de aulas asignadas");
        ArrayList<String> aulas = new ArrayList<String>();
        for (int i=0;i<n;i++){
            aulas.add(JOptionPane.showInputDialog("Ingrese el nombre de aula del bloque "+(i+1)));
        }
        int horasExtra = EntradaNumeroEntero("Ingrese el numero de horas extras trabajadas");
        Mantenimiento mantenimiento = new Mantenimiento(nombre, cedula, dependencia, 5000.00,aulas,horasExtra);
        JOptionPane.showMessageDialog(null,
            "Empleado: "+mantenimiento.getNombre()+"\n"+
            "Cedula: "+mantenimiento.getCedula()+"\n"+
            "Dependencia: "+mantenimiento.getDependencia()+"\n"+
            "Aulas asignadas: "+SalidaAulas(mantenimiento.getSalonesAsignados())+"\n"+
            "Salario: "+mantenimiento.SalarioFinal());
    }

    // Inicio - Funciones
    public static int EntradaNumeroEntero(String mensaje){
        int n=0;
        while (true) {
            try {
                n=Integer.parseInt(JOptionPane.showInputDialog(mensaje));
                return n;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,numExcepcion);
            }
        }
    }

    public static double EntradaNumeroDecimal(String mensaje){
        double n=0;
        while (true) {
            try {
                n=Double.parseDouble(JOptionPane.showInputDialog(mensaje));
                return n;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,numExcepcion);
            }
        }
    }

    public static String Botones(String mensaje,String[] botones){
        int opcion=0;
        opcion=JOptionPane.showOptionDialog(null,mensaje,"Selecciones una opcion", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null, botones,0);
        return botones[opcion];
    }

    public static String SalidaAulas(ArrayList<String> aulas){
        String salida="";
        for (int i=0;i<aulas.size();i++){
            if (i==(aulas.size()-1)){
                salida+=aulas.get(i);
            }else{
                salida+=aulas.get(i)+", ";
            }
        }
        return salida;
    }
    // Fin - Funciones
}
