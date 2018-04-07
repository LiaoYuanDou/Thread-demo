package com.xx.study.thread.demo2;

public class ThreadTest2 {

	public static void main(String[] args) {
		MyThreadDemo2 myThreadRunableDemo1 = new MyThreadDemo2();
		MyThreadDemo2 myThreadRunableDemo2 = new MyThreadDemo2();
		
		Thread thread1 = new Thread(myThreadRunableDemo1);
		Thread thread2 = new Thread(myThreadRunableDemo2);
		thread1.start();
		thread2.start();
		System.out.println("Main Say : Hello World!");
	}

}
