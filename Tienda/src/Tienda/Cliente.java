package Tienda;

public class Cliente {
    private long id;
    private String nombre;
    
    /**
     * @param id
     * @param nombre
     */

    public Cliente(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public long getIdentificacion() {
        return id;
    }

    public void setIdentificacion(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Identificacion cliente =" + id + ", nombre =" + nombre;
    }
    
    
    
}
