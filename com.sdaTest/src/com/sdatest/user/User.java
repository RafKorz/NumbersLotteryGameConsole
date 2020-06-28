package com.sdatest.user;

import java.util.Scanner;

public class User {
    
    String name;
    String lastName;
    public User(String name, String lastName)
    {
        this.name = name;
        this.lastName = lastName;
    }
    public void welcome()
    {
        System.out.println("Witaj " + name + " " + lastName + "!");
        System.out.println("Życzę szczęścia i wysokich wygranych!");
    }
}