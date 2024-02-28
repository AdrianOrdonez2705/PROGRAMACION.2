package LABORATORIOS.laboratorio2;

public class auto {
    
    //CREACION DE METODOS

    public void acelerar(String nombreAuto){ // Crear el método "acelerar" para la clase "auto"
        System.out.println(nombreAuto + " acelera");
    }

    public void frenar(String nombreAuto){ // Crear el método "frenar" para la clase "auto"
        System.out.println(nombreAuto + " frena");
    }

    public void tocarBocina(int tipoAuto){ // Crear el método "tocarBocina" para la clase "auto"
        if(tipoAuto == 1){
            System.out.println("mi mi mi");
        }
        else{
            System.out.println("hummm hummm");
        }
    }
}