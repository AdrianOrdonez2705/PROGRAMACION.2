package PRACTICAS.practica02.P2_ejercicio01;

public class contarLetras {
    
    public String palabra;
    public int[] counter;

    public contarLetras(String palabra, int[] counter){
        this.palabra = palabra;
        this.counter = counter;
    }

    public void conteo(){

        getPalabra().toLowerCase();

        for (int i = 0; i < getPalabra().length(); i++){

            char letra = getPalabra().charAt(i);

            if(letra >= 'a' && letra <= 'z'){
                getCounter()[letra - 'a'] ++;
            }
        }
    }

    public void mostrarResultado(){
        for(char i = 'a'; i <= 'z'; i++){
            if(getCounter()[i - 'a'] > 0){
                System.out.println(i + " = " + getCounter()[i - 'a']);
            }
        }
    }

    // PALABRA
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getPalabra() {
        return palabra;
    }

    // COUNTER
    public void setCounter(int[] counter) {
        this.counter = counter;
    }

    public int[] getCounter() {
        return counter;
    }

}
