package com.edomex.mesaAyuda.web.controller;


import com.edomex.mesaAyuda.domain.service.UserRoleService;
import com.edomex.mesaAyuda.persistence.entity.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userrole")
public class UserRoleController {

    @Autowired
    private UserRoleService userRoleService;

    @GetMapping("/all")
    public List<UserRole> getAll(){
        return userRoleService.getAll();
    }

    @PostMapping("/save")
    public UserRole save(@RequestBody UserRole userRole){
        return userRoleService.save(userRole);
    }

    @PutMapping("/update")
    public UserRole update(@RequestBody UserRole userRole){
        return userRoleService.update(userRole);

    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        return userRoleService.delete(id);
    }

}
