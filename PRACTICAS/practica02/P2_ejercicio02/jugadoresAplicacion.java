package PRACTICAS.practica02.P2_ejercicio02;

public class jugadoresAplicacion {
    public static void main(String[] args) {
        int cantidadJugadores = 0;
        int[] tarjetasRojas = new int[1];
        int[] tarjetasAmarillas = new int[1];
        int[] goles = new int[1];

        jugadores player = new jugadores(cantidadJugadores, tarjetasRojas, tarjetasAmarillas, goles);

        player.generarDatos();
        player.masExpulsiones();
        player.menosAmarillas();
        player.faltasTotales();
        player.totalPromedioGoles();
    }


}
