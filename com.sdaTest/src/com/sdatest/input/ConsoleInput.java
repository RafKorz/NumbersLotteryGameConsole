package com.sdatest.input;

import com.sdatest.user.User;
import java.util.Scanner;

public class ConsoleInput 
{
    static Scanner scanner = new Scanner(System.in);
    
public static User getUserData()
   {     
    Scanner scannGamer = new Scanner(System.in);
    System.out.println("Proszę podać imię.");
    String name = scannGamer.nextLine();
    System.out.println("Proszę podać nazwisko.");
    String lastName = scannGamer.nextLine();
    
    return new User(name, lastName);
    }    
    public static int[] getUserNumbers(int count)
    {
        int[] numbers = new int[count];
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.print("Podaj "+ (i+1) +"  liczbę: ");
        numbers[i] = scanner.nextInt();
        }
    return numbers;
    }
}

