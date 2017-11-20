package org.cn.vo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String>{
	private int id;
	public CallableTask(int id){
		this.id=id;
	}
	@Override
	public String call() throws Exception {
		return "result finish "+id;
	}
	
}
public class CallableDemo {
	public static void main(String[] args){
		ExecutorService executor=Executors.newCachedThreadPool();
		List<Future<String>>list=new ArrayList<Future<String>>();
		for(int i=0;i<5;i++){
			list.add(executor.submit(new CallableTask(i)));
		}
		for(Future<String> f:list){
			try {
				System.out.println(f.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				executor.shutdown();
			}
		}
	}
}
