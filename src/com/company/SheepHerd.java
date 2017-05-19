package com.company;

/**
 * Created by Android2017 on 5/19/2017.
 */
public class SheepHerd {
    private int sheepCounter = 0;
    final static Object FOODLOCK = new Object();
    final static Object WATERLOCK = new Object();
    final static Object SHEARLOCK = new Object();

    public synchronized void addSheepAndCount(){
        System.out.print(++sheepCounter + " Thread:");
        System.out.println(Thread.currentThread().getName());
    }

    public void addSheepAndCountExplicit(){
        synchronized (FOODLOCK) {
            System.out.print(++sheepCounter + " Thread:");
            System.out.println(Thread.currentThread().getName());
        }
    }

    public synchronized void doSomeOtherStuff(){
        System.out.println("Thread: "+Thread.currentThread().getName());
        System.out.print(" Doing other stuff.");
    }
}
