package com.example.services;

import java.util.List;

import com.example.model.Libro;

public interface LibrosService {
    List<Libro> libros();
    Libro buscarLibro(int isbn);
    void altaLibro(Libro libro);
    void actualizarLibro(Libro libro);
    List<Libro> eliminarLibro(int isbn);
}
