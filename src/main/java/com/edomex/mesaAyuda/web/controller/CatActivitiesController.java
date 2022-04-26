package com.edomex.mesaAyuda.web.controller;

import com.edomex.mesaAyuda.domain.service.CatActivitiesService;
import com.edomex.mesaAyuda.persistence.entity.CatActivities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/catactivities")
public class CatActivitiesController {
    @Autowired
    private CatActivitiesService catActivitiesService;

    @GetMapping("/all")
    public List<CatActivities> getAll(){
        return catActivitiesService.getAll();
    }

    @PostMapping("/save")
    public CatActivities save(@RequestBody CatActivities catActivities){
        return catActivitiesService.save(catActivities);
    }

    @PutMapping("/update")
    public CatActivities update(@RequestBody CatActivities catActivities){
        return catActivitiesService.update(catActivities);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        return catActivitiesService.delete(id);
    }

}
