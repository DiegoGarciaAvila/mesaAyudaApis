package com.edomex.mesaAyuda.web.controller;

import com.edomex.mesaAyuda.domain.service.StatusService;
import com.edomex.mesaAyuda.persistence.crud.StatusCrudRepository;
import com.edomex.mesaAyuda.persistence.entity.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/status")
public class StatusController {

    @Autowired
    private StatusService statusService;

    @GetMapping("/all")
    public List<Status> getAll(){
        return statusService.getAll();
    }

    @PostMapping("/save")
    public Status save(@RequestBody Status status){
        return statusService.save(status);
    }

    @PutMapping("/update")
    public Status update(@RequestBody Status status){
        return statusService.update(status);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        return statusService.delete(id);
    }




}
