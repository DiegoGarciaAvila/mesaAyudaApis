package com.edomex.mesaAyuda.web.controller;


import com.edomex.mesaAyuda.domain.service.TypeteamsService;
import com.edomex.mesaAyuda.persistence.entity.Typeteams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/typeteams")
public class TypeteamsController {

    @Autowired
    private TypeteamsService typeteamsService;

    @GetMapping("/all")
    public List<Typeteams> getAll(){
        return typeteamsService.getAll();
    }

    @PostMapping("/save")
    public Typeteams save(@RequestBody Typeteams typeteams){
      return typeteamsService.save(typeteams);
    }

    @PutMapping("/update")
    public Typeteams update(@RequestBody Typeteams typeteams){
        return typeteamsService.update(typeteams);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
       return typeteamsService.delete(id);

    }

}
