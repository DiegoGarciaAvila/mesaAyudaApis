package com.edomex.mesaAyuda.persistence.crud;

import com.edomex.mesaAyuda.persistence.entity.Role;
import org.springframework.data.repository.CrudRepository;

public interface  RoleCrudRepository extends CrudRepository<Role,Integer> {

    //Role findByName(String name);

}
