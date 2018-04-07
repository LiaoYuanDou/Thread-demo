package com.xx.study.thread.demo3;

import java.util.concurrent.Callable;

public class MyThreadDemo3<V> implements Callable<V> {
	
	@Override
	public V call() throws Exception {
		System.out.println("MyThreadCallableDemo3 Say : Hello World!");
		return null;
	}

}
