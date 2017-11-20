package org.cn.vo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

public class MainDemo {
	private static String info=""
			+ "this is test Rlected\n"+
			" begining";
	private static Pattern p=Pattern.compile("\\w+\\.");
	public static void main(String[] args){
		if(args.length<=1){
			args=new String[]{
				"org.cn.vo.MainDemo","org.cn.vo.MainDemo"
			};
		}
		if(args.length<1){
			System.out.println("args.length<1 System exit");
			System.exit(2);
		}
		int lines=0;
		
		try{
			Class<?>c=Class.forName(args[0]);
			Method[] methods=c.getMethods();
			Constructor[] cons=c.getConstructors();
			if(args.length==1){
				for(Method method:methods){
					System.out.println(p.matcher(method.toString()));
				}
				for(Constructor con:cons){
					System.out.println(p.matcher(con.toString()));
				}
			}else{
				for(Method method:methods){
					if(method.toString().indexOf(args[1])!=-1){
						System.out.println(p.matcher(method.toString()).replaceAll(""));
						lines++;
						System.out.println(lines);
					}
				}
				for(Constructor con:cons){
					if(con.toString().indexOf(args[1])!=-1){
						System.out.println(p.matcher(con.toString()).replaceAll(""));
						lines++;
						System.out.println(lines);
					}
				}
			}
		}catch(ClassNotFoundException e){
			System.out.println("No Such Class"+e);
		}
	}
}
