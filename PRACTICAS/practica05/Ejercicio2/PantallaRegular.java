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

public class PantallaRegular extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nombres;
	private JTextField carnets;
	private JTextField fechas;
	private JTextField carreras;
	private JTextField nacionalidades;
	private JTextField departamentos;
	private JTextField ubicaciones;

	/**
	 * Create the frame.
	 */
	public PantallaRegular(ArrayList<Estudiante> lista) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTRAR ESTUDIANTE REGULAR");
		lblNewLabel.setBounds(22, 21, 191, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(22, 56, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Carnet:");
		lblNewLabel_2.setBounds(22, 81, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Fecha Nacimiento:");
		lblNewLabel_3.setBounds(22, 108, 88, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Carrera:");
		lblNewLabel_4.setBounds(22, 136, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Nacionalidad:");
		lblNewLabel_5.setBounds(22, 161, 64, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Departamento:");
		lblNewLabel_6.setBounds(22, 186, 88, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Ubicacion:");
		lblNewLabel_7.setBounds(22, 221, 64, 14);
		contentPane.add(lblNewLabel_7);
		
		nombres = new JTextField();
		nombres.setBounds(78, 53, 86, 20);
		contentPane.add(nombres);
		nombres.setColumns(10);
		
		carnets = new JTextField();
		carnets.setBounds(78, 78, 86, 20);
		contentPane.add(carnets);
		carnets.setColumns(10);
		
		fechas = new JTextField();
		fechas.setBounds(127, 105, 86, 20);
		contentPane.add(fechas);
		fechas.setColumns(10);
		
		carreras = new JTextField();
		carreras.setBounds(78, 133, 86, 20);
		contentPane.add(carreras);
		carreras.setColumns(10);
		
		nacionalidades = new JTextField();
		nacionalidades.setBounds(96, 158, 86, 20);
		contentPane.add(nacionalidades);
		nacionalidades.setColumns(10);
		
		departamentos = new JTextField();
		departamentos.setBounds(106, 183, 86, 20);
		contentPane.add(departamentos);
		departamentos.setColumns(10);
		
		ubicaciones = new JTextField();
		ubicaciones.setBounds(78, 218, 86, 20);
		contentPane.add(ubicaciones);
		ubicaciones.setColumns(10);
		
		JButton btnNewButton = new JButton("REGISTRAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String name = nombres.getText();
					int ci = Integer.parseInt(carnets.getText());
					String date = fechas.getText();
					String degree = carreras.getText();
					String citen = nacionalidades.getText();
					String dep = departamentos.getText();
					String ubi = ubicaciones.getText();
					
					EstudianteRegular estudiante = new EstudianteRegular(name,ci,date,degree,citen,dep,ubi);
					lista.add(estudiante);
					
				} catch(Exception f) {
					f.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(295, 104, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("VOLVER");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaUno ventana = new PantallaUno();
				ventana.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(295, 217, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
