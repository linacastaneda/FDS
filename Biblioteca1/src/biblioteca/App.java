package biblioteca;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
    	        ArrayList<Libro> listaLibro = new ArrayList<Libro>();
    	        ArrayList<Prestamo> listaPrestamos = new ArrayList<Prestamo>();
    	        Pais pais = new Pais("Colombia ", 1345);
    	        Autor autor = new Autor("Gabriel Garcia ", pais );
    	        Editorial editorial = new Editorial(55621, "Norma", pais);
    	        Libro libro = new Libro("123ADE", "cien años de soledad", 1, 100, autor, editorial);
    	        listaLibro.add(libro);
    	        Persona estudiante = new Persona(1345, "lola");
    	        Prestamo prestamo = new Prestamo(libro, estudiante);
    	        listaPrestamos.add(prestamo);
    	        
    	        
    	        System.out.println("LISTA LIBROS");
    	        for(Libro libros : listaLibro) { 	
    	        	System.out.println(libros);
    	        }
    	        System.out.println("LISTA PRESTAMOS");
    	        for(Prestamo prestamos : listaPrestamos) { 	
    	        	System.out.println(prestamos);
    	        }
    	        
    	        
    	    }
 

   }

