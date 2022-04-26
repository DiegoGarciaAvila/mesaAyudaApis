package com.edomex.mesaAyuda.web.controller;

import com.edomex.mesaAyuda.domain.service.AttenmentService;
import com.edomex.mesaAyuda.persistence.entity.Attenment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/attenment")
public class AttenmentController {

    @Autowired
    private AttenmentService attenmentService;

    @GetMapping("/all")
    public List<Attenment> getAll(){
        return attenmentService.getAll();
    }

    @PostMapping("/save")
    public Attenment save(@RequestBody Attenment attenment){
        return attenmentService.save(attenment);
    }

    @PutMapping("/update")
    public Attenment update(@RequestBody Attenment attenment){
        return attenmentService.update(attenment);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        return attenmentService.delete(id);
    }


}
