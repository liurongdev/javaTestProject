package org.cn.vo;

import java.util.Arrays;
import java.util.Random;

public class MainDemo {
	static Random rand=new Random(19);
	
	public static void main(String args[]){
		System.out.println("hello world!!");
		int[][] a={
				{1,2,3},
				{2,3,4},
				{3,4,5}
		};
		System.out.println(Arrays.deepToString(a));
		
		
		int[][][] b=new int[rand.nextInt(7)][][];
		for(int i=0;i<b.length;i++){
			b[i]=new int[rand.nextInt(8)][];
			for(int j=0;j<b[i].length;j++){
				b[i][j]=new int[rand.nextInt(9)];
			}
		}
		System.out.println(Arrays.deepToString(b));
		
		String[][]str={
				{"liurong","xixi","xiaowang"},
				{"wang","yang"},
				{"chen","zhang","liu"}
		};
		System.out.println("str=="+Arrays.deepToString(str));
		for(int i=0;i<str.length;i++){
			System.out.println(str[i].length);
		}
		
		int[][] d={
				{1,2,3},
				{1,2},
				{2,3,4}
		};
		System.out.println(Arrays.deepToString(d));
		for(int i=0;i<d.length;i++){
			System.out.println(d[i].length);
		}
	}
}
