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

public class PantallaTriangulo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField colorTriangulo;
	private JTextField nombreTriangulo;
	private JTextField ladoTriangulo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaTriangulo frame = new PantallaTriangulo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PantallaTriangulo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TRIANGULO");
		lblNewLabel.setBounds(173, 23, 99, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("COLOR:");
		lblNewLabel_1.setBounds(36, 56, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NOMBRE:");
		lblNewLabel_2.setBounds(36, 97, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("LADO DEL TRIANGULO:");
		lblNewLabel_3.setBounds(34, 135, 118, 14);
		contentPane.add(lblNewLabel_3);
		
		colorTriangulo = new JTextField();
		colorTriangulo.setBounds(92, 53, 161, 20);
		contentPane.add(colorTriangulo);
		colorTriangulo.setColumns(10);
		
		nombreTriangulo = new JTextField();
		nombreTriangulo.setBounds(92, 94, 161, 20);
		contentPane.add(nombreTriangulo);
		nombreTriangulo.setColumns(10);
		
		ladoTriangulo = new JTextField();
		ladoTriangulo.setBounds(162, 132, 86, 20);
		contentPane.add(ladoTriangulo);
		ladoTriangulo.setColumns(10);
		
		JTextArea textoTriangulo = new JTextArea();
		textoTriangulo.setBounds(30, 165, 303, 85);
		contentPane.add(textoTriangulo);
		
		JButton btnNewButton = new JButton("CALCULAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					String color = colorTriangulo.getText();
					String name = nombreTriangulo.getText();
					double side = Double.parseDouble(ladoTriangulo.getText());
					
					Triangulo triangle = new Triangulo(color,name,side);
					
					double areaTriangulo = triangle.area();
					double perimetroTriangulo = triangle.perimetro();
					
					textoTriangulo.setText("El triángulo " + name
							 + "\nde color " + color
							 + "\ntiene un área de " + areaTriangulo
							 + "\ny un perímetro de " + perimetroTriangulo);
					
				} catch(Exception f) {
					f.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(306, 88, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("VOLVER");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaUno app = new PantallaUno();
				app.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(10, 14, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
