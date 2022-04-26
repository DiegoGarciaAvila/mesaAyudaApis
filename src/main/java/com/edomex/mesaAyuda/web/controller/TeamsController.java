package com.edomex.mesaAyuda.web.controller;

import com.edomex.mesaAyuda.domain.service.TeamsService;
import com.edomex.mesaAyuda.persistence.entity.Teams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamsController {

    @Autowired
    private TeamsService teamsService;

    @GetMapping("/all")
    public List<Teams> getAll(){
        return teamsService.getAll();
    }

    @PostMapping("/save")
    public Teams save(@RequestBody Teams teams){
        return teamsService.save(teams);
    }

    @PutMapping("/update")
    public Teams update(@RequestBody Teams teams){
        return teamsService.update(teams);

    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        teamsService.delete(id);
        return "team delete "+ id;
    }

}


