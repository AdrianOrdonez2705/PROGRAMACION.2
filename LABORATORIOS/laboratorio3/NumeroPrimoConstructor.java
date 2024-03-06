package laboratorio3;

public class NumeroPrimoConstructor {

    public int numero;

    // Constructor con parámetros
    public NumeroPrimoConstructor(int numero){
        this.numero = numero;
    }

    // Método para determinar si es primo
    public void NumeroEsPrimo(){

        int counter = 0;

        for(int i = 1; i < getNumero()/2; i++){
            if(getNumero() % i == 0){
                counter ++;
            }
        }

        if(counter == 1){
            System.out.println("El numero SI es primo");
        }
        else{
            System.out.println("El numero NO es primo");
        }

    }
    // Setter
    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Getter
    public int getNumero() {
        return numero;
    }
}
