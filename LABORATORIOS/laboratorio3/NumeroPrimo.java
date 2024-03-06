package laboratorio3;

public class NumeroPrimo {
    
    int numero;

    public void esPrimo(int numero){

        int counter = 0;

        for(int i = 1; i < numero/2; i++){
            if(numero % i == 0){
                counter ++;
            }
        }

        if(counter == 1){
            System.out.println("El numero es primo");
        }
    
        else{
            System.out.println("El numero NO es primo");
        }
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}

