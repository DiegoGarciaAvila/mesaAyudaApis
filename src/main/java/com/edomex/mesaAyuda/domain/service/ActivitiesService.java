package com.edomex.mesaAyuda.domain.service;

import com.edomex.mesaAyuda.persistence.crud.ActivitiesCrudRepository;
import com.edomex.mesaAyuda.persistence.entity.Activities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivitiesService {
    @Autowired
    private ActivitiesCrudRepository activitiesCrudRepository;

    public List<Activities> getAll(){
        return (List<Activities>) activitiesCrudRepository.findAll();
    }

    public Activities save(Activities activities){
        return activitiesCrudRepository.save(activities);
    }

    public Activities update(Activities activities){
        Activities update= activitiesCrudRepository.findById(activities.getAcveact()).orElse(null);
        update.setAnombre(activities.getAnombre());
        update.setAdescripcion(activities.getAdescripcion());
        return activitiesCrudRepository.save(update);
    }

    public String delete(Integer id){
        activitiesCrudRepository.deleteById(id);
        return "activities delete "+ id;
    }


}
