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

    // Generar rojas, amarillas Y goles de cada jugador
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

    // Mas expulsiones (rojas)
    public void masExpulsiones(){
        int mayor = 0;
        int jugadorMasExpulsado = 0;

        for (int i=0; i < getCantidadJugadores(); i++){
            if(getTarjetasRojas()[i] > mayor){
                mayor = getTarjetasRojas()[i];
                jugadorMasExpulsado = i + 1;
            }
        }

        System.out.println("Jugador con mas expulsiones: Jugador " + jugadorMasExpulsado);
    }

    // Menos amarillas
    public void menosAmarillas(){

        int menor = getTarjetasAmarillas()[0];
        int jugadorMenosAmarillas = 1;


        for(int i=1; i < getCantidadJugadores(); i++){
            if (getTarjetasAmarillas()[i] < menor){
                menor = getTarjetasAmarillas()[i];
                jugadorMenosAmarillas = i + 1;
            }
        }

        System.out.println("Jugador con menos tarjetas amarillas: Jugador " + jugadorMenosAmarillas);
    }


    // Mas faltas totales cometidas (rojas + amarillas)
    public void faltasTotales(){

        int mayor = 0;
        int jugadosMasFaltas = 0;
        int[] jugadorFaltasTotales = new int[getCantidadJugadores()];

        for (int i=0; i < getCantidadJugadores(); i++){
            jugadorFaltasTotales[i] = getTarjetasRojas()[i] + getTarjetasAmarillas()[i];
        }

        for (int j=0; j < getCantidadJugadores(); j++){
            if (jugadorFaltasTotales[j] > mayor){
                mayor = jugadorFaltasTotales[j];
                jugadosMasFaltas = j + 1; 
            }
        }

        System.out.println("Jugador con mas faltas totales cometidas: Jugador " + jugadosMasFaltas);

    }

    // Total de goles y promedio
    public void totalPromedioGoles(){
        int totalGoles = 0;

        for (int k=0; k < getCantidadJugadores(); k++){
            totalGoles += getGoles()[k];
        }

        double promedioGoles = totalGoles / getCantidadJugadores();

        System.out.println("Total de goles: " + totalGoles);
        System.out.println("Promedio de goles: " + promedioGoles);
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
