package com.ogiraffers.section01.thread;

public class Car extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i ++){
            System.out.println("Car driving...");

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
