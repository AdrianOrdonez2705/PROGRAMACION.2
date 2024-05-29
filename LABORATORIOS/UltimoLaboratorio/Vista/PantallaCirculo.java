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

public class PantallaCirculo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField colorCirculo;
	private JTextField nombreCirculo;
	private JTextField radioCirculo;

	/**
	 * Create the frame.
	 */
	public PantallaCirculo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CIRCULO");
		lblNewLabel.setBounds(188, 24, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("COLOR:");
		lblNewLabel_1.setBounds(34, 54, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NOMBRE:");
		lblNewLabel_2.setBounds(34, 93, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("RADIO:");
		lblNewLabel_3.setBounds(34, 134, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		colorCirculo = new JTextField();
		colorCirculo.setBounds(90, 51, 118, 20);
		contentPane.add(colorCirculo);
		colorCirculo.setColumns(10);
		
		nombreCirculo = new JTextField();
		nombreCirculo.setBounds(90, 90, 118, 20);
		contentPane.add(nombreCirculo);
		nombreCirculo.setColumns(10);
		
		radioCirculo = new JTextField();
		radioCirculo.setBounds(87, 131, 121, 20);
		contentPane.add(radioCirculo);
		radioCirculo.setColumns(10);
		
		JTextArea textoCirculo = new JTextArea();
		textoCirculo.setBounds(34, 169, 286, 81);
		contentPane.add(textoCirculo);
		
		JButton btnNewButton = new JButton("CALCULAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String color = colorCirculo.getText();
					String name = nombreCirculo.getText();
					double radio = Double.parseDouble(radioCirculo.getText());
					double pi = 3.1416;
					
					Circulo circle = new Circulo(color,name,radio,pi);
					
					double areaCirculo = circle.area();
					double perimetroCirculo = circle.perimetro();
					
					textoCirculo.setText("El círculo " + name 
										 + "\nde color " + color
										 + "\ntiene un área de " + areaCirculo
										 + "\ny un perímetro de " + perimetroCirculo);
					
				} catch(Exception f) {
					f.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(294, 89, 89, 23);
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
