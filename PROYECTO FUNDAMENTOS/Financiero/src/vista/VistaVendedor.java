package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaVendedor extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextField textFieldId;
	public JTextField textFieldNombre;
	public JTextField textFieldEdad;
	public JTextField textFieldIngreso;
	public JTextField textFieldTotalVentas;
	public JLabel LabelId;
	public JLabel LabelVendedores;
	public JLabel LabelNombre;
	public JLabel LabelEdad;
	public JLabel LabelIngreso;
	public JLabel LabelTotalVentas;
	public JButton btnAgregar;
	public JButton btnModificar;
	public JButton btnBorrar;
	public JButton btnBuscar;
	
	public VistaVendedor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		LabelVendedores = new JLabel("VENDEDORES");
		LabelVendedores.setFont(new Font("Tahoma", Font.PLAIN, 16));
		LabelVendedores.setBounds(174, 11, 120, 14);
		contentPane.add(LabelVendedores);
		
		LabelId = new JLabel("Identificacion");
		LabelId.setBounds(32, 53, 87, 14);
		contentPane.add(LabelId);
		
		LabelNombre = new JLabel("Nombre");
		LabelNombre.setBounds(32, 74, 46, 14);
		contentPane.add(LabelNombre);
		
		LabelEdad = new JLabel("Edad");
		LabelEdad.setBounds(32, 96, 46, 14);
		contentPane.add(LabelEdad);
		
		LabelIngreso = new JLabel("Año de Ingreso");
		LabelIngreso.setBounds(32, 120, 87, 14);
		contentPane.add(LabelIngreso);
		
		LabelTotalVentas = new JLabel("Total Ventas");
		LabelTotalVentas.setBounds(32, 145, 76, 14);
		contentPane.add(LabelTotalVentas);
		
		textFieldId = new JTextField();
		textFieldId.setBounds(129, 50, 86, 14);
		contentPane.add(textFieldId);
		textFieldId.setColumns(10);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(129, 71, 153, 14);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldEdad = new JTextField();
		textFieldEdad.setBounds(129, 93, 62, 14);
		contentPane.add(textFieldEdad);
		textFieldEdad.setColumns(10);
		
		textFieldIngreso = new JTextField();
		textFieldIngreso.setBounds(129, 117, 86, 14);
		contentPane.add(textFieldIngreso);
		textFieldIngreso.setColumns(10);
		
		textFieldTotalVentas = new JTextField();
		textFieldTotalVentas.setBounds(129, 142, 86, 14);
		contentPane.add(textFieldTotalVentas);
		textFieldTotalVentas.setColumns(10);
		
		btnAgregar = new JButton("Agregar nuevo");
		btnAgregar.setBounds(32, 194, 105, 23);
		contentPane.add(btnAgregar);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuscar.setBounds(324, 44, 65, 14);
		contentPane.add(btnBuscar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificar.setBounds(174, 194, 89, 23);
		contentPane.add(btnModificar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(318, 194, 89, 23);
		contentPane.add(btnBorrar);
	}
}
