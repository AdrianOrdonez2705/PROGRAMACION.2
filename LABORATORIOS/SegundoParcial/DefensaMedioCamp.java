package SegundoParcial;

public class DefensaMedioCamp extends NoArquero{
    
    int despejes;

    public DefensaMedioCamp(String equipo, String nombre, int dorsal, int remates, int despejes){
        super(equipo, nombre, dorsal, remates);
        this.despejes = despejes;
    }

    public int getDespejes() {
        return despejes;
    }
    public void setDespejes(int despejes) {
        this.despejes = despejes;
    }
}
