package com.example.springboot.controlador;

import java.util.List;
import java.util.Optional;

import com.example.springboot.entidades.Alumno;
import com.example.springboot.entidades.Carrera;
import com.example.springboot.repository.AlumnoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class viewControl {
    
    
    @Autowired
    AlumnoRepository alumnoRepo;

    @GetMapping("/vista")
    public String vista(Model modelo) {
       modelo.addAttribute("variable", "Arturo");
       return "index";
    }

    @GetMapping("/vista/{codigo:.+}")
    public String vistaV(Model modelo, @PathVariable String codigo) {
        Optional<Alumno> a = alumnoRepo.findById(codigo);
        if(!a.isPresent()){
            return "codigo no registrado papi!";
        }
        Alumno alumno = a.get();
        modelo.addAttribute("variable", alumno);
        return "index";
    }


    @GetMapping("/datos")
    public String datos(Model modelo) {
        List<Alumno> as = alumnoRepo.findAll();
        modelo.addAttribute("student", as);
        return "index";
    }

    @GetMapping("/datos/nuevo")
    public String datosNuevo(Model modelo) {
        Alumno ar = new Alumno();
        modelo.addAttribute("alumno", ar);
        return "nuevo";
    }

    @PostMapping("/datos/registro")
    public String datosRegistro(Model modelo) {
        return "index";
    }


}