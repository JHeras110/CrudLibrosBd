package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.LibrosDao;
import com.example.model.Libro;

/**
 * Servicio que implementa todos los metodos
 */
@Service
public class LibrosServiceImpl implements LibrosService{
    
    @Autowired
    LibrosDao librosDao;
    
    @Override
    public List<Libro> libros() {
        return librosDao.findAll();
    }

    @Override
    public Libro buscarLibro(int isbn) {
        return librosDao.findById(isbn).orElse(null);
    }

    @Override
    public void altaLibro(Libro libro) {
        librosDao.save(libro);
    }

    @Override
    public void actualizarLibro(Libro libro) {
        librosDao.save(libro);
    }

    @Override
    public List<Libro> eliminarLibro(int isbn) {
        librosDao.deleteById(isbn);
        return librosDao.findAll();
    }
}
