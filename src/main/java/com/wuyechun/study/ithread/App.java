package com.wuyechun.study.ithread;

/***
 * 
 * 多线程演示
 * @author wuyechun
 *
 */
public class App {
    public static void main(String[] args) {
    	ThreadRun r = new ThreadRun();
        Thread t = new Thread(r);
        t.start();
    }
}

class ThreadRun implements Runnable{
    public void run() {
    	System.out.println("ThreadRun-----");
    }
}