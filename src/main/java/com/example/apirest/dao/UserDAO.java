package com.example.apirest.dao;

import com.example.apirest.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Roberge-Mentec Corentin
 */

@Repository
public class UserDAO implements IUserDAO {

    List<User> users;

    public UserDAO(){
        users = new ArrayList<>();
        users.add(new User(1, "Marc", "Marcus", "Nancy", "0601020304"));
        users.add(new User(2, "Ginette", "Supp", "Metz", "0612345678"));
        users.add(new User(3, "Manon", "Massi", "Paris", "0606060606"));
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public User findById(int id) {
        User user = null;
        for (User u: users){
            if (u.getId()==id){
                user = u;
            }
        }
        return user;
    }

    @Override
    public void save(User user) {
        users.add(user);
    }

    @Override
    public void delete(int id) {
        List<User> newUsers = new ArrayList<>();
        for (User u: users){
            if (u.getId()!=id){
                newUsers.add(u);
            }
        }
        users = newUsers;
    }

    @Override
    public void update(User user) {
        List<User> newUsers = new ArrayList<>();
        for (User u: users){
            if (u.getId()==user.getId()){
                newUsers.add(user);
            }else{
                newUsers.add(u);
            }
        }
        users = newUsers;
    }
}
