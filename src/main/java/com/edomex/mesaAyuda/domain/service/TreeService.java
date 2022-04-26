package com.edomex.mesaAyuda.domain.service;

import com.edomex.mesaAyuda.persistence.crud.TreeCrudRepository;
import com.edomex.mesaAyuda.persistence.entity.Tree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreeService {

    @Autowired
    private TreeCrudRepository treeCrudRepository;

    public List<Tree> getAll(){
        return (List<Tree>) treeCrudRepository.findAll();
    }

    public Tree save(Tree tree){
        return treeCrudRepository.save(tree);
    }

    public Tree update(Tree tree){
        Tree update= treeCrudRepository.findById(tree.getTcvearbol()).orElse(null);
        update.setTcveserfk(tree.getTcveserfk());
        update.setTcvecatserfk(tree.getTcvecatserfk());
        update.setTcveactfk(tree.getTcveactfk());
        update.setTcvecatactfk(tree.getTcvecatactfk());
        return treeCrudRepository.save(update);

    }

    public String delete(Integer id){
        treeCrudRepository.deleteById(id);
        return "tree delete "+ id;
    }




}
