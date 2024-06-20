package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Conexion;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class AgregarDocenteNacional extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCarnet;
	private JTextField textResidencia;
	private JTextField textPaterno;
	private JTextField textNombre;
	private JTextField textTitulo;
	private JTextField textTelefono;
	private JTextField textMaterno;
	private JTextField textAnio;
	public int tipo_usuario = 1;
	public int tipo_docente = 1;
	public int id = 0;
	private JTextField correo;

	/**
	 * Create the frame.
	 */
	public AgregarDocenteNacional() {
		setTitle("Agregar Docente Nacional");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 507, 329);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Apellidos:");
		lblNewLabel.setBounds(10, 10, 158, 13);
		contentPane.add(lblNewLabel);
		
		JButton btnVolverDosUno = new JButton("VOLVER");
		btnVolverDosUno.setBounds(42, 261, 85, 21);
		btnVolverDosUno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AgregarDocente ventanaAgregarDocente = new AgregarDocente();
				ventanaAgregarDocente.setVisible(true);
				ventanaAgregarDocente.setLocationRelativeTo(null);
				dispose();
			}
		});
		contentPane.add(btnVolverDosUno);
		
		JLabel lblCarnet = new JLabel("Carnet");
		lblCarnet.setBounds(10, 145, 45, 13);
		contentPane.add(lblCarnet);
		
		JLabel lblResidencia = new JLabel("Residencia");
		lblResidencia.setBounds(187, 177, 57, 13);
		contentPane.add(lblResidencia);
		
		JLabel lblPaterno = new JLabel("Paterno");
		lblPaterno.setBounds(10, 33, 57, 13);
		contentPane.add(lblPaterno);
		
		JLabel lblMaterno = new JLabel("Materno");
		lblMaterno.setBounds(10, 61, 57, 13);
		contentPane.add(lblMaterno);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 87, 70, 13);
		contentPane.add(lblNombre);
		
		JLabel lblTitulo = new JLabel("Titulo");
		lblTitulo.setBounds(10, 116, 45, 13);
		contentPane.add(lblTitulo);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(10, 177, 45, 13);
		contentPane.add(lblTelefono);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha de Nacimiento:");
		lblFechaNacimiento.setBounds(254, 13, 104, 13);
		contentPane.add(lblFechaNacimiento);
		
		JLabel lblAnio = new JLabel("Año");
		lblAnio.setBounds(320, 33, 24, 13);
		contentPane.add(lblAnio);
		
		JLabel lblMes = new JLabel("Mes");
		lblMes.setBounds(320, 61, 24, 13);
		contentPane.add(lblMes);
		
		JLabel lblDia = new JLabel("Día");
		lblDia.setBounds(320, 98, 24, 13);
		contentPane.add(lblDia);
		
		JLabel lblDeptoNacimiento = new JLabel("Depto. Nacimiento");
		lblDeptoNacimiento.setBounds(251, 129, 93, 13);
		contentPane.add(lblDeptoNacimiento);
		
		textCarnet = new JTextField();
		textCarnet.setBounds(90, 142, 96, 19);
		contentPane.add(textCarnet);
		textCarnet.setColumns(10);
		
		textResidencia = new JTextField();
		textResidencia.setBounds(254, 174, 196, 19);
		contentPane.add(textResidencia);
		textResidencia.setColumns(10);
		
		textPaterno = new JTextField();
		textPaterno.setBounds(90, 30, 96, 19);
		contentPane.add(textPaterno);
		textPaterno.setColumns(10);
		
		textMaterno = new JTextField();
		textMaterno.setBounds(90, 58, 96, 19);
		contentPane.add(textMaterno);
		textMaterno.setColumns(10);
		
		textNombre = new JTextField();
		textNombre.setBounds(90, 84, 96, 19);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textTitulo = new JTextField();
		textTitulo.setBounds(90, 113, 96, 19);
		contentPane.add(textTitulo);
		textTitulo.setColumns(10);
		
		textTelefono = new JTextField();
		textTelefono.setBounds(90, 174, 78, 19);
		contentPane.add(textTelefono);
		textTelefono.setColumns(10);
		
		textAnio = new JTextField();
		textAnio.setBounds(354, 36, 96, 19);
		contentPane.add(textAnio);
		textAnio.setColumns(10);
		
		String[] departamentos = {"Pando","Beni","La Paz",
				  				  "Cochabamba","Santa Cruz","Oruro",
				  				  "Chuquisaca","Potosí","Tarija"};
		JComboBox comboBoxDeptoNacimiento = new JComboBox(departamentos);
		comboBoxDeptoNacimiento.setBounds(354, 125, 96, 21);
		contentPane.add(comboBoxDeptoNacimiento);
		
		String[] meses = {"Enero","Febrero","Marzo",
				  		  "Abril","Mayo","Junio",
				  		  "Julio","Agosto","Septiembre",
				  		  "Octubre","Noviembre","Diciembre"};
		JComboBox comboBoxMes = new JComboBox(meses);
		comboBoxMes.setBounds(354, 61, 96, 21);
		contentPane.add(comboBoxMes);
		
		String[] dias = new String[31];
		for(int i=0; i < 31; i++) {
			dias[i] = String.valueOf(i+1);
		}
		JComboBox comboBoxDia = new JComboBox(dias);
		comboBoxDia.setBounds(354, 94, 96, 21);
		contentPane.add(comboBoxDia);
		
		JLabel lblCorreoElectrnico = new JLabel("correo electrónico:");
		lblCorreoElectrnico.setBounds(10, 209, 131, 13);
		contentPane.add(lblCorreoElectrnico);
		
		correo = new JTextField();
		correo.setColumns(10);
		correo.setBounds(187, 206, 277, 19);
		contentPane.add(correo);
		
		JButton btnConfirmarTres = new JButton("CONFIRMAR");
		btnConfirmarTres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					if(comprobarCamposLlenos()) 
					{
						if (comprobarNumerico()) 
						{
							if (comprobarAnioValido()) 
							{
								int dia = comboBoxDia.getSelectedIndex() + 1;
								int mes = comboBoxMes.getSelectedIndex() + 1;
								int anio = Integer.parseInt(textAnio.getText().trim());
								
								if (comprobarFechaValida(dia,mes,anio)) 
								{
									// Composición del apellido
									String paterno = textPaterno.getText().toUpperCase();
									String materno = textMaterno.getText().toUpperCase();
									
									//String apellido = paterno + " " + materno;
									
									// Variables oficiales para la base de datos:
									String carnet = textCarnet.getText();
									String nacionalidad = "BOLIVIANA";
									String deptoNacimiento = comboBoxDeptoNacimiento.getSelectedItem().toString().toUpperCase();
									String residencia = textResidencia.getText();
									String nombre = textNombre.getText().toUpperCase();
									String apellido = paterno + " " + materno;
									String telefono = textTelefono.getText();
									String titulo = textTitulo.getText().toUpperCase();
									String tipoDocente = "NACIONAL";
									String fechaNacimiento = anio + "-" + mes + "-" + dia;

									// Una vez registrado, se restablecen los campos 
									
									Conexion conn = new Conexion();
									//Connection conexion = Conexion.conectar();
									
									//Se puede insertar el correo para enviar por correo
									conn.crearUsuario(apellido, nombre, tipo_usuario);
									
									int idDocente = conn.insertarDocente(apellido, nombre, titulo, tipoDocente, fechaNacimiento, telefono);
									
									JOptionPane.showMessageDialog(null, "Se registró con éxito, IdUsuario = "+id+" Id Docente: "+idDocente);
									
									restablecerCampos();
								}
								else 
								{
									JOptionPane.showMessageDialog(null, "La fecha no es válida");
								}
							}
							else 
							{
								JOptionPane.showMessageDialog(null, "El año no es válido");
							}
						}
						else 
						{
							JOptionPane.showMessageDialog(null, "Teléfono y Año deben ser enteros");
						}
					}
					else 
					{
						JOptionPane.showMessageDialog(null, "Todos los campos deben ser llenados");
					}
					
					
				} catch(Exception f) {
					f.printStackTrace();
				}
			}
		});
		btnConfirmarTres.setBounds(306, 261, 96, 21);
		contentPane.add(btnConfirmarTres);
		
		
	}
	
	// Comprobar que todos los campos estén llenados
	private boolean comprobarCamposLlenos(){
			
		boolean noVacio = true;
		JTextField[] campos = {textNombre, textPaterno, textMaterno, textTelefono, 
							   textResidencia, textCarnet, textTitulo,
							   textAnio,correo};
		for (JTextField campo : campos) {
			if (campo.getText().trim().isEmpty()) {
				noVacio = false;
				break;
			}
		}
		return noVacio;
	}
	
	// Comprobar que el teléfono y año sean números enteros
	private boolean comprobarNumerico() {
			
		boolean numerico = true;
		try {
			Integer.parseInt(textTelefono.getText().trim());
			Integer.parseInt(textAnio.getText().trim());
		} catch (NumberFormatException f) {
			numerico = false;
		}
		return numerico;
	}
	
	// Comprobar que el año sea razonable (en este caso de 1900 hasta 2024)
	private boolean comprobarAnioValido() {
		boolean anioValido = true;
		int anio = Integer.parseInt(textAnio.getText().trim()); 
		if(anio >= 2025 || anio <= 1899) {
			anioValido = false;
		}
		return anioValido;
	}
	
	// Comprobar que los días y meses sean acordes
		private boolean comprobarFechaValida(int dia, int mes, int anio) {
	        boolean fechaValida = true;

	        if (mes < 1 || mes > 12) 
	        {
	            fechaValida = false;
	        } 
	        else 
	        {
	            switch (mes) {
	                case 2: 
	                	
	                    if (comprobarBisiesto(anio)) 
	                    {
	                        if (dia < 1 || dia > 29) 
	                        {
	                            fechaValida = false;
	                        }
	                    } 
	                    
	                    else 
	                    {
	                        if (dia < 1 || dia > 28) 
	                        {
	                            fechaValida = false;
	                        }
	                    }
	                    break;
	                case 4: 
	                case 6:
	                case 9:
	                case 11:
	                    if (dia < 1 || dia > 30) 
	                    {
	                        fechaValida = false;
	                    }
	                    break;
	                default:
	                    if (dia < 1 || dia > 31) 
	                    {
	                        fechaValida = false;
	                    }
	                    break;
	            }
	        }

	        return fechaValida;
	    }
	
	// Comprobar los años bisiestos
	private boolean comprobarBisiesto(int anio) {
	    return (anio % 4 == 0) && (anio % 100 != 0 || anio % 400 == 0);
	}
	
	// Cuando ya se registra, se restablecen los campos
    private void restablecerCampos() {
        textNombre.setText("");
        textPaterno.setText("");
        textMaterno.setText("");
        textTelefono.setText("");
        textTitulo.setText("");
        textResidencia.setText("");
        textCarnet.setText("");
        textAnio.setText("");
    }
}
