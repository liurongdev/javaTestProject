package org.cn.vo;

import java.util.Arrays;
import java.util.regex.Pattern;

public class PatternDemo {
	public static void main(String [] args){
		String input="hello!!xixi l am liurong!!zhang!!wang yang";
		System.out.println(Arrays.toString(Pattern.compile("!!").split(input)));
		System.out.println(Arrays.deepToString(Pattern.compile("!!").split(input,3)));
	}
}
