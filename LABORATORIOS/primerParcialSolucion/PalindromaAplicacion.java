package primerParcialSolucion;

public class PalindromaAplicacion {
    public static void main(String[] args) {
        String cadena = "ANITALAVALATINA";
        int tam = cadena.length();
        String matriz[][] = new String[tam][tam];

        solucionPalindroma clase = new solucionPalindroma(cadena,tam);

        if(clase.verificarPalindromo()){
            clase.generarMatriz(matriz);
            clase.mostrarMatriz(matriz);
        }
        else{
            System.out.println("No es palidroma");
        }
    }

    
}
