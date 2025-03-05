package Biblioteca;
/**
 * Clase que representa un libro con título, autor y año de publicación.
 * @author Alberto Montero Cabezas
 * @version 05.03.2025
 */
public class Libro {

    /**
     * Título del libro.
     */
    private String titulo;
    /**
     * Autor del libro.
     */
    private String autor;
    /**
     * Autor del libro.
     */
    private int anioPublicacion;

    /**
     * Constructor que inicializa un libro con los valores especificados.
     * @param titulo Título del libro.
     * @param autor Autor del libro.
     * @param anioPublicacion Año de publicación del libro.
     */
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene el autor del libro.
     * @return El autor del libro.
     */
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Obtiene el año de publicación del libro.
     * @return El año de publicación del libro.
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
