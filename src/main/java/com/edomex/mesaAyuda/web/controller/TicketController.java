package com.edomex.mesaAyuda.web.controller;

import com.edomex.mesaAyuda.domain.service.TicketService;
import com.edomex.mesaAyuda.persistence.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping("/all")
    public List<Ticket> getAll(){
        return ticketService.getAll();
    }

    @PostMapping("/save")
    public Ticket save(@RequestBody Ticket ticket){
        return ticketService.save(ticket);
    }

    @PutMapping("/update")
    public Ticket update(@RequestBody Ticket ticket){
        return ticketService.update(ticket);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        return ticketService.delete(id);
    }



}
