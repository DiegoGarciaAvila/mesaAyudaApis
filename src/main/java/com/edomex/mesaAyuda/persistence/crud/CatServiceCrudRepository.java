package com.edomex.mesaAyuda.persistence.crud;


import com.edomex.mesaAyuda.persistence.entity.CatService;
import org.springframework.data.repository.CrudRepository;

public interface CatServiceCrudRepository extends CrudRepository<CatService,Integer> {
}
