package com.edomex.mesaAyuda.web.controller;

import com.edomex.mesaAyuda.domain.service.EventService;
import com.edomex.mesaAyuda.persistence.entity.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping("/all")
    public List<Event> getAll(){
        return eventService.getAll();
    }

    @PostMapping("/save")
    public Event save(@RequestBody Event event){
       return eventService.save(event);
    }

    @PutMapping("/update")
    public Event update(@RequestBody Event event){
        return eventService.update(event);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        return eventService.delete(id);
    }

}
