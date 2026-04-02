package com.example.GestionRutinas.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Rutinas {

    private int identificador;
    private String usuario;
    private String tipoEntrenamiento;
    private int duracion;
    private String dificultad;
    private String fecha;
    private String estadoRutina;

}
