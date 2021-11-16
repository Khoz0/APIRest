package com.example.apirest.dao;

import com.example.apirest.model.User;

import java.util.List;

public interface IUserDAO {
    List<User> findAll();
    User findById(int id);
    void save(User user);
    void delete(int id);
    void update(User user);
}
