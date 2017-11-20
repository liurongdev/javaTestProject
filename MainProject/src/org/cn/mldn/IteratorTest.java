package org.cn.mldn;

import java.util.Iterator;

public class IteratorTest implements Iterable<String> {
	private String[] words="liurong xixi zhang wang".split(" ");

	public Iterator<String> iterator(){
		return new Iterator<String>(){
			private int index;
			public  boolean hasNext(){
				return index<words.length;
			}
			public String next(){
				return words[index++];
			}
			public void remove(){
				throw new UnsupportedOperationException();
			}
		};
	}
	
}
