package com.company;


import java.time.LocalTime;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        SheepHerd herd = new SheepHerd();
        ExecutorService pool = Executors.newCachedThreadPool();


        ScheduledExecutorService sched = Executors.newScheduledThreadPool(1);
        sched.scheduleAtFixedRate(Main::displayTime, 1, 1, TimeUnit.SECONDS);

        pool.execute(herd::addSheepAndCount);

        ArrayList<String> data = new ArrayList<>();
        data.add("A");
        data.add("B");
        data.add("C");
        data.add("D");

        data.forEach(Main::readData);

        ExecutorService service = Executors.newFixedThreadPool(4);
        service.execute(Main::doStuff);
        service.shutdown();
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
