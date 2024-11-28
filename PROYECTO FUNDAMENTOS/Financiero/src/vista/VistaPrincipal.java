package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class VistaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JMenuBar menuBar;
	public JMenu mnDatos;
	public JMenuItem mntmVendedores;
	public JMenuItem mntmRepartidores;
	public JMenu mnNomina;
	public JMenuItem mntmLiquidarNomina;
	public JMenu mnConsultas;
	public JMenu mnVendedoresConsulta;
	public JMenuItem mntmNVendedores;
	public JMenuItem mntmMVendedor;
	public JMenu mnRepartidoresConsulta ;
	public JMenuItem mntmNRepartidores;
	public JMenuItem mntmMRepartidores;
	public JMenuItem mntmEmpleados;
	public JMenu mnSalir;
	public JMenuItem mntmSalir;
	
	
	public VistaPrincipal() {
		setTitle("SISTEMA GENERAL FINANCIERO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1293, 742);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 444, 22);
		contentPane.add(menuBar);
		
		mnDatos = new JMenu("Datos");
		menuBar.add(mnDatos);
		
		mntmVendedores = new JMenuItem("Vendedores");
		mnDatos.add(mntmVendedores);
		
		mntmRepartidores = new JMenuItem("Repartidores");
		mnDatos.add(mntmRepartidores);
		
		mnNomina = new JMenu("Nomina");
		menuBar.add(mnNomina);
		
		mntmLiquidarNomina = new JMenuItem("Liquidar Nomina");
		mnNomina.add(mntmLiquidarNomina);
		
		mnConsultas = new JMenu("Consultas");
		menuBar.add(mnConsultas);
		
		mnVendedoresConsulta = new JMenu("Vendedores");
		mnConsultas.add(mnVendedoresConsulta);
		
		mntmNVendedores = new JMenuItem("Vendedores");
		mnVendedoresConsulta.add(mntmNVendedores);
		
		mntmMVendedor = new JMenuItem("Mayores Vendedores (3)");
		mnVendedoresConsulta.add(mntmMVendedor);
		
		mnRepartidoresConsulta = new JMenu("Repartidores");
		mnConsultas.add(mnRepartidoresConsulta);
		
		mntmNRepartidores = new JMenuItem("Repartidores");
		mnRepartidoresConsulta.add(mntmNRepartidores);
		
		mntmMRepartidores = new JMenuItem("Mayor Repartidor");
		mnRepartidoresConsulta.add(mntmMRepartidores);
		
		mntmEmpleados = new JMenuItem("Empleados");
		mnConsultas.add(mntmEmpleados);
		
		mnSalir = new JMenu("Salir");
		menuBar.add(mnSalir);
		
		mntmSalir = new JMenuItem("Salir");
		mnSalir.add(mntmSalir);
		
		
	}
}
