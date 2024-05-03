package SegundoParcial;

public class NoArquero extends Jugador {
    
    int remates;

    public NoArquero(String equipo, String nombre, int dorsal, int remates){
        super(equipo, nombre, dorsal);
        this.remates = remates;
    }

    public int getRemates() {
        return remates;
    }
    public void setRemates(int remates) {
        this.remates = remates;
    }
    
}
