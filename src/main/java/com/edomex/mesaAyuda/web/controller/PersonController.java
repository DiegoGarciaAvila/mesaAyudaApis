package com.edomex.mesaAyuda.web.controller;

import com.edomex.mesaAyuda.domain.service.PersonService;
import com.edomex.mesaAyuda.persistence.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/all")
    public List<Person> getAll(){
        return personService.getAll();
    }

    @PostMapping("/save")
    public Person save(@RequestBody Person person){
        return personService.save(person);
    }

    @DeleteMapping("/delete/{id}")
    private String delete(@PathVariable String id){
        return personService.delete(id);

    }

    @PutMapping("/update")
    public Person update(@RequestBody Person person){
        return personService.update(person);
    }


}
