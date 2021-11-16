package com.example.apirest.model;

/**
 * @author Roberge-Mentec Corentin
 */


public class User {

    private int id;
    private String name;
    private String firstName;
    private String city;
    private String phoneNumber;

    public User(int id, String name, String firstName, String city, String phoneNumber){
        this.id = id;
        this.name = name;
        this.firstName = firstName;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
