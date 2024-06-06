package PRACTICAS.practica05.Ejercicio1;

import java.util.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaReporte extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public PantallaReporte(ArrayList<product> prod) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(37, 44, 347, 206);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("VER REPORTE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(product producto : prod){
                    textArea.setText(producto.getCodigo()
                                    +producto.getNombre()
                                    +producto.getPrecioUnitario()
                                    +producto.getStock()
                                    +producto.getDescuento());
                }
			}
		});
		btnNewButton.setBounds(159, 10, 113, 23);
		contentPane.add(btnNewButton);
	}
}
