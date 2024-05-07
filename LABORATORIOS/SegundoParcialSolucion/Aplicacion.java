package SegundoParcialSolucion;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Aplicacion {

    public static ArrayList<Integer> stats1 = new ArrayList<>();
    public static ArrayList<Integer> stats2 = new ArrayList<>();

    public static String nombreEquipo1 = "";
    public static String nombreEquipo2 = "";
    public static void main(String[] args) {
        try{
            String[] partido = null;
            ArrayList<Jugador> equipoLocal= new ArrayList<>();
            ArrayList<Jugador> equipoVisitante= new ArrayList<>();


            String strMenu = "\n1.Registro del equipo local y visitante";
            strMenu += "\n2.Simulacion del partido";
            strMenu += "\n3.Estadisticas";
            strMenu += "\n4.Salir";



            while (true){
                int op = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion:"+strMenu));
                menu (op, partido, equipoLocal, equipoVisitante);
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "HUBO UN ERROR EN EL PROCESO...");
        }
    }

    public static void menu (int opcion, String[] partido, ArrayList<Jugador> equipo1, ArrayList<Jugador> equipo2){
        switch (opcion) {
            case 1:
                int tipo = Integer.parseInt(JOptionPane.showInputDialog("1.Local\n2.Visitante:"));
                if (tipo == 1){
                    // partido = registrarEquipo(partido, tipo);
                    nombreEquipo1 = JOptionPane.showInputDialog(null, "Ingrese el nombre del equipo LOCAL:");
                    equipo1 = registrarJugadores(equipo1);
                }else{
                    if (tipo == 2){
                        // partido = registrarEquipo(partido, tipo);
                        nombreEquipo2 = JOptionPane.showInputDialog(null, "Ingrese el nombre del equipo VISITANTE:");
                        equipo2 = registrarJugadores(equipo2);
                    }else{
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                    }
                }
                break;
            case 2:
                stats1.clear();
                stats2.clear();

                simulacionTarjetas(equipo1);
                simulacionTarjetas(equipo2);

                simulacionHabilidades(equipo1);
                simulacionHabilidades(equipo2);

                simulacionStats(equipo1, equipo2);

                JOptionPane.showMessageDialog(null, "PARTIDO SIMULADO");
                break;
            case 3:
                String estadisticas1 = nombreEquipo1 + " vs " + nombreEquipo2 + "\n";
                estadisticas1 += stats1.get(0) + "\tposesion\t" + stats2.get(0) + "\n";
                estadisticas1 += stats1.get(1) + "\tremates\t" + stats2.get(1) + "\n";
                estadisticas1 += stats1.get(3) + "\tamarillas\t" + stats2.get(3) + "\n";
                estadisticas1 += stats1.get(4) + "\trojas\t" + stats2.get(4) + "\n";
                estadisticas1 += stats1.get(2) + "\tgoles\t" + stats2.get(2) + "\n";

                JTextArea ob = new JTextArea(20,30);
                ob.setText(estadisticas1);
                JScrollPane ob1 = new JScrollPane(ob);
                JOptionPane.showMessageDialog(null, ob1);
                
                break;
            case 4:
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "ENTRADA INVALIDA");
                break;
        }
    }

    public static String[] registrarEquipo (String[]partido, int tipoEquipo){
        String localia = tipoEquipo==1?"LOCAL":"VISITANTE";
        String nombreEquipo = JOptionPane.showInputDialog("Ingrese el nombre del equipo "+localia);
        partido[tipoEquipo-1] = nombreEquipo;
        return partido;
    }
    
    public static ArrayList<Jugador> registrarJugadores (ArrayList<Jugador> equipo){
        // equipo = null;
        Jugador jugador = null;
        int[] tipoJugador = {0,1,1,1,2,2,2,2,3,3,3};
        String[] strTipoJugador = {"ARQUERO", "DEFENSA", "MEDIOCAMPISTA", "DELANTERO"};
        String nombre = "";

        for (int i=0; i<11; i++){
            switch (tipoJugador[i]) {
                case 0:
                    nombre  = JOptionPane.showInputDialog("Ingrese el nombre del "+ strTipoJugador[tipoJugador[i]]);
                    jugador = new Arquero(nombre, i+1, 0, 0, 0);
                    break;
                case 1:
                    nombre  = JOptionPane.showInputDialog("Ingrese el nombre del "+ strTipoJugador[tipoJugador[i]]);
                    jugador = new Defensa(nombre, i+1, 0, 0, 0, 0);
                    break;
                case 2:
                    nombre  = JOptionPane.showInputDialog("Ingrese el nombre del "+ strTipoJugador[tipoJugador[i]]);
                    jugador = new Mediocampo(nombre, i+1, 0, 0, 0, 0);
                    break;
                case 3:
                    nombre  = JOptionPane.showInputDialog("Ingrese el nombre del "+ strTipoJugador[tipoJugador[i]]);
                    jugador = new Delantero(nombre, i+1, 0, 0, 0);
                    break;
            }
            equipo.add(jugador);
        }
        return equipo;
    }
    
    public static void simulacionTarjetas (ArrayList<Jugador> equipo){
        int[] tipoJugador = {0,1,1,1,2,2,2,2,3,3,3};
        for (int i=0; i<11; i++){
            switch (tipoJugador[i]) {
                case 0:
                    Jugador arq = equipo.get(i);
                    ((Arquero)arq).SimularTarjetasAmarillas(0,1);
                    ((Arquero)arq).SimularTarjetasRojas(0,1);
                    break;
                case 1:
                    Jugador def = equipo.get(i);
                    ((Defensa)def).SimularTarjetasAmarillas(0,1);
                    ((Defensa)def).SimularTarjetasRojas(0,1);
                    break;
                case 2:
                    Jugador med = equipo.get(i);
                    ((Mediocampo)med).SimularTarjetasAmarillas(0,1);
                    ((Mediocampo)med).SimularTarjetasRojas(0,1);
                    break;
                case 3:
                    Jugador del = equipo.get(i);
                    ((Delantero)del).SimularTarjetasAmarillas(0,1);
                    ((Delantero)del).SimularTarjetasRojas(0,1);
                    break;
            }
        }
    }

    public static void simulacionHabilidades (ArrayList<Jugador> equipo){
        int[] tipoJugador = {0,1,1,1,2,2,2,2,3,3,3};
        for (int i=0; i<11; i++){
            switch (tipoJugador[i]) {
                case 0:
                    Jugador arq = equipo.get(i);
                    ((Arquero)arq).setParadas(numerosRandom(0,20));
                    break;
                case 1:
                    Jugador def = equipo.get(i);
                    ((Defensa)def).setDespejes(numerosRandom(0, 2));
                    ((Defensa)def).setRemates(numerosRandom(0, 1));
                    break;
                case 2:
                    Jugador med = equipo.get(i);
                    ((Mediocampo)med).setDespejes(numerosRandom(0, 1));
                    ((Mediocampo)med).setRemates(numerosRandom(0, 2));
                    break;
                case 3:
                    Jugador del = equipo.get(i);
                    ((Delantero)del).setRemates(numerosRandom(0, 2));
                    break;
            }
        }
    }
    
    public static int numerosRandom (int a, int b){
        Random random = new Random();
        return random.nextInt(b - a + 1) + a;
    }

    public static ArrayList<Integer> simulacionStats (ArrayList<Jugador> equipo1, ArrayList<Jugador> equipo2){

        // para la posesion
        int posesion1 = numerosRandom(1, 100);
        int posesion2 = 100 - posesion1;
        stats1.add(posesion1);
        stats2.add(posesion2);

        // para los remates
        int remates1 = contadorRemates(equipo1);
        int remates2 = contadorRemates(equipo2);
        stats1.add(remates1);
        stats2.add(remates2);

        // para los goles
        int goles1 = numerosRandom(0, remates1);
        int goles2 = numerosRandom(0, remates2);
        stats1.add(goles1);
        stats2.add(goles2);

        // para las tarjetas amarillas
        int tarjetasAmarillas1 = contadorAmarillas(equipo1);
        int tarjetasAmarillas2 = contadorAmarillas(equipo2);
        stats1.add(tarjetasAmarillas1);
        stats2.add(tarjetasAmarillas2);

        int tarjetasRojas1 = contadorRojas(equipo1);
        int tarjetasRojas2 = contadorRojas(equipo2);
        stats1.add(tarjetasRojas1);
        stats2.add(tarjetasRojas2);

        return null;
    }

    public static int contadorRemates(ArrayList<Jugador> equipo){
        int[] tipoJugador = {0,1,1,1,2,2,2,2,3,3,3};
        int contadorRemates = 0;
        for (int i=0; i<11; i++){
            switch (tipoJugador[i]) {
                // case 0:
                //     Jugador arq = equipo.get(i);
                //     ((Arquero)arq).setParadas(numerosRandom(0,20));;
                //     break;
                case 1:
                    Jugador def = equipo.get(i);
                    contadorRemates += ((Defensa)def).getRemates();
                    break;
                case 2:
                    Jugador med = equipo.get(i);
                    contadorRemates += ((Mediocampo)med).getRemates();
                    break;
                case 3:
                    Jugador del = equipo.get(i);
                    contadorRemates += ((Delantero)del).getRemates();
                    break;
            }
        }
        return contadorRemates;
    }

    public static int contadorAmarillas(ArrayList<Jugador> equipo){
        int[] tipoJugador = {0,1,1,1,2,2,2,2,3,3,3};
        int contadorAmarillas = 0;
        for (int i=0; i<11; i++){
            switch (tipoJugador[i]) {
                case 0:
                    Jugador arq = equipo.get(i);
                    contadorAmarillas += ((Arquero)arq).getTarjetasAmarillas();
                    break;
                case 1:
                    Jugador def = equipo.get(i);
                    contadorAmarillas += ((Defensa) def).getTarjetasAmarillas();
                    break;
                case 2:
                    Jugador med = equipo.get(i);
                    contadorAmarillas += ((Mediocampo) med).getTarjetasAmarillas();
                    break;
                case 3:
                    Jugador del = equipo.get(i);
                    contadorAmarillas += ((Delantero) del).getTarjetasAmarillas();
                    break;
            }
        }
        return contadorAmarillas;
    }

    public static int contadorRojas(ArrayList<Jugador> equipo){
        int[] tipoJugador = {0,1,1,1,2,2,2,2,3,3,3};
        int contadorRojas = 0;
        for (int i=0; i<11; i++){
            switch (tipoJugador[i]) {
                case 0:
                    Jugador arq = equipo.get(i);
                    contadorRojas += ((Arquero)arq).getTarjetasRojas();
                    break;
                case 1:
                    Jugador def = equipo.get(i);
                    contadorRojas += ((Defensa) def).getTarjetasRojas();
                    break;
                case 2:
                    Jugador med = equipo.get(i);
                    contadorRojas += ((Mediocampo) med).getTarjetasRojas();
                    break;
                case 3:
                    Jugador del = equipo.get(i);
                    contadorRojas += ((Delantero) del).getTarjetasRojas();
                    break;
            }
        }
        return contadorRojas;
    }
}
