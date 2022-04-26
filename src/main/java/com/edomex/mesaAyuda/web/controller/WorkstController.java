package com.edomex.mesaAyuda.web.controller;

import com.edomex.mesaAyuda.domain.service.WorkstService;
import com.edomex.mesaAyuda.persistence.entity.UserRole;
import com.edomex.mesaAyuda.persistence.entity.Workst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workst")
public class WorkstController {

    @Autowired
    private WorkstService workstService;

    @GetMapping("/all")
    public List<Workst> getAll(){
        return workstService.getAll();
    }

    @PostMapping("/save")
    public Workst save(@RequestBody Workst workst){
        return workstService.save(workst);
    }

    @PutMapping("/update")
    public Workst update(@RequestBody Workst workst){
        return workstService.update(workst);

    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        return workstService.delete(id);
    }



}
