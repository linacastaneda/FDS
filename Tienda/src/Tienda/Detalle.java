package Tienda;

public class Detalle {
    private Producto producto;
    private int cantidad;
    
    /**
     * @param producto
     * @param cantidad
     */

    public Detalle(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidadDetalle() {
        return cantidad;
    }

    public void setCantidadDetalle(int cantidadDetalle) {
        this.cantidad = cantidadDetalle;
    }

    @Override
    public String toString() {
        return "Detalle producto =" + producto + ", cantidad =" + cantidad;
    }
    
    
}
