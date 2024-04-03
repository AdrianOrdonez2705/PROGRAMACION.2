package laboratorio6;

public class PromediosFinales implements notasFinalesInterfaz {

    public double parciales;
    public double proy;
 
    public PromediosFinales(double parciales, double proy){
       this.parciales = parciales;
       this.proy = proy;
    }

    @Override
    public double promedioFinal(){
        return (getParciales() + getProy()) / 2;
    }

    // Parciales
    public void setParciales(double parciales) {
        this.parciales = parciales;
    }
    public double getParciales() {
        return parciales;
    }
    // Proyecto
    public void setProy(double proy) {
        this.proy = proy;
    }
    public double getProy() {
        return proy;
    }
}
