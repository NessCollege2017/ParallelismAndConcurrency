package com.company;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        SheepHerd herd = new SheepHerd();

        for (int i = 0; i < 10; i++) {
            new Thread(()->herd.addSheepAndCount(), String.valueOf(i)).start();
        }

    }
}
