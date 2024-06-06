package PRACTICAS.practica05.Ejercicio2;

import java.util.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaExtranjero extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nombres;
	private JTextField ci;
	private JTextField fechas;
	private JTextField degree;
	private JTextField citen;
	private JTextField ubi;
	private JTextField idiomas;
	private JTextField pasaports;


	/**
	 * Create the frame.
	 */
	public PantallaExtranjero(ArrayList<Estudiante> lista) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(26, 24, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Carnet:");
		lblNewLabel_1.setBounds(26, 49, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Fecha Nacimiento:");
		lblNewLabel_2.setBounds(26, 84, 62, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Carrera:");
		lblNewLabel_3.setBounds(26, 119, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nacionalidad:");
		lblNewLabel_4.setBounds(228, 24, 73, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Ubicacion:");
		lblNewLabel_5.setBounds(228, 49, 62, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Idioma:");
		lblNewLabel_6.setBounds(228, 84, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("N° Pasaporte:");
		lblNewLabel_7.setBounds(228, 119, 87, 14);
		contentPane.add(lblNewLabel_7);
		
		nombres = new JTextField();
		nombres.setBounds(79, 21, 86, 20);
		contentPane.add(nombres);
		nombres.setColumns(10);
		
		ci = new JTextField();
		ci.setBounds(82, 46, 86, 20);
		contentPane.add(ci);
		ci.setColumns(10);
		
		fechas = new JTextField();
		fechas.setBounds(92, 81, 86, 20);
		contentPane.add(fechas);
		fechas.setColumns(10);
		
		degree = new JTextField();
		degree.setBounds(79, 116, 86, 20);
		contentPane.add(degree);
		degree.setColumns(10);
		
		citen = new JTextField();
		citen.setBounds(311, 21, 86, 20);
		contentPane.add(citen);
		citen.setColumns(10);
		
		ubi = new JTextField();
		ubi.setBounds(300, 49, 86, 20);
		contentPane.add(ubi);
		ubi.setColumns(10);
		
		idiomas = new JTextField();
		idiomas.setBounds(282, 81, 86, 20);
		contentPane.add(idiomas);
		idiomas.setColumns(10);
		
		pasaports = new JTextField();
		pasaports.setBounds(311, 116, 86, 20);
		contentPane.add(pasaports);
		pasaports.setColumns(10);
		
		JButton btnNewButton = new JButton("REGISTRAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String name = nombres.getText();
					int carnet = Integer.parseInt(ci.getText());
					String date = fechas.getText();
					String carrera = degree.getText();
					String nacionalidad = citen.getText();
					String ubicacion = ubi.getText();
					String lang = idiomas.getText();
					int pasap = Integer.parseInt(pasaports.getText());
					
					EstudianteExtranjero estudiante = new EstudianteExtranjero(name,carnet,date,carrera,nacionalidad,ubicacion,lang,pasap);
					lista.add(estudiante);
					
				} catch(Exception f) {
					f.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(238, 192, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("VOLVER");
		btnNewButton_1.setBounds(10, 192, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
