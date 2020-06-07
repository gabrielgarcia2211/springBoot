package com.example.springboot.controlador;

import com.example.springboot.repository.AlumnoRepository;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping({"/user"})
public class userControl {

    @Autowired
    AlumnoRepository alumnoRepo;

    @GetMapping(value = "/buscar")
    public String getMethodName() {
       // Optional<Alumno> a = alumnoRepo.findById("1151654");

    ///Alumno alumno = a.get();
       // return "hola mundo : " + alumno.nombre;
       return "";
    }

 

   

}