package org.cn.mldn;

import java.util.Arrays;
import java.util.Random;
import java.util.jar.Attributes.Name;

public class WangDemo { 
	private static Random rand=new Random(47);
	private static final String[] NAME={
			"liurong","xixi","zhang","wang","cheng","yang"
	};
	public static String[] getString(int n){
		String[] result=new String[n];
		boolean[] picked=new boolean[NAME.length];
		for(int i=0;i<n;i++){
			int t;
			do
				t=rand.nextInt(NAME.length);
			while(picked[t]);
			result[i]=NAME[t];
			picked[t]=true;
		}
		return result;
	}
	public static void main(String args[]){
		for(int i=0;i<10;i++){
			System.out.println(Arrays.toString(getString(3)));
		}
		
		Random rand=new Random(10);
		for(int i=0;i<10;i++){
			System.out.println(rand.nextInt(100));
		}
		
	}
}
