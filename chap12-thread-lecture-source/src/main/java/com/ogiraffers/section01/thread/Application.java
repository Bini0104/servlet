package com.ogiraffers.section01.thread;

public class Application {
    public static void main(String[] args) {

        /* 프로세스와 스레드
        *
        * 프로세스는 실행중인 프로그램이라고 할 수 있다.
        * 스레드는 프로세스 내에서 실제로 작업을 수행하는 주체를 의미한다.
        * 모든 프로세스는 한 개 이상의 스레드가 존재하며
        * 두 개 이상의 스레드를 가지는 프로세스를 멀티 스레드라고 한다.
        *
        * 스레드를 생성하는 방법
        * 1. Thread 클래스를 상속하는 방법
        * 2. Runnable 인터페이스를 상속 받는 방법
        * */

        Thread t1 = new Car();
        Thread t2 = new Tank();
        Thread t3 = new Thread(new Plane());    // Runnable을 상속

//        t1.run();
//        t2.run();
//        t3.run();

        t1.start();
        t2.start();
        t3.start();

        System.out.println("-------------main end--------------");
    }
}
