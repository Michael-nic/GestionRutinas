package com.example.GestionRutinas.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.GestionRutinas.Model.Rutinas;
import com.example.GestionRutinas.Services.RutinaService;

@RestController
@RequestMapping("/api/v1/libros")
public class RutinaControlador {

    @Autowired
    private RutinaService rutinaService;

    @GetMapping
    public List<Rutinas> listarRutinas;

    @PostMapping
    public Rutinas agregarRutina(@requestBody Rutinas _rutina){
        return rutinaService.saveRutinas(_rutina);
    }



}
