package com.xx.study.thread.demo4;

import java.util.Date;
import java.util.concurrent.Callable;

public class MyThreadDemo4 implements Callable<Object> {

	private String taskNum;

	public MyThreadDemo4(String taskNum) {
		this.taskNum = taskNum;
	}

	@Override
	public Object call() throws Exception {
		System.out.println(">>> " + taskNum + " ��������");
		Date date1 = new Date();
		Thread.sleep(1000);
		Date date2 = new Date();
		long time = date2.getTime() - date1.getTime();
		System.out.println(">>> " + taskNum + " �������");
		return taskNum + " ���񷵻����н������ǰ����ʱ�䡾  " + time + " ���롿";
	}

}
