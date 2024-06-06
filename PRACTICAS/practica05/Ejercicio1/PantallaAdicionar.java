package PRACTICAS.practica05.Ejercicio1;

import java.util.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class PantallaAdicionar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField code;
	private JTextField name;
	private JTextField price;
	private JTextField stocks;
	
	public JRadioButton lacteos;
	public JRadioButton carnes;
	public JRadioButton frutas;
	
	/**
	 * Create the frame.
	 */
	public PantallaAdicionar(ArrayList<product>prod) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADICION");
		lblNewLabel.setBounds(180, 11, 64, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Código:");
		lblNewLabel_1.setBounds(29, 41, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre:");
		lblNewLabel_2.setBounds(29, 66, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tipo:");
		lblNewLabel_3.setBounds(243, 36, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Precio Unitario:");
		lblNewLabel_4.setBounds(26, 94, 95, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Stock:");
		lblNewLabel_5.setBounds(29, 138, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		code = new JTextField();
		code.setBounds(77, 38, 86, 20);
		contentPane.add(code);
		code.setColumns(10);
		
		name = new JTextField();
		name.setBounds(77, 63, 86, 20);
		contentPane.add(name);
		name.setColumns(10);
		
		price = new JTextField();
		price.setBounds(103, 91, 86, 20);
		contentPane.add(price);
		price.setColumns(10);
		
		stocks = new JTextField();
		stocks.setBounds(103, 135, 86, 20);
		contentPane.add(stocks);
		stocks.setColumns(10);
		
		JButton btnNewButton = new JButton("VOLVER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaUno ventana = new PantallaUno();
				ventana.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(10, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ADICIONAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					product producto = null;
					while (true){
						int codigo = Integer.parseInt(code.getText());
						String nombre = name.getText();
						double precio = Double.parseDouble(price.getText());
						int stock = Integer.parseInt(stocks.getText());
						double discount = 5;
						
						if(lacteos.isSelected()) {
							producto = new Lacteo(codigo,nombre,precio,stock,discount);
							prod.add(producto);
						}
						else {
							if(carnes.isSelected()) {
								producto = new Carne(codigo,nombre,precio,stock,discount);
								prod.add(producto);
							}
							else {
								if(frutas.isSelected()) {
									producto = new Fruta(codigo,nombre,precio,stock,discount);
									prod.add(producto);
								}
							}
						}
						
						
						
						
						
					}
					
				} catch (Exception f) {
					f.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(265, 198, 122, 23);
		contentPane.add(btnNewButton_1);
		
		lacteos = new JRadioButton("LACTEO");
		lacteos.setSelected(true);
		lacteos.setBounds(278, 62, 109, 23);
		contentPane.add(lacteos);
		
		carnes = new JRadioButton("CARNE");
		carnes.setBounds(278, 90, 109, 23);
		contentPane.add(carnes);
		
		frutas = new JRadioButton("FRUTA");
		frutas.setBounds(278, 116, 109, 23);
		contentPane.add(frutas);
		
		ButtonGroup grupoRB = new ButtonGroup();
		grupoRB.add(lacteos);
		grupoRB.add(carnes);
		grupoRB.add(frutas);
	}
}
