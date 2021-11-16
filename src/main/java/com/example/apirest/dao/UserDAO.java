package com.example.apirest.dao;

import com.example.apirest.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Roberge-Mentec Corentin
 */

@Repository
public class UserDAO implements IUserDAO {
    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public void save(User user) {

    }
}
