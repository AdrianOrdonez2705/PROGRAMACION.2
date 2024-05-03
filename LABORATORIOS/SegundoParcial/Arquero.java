package SegundoParcial;

public class Arquero extends Jugador{
    
    int paradas;

    public Arquero(String equipo, String nombre, int dorsal, int paradas){
        super(equipo, nombre, dorsal);
        this.paradas = paradas;
    }

    public int getParadas() {
        return paradas;
    }
    public void setParadas(int paradas) {
        this.paradas = paradas;
    }

}
