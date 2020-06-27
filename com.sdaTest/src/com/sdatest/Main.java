package com.sdatest;

import com.sdatest.engine.LotteryEngine;
import com.sdatest.input.ConsoleInput;
import com.sdatest.user.User;

public class Main 
{
    public static void main(String[] args) 
    {

        User user1 = ConsoleInput.getUserData();
        user1.welcome();
        
        LotteryEngine lottery = new LotteryEngine(1, 20, 10);
        
        
        for(int i=0; i<SIZE; i++) 
        {                
            System.out.print(lottery.getRandomNumber() + ", ");
        }
    }
    public static final int SIZE = 10;
}
