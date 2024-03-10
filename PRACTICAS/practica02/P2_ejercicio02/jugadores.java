package PRACTICAS.practica02.P2_ejercicio02;

import java.util.Random;

public class jugadores {
    int cantidadJugadores;
    int[] tarjetasRojas;
    int[] tarjetasAmarillas;
    int[] goles;

    public jugadores(int cantidadJugadores, int[] tarjetasRojas, int[] tarjetasAmarillas, int[] goles){
        this.cantidadJugadores = cantidadJugadores;
        this.tarjetasRojas = tarjetasRojas;
        this.tarjetasAmarillas = tarjetasAmarillas;
        this.goles = goles;
    }

    public void generarDatos(){
        Random random = new Random();

        setCantidadJugadores(11);

        int[] vectorRojas = new int[getCantidadJugadores()];
        int[] vectorAmarillas = new int[getCantidadJugadores()];
        int[] vectorGoles = new int[getCantidadJugadores()];


        for (int i=0; i < getCantidadJugadores(); i++){
            vectorRojas[i] = random.nextInt(10);
            vectorAmarillas[i] = random.nextInt(10);
            vectorGoles[i] = random.nextInt(10);
        }

        setTarjetasRojas(vectorRojas);
        setTarjetasAmarillas(vectorAmarillas);
        setGoles(vectorGoles);

        for(int i=0; i < getCantidadJugadores(); i++){
            int j = i+1;
            System.out.println("Rojas jugador " + j + ": " + getTarjetasRojas()[i]);
            System.out.println("Amarillas jugador " + j + ": " + getTarjetasAmarillas()[i]);
            System.out.println("Goles jugador " + j + ": " + getGoles()[i] + "\n");
        }

    }


    // CANTIDAD DE JUGADORES
    public void setCantidadJugadores(int cantidadJugadores) {
        this.cantidadJugadores = cantidadJugadores;
    }

    public int getCantidadJugadores() {
        return cantidadJugadores;
    }

    // TARJETAS ROJAS
    public void setTarjetasRojas(int[] tarjetasRojas) {
        this.tarjetasRojas = tarjetasRojas;
    }

    public int[] getTarjetasRojas() {
        return tarjetasRojas;
    }

    // TARJETAS AMARILLAS
    public void setTarjetasAmarillas(int[] tarjetasAmarillas) {
        this.tarjetasAmarillas = tarjetasAmarillas;
    }

    public int[] getTarjetasAmarillas() {
        return tarjetasAmarillas;
    }

    // GOLES
    public void setGoles(int[] goles) {
        this.goles = goles;
    }

    public int[] getGoles() {
        return goles;
    }

}
