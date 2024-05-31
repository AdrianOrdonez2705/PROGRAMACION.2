package PRACTICAS.practica04.Ejercicio2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Recuperador extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField contAntigua;
	private JTextField contNueva;
	private JTextField contRepetir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recuperador frame = new Recuperador();
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
	public Recuperador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CAMBIOS DE CONTRASEÑA");
		lblNewLabel.setBounds(23, 10, 134, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario:");
		lblNewLabel_1.setBounds(23, 33, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contraseña Antigua:");
		lblNewLabel_2.setBounds(23, 64, 104, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nueva Contraseña:");
		lblNewLabel_3.setBounds(33, 90, 106, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Repita Contraseña:");
		lblNewLabel_4.setBounds(39, 123, 88, 13);
		contentPane.add(lblNewLabel_4);
		
		JTextArea textoMostrado = new JTextArea();
		textoMostrado.setBounds(33, 156, 352, 97);
		contentPane.add(textoMostrado);
		
		//contraseñas de los (5) usuarios
		String[] passwords = {"pollito12","cerdito45","vaca60","paloma83","caballo97"};
		
		//usuarios
		String[] items = {"usuario12","usuario45","usuario60","usuario83","usuario97"};
		JComboBox usuarios = new JComboBox(items);
		usuarios.setBounds(78, 33, 106, 21);
		contentPane.add(usuarios);
		
		contAntigua = new JTextField();
		contAntigua.setBounds(134, 61, 141, 19);
		contentPane.add(contAntigua);
		contAntigua.setColumns(10);
		
		contNueva = new JTextField();
		contNueva.setBounds(134, 87, 141, 19);
		contentPane.add(contNueva);
		contNueva.setColumns(10);
		
		contRepetir = new JTextField();
		contRepetir.setBounds(134, 120, 141, 19);
		contentPane.add(contRepetir);
		contRepetir.setColumns(10);
		
		JButton btnNewButton = new JButton("CAMBIAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					boolean flagNumero = false;
					String oldPassword = contAntigua.getText();
					String newPassword = contNueva.getText();
					String repPassword = contRepetir.getText();
					
					int user = usuarios.getSelectedIndex();
					
					switch (user) {
						case 0:
							if(!oldPassword.equals("pollito12")) {
								textoMostrado.setText("La antigua contraseña no es correcta");
								break;
							}
							else {
								if(newPassword.length() < 8) {
									textoMostrado.setText("Debe tener al menos 8 caracteres");
									break;
								}
								else {
									if(!newPassword.matches(".*[!@#$%^&*\\(\\)\\[\\]{}|<>].*")) {
										textoMostrado.setText("Debe tener al menos 1 caracter especial");
										break;
									}
									else {
										for (char caracter : newPassword.toCharArray()) {
											if(Character.isDigit(caracter)) {
												flagNumero = true;
												break;
											}
										}
										
										if(flagNumero) {
											if(!repPassword.equals(newPassword)) {
												textoMostrado.setText("Confirme la nueva contraseña correctamente");
											}
											else {
												passwords[0] = newPassword;
												textoMostrado.setText("Contraseña cambiada con éxito");
												break;
											}
										}
									}
								}
							}
							
						case 1:
							if(!oldPassword.equals("cerdito45")) {
								textoMostrado.setText("La antigua contraseña no es correcta");
								break;
							}
							else {
								if(newPassword.length() < 8) {
									textoMostrado.setText("Debe tener al menos 8 caracteres");
									break;
								}
								else {
									if(!newPassword.matches(".*[!@#$%^&*\\(\\)\\[\\]{}|<>].*")) {
										textoMostrado.setText("Debe tener al menos 1 caracter especial");
										break;
									}
									else {
										for (char caracter : newPassword.toCharArray()) {
											if(Character.isDigit(caracter)) {
												flagNumero = true;
												break;
											}
										}
										
										if(flagNumero) {
											if(!repPassword.equals(newPassword)) {
												textoMostrado.setText("Confirme la nueva contraseña correctamente");
											}
											else {
												passwords[1] = newPassword;
												textoMostrado.setText("Contraseña cambiada con éxito");
												break;
											}
										}
									}
								}
							}
						case 2:
							if(!oldPassword.equals("vaca60")) {
								textoMostrado.setText("La antigua contraseña no es correcta");
								break;
							}
							else {
								if(newPassword.length() < 8) {
									textoMostrado.setText("Debe tener al menos 8 caracteres");
									break;
								}
								else {
									if(!newPassword.matches(".*[!@#$%^&*\\(\\)\\[\\]{}|<>].*")) {
										textoMostrado.setText("Debe tener al menos 1 caracter especial");
										break;
									}
									else {
										for (char caracter : newPassword.toCharArray()) {
											if(Character.isDigit(caracter)) {
												flagNumero = true;
												break;
											}
										}
										
										if(flagNumero) {
											if(!repPassword.equals(newPassword)) {
												textoMostrado.setText("Confirme la nueva contraseña correctamente");
											}
											else {
												passwords[2] = newPassword;
												textoMostrado.setText("Contraseña cambiada con éxito");
												break;
											}
										}
									}
								}
							}
						case 3:
							if(!oldPassword.equals("paloma83")) {
								textoMostrado.setText("La antigua contraseña no es correcta");
								break;
							}
							else {
								if(newPassword.length() < 8) {
									textoMostrado.setText("Debe tener al menos 8 caracteres");
									break;
								}
								else {
									if(!newPassword.matches(".*[!@#$%^&*\\(\\)\\[\\]{}|<>].*")) {
										textoMostrado.setText("Debe tener al menos 1 caracter especial");
										break;
									}
									else {
										for (char caracter : newPassword.toCharArray()) {
											if(Character.isDigit(caracter)) {
												flagNumero = true;
												break;
											}
										}
										
										if(flagNumero) {
											if(!repPassword.equals(newPassword)) {
												textoMostrado.setText("Confirme la nueva contraseña correctamente");
											}
											else {
												passwords[3] = newPassword;
												textoMostrado.setText("Contraseña cambiada con éxito");
												break;
											}
										}
									}
								}
							}
						case 4:
							if(!oldPassword.equals("caballo97")) {
								textoMostrado.setText("La antigua contraseña no es correcta");
								break;
							}
							else {
								if(newPassword.length() < 8) {
									textoMostrado.setText("Debe tener al menos 8 caracteres");
									break;
								}
								else {
									if(!newPassword.matches(".*[!@#$%^&*\\(\\)\\[\\]{}|<>].*")) {
										textoMostrado.setText("Debe tener al menos 1 caracter especial");
										break;
									}
									else {
										for (char caracter : newPassword.toCharArray()) {
											if(Character.isDigit(caracter)) {
												flagNumero = true;
												break;
											}
										}
										
										if(flagNumero) {
											if(!repPassword.equals(newPassword)) {
												textoMostrado.setText("Confirme la nueva contraseña correctamente");
											}
											else {
												passwords[4] = newPassword;
												textoMostrado.setText("Contraseña cambiada con éxito");
												break;
											}
										}
									}
								}
							}
									
					}
					
				} catch (Exception f) {
					f.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(323, 86, 85, 21);
		contentPane.add(btnNewButton);
		
	}
	
	public JTextField getContAntigua() {
		return contAntigua;
	}
	
	public JTextField getContNueva() {
		return contNueva;
	}
	
	public JTextField getContRepetir() {
		return contRepetir;
	}
	
	public void setContAntigua(JTextField contAntigua) {
		this.contAntigua = contAntigua;
	}
	
	public void setContNueva(JTextField contNueva) {
		this.contNueva = contNueva;
	}
	
	public void setContRepetir(JTextField contRepetir) {
		this.contRepetir = contRepetir;
	}
	
	
}
