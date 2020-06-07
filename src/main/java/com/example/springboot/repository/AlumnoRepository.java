package com.example.springboot.repository;


import com.example.springboot.entidades.Alumno;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository extends JpaRepository<Alumno, String> {
   
}