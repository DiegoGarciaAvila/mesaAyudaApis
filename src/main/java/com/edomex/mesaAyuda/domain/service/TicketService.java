package com.edomex.mesaAyuda.domain.service;

import com.edomex.mesaAyuda.persistence.crud.TicketCrudRepository;
import com.edomex.mesaAyuda.persistence.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {

    @Autowired
    private TicketCrudRepository ticketCrudRepository;

    public List<Ticket> getAll(){
        return  (List<Ticket>) ticketCrudRepository.findAll();
    }


    public Ticket save(Ticket ticket){
        return ticketCrudRepository.save(ticket);
    }

    public Ticket update(Ticket ticket){
        Ticket update=ticketCrudRepository.findById(ticket.getTcveticket()).orElse(null);
        update.setTfolio(ticket.getTfolio());
        update.setTcveeventofk(ticket.getTcveeventofk());
        return ticketCrudRepository.save(update);
    }

    public String delete(Integer id){
        ticketCrudRepository.deleteById(id);
        return "folio delete "+ id;
    }

}
