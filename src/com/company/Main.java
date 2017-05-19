package com.company;


import java.time.LocalTime;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        //consumer
        //shutdown
        ExecutorService threadPool = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 10; i++) {
            threadPool.execute(() -> {
                try {
                    Thread.sleep(1000);
                    threadPool.execute((Main::displayTime));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        threadPool.shutdown();
    }

    public static void doStuff(){
        System.out.println("Doing stuff.");
    }
    //void accept(T result)
    public static void readData(String s){
        System.out.println("Read " + s);
    }
    public static void displayTime(){
        System.out.println(LocalTime.now());
    }
}
