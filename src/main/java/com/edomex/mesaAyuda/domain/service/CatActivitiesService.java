package com.edomex.mesaAyuda.domain.service;

import com.edomex.mesaAyuda.persistence.crud.CatActivitiesCrudRepository;
import com.edomex.mesaAyuda.persistence.entity.CatActivities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatActivitiesService {
    @Autowired
    private CatActivitiesCrudRepository catActivitiesCrudRepository;

    public List<CatActivities> getAll(){
        return (List<CatActivities>) catActivitiesCrudRepository.findAll();
    }

    public CatActivities save(CatActivities catActivities){
        return catActivitiesCrudRepository.save(catActivities);
    }

    public CatActivities update(CatActivities catActivities){
        CatActivities update=catActivitiesCrudRepository.findById(catActivities.getCacvecatact()).orElse(null);
        update.setCanombre(catActivities.getCanombre());
        update.setCadescripcion(catActivities.getCadescripcion());
        return catActivitiesCrudRepository.save(update);
    }

    public String delete(Integer id){
        catActivitiesCrudRepository.findById(id);
        return "catActivities delete "+id;
    }

}
