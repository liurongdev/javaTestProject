package org.cn.vo;

import java.util.PriorityQueue;

class ToDoList extends PriorityQueue<ToDoList.ToDoItem>{
	static class ToDoItem implements Comparable<ToDoItem>{
		private Character priority;
		private int secondary;
		private String item;
		public ToDoItem(Character pri,int secondary,String item){
			this.priority=pri;
			this.secondary=secondary;
			this.item=item;
		}
		public int compareTo(ToDoItem arg){
			if(priority>arg.priority)
				return 1;
			if(priority==arg.priority){
				if(secondary>arg.secondary){
					return 1;
				}else{
					if(secondary==arg.secondary){
						return 0;
					}
				}
			}
			return -1;
		}
		public String toString(){
			return (Character.toString(priority))+secondary+" ;"+item;
		}
	}
	public void add(String item,Character c,int secondary){
		super.add(new ToDoItem(c,secondary,item));
	}
}
public class PriorityDemo {
	public static void main(String[] args){
		ToDoList list=new ToDoList();
		list.add("liurong",'A',2);
		list.add("xixi",'A',1);
		list.add("zhang",'C',3);
		list.add("wang",'C',2);
		list.add("yang",'B',1);
		list.add("cheng",'B',3);
		list.add("wu",'C',2);
		while(!list.isEmpty()){
			System.out.println(list.remove());
		}
	}
}
