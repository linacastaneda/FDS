package Tienda;

import java.util.ArrayList;
import java.time.LocalDate;

public class Venta {
    private int numConsecutivo;
    private LocalDate fechaVenta;
    private Cliente cliente;
    private double valorTotal;
    private double iva;
    private double valorTotalPagar;
    private ArrayList<Detalle> listaDetalle;
	/**
	 * @param numConsecutivo
	 * @param fechaVenta
	 * @param cliente
	 * @param producto
	 * @param valorTotal
	 * @param iva
	 * @param valorTotalPagar
	 */
	public Venta(int numConsecutivo, Cliente cliente, double valorTotal,
			double iva, double valorTotalPagar) {
		super();
		this.numConsecutivo = numConsecutivo;
		this.fechaVenta = LocalDate.now();
		this.cliente = cliente;
		this.valorTotal = valorTotal;
		this.iva = iva;
		this.valorTotalPagar = valorTotalPagar;
		this.listaDetalle = new ArrayList<Detalle>();
	}
	/**
	 * @return the numConsecutivo
	 */
	public int getNumConsecutivo() {
		return numConsecutivo;
	}
	/**
	 * @param numConsecutivo the numConsecutivo to set
	 */
	public void setNumConsecutivo(int numConsecutivo) {
		this.numConsecutivo = numConsecutivo;
	}
	/**
	 * @return the fechaVenta
	 */
	public LocalDate getFechaVenta() {
		return fechaVenta;
	}
	/**
	 * @param fechaVenta the fechaVenta to set
	 */
	public void setFechaVenta(LocalDate fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}
	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the valorTotal
	 */
	public double getValorTotal() {
		return valorTotal;
	}
	/**
	 * @param valorTotal the valorTotal to set
	 */
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	/**
	 * @return the iva
	 */
	public double getIva() {
		return iva;
	}
	/**
	 * @param iva the iva to set
	 */
	public void setIva(double iva) {
		this.iva = iva;
	}
	/**
	 * @return the valorTotalPagar
	 */
	public double getValorTotalPagar() {
		return valorTotalPagar;
	}
	/**
	 * @param valorTotalPagar the valorTotalPagar to set
	 */
	public void setValorTotalPagar(double valorTotalPagar) {
		this.valorTotalPagar = valorTotalPagar;
	}
	/**
	 * @return the listaDetalle
	 */
	public ArrayList<Detalle> getListaDetalle() {
		return listaDetalle;
	}
	/**
	 * @param listaDetalle the listaDetalle to set
	 */
	public void setListaDetalle(ArrayList<Detalle> listaDetalle) {
		this.listaDetalle = listaDetalle;
	}
	@Override
	public String toString() {
		return "Venta =" + numConsecutivo + ", fechaVenta=" + fechaVenta + ", cliente=" + cliente
				+ ", valorTotal=" + valorTotal + ", iva=" + iva + ", valorTotalPagar="
				+ valorTotalPagar + ", listaDetalle=" + listaDetalle;
	}
    
	public void adicionarDetalle(Detalle detalle) {
		listaDetalle.add(detalle);
	}
	public void mostrarDetalle() {
		
		for(Detalle detalle:listaDetalle){
			System.out.println(detalle);
		}
	}
    
    
}
