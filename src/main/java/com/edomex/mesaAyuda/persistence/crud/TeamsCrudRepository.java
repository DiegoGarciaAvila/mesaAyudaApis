package com.edomex.mesaAyuda.persistence.crud;

import com.edomex.mesaAyuda.persistence.entity.Teams;
import org.springframework.data.repository.CrudRepository;

public interface TeamsCrudRepository extends CrudRepository<Teams,Integer> {
}
