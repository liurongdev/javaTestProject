package org.cn.vo;

import java.nio.ByteBuffer;

public class ByteBufferDemo {
	public static final int SIZE=1024;
	public static void main(String[] args){
		ByteBuffer bb=ByteBuffer.allocate(SIZE);
		int i=0;
		while(i++<bb.limit()){
			if(bb.get()!=0){
				System.out.println("nonzero");
			}
		}
		System.out.println("i="+i);
		bb.rewind();
		bb.asCharBuffer().put("hello liurong");
		char c;
		while((c=bb.getChar())!=0){
			System.out.print(c+"; ");
		}
		System.out.println();
		bb.rewind();
		bb.asIntBuffer().put(100);
		System.out.println(bb.getInt());
		bb.rewind();
		
	}
}
