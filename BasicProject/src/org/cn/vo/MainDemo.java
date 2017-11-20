package org.cn.vo;

public class MainDemo {
	public static void main(String[] args){
		  for(char c=0;c<128;c++){
			  if(Character.isLowerCase(c)){
				  System.out.println("value:"+(int)c+" character:"+c);
			  }
		  }
		  for(char c:"hello this is dongguang university".toCharArray()){
			  System.out.print(c+";");
		  }
		  for(int i=0;i<100;i++){
			  if(i==93)
				  break;
			 if(i%9 !=0)
				 continue;
			 System.out.println("i="+i);
		  }
		  
		  System.out.println("@@@@@@@@@@@@@@@@@@@@@");
		  int i=0;
		  outer:
			  for(;true;){
				  inner:
					 for(;i<10;i++){
						 System.out.println("i="+i);
						 if(i==2){
							 System.out.println("continue");
							 continue;
						 }
						 if(i==3){
							 System.out.println("break;");
							 i++;
							 break;
						 }
						 if(i==7){
							 System.out.println("continue outer:");
							 i++;
							 continue outer;
						 }
						 if(i==8){
							 System.out.println("break outer");
							 break outer;
						 }
						 for(int k=0;k<5;k++){
							 if(k==3){
								 System.out.println("continue inner");
								 continue inner;
							 }
						 }
					 }
			  }
	}
}
