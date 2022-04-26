package com.edomex.mesaAyuda.domain.service;

import com.edomex.mesaAyuda.persistence.crud.TeamsCrudRepository;
import com.edomex.mesaAyuda.persistence.entity.Teams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamsService {

    @Autowired
    private TeamsCrudRepository teamsCrudRepository;

    public List<Teams> getAll(){
        return (List<Teams>) teamsCrudRepository.findAll();
    }

    public Teams save(Teams teams){
        return teamsCrudRepository.save(teams);
    }

    public String delete(Integer id){
        teamsCrudRepository.deleteById(id);
        return "teams delete "+id;
    }

    public Teams update(Teams teams){
        Teams cambio=teamsCrudRepository.findById(teams.getTcveequipo()).orElse(null);
        cambio.setTnuminventario(teams.getTnuminventario());
        cambio.setTserie(teams.getTserie());
        cambio.setTmarca(teams.getTmarca());
        cambio.setTcveequipo(teams.getTcveequipo());
        return teamsCrudRepository.save(cambio);
    }

}
