package UltimoLaboratorio.Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaUno extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		
		JLabel lblNewLabel = new JLabel("CALCULADORA DE AREA Y PERIMETRO");
		lblNewLabel.setBounds(126, 31, 214, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("INGRESE UNA OPCION:");
		lblNewLabel_1.setBounds(52, 73, 139, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("CIRCULO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaCirculo ventanaCirc = new PantallaCirculo();
				ventanaCirc.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(35, 153, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CUADRADO");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaCuadrado ventanaCuad = new PantallaCuadrado();
				ventanaCuad.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(172, 153, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("TRIANGULO");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaTriangulo ventanaTrian = new PantallaTriangulo();
				ventanaTrian.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(285, 153, 102, 23);
		contentPane.add(btnNewButton_2);
	}
}
