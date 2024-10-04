package Tienda;

public class Proveedor {
    private long id;
    private String nombre;
    
    
	/**
	 * @param id
	 * @param nombre
	 */
	public Proveedor(long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Proveedor id=" + id + ", nombre=" + nombre;
	}

    
   
    
    

    
    
    
}
