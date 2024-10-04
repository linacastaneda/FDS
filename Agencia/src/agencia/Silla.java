package agencia;

public class Silla {
	
	private String id;
	private Persona pasajero;
	/**
	 * @param id
	 * @param pasajero
	 */
	public Silla(String id, Persona pasajero) {
		super();
		this.id = id;
		this.pasajero = pasajero;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the pasajero
	 */
	public Persona getPasajero() {
		return pasajero;
	}
	/**
	 * @param pasajero the pasajero to set
	 */
	public void setPasajero(Persona pasajero) {
		this.pasajero = pasajero;
	}
	@Override
	public String toString() {
		return "Silla " + id + ", pasajero " + pasajero;
	}
	
}