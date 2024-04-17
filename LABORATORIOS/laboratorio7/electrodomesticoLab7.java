package laboratorio7;

import javax.swing.JOptionPane;

public abstract class electrodomestico{
  
    public double precioBase;
    public String color;
    public char letra;
    public double peso;

    public electrodomestico(double precioBase, String color, char letra, double peso){
        this.precioBase = precioBase;
        this.color = color;
        this.letra = letra;
        this.peso = peso;
    }

    public void ComprobarConsumoEnergetico(char letra){
        try{
            String letrasConsumo = "ABCDEF";
            for(int i = 0; i < 6; i++){
                char letter = letrasConsumo.charAt(i);
                if(letra == letter){
                    setLetra(letra);
                }
            }
        }
        catch (Exception e){
            setLetra('F');
        }
        JOptionPane.showMessageDialog(null, "La letra es: " + getLetra());
    }

    public void ComprobarColor(String color){
        try{
            String[] coloresDisponibles = {"blanco","negro","rojo","azul","gris"};
            for (int i=0; i < 5; i++){
                if(color.equals(coloresDisponibles[i])){
                    setColor(color);
                }
            }
        }
        catch (Exception e){
            setColor("blanco");
        }
        JOptionPane.showMessageDialog(null, "El color es: " + getColor());
    }

    public void PrecioFinal(){
        
    }

    // SETTERS
    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setLetra(char letra) {
        this.letra = letra;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    // GETTERS
    public double getPrecioBase() {
        return precioBase;
    }
    public String getColor() {
        return color;
    }
    public char getLetra() {
        return letra;
    }
    public double getPeso() {
        return peso;
    }
}
