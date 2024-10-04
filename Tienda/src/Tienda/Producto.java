package Tienda;

public class Producto {
    private TipoProducto tipoProducto;
    private double precioProducto;
    private int cantActual;
    private Proveedor proveedor;
	/**
	 * @param tipoProducto
	 * @param precioProducto
	 * @param cantActual
	 * @param proveedor
	 */
	public Producto(TipoProducto tipoProducto, double precioProducto, int cantActual, Proveedor proveedor) {
		super();
		this.tipoProducto = tipoProducto;
		this.precioProducto = precioProducto;
		this.cantActual = cantActual;
		this.proveedor = proveedor;
	}
	/**
	 * @return the tipoProducto
	 */
	public TipoProducto getTipoProducto() {
		return tipoProducto;
	}
	/**
	 * @param tipoProducto the tipoProducto to set
	 */
	public void setTipoProducto(TipoProducto tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	/**
	 * @return the precioProducto
	 */
	public double getPrecioProducto() {
		return precioProducto;
	}
	/**
	 * @param precioProducto the precioProducto to set
	 */
	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}
	/**
	 * @return the cantActual
	 */
	public int getCantActual() {
		return cantActual;
	}
	/**
	 * @param cantActual the cantActual to set
	 */
	public void setCantActual(int cantActual) {
		this.cantActual = cantActual;
	}
	/**
	 * @return the proveedor
	 */
	public Proveedor getProveedor() {
		return proveedor;
	}
	/**
	 * @param proveedor the proveedor to set
	 */
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	@Override
	public String toString() {
		return "Producto [tipoProducto=" + tipoProducto + ", precioProducto=" + precioProducto + ", cantActual="
				+ cantActual + ", proveedor=" + proveedor + "]";
	}

    
    
}
    