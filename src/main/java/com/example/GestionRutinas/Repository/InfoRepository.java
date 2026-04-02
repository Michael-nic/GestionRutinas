package com.example.GestionRutinas.Repository;

import com.example.GestionRutinas.Model.Rutinas;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class InfoRepository {

    private List<Rutinas> listaRutinas = new ArrayList<>();

    public List<Rutinas> ObtenerRutinas(){
        return listaRutinas;
    }

    public Rutinas guardar(Rutinas rut){
        listaRutinas.add(rut);
        return rut;
    }

    public Rutinas buscarPorInde(int identificador){
        for (Rutinas _rutina : listaRutinas){
            if (_rutina.getIdentificador() == identificador){
                return _rutina;
            }
        }
        return null;
    }

    public Rutinas actualizar(Rutinas _rutina){

        int idRutina = 0;
        int rutinaPosicion = 0;

        for (int i = 0; i < listaRutinas.size(); i++){
            if (listaRutinas.get(i).getIdentificador() == _rutina.getIdentificador()){
                idRutina = _rutina.getIdentificador();
              rutinaPosicion = i;
            }
        

        Rutinas rutina1 = new   Rutinas();
        rutina1.setIdentificador(idRutina);
        rutina1.setUsuario(_rutina.getUsuario());
        rutina1.setTipoEntrenamiento(_rutina.getTipoEntrenamiento());
        rutina1.setDuracion(_rutina.getDuracion());
        rutina1.setDificultad(_rutina.getDificultad());
        rutina1.setFecha(_rutina.getFecha());
        rutina1.setEstadoRutina(_rutina.getEstadoRutina());

        listaRutinas.set(rutinaPosicion, rutina1);
        return rutina1;
        }
    }

    public void eliminar(int identificador){
        Rutinas _rutina = buscarPorInde(identificador);
        if (_rutina != null){
            listaRutinas.remove(identificador);
        }
    }



}
    
