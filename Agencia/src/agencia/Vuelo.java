package agencia;

import java.time.LocalDate;
import java.util.*;

public class Vuelo {
	
	private int numero;
	private Ciudad ciudadSalida;
	private Ciudad ciudadDestino;
	private int numeroSillas;
	private LocalDate horaSalida;
	private int duracionVuelo;
	private Piloto piloto;
	private ArrayList<Silla> listaPasajeros;
	/**
	 * @param numero
	 * @param ciudadSalida
	 * @param ciudadDestino
	 * @param numeroSillas
	 * @param duracionVuelo
	 * @param piloto
	 */
	public Vuelo(int numero, Ciudad ciudadSalida, Ciudad ciudadDestino, int numeroSillas, int duracionVuelo,
			Piloto piloto) {
		super();
		this.numero = numero;
		this.ciudadSalida = ciudadSalida;
		this.ciudadDestino = ciudadDestino;
		this.numeroSillas = numeroSillas;
		this.duracionVuelo = duracionVuelo;
		this.piloto = piloto;
		this.listaPasajeros = new ArrayList<Silla>();
	}
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	/**
	 * @return the ciudadSalida
	 */
	public Ciudad getCiudadSalida() {
		return ciudadSalida;
	}
	/**
	 * @param ciudadSalida the ciudadSalida to set
	 */
	public void setCiudadSalida(Ciudad ciudadSalida) {
		this.ciudadSalida = ciudadSalida;
	}
	/**
	 * @return the ciudadDestino
	 */
	public Ciudad getCiudadDestino() {
		return ciudadDestino;
	}
	/**
	 * @param ciudadDestino the ciudadDestino to set
	 */
	public void setCiudadDestino(Ciudad ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}
	/**
	 * @return the numeroSillas
	 */
	public int getNumeroSillas() {
		return numeroSillas;
	}
	/**
	 * @param numeroSillas the numeroSillas to set
	 */
	public void setNumeroSillas(int numeroSillas) {
		this.numeroSillas = numeroSillas;
	}
	/**
	 * @return the horaSalida
	 */
	public LocalDate getHoraSalida() {
		return horaSalida;
	}
	/**
	 * @param horaSalida the horaSalida to set
	 */
	public void setHoraSalida(LocalDate horaSalida) {
		this.horaSalida = horaSalida;
	}
	/**
	 * @return the duracionVuelo
	 */
	public int getDuracionVuelo() {
		return duracionVuelo;
	}
	/**
	 * @param duracionVuelo the duracionVuelo to set
	 */
	public void setDuracionVuelo(int duracionVuelo) {
		this.duracionVuelo = duracionVuelo;
	}
	/**
	 * @return the piloto
	 */
	public Piloto getPiloto() {
		return piloto;
	}
	/**
	 * @param piloto the piloto to set
	 */
	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}
	/**
	 * @return the listaPasajeros
	 */
	public ArrayList<Silla> getListaPasajeros() {
		return listaPasajeros;
	}
	/**
	 * @param listaPasajeros the listaPasajeros to set
	 */
	public void setListaPasajeros(ArrayList<Silla> listaPasajeros) {
		this.listaPasajeros = listaPasajeros;
	}
	@Override
	public String toString() {
		return "Vuelo numero=" + numero + ", ciudadSalida=" + ciudadSalida + ", ciudadDestino=" + ciudadDestino
				+ ", numeroSillas=" + numeroSillas + ", horaSalida=" + horaSalida + ", duracionVuelo=" + duracionVuelo
				+ ", piloto=" + piloto ;
	}
	
	public void adicionarSilla(Silla silla) {
		
		listaPasajeros.add(silla);
	}
	
	public void mostrarlista() {
		for(Silla silla : listaPasajeros) {
			System.out.println(silla);
		}
	}
}
