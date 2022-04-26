package com.edomex.mesaAyuda.domain.service;

import com.edomex.mesaAyuda.persistence.crud.EventCrudRepository;
import com.edomex.mesaAyuda.persistence.entity.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventCrudRepository eventCrudRepository;

    public List<Event> getAll(){
        return (List<Event>) eventCrudRepository.findAll();
    }

    public Event save(Event event){
        return eventCrudRepository.save(event);
    }
    public Event update(Event event){
        Event update= eventCrudRepository.findById(event.getEcveevento()).orElse(null);
        update.setEfechainicio(event.getEfechainicio());
        update.setEfechafin(event.getEfechafin());
        update.setEcveusuariofk(event.getEcveusuariofk());
        update.setEcveestatusfk(event.getEcveestatusfk());
        update.setEcve_arbolfk(event.getEcve_arbolfk());
        update.setEcveattenmentfk(event.getEcveattenmentfk());
        return eventCrudRepository.save(update);
    }

    public String delete(Integer id){
        eventCrudRepository.deleteById(id);
        return "event delete "+ id;
    }

}
