package primerParcialSolucion;

public class solucionPalindroma {

    public String cadena;
    public int tam;

    public solucionPalindroma(String cadena, int tam){
        this.cadena = cadena;
        this.tam = tam;
    }

    public String[][] generarMatriz(String[][] matriz){
        String cadena = getCadena();
        int c = 0;
        // Genera la matriz
        for(int i=0; i < getTam(); i++){
            for(int j=0; j < getTam(); j++){
                if (i == j || i + j == getTam() - 1){
                    matriz[i][j] = "" + cadena.charAt(c);
                }
                else{
                    matriz[i][j] = "-"; 
                }
            }
            c = c + 1;
        }

        return matriz;
    }

    public void mostrarMatriz(String[][] matriz){
        // Muestra la matriz
        for(int i=0; i < getTam(); i++){
            for(int j=0; j < getTam(); j++){
                System.out.print(matriz[i][j]);
            }
        System.out.println();
        }
    }

    public boolean verificarPalindromo(){
        String reversa = "";
        String cadena = getCadena();
        for(int i=cadena.length()-1; i >= 0; i--){
            reversa = reversa + cadena.charAt(i);
        }

        return cadena.compareTo(reversa) == 0?true:false;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    public String getCadena() {
        return cadena;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }
    public int getTam() {
        return tam;
    }
}
