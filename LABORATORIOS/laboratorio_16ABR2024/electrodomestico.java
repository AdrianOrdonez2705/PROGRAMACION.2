package laboratorio_16ABR2024;

public class electrodomestico implements InterfazElectrodomestico{
    
    public double precio;
    public String color;
    public char consumo;
    public double peso;

    public electrodomestico(double precio, String color, char consumo, double peso){
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getPrecio() {
        return precio;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }
    public char getConsumo() {
        return consumo;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPeso() {
        return peso;
    }

    public void comprobarConsumoEnergetico(){
        if(consumo != 'A' || consumo != 'B' || consumo != 'C' || consumo != 'D' || consumo != 'E'){
            setConsumo('F');
        }
    }

    public void comprobarColor(){

        if(color != "negro" || color != "rojo" || color != "azul" || color != "gris"){
            setColor("blanco");
        }
    }

    @Override
    public double precioFinal(){

        if(consumo == 'A'){
            precio += 100;
        } else{
            if(consumo == 'B'){
                precio += 80;
            } else{
                if(consumo == 'C'){
                    precio += 60;
                } else{
                    if(consumo == 'D'){
                        precio += 50;
                    } else{
                        if(consumo == 'E'){
                            precio += 30;
                        } else{
                            precio += 10;
                        }
                    }
                }
            }
        }

        if (peso > 0 && peso <19){
            precio+=10;
        } else{
            if (peso > 20 && peso <49){
                precio+=50;
            } else{
                if (peso > 50 && peso <79){
                    precio+=80;
                } else{
                    precio+=100;
                }
            }
        }

        return precio;
    }
}