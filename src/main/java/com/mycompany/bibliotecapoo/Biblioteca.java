package com.mycompany.bibliotecapoo;

public class Biblioteca {
    private LinkedList<Libro> libros;

    public Biblioteca() {
        this.libros = new LinkedList<>();
    }

    public void registrarLibro(Libro libro) {
        libros.add(libro);
    }

    public Libro buscarLibro(String palabraBusqueda) { 
        for (Libro libro : libros) {
            if (libro.mostrarInformacion().toLowerCase().contains(palabraBusqueda.toLowerCase())) {
                return libro;
            }
        }
        return null;
    }

    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro.mostrarInformacion());
        }
    }

    public void mostrarLibrosNoLeidos() { 
        for (Libro libro : libros) {
            if (!libro.isLeido()) {
                System.out.println(libro.mostrarInformacion());
            }
        }
    }
}