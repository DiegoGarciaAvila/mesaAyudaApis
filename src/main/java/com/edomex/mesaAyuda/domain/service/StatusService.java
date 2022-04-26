package com.edomex.mesaAyuda.domain.service;

import com.edomex.mesaAyuda.persistence.crud.StatusCrudRepository;
import com.edomex.mesaAyuda.persistence.entity.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusService {

    @Autowired
    private StatusCrudRepository statusCrudRepository;

    public List<Status> getAll(){
        return (List<Status>) statusCrudRepository.findAll();
    }

    public Status save(Status status){
        return statusCrudRepository.save(status);
    }

    public Status update(Status status){
        Status update=statusCrudRepository.findById(status.getScveestatus()).orElse(null);
        update.setSdescripcion(status.getSdescripcion());
        return statusCrudRepository.save(update);
    }

    public String delete(Integer id){
        statusCrudRepository.deleteById(id);
        return "status delete "+ id;
    }

}
