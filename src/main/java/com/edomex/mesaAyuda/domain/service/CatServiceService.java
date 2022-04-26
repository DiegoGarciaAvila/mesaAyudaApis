package com.edomex.mesaAyuda.domain.service;

import com.edomex.mesaAyuda.persistence.crud.CatServiceCrudRepository;
import com.edomex.mesaAyuda.persistence.entity.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatServiceService {

    @Autowired
    private CatServiceCrudRepository catServiceCrudRepository;

    public List<CatService> getAll(){
        return (List<CatService>) catServiceCrudRepository.findAll();
    }

    public CatService save(CatService catService){
        return catServiceCrudRepository.save(catService);
    }

    public CatService update(CatService catService){
        CatService update=catServiceCrudRepository.findById(catService.getCscvecatser()).orElse(null);
        update.setCsnombre(catService.getCsnombre());
        update.setCsdescripcion(catService.getCsdescripcion());
        return catServiceCrudRepository.save(update);

    }

    public String delete(Integer id){
        catServiceCrudRepository.deleteById(id);
        return "catService "+id;
    }

}
