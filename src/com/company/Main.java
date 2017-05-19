package com.company;


import java.time.LocalTime;
import java.util.ArrayList;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //consumer
        //shutdown
        ExecutorService threadPool = Executors.newFixedThreadPool(4);


        Future<String> futureResult = threadPool.submit(() -> {
            Thread.sleep(1000);
            return "Surprise!";
        });

        System.out.println("Main");

        System.out.println("Main is doing some work");

        System.out.println("Main is now waiting for the futureResult");
        System.out.println(futureResult.get());
        System.out.println("Main is done waiting for the futureResult");
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
