package com.pt.entities;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
public class User {

    public static final String DEFAULT_FIRST_NAME = "DEFAULT_FIRST_NAME";
    public static final String DEFAULT_LAST_NAME = "DEFAULT_LAST_NAME";

    private String firstName;
    private String lastName;

    @Inject
    public User(@Named(DEFAULT_FIRST_NAME) String firstName, @Named(DEFAULT_LAST_NAME) String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
       return new StringBuilder().append("First Name ").
                append(firstName).append("\n").
                append("Last Name:").
                append(lastName).toString();
    }
}
