package org.cn.vo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTestDemo {
	public static void main(String [] args){
		if(args.length<2){
				System.out.println("input args.length<=2 it is too short");
				System.exit(1);
		}
		System.out.println("input String is:"+args[0]);
		for(String arg:args){
			System.out.println("reguler expression:"+arg);
			Pattern pattern=Pattern.compile(arg);
			Matcher matcher=pattern.matcher(args[0]);
			while(matcher.find()){
				System.out.println("Math ;"+matcher.group()+" at position "+
								matcher.start()+" ; end at 	"+(matcher.end()-1)); 
			}
		}
	}
}
