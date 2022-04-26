package com.edomex.mesaAyuda.persistence.crud;

import com.edomex.mesaAyuda.persistence.entity.Event;
import com.edomex.mesaAyuda.persistence.entity.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketCrudRepository extends CrudRepository<Ticket,Integer> {
}
