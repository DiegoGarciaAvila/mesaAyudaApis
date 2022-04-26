package com.edomex.mesaAyuda.web.controller;

import com.edomex.mesaAyuda.domain.service.UsersService;
import com.edomex.mesaAyuda.persistence.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService userService;

    @GetMapping("/all")
    public List<Users> getAll(){
        return userService.getAll();
    }

    @PostMapping("/save")
    public Users save(@RequestBody Users users){
        return userService.save(users);
    }

    @PutMapping("/update")
    public Users update(@RequestBody Users users){
        return userService.update(users);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        return userService.delete(id);
    }

}
