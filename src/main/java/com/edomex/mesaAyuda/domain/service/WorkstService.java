package com.edomex.mesaAyuda.domain.service;

import com.edomex.mesaAyuda.persistence.crud.WorkstCrudRepository;
import com.edomex.mesaAyuda.persistence.entity.Workst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkstService {

    @Autowired
    private WorkstCrudRepository workstCrudRepository;

    public List<Workst> getAll(){
        return (List<Workst>) workstCrudRepository.findAll();
    }

    public Workst save (Workst workst){
        return workstCrudRepository.save(workst);
    }

    public Workst update(Workst workst){
        Workst update=workstCrudRepository.findById(workst.getWcveareat()).orElse(null);
        update.setWdescripcion(workst.getWdescripcion());
        System.out.println(workst.getWcveareat());
        update.setWabreviatura(workst.getWabreviatura());
        return workstCrudRepository.save(update);

    }

    public String delete(Integer id){
        workstCrudRepository.deleteById(id);
        return "works delete "+id;
    }


}
