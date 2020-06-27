package com.sdatest.engine;

import java.util.Random;
import java.util.LinkedList;
import java.util.List;

public class LotteryEngine {
    int start;
    int end;
    int count;
    public LotteryEngine(int start, int end, int count) {
        this.start = start;
        this.end = end;
        this.count = count;
    }
    public int getRandomNumber()
    {
        Random random = new Random();
        return random.nextInt(end + 1 - start) + start;
    }
    
//    public int getMultipleInts(int start, int end, int count)
//    (
//        return 
//    )
}
