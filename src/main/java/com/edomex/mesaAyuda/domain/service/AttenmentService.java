package com.edomex.mesaAyuda.domain.service;

import com.edomex.mesaAyuda.persistence.crud.AttenmentCrudRepository;
import com.edomex.mesaAyuda.persistence.entity.Attenment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttenmentService {

    @Autowired
    private AttenmentCrudRepository attenmentCrudRepository;

    public List<Attenment> getAll(){
        return (List<Attenment>) attenmentCrudRepository.findAll();
    }

    public Attenment save(Attenment attenment){
        return attenmentCrudRepository.save(attenment);
    }

    public Attenment update(Attenment attenment){
        Attenment update= attenmentCrudRepository.findById(attenment.getAcveencargado()).orElse(null);
        update.setAnombre(attenment.getAnombre());
        update.setAcorreo(attenment.getAcorreo());
        update.setAextencion(attenment.getAextencion());
        return attenmentCrudRepository.save(update);
    }

    public String delete(Integer id){
        attenmentCrudRepository.deleteById(id);
        return "attenmet delete "+ id;
    }



}
