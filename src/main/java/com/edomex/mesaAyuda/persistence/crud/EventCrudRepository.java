package com.edomex.mesaAyuda.persistence.crud;

import com.edomex.mesaAyuda.persistence.entity.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventCrudRepository extends CrudRepository<Event,Integer> {
}
