package modeloDto;

import java.io.Serializable;


public class Repartidor extends Empleado implements Serializable {
	/**
	 * 
	 */ 
	private static final long serialVersionUID = 1L;
	private int numeroDeRepartos;
    private int zona;
    private double salario;
    private double bonificacion;
    private double comision;
    
    public Repartidor() {
		// TODO Auto-generated constructor stub
	}
    
	public Repartidor(int identificacion, String nombre, int edad, int anio_ingreso, int numeroDeRepartos, int zona) {
		super(identificacion, nombre, edad, anio_ingreso);
		// TODO Auto-generated constructor stub
		this.numeroDeRepartos = numeroDeRepartos;
		this.zona = comprobadorZona(zona);
	}
	
	private int comprobadorZona(int zona) {
		if(zona>=1&&zona<=5) {
			return zona;
		}else {
			return 1;
		}
	}

	
	public int getNumeroDeRepartos() {
		return numeroDeRepartos;
	}
	public void setNumeroDeRepartos(int numeroDeRepartos) {
		this.numeroDeRepartos = numeroDeRepartos;
	}
	public int getZona() {
		return zona;
	}
	public void setZona(int zona) {
		this.zona = zona;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getBonificacion() {
		return bonificacion;
	}

	public void setBonificacion(double bonificacion) {
		this.bonificacion = bonificacion;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}


	
	
    
}