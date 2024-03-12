package PRACTICAS.practica02.P2_ejercicio05;

public class secuencia {
    public int tamano;

    public secuencia(int tamano){
        this.tamano = tamano;
    }

    public void generarSecuencia(){
        int[][] matriz = new int[getTamano()][getTamano()];
       
        for (int i=0; i < getTamano(); i++){
            for (int j=0; j < getTamano(); j++){
                if(i == (getTamano()/2) && j == (getTamano()/2)){
                    matriz[i][j] = 100;
                }
                else if(i == 0 && j == getTamano()-1){
                    matriz[i][j] = 1;
                }
                else if(i == 1 && j == 1){
                    matriz[i][j] = 1;
                }
                else if(i == 1 && j == getTamano()-2){
                    matriz[i][j] = getTamano()-3;
                }
                else if(i == getTamano()-2 && j == 1){
                    matriz[i][j] = getTamano()-2;
                }
                else if(i == getTamano()-2 && j == getTamano()-2){
                    matriz[i][j] = getTamano();
                }
                else if(i == getTamano()-1 && j == 0){
                    matriz[i][j] = getTamano()+3;
                }
                else if(i == getTamano()-1 && j == getTamano()-1){
                    matriz[i][j] = getTamano() + matriz[getTamano()-1][0];
                }
                else{
                    matriz[i][j] = 0;
                }
            }
            System.out.println();
        }

        for (int i=0; i < getTamano(); i++){
            for (int j=0; j < getTamano(); j++){
                if(matriz[i][j] == 100){
                    System.out.print(">:v ");
                }
                else{
                    System.out.print(matriz[i][j] + "   ");
                }
            }

            System.out.println();
        }


    }

    // TAMAÑO
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getTamano() {
        return tamano;
    }
}
