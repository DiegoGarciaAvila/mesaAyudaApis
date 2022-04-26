package com.edomex.mesaAyuda.web.controller;


import com.edomex.mesaAyuda.domain.service.CatServiceService;
import com.edomex.mesaAyuda.persistence.entity.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/catservice")
public class CatServiceController {

    @Autowired
    private CatServiceService catServiceService;
    
    @GetMapping("/all")
    public List<CatService> getAll(){
        return (List<CatService>) catServiceService.getAll();
    }

    @PostMapping("/save")
    public CatService save(@RequestBody CatService catService){
        return catServiceService.save(catService);
    }

    @PutMapping("/update")
    public CatService update(@RequestBody CatService catService){
        return catServiceService.update(catService);
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        return catServiceService.delete(id);
    }





}
