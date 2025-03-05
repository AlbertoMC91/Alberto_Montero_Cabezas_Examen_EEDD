package Biblioteca;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibroTest {

    @Test
    void testConstructor() {
        //Datos del libro
        String titulo = "Dune";
        String autor = "Frank Herbert";
        int anioPublicacion = 1965;

        //Creamos el objeto libro
        Libro libro = new Libro(titulo, autor, anioPublicacion);

        //Compruebo que los datos son correctos
        assertEquals(titulo, libro.getTitulo());
        assertEquals(autor, libro.getAutor());
        assertEquals(anioPublicacion, libro.getAnioPublicacion());
    }
}