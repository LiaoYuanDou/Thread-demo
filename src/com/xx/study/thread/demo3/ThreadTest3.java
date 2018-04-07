package com.xx.study.thread.demo3;

import java.util.concurrent.FutureTask;

public class ThreadTest3 {

	public static void main(String[] args) {
		MyThreadDemo3<Object> myThreadDemo1 = new MyThreadDemo3<Object>();
		MyThreadDemo3<Object> myThreadDemo2 = new MyThreadDemo3<Object>();
		FutureTask<Object> futureTask1 = new FutureTask<Object>(myThreadDemo1);
		FutureTask<Object> futureTask2 = new FutureTask<Object>(myThreadDemo2);
		Thread thread1 = new Thread(futureTask1);
		Thread thread2 = new Thread(futureTask2);
		thread1.start();
		thread2.start();
		System.out.println("Main Say : Hello World!");
	}

}
