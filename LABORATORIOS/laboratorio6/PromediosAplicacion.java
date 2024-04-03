package laboratorio6;

import javax.swing.JOptionPane;

public class PromediosAplicacion {
    public static void main(String[] args) {
        double exam = 0;
        double practica = 0;
        double labos = 0;
        double asist = 0;

        double notaParcial1 = 0;
        double notaParcial2 = 0;
        double notaParcial3 = 0;

        double parciales = 0;
        double proy = 0;

        String[] opciones = {"Primer Parcial", "Segundo Parcial", "Tercer Parcial", "PRIMER TURNO 1T"};
        var entrada = JOptionPane.showOptionDialog(null, "ELIJA UNA OPCION", "MENU", 0, 3, null, opciones, opciones[0]);

        if(entrada == 0){
            String ex1 = JOptionPane.showInputDialog(null,"Ingrese nota del primer examen: ","EXAMEN 1",3);
            String prac1 = JOptionPane.showInputDialog(null,"Ingrese nota de practicas: ","PRACTICAS",3);
            String lab1 = JOptionPane.showInputDialog(null,"Ingrese nota de laboratorios: ","LABORATORIOS",3);
            String as1 = JOptionPane.showInputDialog(null,"Ingrese nota de asistencia: ","ASISTENCIA PERFECTA?",3);

            exam = Double.parseDouble(ex1);
            practica = Double.parseDouble(prac1);
            labos = Double.parseDouble(lab1);
            asist = Double.parseDouble(as1);

            PromediosParciales parcial1 = new PromediosParciales(exam, practica, labos, asist);

            notaParcial1 = parcial1.primerParcial();
            JOptionPane.showMessageDialog(null, "NOTA DEL PRIMER PARCIAL: " + notaParcial1, "PARCIAL 1", 1);
        }
        if(entrada == 1){
            String ex2 = JOptionPane.showInputDialog(null,"Ingrese nota del segundo examen: ","EXAMEN 2",3);
            String prac2 = JOptionPane.showInputDialog(null,"Ingrese nota de practicas: ","PRACTICAS",3);
            String lab2 = JOptionPane.showInputDialog(null,"Ingrese nota de laboratorios: ","LABORATORIOS",3);
            String as2 = JOptionPane.showInputDialog(null,"Ingrese nota de asistencia: ","ASISTENCIA PERFECTA?",3);

            exam = Double.parseDouble(ex2);
            practica = Double.parseDouble(prac2);
            labos = Double.parseDouble(lab2);
            asist = Double.parseDouble(as2);

            PromediosParciales parcial2 = new PromediosParciales(exam, practica, labos, asist);

            notaParcial2 = parcial2.primerParcial();
            JOptionPane.showMessageDialog(null, "NOTA DEL SEGUNDO PARCIAL: " + notaParcial2, "PARCIAL 2", 1);
        }
        if(entrada == 2){
            String ex3 = JOptionPane.showInputDialog(null,"Ingrese nota del tercer examen: ","EXAMEN 3",3);
            String prac3 = JOptionPane.showInputDialog(null,"Ingrese nota de practicas: ","PRACTICAS",3);
            String lab3 = JOptionPane.showInputDialog(null,"Ingrese nota de laboratorios: ","LABORATORIOS",3);
            String as3 = JOptionPane.showInputDialog(null,"Ingrese nota de asistencia: ","ASISTENCIA PERFECTA?",3);

            exam = Double.parseDouble(ex3);
            practica = Double.parseDouble(prac3);
            labos = Double.parseDouble(lab3);
            asist = Double.parseDouble(as3);

            PromediosParciales parcial3 = new PromediosParciales(exam, practica, labos, asist);

            notaParcial3 = parcial3.primerParcial();
            JOptionPane.showMessageDialog(null, "NOTA DEL TERCER PARCIAL: " + notaParcial3, "PARCIAL 3", 1);
        }
        if(entrada == 3){
            parciales = notaParcial1 + notaParcial2 + notaParcial3;
            String proy1 = JOptionPane.showInputDialog(null, "Ingrese la nota del proyecto final", "PROYECTO", 3);
            proy = Double.parseDouble(proy1);

            PromediosFinales promedioFinal = new PromediosFinales(parciales, proy);
            JOptionPane.showMessageDialog(null, "NOTA FINAL: " + promedioFinal, "PROMEDIO FINAL", 1);
        }
    }
}
