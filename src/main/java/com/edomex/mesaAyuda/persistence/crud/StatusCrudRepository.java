package com.edomex.mesaAyuda.persistence.crud;

import com.edomex.mesaAyuda.persistence.entity.Status;
import org.springframework.data.repository.CrudRepository;

public interface StatusCrudRepository extends CrudRepository<Status,Integer> {
}
