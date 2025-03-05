package Biblioteca;

import java.util.ArrayList;
import java.util.List;
/**
 * Clase que representa una biblioteca con una colección de Libros
 * que permite agregar, eliminar y buscar libros por título y por autor.
 *
 * @see Libro
 * @author Alberto Montero Cabezas
 * @version 05.03.2025
 * Repositorio:
 */
public class Biblioteca {

    /**
     * Lista de libros que forman parte de la biblioteca.
     */
    private final List<Libro> libros;

    /**
     * Constructor que inicializa una biblioteca vacía.
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    //  Test: NO HAY QUE TESTEAR ESTE METODO
    /**
     * Constructor que inicializa una biblioteca con una lista predefinida de libros.
     * @param libros Lista de libros con la que se inicializa la biblioteca.
     */
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }


    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }


    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    /**
     * Obtiene la lista de libros disponibles en la biblioteca.
     * @return Lista de libros en la biblioteca.
     */
    public List<Libro> getLibros() {
        return libros;
    }

    /**
     * Busca un libro por su título.
     * @param titulo El título del libro a buscar.
     * @return El libro encontrado o {@code null} si no se encuentra.
     */
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * @deprecated Este metodo está obsoleto. Utilice {@link #encuentraLibrosPorAutor(String)} en su lugar.
     * Busca un libro por el autor.
     * @param autor El autor del libro a buscar.
     * @return El primer libro encontrado del autor o {@code null} si no se encuentra.
     */
    @Deprecated
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * Busca todos los libros de un autor específico.
     * Disponible desde la versión 2.0.
     * @param autor El autor cuyos libros se quiere buscar.
     * @return Lista de libros del autor especificado o {@code null} si no hay libros de ese autor.
     */
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}
