package org.cn.vo;

public class RandomTest {
	static void usage(){
		System.out.println("usage:");
		System.out.println("\tRandomBounds:lower");
		System.out.println("\tRandomBounds:upper");
		System.exit(2);
	}
	public static void main(String[] args){
		if(args.length !=1)
			usage();
		if(args[0].equals("lower")){
			while(Math.random()!=0.0)
				;
			System.out.println("Produced 0.0!");
		}else if(args[0].equals("upper")){
			while(Math.random()!=1.0)
				;
			System.out.println("Produces 1.0!");
		}else{
			usage();
		}
	}
}
