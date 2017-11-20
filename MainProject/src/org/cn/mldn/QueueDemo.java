package org.cn.mldn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueDemo {
	public static void printQueue(Queue queue){
		while(queue.peek()!=null){
			System.out.print(queue.poll()+" ,");
		}
	}
	public static void main(String[] args){
		Queue<Integer>queue=new LinkedList<Integer>();
		Random rand=new Random(29);
		for(int i=0;i<10;i++){
			queue.offer(rand.nextInt(i+10));
		}
		printQueue(queue);
		System.out.println();
		Queue<Character>queue2=new LinkedList<Character>();
		for(char c:"liurongxixi".toCharArray()){
			queue2.offer(c);
		}
		printQueue(queue2);
	}
}
