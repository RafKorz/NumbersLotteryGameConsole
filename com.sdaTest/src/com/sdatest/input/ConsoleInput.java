package com.sdatest.input;

import com.sdatest.user.User;
import java.util.Scanner;

public class ConsoleInput 
{
public static User getUserData()
   {     
    Scanner scannGamer = new Scanner(System.in);
    System.out.println("Proszę podać imię.");
    String name = scannGamer.nextLine();
    System.out.println("Proszę podać nazwisko.");
    String lastName = scannGamer.nextLine();
    
    return new User(name, lastName);
    }    
}

