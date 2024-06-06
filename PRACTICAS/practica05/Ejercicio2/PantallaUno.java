package PRACTICAS.practica05.Ejercicio2;

import java.util.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class PantallaUno extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public ArrayList<Estudiante> lista;


	/**
	 * Create the frame.
	 */
	public PantallaUno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ESTUDIANTES NUEVOS");
		lblNewLabel.setBounds(142, 11, 130, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("ESTUDIANTE REGULAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaRegular ventanaUno = new PantallaRegular(lista);
				ventanaUno.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(36, 52, 166, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ESTUDIANTE EXTRANJERO");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaExtranjero ventanaDos = new PantallaExtranjero(lista);
				ventanaDos.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(40, 111, 162, 23);
		contentPane.add(btnNewButton_1);
		
		JTextArea textoReporte = new JTextArea();
		textoReporte.setBounds(36, 169, 358, 92);
		contentPane.add(textoReporte);
		
		JButton btnNewButton_2 = new JButton("REPORTE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(Estudiante estud : lista) {
					textoReporte.setText("Nombre: " + estud.getNombre()
										+ "\nCarnet: " + estud.getCarnet()
										+ "\nFecha Nacimiento: " + estud.getFecha()
										+ "\nCarrera: " + estud.getCarrera()
										+ "\nNacionalidad: " + estud.getNacionalidad()
										+ "\nUbicacion: " + estud.getUbicacion());
				}
			}
		});
		btnNewButton_2.setBounds(282, 78, 89, 23);
		contentPane.add(btnNewButton_2);
		
		
	}

}
