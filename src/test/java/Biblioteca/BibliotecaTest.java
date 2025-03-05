package Biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    private Biblioteca biblioteca;
    private Libro libro;
    private Libro libro2;
    private Libro libro3;
    private Libro libro4;

    @BeforeEach
    void setUp() {
        biblioteca = new Biblioteca();
        libro = new Libro("Neuromante","William Gibson", 1984);
        libro2 = new Libro("Sueñan los androides con ovejas eléctricas","Philip K.Dick", 1968);
        libro3 = new Libro("La pistola de rayos","Philip K.Dick", 1967);
        libro4 = new Libro("El banquete","Platon", 0);
        //Añado los libros en setup, así no tengo que agregarlos en cada test
        biblioteca.agregarLibro(libro);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
    }

    @Test
    void agregarLibro() {
        //Agrego el libro
        assertTrue(biblioteca.agregarLibro(libro4));
        //Compuebo que se ha agregado correctamente
        assertTrue(biblioteca.getLibros().contains(libro4));
    }

    @Test
    void eliminarLibro() {
        //Libro que está en la biblioteca, devolverá true
        assertTrue(biblioteca.eliminarLibro(libro));
        //Compruebo que se ha eliminado correctamente
        assertFalse(biblioteca.getLibros().contains(libro));
        //Libro que no está en la biblioteca, devolverá false
        assertFalse(biblioteca.eliminarLibro(libro4));
    }

    @Test
    void encuentraLibroPorTitulo() {
        //El libro existe
        assertEquals(libro, biblioteca.encuentraLibroPorTitulo("Neuromante"));
        //El libro no existe
        assertNull(biblioteca.encuentraLibroPorTitulo("Sueñan las ovejas con androides eléctricos"));
    }

    @Test
    void encuentraLibrosPorAutor() {
        //Pruebo con el autor que tiene dos libros en la biblioteca
        List<Libro> librosPhilip = biblioteca.encuentraLibrosPorAutor("Philip K.Dick");
        //La lista no devolverá null
        assertNotNull(librosPhilip);
        //Esperamos que contenga 2 libros
        assertEquals(2, librosPhilip.size());
        //Concretamente esperamos esos dos libros
        assertEquals(List.of(libro2, libro3), librosPhilip);
        //Probamos con un autor que no tiene libros en la biblioteca
        List<Libro> librosAutorDesconocido = biblioteca.encuentraLibrosPorAutor("Felipe K.Dick");
        //Ahora esperamos que sea null
        assertNull(librosAutorDesconocido);
    }
}