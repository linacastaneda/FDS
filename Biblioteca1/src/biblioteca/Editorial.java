package biblioteca;

public class Editorial {
    private int codigo;
    private String nombre;
    private Pais pais;

    public Editorial(int codigo, String nombre, Pais pais) {
        super();
        this.codigo = codigo;
        this.nombre = nombre;
        this.pais = pais;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return codigo + " " + nombre +" " + pais;
    }
    
}
