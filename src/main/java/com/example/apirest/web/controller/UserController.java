package com.example.apirest.web.controller;

import com.example.apirest.dao.IUserDAO;
import com.example.apirest.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Roberge-Mentec Corentin
 */

@RestController
public class UserController {

    @Autowired
    private IUserDAO dao;

    @GetMapping(value="/Users")
    public List<User> getLesUser(){
        return dao.findAll();
    }

    @GetMapping(value="/User/{id}")
    public User getUser(@PathVariable int id){
        return dao.findById(id);
    }

    @PostMapping(value="/Users")
    public void addUser(@RequestBody User u){
        dao.save(u);
    }

    @DeleteMapping(value="/Users/{id}")
    public void deleteUser(@PathVariable int id){
        dao.delete(id);
    }

    @PutMapping(value="/Users")
    public void updateUser(@RequestBody User u){
        dao.update(u);
    }
}
