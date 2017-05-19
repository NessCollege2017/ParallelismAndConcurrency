package com.company;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        //will make the main thread sleep.
        //Thread.sleep(1000);

        //favour encapsulation over inheritance
        Thread t = new Thread(() -> {
            while (true){
                System.out.println("Hello"); //do a mission
                //will make the 2nd Thread sleep.
                try {
                    Thread.sleep(5000); //don't use the cpu
                } catch (InterruptedException e) {
                    //get rid of any resources and make the thread stop.
                    //clean up
                    e.printStackTrace();
                }
            }
        });

        t.start();


        //t.interrupt();
    }
}
