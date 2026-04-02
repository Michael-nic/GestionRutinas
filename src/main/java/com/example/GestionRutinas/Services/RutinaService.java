package com.example.GestionRutinas.Services;

import com.example.GestionRutinas.Model.Rutinas;
import com.example.GestionRutinas.Repository.InfoRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RutinaService {
    @Autowired
    private InfoRepository infoRepository;

    public List<Rutinas> getRutinas(){
        return infoRepository.ObtenerRutinas();
    }

    public Rutinas saveRutinas(Rutinas _rutinas){
        return infoRepository.guardar(_rutinas);
    }

    public Rutinas getRutinasInde(int identificador){
        return infoRepository.buscarPorInde(identificador);
    }

    public Rutinas updateRutina(Rutinas _rutina){
        return infoRepository.actualizar(_rutina);
    }

    public String deleteRutina(int ide){
        infoRepository.eliminar(ide);
        return "Eliminado";
    }


}
