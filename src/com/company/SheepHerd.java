package com.company;

/**
 * Created by Android2017 on 5/19/2017.
 */
public class SheepHerd {
    private int sheepCounter = 0;

    public synchronized void addSheepAndCount(){
        System.out.print(++sheepCounter + " Thread:");
        System.out.println(Thread.currentThread().getName());
    }
}
