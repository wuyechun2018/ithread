package com.wuyechun.study.ithread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class QueueThread {
	 private static ExecutorService threadPool = Executors.newFixedThreadPool(5);
	 private static ArrayBlockingQueue<Runnable> taskQueue = new ArrayBlockingQueue<Runnable>(30);
	 
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			MyThread myThread = new MyThread();
			System.out.println("加入队列"+i);
			taskQueue.add(myThread);
		}

		Runnable r;
		
		int count=1;
		while (true) {
			try {
				// 有任务时，取出任务
				r = taskQueue.take();
				System.out.println("取出任务"+count);
				// 执行任务
				threadPool.execute(r);
				count++;
			} catch (InterruptedException e) {
				
			}
		}

	}
	 
	 
	 
	 
}
