package modeloDto;

import java.io.Serializable;
import java.util.ArrayList;


@SuppressWarnings("serial")
public class Repartidor extends Empleado implements Serializable{
    private int numeroDeRepartos;
    private int zona;
    private double salario;
    
    public Repartidor() {
    	super();
    }
    
    public Repartidor(int identificacion, String nombre, int edad, int anio_ingreso, int numeroDeRepartos, int zona) {
        super(identificacion, nombre, edad, anio_ingreso);
        this.numeroDeRepartos = numeroDeRepartos;
        this.zona = zona;
        comprobadorZona();
        
    }
    
    
    private void comprobadorZona() {

    	
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
    
    

}
