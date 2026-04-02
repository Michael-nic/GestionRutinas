package com.example.GestionRutinas.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.GestionRutinas.Model.Rutinas;
import com.example.GestionRutinas.Services.RutinaService;

@RestController
@RequestMapping("/api/v1/libros")
public class RutinaControlador {

    @Autowired
    private RutinaService rutinaService;

    @GetMapping
    public List<Rutinas> listarRutinas(){
        return rutinaService.getRutinas();
    }

    @PostMapping
    public Rutinas agregarRutina(@RequestBody Rutinas _rutina){
        return rutinaService.saveRutinas(_rutina);
    }

    



}
