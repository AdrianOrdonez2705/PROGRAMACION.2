package PRACTICAS.practica04.Ejercicio3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;

public class SimulacionDados extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField cantidadLanzamientos;
	
	public JRadioButton varSeisCaras;
	public JRadioButton varOchoCaras;
	
	public int cara;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimulacionDados frame = new SimulacionDados();
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
	public SimulacionDados() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SIMULACION DE DADOS");
		lblNewLabel.setBounds(10, 10, 131, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CARAS");
		lblNewLabel_1.setBounds(10, 51, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("LANZAMIENTOS:");
		lblNewLabel_2.setBounds(10, 98, 97, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Promedio:");
		lblNewLabel_3.setBounds(237, 139, 66, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Cara mayor:");
		lblNewLabel_4.setBounds(237, 169, 66, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Cara menor:");
		lblNewLabel_5.setBounds(237, 195, 66, 13);
		contentPane.add(lblNewLabel_5);
		
		cantidadLanzamientos = new JTextField();
		cantidadLanzamientos.setBounds(99, 95, 159, 19);
		contentPane.add(cantidadLanzamientos);
		cantidadLanzamientos.setColumns(10);
		
		JTextArea textoSimulacion = new JTextArea();
		textoSimulacion.setBounds(10, 133, 217, 130);
		contentPane.add(textoSimulacion);
		
		JTextArea textoPromedio = new JTextArea();
		textoPromedio.setBounds(302, 133, 75, 22);
		contentPane.add(textoPromedio);
		
		JTextArea textoCaraMayor = new JTextArea();
		textoCaraMayor.setBounds(310, 162, 67, 22);
		contentPane.add(textoCaraMayor);
		
		JTextArea textoCaraMenor = new JTextArea();
		textoCaraMenor.setBounds(313, 189, 67, 22);
		contentPane.add(textoCaraMenor);
		
		JButton btnNewButton = new JButton("SIMULAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					int suma = 0;
					int promedioCaras;
					int[] veces = new int[6];
					int[] vecesOcho = new int[8];
					
		            Random random = new Random();
		            
		            if (varSeisCaras.isSelected()) {
		            	
		                int cantidad = Integer.parseInt(cantidadLanzamientos.getText());
		                StringBuilder simulacion = new StringBuilder(); 

		                for (int i = 0; i < cantidad; i++) {
		                    cara = random.nextInt(6 - 1 + 1) + 1;
		                    veces[cara - 1] += 1;
		                    suma += cara;
		                    simulacion.append("lanzado (").append(i+1).append("): ").append(cara).append("\n"); 
		                }
		                          
		                textoSimulacion.setText(simulacion.toString()); 
		                
		                promedioCaras = suma/cantidad;
		                textoPromedio.setText("" + promedioCaras);
		                
		                int mayor = veces[0];
		                int indiceMayor = 1;
		                
		                for(int j = 1; j < 6; j++) {
		                	if(veces[j] > mayor) {
		                		mayor = veces[j];
		                		indiceMayor = j + 1;
		                	}
		                }
		                
		                textoCaraMayor.setText("" + indiceMayor);
		                
		                int menor = mayor;
		                int indiceMenor = -1;
		                
		                for(int k = 0; k < 6; k++) {
		                	if(veces[k] < menor) {
		                		menor = veces[k];
		                		indiceMenor = k+1;
		                	}
		                }
		                
		                textoCaraMenor.setText("" + indiceMenor);
		            }
		            ////////
		            else {
		            	if (varOchoCaras.isSelected()) {
			            	
			                int cantidad = Integer.parseInt(cantidadLanzamientos.getText());
			                StringBuilder simulacion = new StringBuilder(); 

			                for (int i = 0; i < cantidad; i++) {
			                    cara = random.nextInt(8 - 1 + 1) + 1;
			                    vecesOcho[cara - 1] += 1;
			                    suma += cara;
			                    simulacion.append("lanzado (").append(i+1).append("): ").append(cara).append("\n"); 
			                }
			                          
			                textoSimulacion.setText(simulacion.toString()); 
			                
			                promedioCaras = suma/cantidad;
			                textoPromedio.setText("" + promedioCaras);
			                
			                int mayor = vecesOcho[0];
			                int indiceMayor = 1;
			                
			                for(int j = 1; j < 8; j++) {
			                	if(vecesOcho[j] > mayor) {
			                		mayor = vecesOcho[j];
			                		indiceMayor = j + 1;
			                	}
			                }
			                
			                textoCaraMayor.setText("" + indiceMayor);
			                
			                int menor = mayor;
			                int indiceMenor = -1;
			                
			                for(int k = 0; k < 8; k++) {
			                	if(vecesOcho[k] < menor) {
			                		menor = vecesOcho[k];
			                		indiceMenor = k+1;
			                	}
			                }
			                
			                textoCaraMenor.setText("" + indiceMenor);
			            }
		            }
		            
		        } catch (Exception f) {
		            f.printStackTrace();
		        }
			}
		});
		btnNewButton.setBounds(307, 94, 85, 21);
		contentPane.add(btnNewButton);
		
		varSeisCaras = new JRadioButton("6 CARAS");
		varSeisCaras.setSelected(true);
		varSeisCaras.setBounds(61, 47, 85, 21);
		contentPane.add(varSeisCaras);
		
		varOchoCaras = new JRadioButton("8 CARAS");
		varOchoCaras.setBounds(172, 47, 103, 21);
		contentPane.add(varOchoCaras);
		
		ButtonGroup grupoRB = new ButtonGroup();
		grupoRB.add(varSeisCaras);
		grupoRB.add(varOchoCaras);
		
	}
	
	public JRadioButton getVarSeisCaras() {
		return varSeisCaras;
	}
	public JRadioButton getVarOchoCaras() {
		return varOchoCaras;
	}
	public int getCara() {
		return cara;
	}
	
	public void setVarSeisCaras(JRadioButton varSeisCaras) {
		this.varSeisCaras = varSeisCaras;
	}
	public void setVarOchoCaras(JRadioButton varOchoCaras) {
		this.varOchoCaras = varOchoCaras;
	}
	public void setCara(int cara) {
		this.cara = cara;
	}
	
}
