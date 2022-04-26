package com.edomex.mesaAyuda.web.controller;

import com.edomex.mesaAyuda.domain.service.ActivitiesService;
import com.edomex.mesaAyuda.persistence.entity.Activities;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/activities")
public class ActivitiesController {
    @Autowired
    private ActivitiesService activitiesService;

    @GetMapping("/all")
    public List<Activities> getAll(){
        return activitiesService.getAll();
    }


    @PostMapping("/save")
    public Activities save(@RequestBody Activities activities){
        return activitiesService.save(activities);
    }

    @PutMapping("/update")
    public Activities update(@RequestBody Activities activities){
        return activitiesService.update(activities);
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        return activitiesService.delete(id);
    }




}
