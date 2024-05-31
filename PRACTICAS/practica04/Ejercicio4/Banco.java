package PRACTICAS.practica04.Ejercicio4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Banco extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField numeroCuenta;
	private JTextField monto;
	
	public JRadioButton debitado;
	public JRadioButton acreditado;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Banco frame = new Banco();
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
	public Banco() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CAJERO AUTOMATICO");
		lblNewLabel.setBounds(10, 10, 123, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nº CUENTA DESTINO:");
		lblNewLabel_1.setBounds(10, 82, 64, 13);
		contentPane.add(lblNewLabel_1);
		
		numeroCuenta = new JTextField();
		numeroCuenta.setBounds(84, 79, 167, 19);
		contentPane.add(numeroCuenta);
		numeroCuenta.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("MONTO (Bs):");
		lblNewLabel_2.setBounds(10, 116, 64, 13);
		contentPane.add(lblNewLabel_2);
		
		monto = new JTextField();
		monto.setBounds(84, 113, 167, 19);
		contentPane.add(monto);
		monto.setColumns(10);
		
		JTextArea textoReporte = new JTextArea();
		textoReporte.setBounds(10, 149, 416, 104);
		contentPane.add(textoReporte);
		
		JButton btnNewButton = new JButton("PROCESAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					double saldo = 80000;
					double enDolar = 0;
					
					if(acreditado.isSelected()) {
						int numCuenta = Integer.parseInt(numeroCuenta.getText());
						double amount = Double.parseDouble(monto.getText());
						enDolar = amount/6.96;
						saldo = saldo - amount;
						
						String texto = "Nº Cuenta Destino: " + numCuenta
									   + "\nMonto Acreditado:\n\tBs: "
									   + amount + "\n\tUSD: " + enDolar
									   + "\nNuevo Saldo (Bs): " + saldo;
						
						textoReporte.setText(texto);
					}
					else {
						if(debitado.isSelected()) {
							int numCuenta = Integer.parseInt(numeroCuenta.getText());
							double amount = Double.parseDouble(monto.getText());
							enDolar = amount/6.96;
							saldo = saldo + amount;
							
							String texto = "Nº Cuenta Origen: " + numCuenta
										   + "\nMonto Debitado:\n\tBs: -"
										   + amount + "\n\tUSD: -" + enDolar
										   + "\nNuevo Saldo (Bs): " + saldo;
							
							textoReporte.setText(texto);
						}
					}
					
				} catch (Exception f) {
					f.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(261, 96, 143, 21);
		contentPane.add(btnNewButton);
		
		acreditado = new JRadioButton("ACREDITAR");
		acreditado.setSelected(true);
		acreditado.setBounds(95, 38, 94, 21);
		contentPane.add(acreditado);
		
		debitado = new JRadioButton("DEBITAR");
		debitado.setBounds(234, 38, 103, 21);
		contentPane.add(debitado);
		
		ButtonGroup grupoRB = new ButtonGroup();
		grupoRB.add(acreditado);
		grupoRB.add(debitado);
		
	}
	
	public JRadioButton getAcreditado() {
		return acreditado;
	}
	public JRadioButton getDebitado() {
		return debitado;
	}
	
	public void setAcreditado(JRadioButton acreditado) {
		this.acreditado = acreditado;
	}
	public void setDebitado(JRadioButton debitado) {
		this.debitado = debitado;
	}
	
}
