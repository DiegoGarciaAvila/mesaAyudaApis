package com.edomex.mesaAyuda.domain.service;

import com.edomex.mesaAyuda.persistence.crud.ServicesCrudRepository;
import com.edomex.mesaAyuda.persistence.entity.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServicesService {
    @Autowired
    private ServicesCrudRepository serviceCrudRepository;

    public List<Services> getAll(){
        return (List<Services>) serviceCrudRepository.findAll();
    }

    public Services save(Services services){
        return serviceCrudRepository.save(services);
    }

    public Services update(Services services){
        Services update=serviceCrudRepository.findById(services.getScveser()).orElse(null);
        update.setSnombre(services.getSnombre());
        update.setSdescripcion(services.getSdescripcion());
        return serviceCrudRepository.save(update);

    }

    public String delete(Integer id){
         serviceCrudRepository.deleteById(id);
         return "service delete "+ id;
    }


}
