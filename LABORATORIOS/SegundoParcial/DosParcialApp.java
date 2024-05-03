package SegundoParcial;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DosParcialApp {
    public static void main(String[] args) {

        Random random = new Random();

        while(true){
            Jugador jugador = null;
            Jugador jugador2 = null;
            Jugador jugador3 = null;
            Jugador jugador4 = null;


            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1.REGISTRO DE EQUIPOS.\n2.SIMULACION.\n3.ESTADISTICAS.\n4.SALIR"));

            try{
                List <Jugador> listaLocal = new ArrayList<Jugador>();
                List <Jugador> listaVisit = new ArrayList<Jugador>();

                String equipo = "";
                String equipo2 = "";

                double posesionLocal = 0;
                double posesionVisit = 0;

                int rematesLocal = 0;
                int rematesVisit = 0;

                int golesLocal = 100;
                int golesVisit = 100;

                if(opcion == 1){

                    int opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Equipo local.\n2.Equipo Visitante."));

                    if(opcion2 == 1){

                        equipo = JOptionPane.showInputDialog(null, "Ingrese el nombre del equipo local:");

                        for(int i=0; i < 1; i++){
                            String nombre1 = JOptionPane.showInputDialog(null, "Ingrese el nombre del arquero:");
                            int dorsal = 1;
                            int paradas = random.nextInt(15);
                            jugador = new Arquero(equipo, nombre1, dorsal, paradas);
                            listaLocal.add(jugador);
                        }
                        
                        for(int i=0; i<3; i++){
                            String nombre2 = JOptionPane.showInputDialog(null, "Ingrese el nombre del DEFENSA " + (i+1));
                            int dorsal2 = 2+i;
                            int remates1 = random.nextInt(15);
                            int despejes1 = random.nextInt(15);
                            jugador2 = new DefensaMedioCamp(equipo, nombre2, dorsal2, remates1, despejes1);
                            listaLocal.add(jugador2);
                        }

                        for(int i=0; i<4; i++){
                            String nombre2 = JOptionPane.showInputDialog(null, "Ingrese el nombre del MEDIOCAMPISTA " + (i+1));
                            int dorsal3 = 5+i;
                            int remates2 = random.nextInt(15);
                            int despejes2 = random.nextInt(15);
                            jugador3 = new DefensaMedioCamp(equipo, nombre2, dorsal3, remates2, despejes2);
                            listaLocal.add(jugador3);
                        }

                        for(int i=0; i<3; i++){
                            String nombre2 = JOptionPane.showInputDialog(null, "Ingrese el nombre del DELANTERO " + (i+1));
                            int dorsal4 = 9+i;
                            int remates3 = random.nextInt(15);
                            jugador4 = new NoArquero(equipo, nombre2, dorsal4, remates3);
                            listaLocal.add(jugador4);
                        }

                        JOptionPane.showMessageDialog(null,"Equipo Local Registrado");
                    } else{

                        if(opcion2 == 2){
                            equipo2 = JOptionPane.showInputDialog(null, "Ingrese el nombre del equipo visitante:");

                            for(int i=0; i < 1; i++){
                                String nombre1 = JOptionPane.showInputDialog(null, "Ingrese el nombre del arquero:");
                                int dorsal = 1;
                                int paradas = random.nextInt(15);
                                jugador = new Arquero(equipo2, nombre1, dorsal, paradas);
                                listaVisit.add(jugador);
                            }
                            
                            for(int i=0; i<3; i++){
                                String nombre2 = JOptionPane.showInputDialog(null, "Ingrese el nombre del DEFENSA " + (i+1));
                                int dorsal2 = 2+i;
                                int remates1 = random.nextInt(15);
                                int despejes1 = random.nextInt(15);
                                jugador2 = new DefensaMedioCamp(equipo2, nombre2, dorsal2, remates1, despejes1);
                                listaVisit.add(jugador2);
                            }

                            for(int i=0; i<4; i++){
                                String nombre2 = JOptionPane.showInputDialog(null, "Ingrese el nombre del MEDIOCAMPISTA " + (i+1));
                                int dorsal3 = 5+i;
                                int remates2 = random.nextInt(15);
                                int despejes2 = random.nextInt(15);
                                jugador3 = new DefensaMedioCamp(equipo2, nombre2, dorsal3, remates2, despejes2);
                                listaVisit.add(jugador3);
                            }

                            for(int i=0; i<3; i++){
                                String nombre2 = JOptionPane.showInputDialog(null, "Ingrese el nombre del DELANTERO " + (i+1));
                                int dorsal4 = 9+i;
                                int remates3 = random.nextInt(15);
                                jugador4 = new NoArquero(equipo2, nombre2, dorsal4, remates3);
                                listaVisit.add(jugador4);
                            }

                            JOptionPane.showMessageDialog(null,"Equipo Visitante Registrado");
                        }
                    }
                } 

                if(opcion == 2){
                    Jugador.simular();
                    System.out.println("----2");
                }

                if(opcion == 3){
                        JOptionPane.showMessageDialog(null, "ESTADISTICAS\n" + equipo +
                                                                        posesionLocal + "%" + 
                                                                        " Posesion " + equipo2 + posesionVisit + "%\n"
                                                                        + equipo + rematesLocal + " Remates " + equipo2 + rematesVisit
                                                                        + "\n" + equipo + golesLocal + " GOLES " + equipo2 + golesVisit);
                }

                if(opcion == 4){
                    break;
                }

                
            } catch (Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error");
            }
        }    
    }
}
