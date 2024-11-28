package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class VistaMRepartidor extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTable tableMRepartidores;
	public JLabel lblId;
	public JLabel lblNombre;
	public JLabel lblZona;
	public JLabel lblSalarioBasico;
	public JLabel lblTotalRepartos;
	public JLabel lblValorTotalRepartos;
	public JButton btnConsultar;
	public JButton btnLimpiar;
	/**
	 * Create the frame.
	 */
	public VistaMRepartidor() {
		setTitle("SISTEMA GENERAL FINANCIERO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1293, 742);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Mayor Repartidor");
		lblTitulo.setBounds(652, 11, 84, 14);
		contentPane.add(lblTitulo);
		
		tableMRepartidores = new JTable();
		tableMRepartidores.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
			},
			new String[] {
				"Id", "Nombre", "Zona", "Salario Basico", "Total Repartos", "ValorTotalRepartos"
			}
		));
		tableMRepartidores.getColumnModel().getColumn(3).setMinWidth(45);
		tableMRepartidores.setBounds(292, 90, 828, 45);
		contentPane.add(tableMRepartidores);
		
		lblId = new JLabel("Id");
		lblId.setBounds(356, 65, 46, 14);
		contentPane.add(lblId);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(479, 65, 46, 14);
		contentPane.add(lblNombre);
		
		lblZona = new JLabel("Zona");
		lblZona.setBounds(607, 65, 46, 14);
		contentPane.add(lblZona);
		
		lblSalarioBasico = new JLabel("Salario Basico");
		lblSalarioBasico.setBounds(725, 65, 74, 14);
		contentPane.add(lblSalarioBasico);
		
		lblTotalRepartos = new JLabel("Total Repartos");
		lblTotalRepartos.setBounds(874, 65, 71, 14);
		contentPane.add(lblTotalRepartos);
		
		lblValorTotalRepartos = new JLabel("Valor Total Repartos");
		lblValorTotalRepartos.setBounds(989, 65, 113, 14);
		contentPane.add(lblValorTotalRepartos);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(498, 206, 89, 23);
		contentPane.add(btnConsultar);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(856, 206, 89, 23);
		contentPane.add(btnLimpiar);
	}
}
