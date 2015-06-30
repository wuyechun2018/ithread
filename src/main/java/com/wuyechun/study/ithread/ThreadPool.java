package com.wuyechun.study.ithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/***
 * 
 * 线程池演示
 * @author wuyechun
 *
 */
public class ThreadPool {
	 private static ExecutorService threadPool = Executors.newFixedThreadPool(3);
	
	 
	 public static void main(String []args){
		  for(int i=0;i<10;i++){
			  MyThread thread=new MyThread();
			  threadPool.execute(thread);
		  }
	 }

}
