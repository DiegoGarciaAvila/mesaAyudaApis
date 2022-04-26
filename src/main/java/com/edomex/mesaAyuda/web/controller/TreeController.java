package com.edomex.mesaAyuda.web.controller;

import com.edomex.mesaAyuda.domain.service.TreeService;
import com.edomex.mesaAyuda.persistence.entity.Tree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tree")
public class TreeController {
    @Autowired
    private TreeService treeService;

    @GetMapping("/all")
    public List<Tree> getAll(){
        return treeService.getAll();
    }

    @PostMapping("/save")
    public Tree save(@RequestBody Tree tree){
        return treeService.save(tree);
    }

    @PutMapping("/update")
    public Tree update(@RequestBody Tree tree){
        return treeService.update(tree);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        return treeService.delete(id);
    }



}
