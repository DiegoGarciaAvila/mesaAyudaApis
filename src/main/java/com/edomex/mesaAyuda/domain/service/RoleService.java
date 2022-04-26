package com.edomex.mesaAyuda.domain.service;

import com.edomex.mesaAyuda.persistence.crud.RoleCrudRepository;
import com.edomex.mesaAyuda.persistence.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    private RoleCrudRepository roleCrudRepository;

    public List<Role> getAll(){
        return (List<Role>) roleCrudRepository.findAll();
}

    public Role save(Role role){
        return roleCrudRepository.save(role);
    }

    public String delete(int id){
        roleCrudRepository.deleteById(id);
        return "role removed " + id;
    }

    public Role update(Role role){
        Role update = roleCrudRepository.findById(role.getRcverole()).orElse(null);
        update.setRdescripcion(role.getRdescripcion());
        return  roleCrudRepository.save(update);
    }


}
