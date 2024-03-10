package PRACTICAS.practica02.P2_ejercicio01;

public class contarLetras {
    
    public String palabra;
    public int[] counter;
    public int counterTotal;

    public contarLetras(String palabra, int[] counter, int counterTotal){
        this.palabra = palabra;
        this.counter = counter;
        this.counterTotal = counterTotal;
    }

    public void conteo(){

        int contador = 0;
        
        setPalabra(getPalabra().toLowerCase());

        for (int i = 0; i < getPalabra().length(); i++){

            char letra = getPalabra().charAt(i);
            
            if(letra >= 'a' && letra <= 'z'){
                getCounter()[letra - 'a'] ++;
                contador ++;
            }
        }

        setCounterTotal(contador);
    }

    public void mostrarResultado(){
        for(char i = 'a'; i <= 'z'; i++){
            if(getCounter()[i - 'a'] > 0){
                System.out.println(i + " = " + getCounter()[i - 'a']);
            }
        }

        System.out.println("Total de letras: " + getCounterTotal());
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

    // COUNTER TOTAL
    public void setCounterTotal(int counterTotal) {
        this.counterTotal = counterTotal;
    }

    public int getCounterTotal() {
        return counterTotal;
    }

}
