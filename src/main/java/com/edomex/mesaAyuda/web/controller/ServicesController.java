package com.edomex.mesaAyuda.web.controller;

import com.edomex.mesaAyuda.domain.service.ServicesService;
import com.edomex.mesaAyuda.persistence.entity.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/services")
public class ServicesController {
    @Autowired
    private ServicesService serviceService;

    @GetMapping("/all")
    public List<Services> getAll(){
        return serviceService.getAll();
    }

    @PostMapping("/save")
    public Services save(@RequestBody Services services){
        return serviceService.save(services);
    }

    @PutMapping("/update")
    public Services update(@RequestBody Services services){
        return serviceService.update(services);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        return serviceService.delete(id);
    }



}
