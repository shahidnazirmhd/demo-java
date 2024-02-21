package com.snm.demo.thread;

public class ThreadDemo1 extends Thread {

    public ThreadDemo1(String name) {
        super(name);
        start(); // Start the thread upon construction
    }

    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " is running");
    }

    public static void main(String[] args) {
        ThreadDemo1 thread1 = new ThreadDemo1("Thread 1");
        ThreadDemo1 thread2 = new ThreadDemo1("Thread 2");

        // No need to start threads here

        // Check whether threads are alive or not
        if (thread1.isAlive())
            System.out.println(thread1.getName() + " is running");
        else
            System.out.println(thread1.getName() + " is not running");

        if (thread2.isAlive())
            System.out.println(thread2.getName() + " is running");
        else
            System.out.println(thread2.getName() + " is not running");
    }
}
