package PRACTICAS.practica05.Ejercicio1;

import java.util.*;
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

	public ArrayList<product> prod;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaUno frame = new PantallaUno();
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
	public PantallaUno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SUPERMERCADO");
		lblNewLabel.setBounds(166, 21, 82, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("ADICIONAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaAdicionar ventanaDos = new PantallaAdicionar(prod);
				ventanaDos.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(45, 60, 105, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("MODIFICAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(45, 111, 105, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ELIMINAR");
		btnNewButton_2.setBounds(47, 164, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("COMPRAR");
		btnNewButton_3.setBounds(61, 210, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("VER REPORTE");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaReporte ventanaCinco = new PantallaReporte(prod);
				ventanaCinco.setVisible(true);
				dispose();
			}
		});
		btnNewButton_4.setBounds(223, 122, 137, 23);
		contentPane.add(btnNewButton_4);
	}
}
