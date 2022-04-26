package com.edomex.mesaAyuda.domain.service;

import com.edomex.mesaAyuda.persistence.crud.PersonCrudRepository;
import com.edomex.mesaAyuda.persistence.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonCrudRepository personCrudRepository;

    public List<Person> getAll(){
        return (List<Person>) personCrudRepository.findAll();
    }

    public Person save(Person person){
        return personCrudRepository.save(person);
    }

    public String delete(String id){
        personCrudRepository.deleteById(id);
        return "persona eliminada " +id;
    }

    public Person update(Person person){
        Person update=personCrudRepository.findById(person.getPcvepersona()).orElse(null);
        update.setPnombre(person.getPnombre());
        update.setPcorreo(person.getPcorreo());
        update.setPpassword(person.getPpassword());
        return personCrudRepository.save(update);
    }


}
