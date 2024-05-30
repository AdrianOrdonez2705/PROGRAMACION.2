package PRACTICAS.practica04.Ejercicio1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.util.ArrayList;
import java.util.List;


public class Correos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField direccionCorreo;
	public int counterGmail = 0;
	public int counterHotmail = 0;
	public int counterLive = 0;
	public int counterYahoo = 0;
	List<String> listaCorreos = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Correos frame = new Correos();
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
	public Correos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CREADOR DE CORREOS");
		lblNewLabel.setBounds(155, 46, 117, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Correo: ");
		lblNewLabel_1.setBounds(46, 101, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		direccionCorreo = new JTextField();
		direccionCorreo.setBounds(95, 98, 190, 19);
		contentPane.add(direccionCorreo);
		direccionCorreo.setColumns(10);
		
		JTextArea Desplegado = new JTextArea();
		Desplegado.setBounds(46, 150, 239, 103);
		contentPane.add(Desplegado);
		
		JButton btnNewButton = new JButton("CREAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					String mail = direccionCorreo.getText();
					
					if(listaCorreos.contains(mail)) {
						return;
					}
					
					else {
						
						listaCorreos.add(mail);
						
						if(mail.endsWith("@gmail.com")) {
							counterGmail += 1;
						}
						if(mail.endsWith("@hotmail.com")) {
							counterHotmail += 1;
						}
						if(mail.endsWith("@live.com")) {
							counterLive += 1;
						}
						if(mail.endsWith("@yahoo.com")) {
							counterYahoo += 1;
						} 
		
					}
					
					String texto = "Gmail: " + counterGmail + "\n"
						  + "hotmail: " + counterHotmail + "\n"
						  + "live: " + counterLive + "\n"
						  + "yahoo: " + counterYahoo + "\n";

		            Desplegado.setText(texto);
					
				} catch (Exception f) {
					f.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(319, 97, 85, 21);
		contentPane.add(btnNewButton);
		
	}
}
