package Tienda;

public class TipoProducto {
    private int codigo;
    private String descripcion;
    private double porcentajeIVA;
    
    public TipoProducto(int codigoProducto, String descripccion, double porcentajeIVA) {
        this.codigo = codigoProducto;
        this.descripcion = descripccion;
        this.porcentajeIVA = porcentajeIVA ;
    }

    public int getCodigoProducto() {
        return codigo;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigo = codigoProducto;
    }

    public String getDescripccion() {
        return descripcion;
    }

    public void setDescripccion(String descripccion) {
        this.descripcion = descripccion;
    }

    public double getPorcentajeIva() {
        return porcentajeIVA;
    }

    public void setPorcentajeIva(float porcentajeIva) {
        this.porcentajeIVA = porcentajeIva;
    }

    @Override
    public String toString() {
        return " Codigo del producto=" + codigo + ", descripcion =" + descripcion
                + ", porcentaje de IVA =" + porcentajeIVA;
    }
    

}
