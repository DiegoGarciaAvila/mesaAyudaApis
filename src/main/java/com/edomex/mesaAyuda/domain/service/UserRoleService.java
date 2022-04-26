package com.edomex.mesaAyuda.domain.service;

import com.edomex.mesaAyuda.persistence.crud.UserRoleCrudRepository;
import com.edomex.mesaAyuda.persistence.entity.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleService {

    @Autowired
    private UserRoleCrudRepository userRoleCrudRepository;

    public List<UserRole> getAll(){
        return (List<UserRole>) userRoleCrudRepository.findAll();
    }

    public UserRole save(UserRole userRole){
        return userRoleCrudRepository.save(userRole);
    }



    public String delete(Integer id){
    userRoleCrudRepository.deleteById(id);
    return "userRole removed "+ id;

    }
    public UserRole update(UserRole userRole){
        UserRole update= userRoleCrudRepository.findById(userRole.getUrcverelacion()).orElse(null);
        update.setUrcvepersonafk(userRole.getUrcvepersonafk());
        update.setUrcverolefk(userRole.getUrcverolefk());
        return userRoleCrudRepository.save(userRole);
    }

}
