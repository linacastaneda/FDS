package biblioteca;

import java.time.LocalDate;

public class Prestamo {
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private Libro libro;
    private Persona estudiante;
	/**
	 * @param libro
	 * @param estudiante
	 */
	public Prestamo(Libro libro, Persona estudiante) {
		super();
		this.libro = libro;
		this.estudiante = estudiante;
		this.fechaPrestamo = LocalDate.now();
		this.fechaDevolucion=fechaPrestamo.plusDays(5);
	
	}
	/**
	 * @return the fechaPrestamo
	 */
	public LocalDate getFechaPrestamo() {
		return fechaPrestamo;
	}
	/**
	 * @param fechaPrestamo the fechaPrestamo to set
	 */
	public void setFechaPrestamo(LocalDate fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}
	/**
	 * @return the fechaDevolucion
	 */
	public LocalDate getFechaDevolucion() {
		return fechaDevolucion;
	}
	/**
	 * @param fechaDevolucion the fechaDevolucion to set
	 */
	public void setFechaDevolucion(LocalDate fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}
	/**
	 * @return the libro
	 */
	public Libro getLibro() {
		return libro;
	}
	/**
	 * @param libro the libro to set
	 */
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	/**
	 * @return the estudiante
	 */
	public Persona getEstudiante() {
		return estudiante;
	}
	/**
	 * @param estudiante the estudiante to set
	 */
	public void setEstudiante(Persona estudiante) {
		this.estudiante = estudiante;
	}
	@Override
	public String toString() {
		return "fechaPrestamo=" + fechaPrestamo + ", fechaDevolucion=" + fechaDevolucion + ", libro=" + libro
				+ ", estudiante= " + estudiante;
	}
    
    

}
