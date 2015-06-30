package com.wuyechun.study.ithread;

public class MyThread implements Runnable{

	/**
	 * 线程
	 */
	public void run() {
		System.out.println(Thread.currentThread().getName() + "------正在执行");
	}

}
