package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import modeloDao.RepartidorDao;
import modeloDto.Repartidor;
import vista.VistaMRepartidor;


public class ControllerMRepartidor implements ActionListener{
	
	private VistaMRepartidor vista;
	private RepartidorDao modelo;
	private DefaultTableModel modeloTabla;
	
	public ControllerMRepartidor(VistaMRepartidor vista) {
		this.vista = vista;
		this.modelo = new RepartidorDao();
		modeloTabla = (DefaultTableModel)this.vista.tableMRepartidores.getModel();
		this.vista.btnConsultar.addActionListener(this);
		this.vista.btnLimpiar.addActionListener(this);
		this.vista.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource().equals(vista.btnConsultar)) {
			ArrayList<Repartidor>listaRepartidores = modelo.readAll();
			
			if (listaRepartidores.isEmpty()) {
				JOptionPane.showMessageDialog(null, "No hay repartidores en la lista");
	        }
			double mayor=0;
			Repartidor repartidorConMayorRepartos = null;
			
			for(Repartidor repartidor : listaRepartidores) {
				if(repartidor.getNumeroDeRepartos()>mayor) {
					mayor=repartidor.getNumeroDeRepartos();
					repartidorConMayorRepartos = repartidor;
				}
			}
			 modeloTabla.setRowCount(0);
			Object[] fila = {repartidorConMayorRepartos.getIdentificacion(), repartidorConMayorRepartos.getNombre(), repartidorConMayorRepartos.getZona(), repartidorConMayorRepartos.getSalarioBase(), repartidorConMayorRepartos.getNumeroDeRepartos(),repartidorConMayorRepartos.getComision()};
			modeloTabla.addRow(fila);
			
		}
		
		if (e.getSource().equals(vista.btnLimpiar)) {
            modeloTabla.setRowCount(0); // Limpiar la tabla completamente
        }
	}
	
	

	
}
