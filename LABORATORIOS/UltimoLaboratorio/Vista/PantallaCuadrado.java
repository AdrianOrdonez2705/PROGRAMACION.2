package UltimoLaboratorio.Vista;

import UltimoLaboratorio.Modelo.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaCuadrado extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField colorCuadrado;
	private JTextField nombreCuadrado;
	private JTextField ladoCuadrado;

	/**
	 * Create the frame.
	 */
	public PantallaCuadrado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CUADRADO");
		lblNewLabel.setBounds(168, 29, 107, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("COLOR:");
		lblNewLabel_1.setBounds(46, 68, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NOMBRE:");
		lblNewLabel_2.setBounds(46, 113, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("LADO:");
		lblNewLabel_3.setBounds(46, 148, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		colorCuadrado = new JTextField();
		colorCuadrado.setBounds(93, 65, 167, 20);
		contentPane.add(colorCuadrado);
		colorCuadrado.setColumns(10);
		
		nombreCuadrado = new JTextField();
		nombreCuadrado.setBounds(102, 110, 158, 20);
		contentPane.add(nombreCuadrado);
		nombreCuadrado.setColumns(10);
		
		ladoCuadrado = new JTextField();
		ladoCuadrado.setBounds(93, 145, 167, 20);
		contentPane.add(ladoCuadrado);
		ladoCuadrado.setColumns(10);
		
		JTextArea textoCuadrado = new JTextArea();
		textoCuadrado.setBounds(46, 180, 272, 70);
		contentPane.add(textoCuadrado);
		
		JButton btnNewButton = new JButton("CALCULAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String color = colorCuadrado.getText();
					String name = nombreCuadrado.getText();
					double side = Double.parseDouble(ladoCuadrado.getText());
					
					Cuadrado square = new Cuadrado(color,name,side);
					
					double areaCuadrado = square.area();
					double perimetroCuadrado = square.perimetro();
					
					textoCuadrado.setText("El cuadrado " + name
										 + "\nde color " + color
										 + "\ntiene un área de " + areaCuadrado
										 + "\ny un perímetro de " + perimetroCuadrado);
					
				} catch(Exception f) {
					f.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(300, 104, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("VOLVER");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaUno app = new PantallaUno();
				app.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(10, 11, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
