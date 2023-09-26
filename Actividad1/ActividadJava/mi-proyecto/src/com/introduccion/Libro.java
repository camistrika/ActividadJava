package com.introduccion;

import java.time.LocalDate;

public class Libro {
    private String titulo;
    private String autor;
    private int publicacion;

    // Constructor que acepta solo título y autor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.publicacion = LocalDate.now().getYear();
    }

    // Constructor que acepta título, autor y publicación
    public Libro(String titulo, String autor, int publicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.publicacion = publicacion;
    }

    // Método para mostrar los detalles del libro
    public void mostrarDetalles() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Publicacion: " + publicacion);
    }

    public static void main(String[] args) {
        // Crear un libro sin especificar el año de publicación
        Libro libro1 = new Libro("El Gran Gatsby", "F. Scott Fitzgerald");

        // Crear un libro especificando el año de publicación
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);

        // Mostrar los detalles de ambos libros
        System.out.println("Detalles del Libro 1:");
        libro1.mostrarDetalles();

        System.out.println("\nDetalles del Libro 2:");
        libro2.mostrarDetalles();
    }
}
