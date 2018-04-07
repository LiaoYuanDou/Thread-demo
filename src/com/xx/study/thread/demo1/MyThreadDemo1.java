package com.xx.study.thread.demo1;

public class MyThreadDemo1 extends Thread {

	@Override
	public void run() {
		System.out.println("MyThreadDemo1 Say : Hello World!");
	}
	
	public static void main(String[] args) {
		MyThreadDemo1 myThreadDemo1 = new MyThreadDemo1();
		MyThreadDemo1 myThreadDemo2 = new MyThreadDemo1();
		myThreadDemo1.start();
		myThreadDemo2.start();
		System.out.println("Main Say : Hello World!");
	}
}
