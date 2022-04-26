package com.edomex.mesaAyuda.domain.service;

import com.edomex.mesaAyuda.persistence.crud.TypeteamsCrudRepository;
import com.edomex.mesaAyuda.persistence.entity.Typeteams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeteamsService {

    @Autowired
    private TypeteamsCrudRepository typeteamsCrudRepository;

    public List<Typeteams> getAll(){
        return (List<Typeteams>) typeteamsCrudRepository.findAll();
    }

    public Typeteams save(Typeteams typeteams){
        return typeteamsCrudRepository.save(typeteams);
    }

    public Typeteams update(Typeteams typeteams){
        Typeteams cambio=typeteamsCrudRepository.findById(typeteams.getTtcveequipo()).orElse(null);
        cambio.setTtdescripcion(typeteams.getTtdescripcion());
        cambio.setTtequipo(typeteams.getTtequipo());
        return typeteamsCrudRepository.save(cambio);
    }

    public String delete(Integer id){
        typeteamsCrudRepository.deleteById(id);
        return "typeTeams delete "+id;
    }

}
