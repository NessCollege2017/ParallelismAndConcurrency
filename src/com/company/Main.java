package com.company;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });

        t.start();

        new Thread(()->{}).start();

        Runnable r = () -> {};
        r.run();


        Callable<String> c = ()-> "Hello world";

        ArrayList<String> data = new ArrayList<>();
        data.add("A");
        data.add("B");
        data.add("C");
        data.add("D");





        data.forEach((letter) -> System.out.println(letter.toLowerCase()));

    }
}
