package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.VistaConsultaRepartidor;
import vista.VistaConsultaVR;
import vista.VistaConsultaVendedor;
import vista.VistaLiquidarNomina;
import vista.VistaMRepartidor;
import vista.VistaMVendedor;
import vista.VistaPrincipal;
import vista.VistaRepartidor;
import vista.VistaVendedor;

public class ControllerPrincipal  implements ActionListener{
	
	private VistaPrincipal vista;

	public ControllerPrincipal(VistaPrincipal vista) {
		this.vista = vista;
		this.vista.mntmEmpleados.addActionListener(this);
		this.vista.mntmLiquidarNomina.addActionListener(this);
		this.vista.mntmMRepartidores.addActionListener(this);
		this.vista.mntmMVendedor.addActionListener(this);
		this.vista.mntmNRepartidores.addActionListener(this);
		this.vista.mntmNVendedores.addActionListener(this);
		this.vista.mntmRepartidores.addActionListener(this);
		this.vista.mntmSalir.addActionListener(this);
		this.vista.mntmVendedores.addActionListener(this);
		this.vista.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(vista.mntmEmpleados)) {
		ControllerConsultaVR cEmpleados = new ControllerConsultaVR(new VistaConsultaVR());
		}
		if (e.getSource().equals(vista.mntmLiquidarNomina)) {
			ControllerLiquidarNomina cLiquidarNomina = new ControllerLiquidarNomina(new VistaLiquidarNomina());
			}
		if (e.getSource().equals(vista.mntmMRepartidores)) {
			ControllerMRepartidor cMRepartidores = new ControllerMRepartidor(new VistaMRepartidor());
			}
		if (e.getSource().equals(vista.mntmMVendedor)) {
			ControllerMVendedor cMVendedor = new ControllerMVendedor(new VistaMVendedor());
			}
		if (e.getSource().equals(vista.mntmNRepartidores)) {
			ControllerConsultaRepartidor cNRepartidores = new ControllerConsultaRepartidor(new VistaConsultaRepartidor());
			}
		if (e.getSource().equals(vista.mntmNVendedores)) {
			ControllerConsultaVendedor cNVendedores = new ControllerConsultaVendedor(new VistaConsultaVendedor());
			}
		if (e.getSource().equals(vista.mntmRepartidores)) {
			ControllerRepartidor cRepartidores = new ControllerRepartidor(new VistaRepartidor());
			}
		if (e.getSource().equals(vista.mntmSalir)) {
		    int confirm = javax.swing.JOptionPane.showConfirmDialog(
		            null, "¿Está seguro de que desea salir?", "Confirmar salida", 
		            javax.swing.JOptionPane.YES_NO_OPTION
		        );
		        if (confirm == javax.swing.JOptionPane.YES_OPTION) {
		            System.exit(0);
		        }
		    }
		if (e.getSource().equals(vista.mntmVendedores)) {
			ControllerVendedor cVendedores = new ControllerVendedor(new VistaVendedor());
			}
	}
	
	
}
