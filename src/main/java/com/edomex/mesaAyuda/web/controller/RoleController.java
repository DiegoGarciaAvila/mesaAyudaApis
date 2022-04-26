package com.edomex.mesaAyuda.web.controller;

import com.edomex.mesaAyuda.domain.service.RoleService;
import com.edomex.mesaAyuda.persistence.entity.Role;
import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @GetMapping("/all")
    public List<Role> getAll(){
        return roleService.getAll();
    }

    @PostMapping("/save")
    public Role save(@RequestBody Role role){
        return roleService.save(role);
    }


    @PutMapping("/update")
    public Role update(@RequestBody Role role){
        return roleService.update(role);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        return roleService.delete(id);
    }

}
