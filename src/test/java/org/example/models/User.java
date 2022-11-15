package org.example.models;

import com.github.javafaker.Faker;

public class User {

    private String first_name;
    private String last_name;
    private String email;
    private String password;

    public User(){
        //Para poder utilizar Java Faker
        Faker faker = new Faker();

        this.first_name = faker.name().firstName();
        this.last_name = faker.name().lastName();
        this.email = faker.internet().emailAddress();
        this.password = "Nelson12345";
        //this.password = faker.internet().password();
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
