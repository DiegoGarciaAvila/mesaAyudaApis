package com.edomex.mesaAyuda.persistence.crud;

import com.edomex.mesaAyuda.persistence.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonCrudRepository extends CrudRepository<Person,String> {
}
