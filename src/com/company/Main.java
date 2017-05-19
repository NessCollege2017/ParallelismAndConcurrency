package com.company;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        ExecutorService service = Executors.newSingleThreadExecutor();

        service.execute(()-> System.out.println("Running the task..."));
        System.out.println("Main");
        service.execute(()-> System.out.println("Running the task..."));
        System.out.println("Main");
        service.execute(()-> System.out.println("Running the task..."));
        System.out.println("Main");
        service.execute(()-> System.out.println("Running the task..."));
        System.out.println("Main");

        service.shutdown();
    }
}
