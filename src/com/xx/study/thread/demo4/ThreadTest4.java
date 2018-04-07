package com.xx.study.thread.demo4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadTest4 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws Exception, ExecutionException {
		System.out.println("MyThreadDemo4 Say : Hello Wrold!");
		Date date1 = new Date();
		int taskSize = 5;
		// ����һ���̳߳�
		ExecutorService threadPool = Executors.newFixedThreadPool(taskSize);
		List<Future> list = new ArrayList<Future>();

		for (int i = 0; i < taskSize; i++) {
			MyThreadDemo4 threadDemo4 = new MyThreadDemo4(i + "");
			Future<Object> future = threadPool.submit(threadDemo4);
			list.add(future);
		}

		for (Future future : list) {
			System.out.println(">>> " + future.get().toString());
		}
		// �ر��̳߳�
		threadPool.shutdown();

		Date date2 = new Date();
		System.out.println(" ---- ����������� ----����������ʱ�䡾 " + (date2.getTime() - date1.getTime()) + " ���롿");
	}

}
