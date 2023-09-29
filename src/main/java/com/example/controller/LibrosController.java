package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Libro;
import com.example.services.LibrosService;

/**
 * Controlador que se encarga de recibir las url y ejecutarles el metodo correspondiente
 */
@RestController
public class LibrosController {
    @Autowired
    LibrosService librosService;

    @GetMapping(value = "libro/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Libro buscarLibro(@PathVariable("isbn") int isbn){
        return librosService.buscarLibro(isbn);
    }

    @GetMapping(value = "libros", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Libro> libros(){
        return librosService.libros();
    }

    @PostMapping(value = "libro", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void agregarLibro(@RequestBody Libro libro){
        librosService.altaLibro(libro);
    }

    @PutMapping(value = "libro", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void actulizarLibro(@RequestBody Libro libro){
        librosService.actualizarLibro(libro);
    }

    @DeleteMapping(value = "libro/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Libro> eliminarLibro(@PathVariable("isbn") int isbn){
        return librosService.eliminarLibro(isbn);
    }
}
