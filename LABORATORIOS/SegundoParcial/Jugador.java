package SegundoParcial;

import java.util.Random;

public class Jugador {
    
    public String equipo;
    public String nombre;
    public int dorsal;

    public Jugador(String equipo, String nombre, int dorsal){
        this.equipo = equipo;
        this.nombre = nombre;
        this.dorsal = dorsal;
    }

    public String getEquipo() {
        return equipo;
    }
    public String getNombre() {
        return nombre;
    }
    public int getDorsal() {
        return dorsal;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }


    public static void simular(){
        Random random = new Random();
        String localia = "La Paz";
        int cantidadJugadores = 22;

        double posesionLocal = random.nextDouble(50);
        double posesionVisit = random.nextDouble(50);

        int rematesLocal = random.nextInt(15);
        int rematesVisit = random.nextInt(15);

        int golesLocal = random.nextInt(15);
        int golesVisit = random.nextInt(15);
    }
}
