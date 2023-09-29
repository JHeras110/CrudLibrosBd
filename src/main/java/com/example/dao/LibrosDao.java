package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Libro;

public interface LibrosDao extends JpaRepository<Libro, Integer>{
    
}
