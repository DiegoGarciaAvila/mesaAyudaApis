package com.edomex.mesaAyuda.domain.service;

import com.edomex.mesaAyuda.persistence.crud.UsersCrudRepository;
import com.edomex.mesaAyuda.persistence.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    @Autowired
    private UsersCrudRepository userCrudRepository;

    public List<Users> getAll(){
        return (List<Users>) userCrudRepository.findAll();
    }

    public Users save(Users users){

        return userCrudRepository.save(users);
    }
    public String delete(Integer id){
        userCrudRepository.deleteById(id);
        return "usuario removido "+ id;
    }

    public Users update(Users users){
        Users update= userCrudRepository.findById(users.getUcveusuario()).orElse(null);
        update.setUcveareatfk(users.getUcveareatfk());
        update.setUcveequipofk(users.getUcveequipofk());
        update.setUcverelacionfk(users.getUcverelacionfk());

        return userCrudRepository.save(update);
    }




}
