package com.edomex.mesaAyuda.persistence.crud;

import com.edomex.mesaAyuda.persistence.entity.Users;
import org.springframework.data.repository.CrudRepository;

public interface UsersCrudRepository extends CrudRepository<Users,Integer> {
}
