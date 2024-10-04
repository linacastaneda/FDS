package Tienda;


public class App {
    public static void main(String[] args) throws Exception {
        Proveedor proveedor = new Proveedor( 1655612165, "Lina ");
        Cliente cliente = new Cliente(101326156, "lina ");
        TipoProducto tipoProducto = new TipoProducto(14565486, "tenis deportivos", 0.19);
        Producto producto= new Producto (tipoProducto, 70000, 6, proveedor);
        Producto producto2 = new Producto(tipoProducto, 20000, 5, proveedor);
        Venta venta = new Venta (01234, cliente, 0, 0, 0);
        
        venta.adicionarDetalle(new Detalle (producto, 5));
        venta.adicionarDetalle(new Detalle(producto2, 3));
        
        venta.mostrarDetalle();
    }
}
