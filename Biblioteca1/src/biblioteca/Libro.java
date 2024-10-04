package biblioteca;

public class Libro {
    private String isbn;
    private String titulo;
    private int edicion;
    private int nPaginas;
    private Autor autor;
    private Editorial editorial;
    private boolean estado;

    public Libro(String isbn, String titulo, int edicion, int nPaginas, Autor autor, Editorial editorial) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.edicion = edicion;
        this.nPaginas = nPaginas;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return " ISBN : " + isbn + ", titulo: " + titulo + ", edicion: " + edicion + ", Numero de Paginas: " + nPaginas
                + ", autor: " + autor + ", editorial: " + editorial + ", estado: " + estado ;
    }
    
    
}
