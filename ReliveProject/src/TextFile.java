

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class TextFile extends ArrayList<String>{
	public  static String read(String fileName){
		StringBuilder sb=new StringBuilder();
		try{
			BufferedReader read=new BufferedReader(new FileReader(new File(fileName).getAbsolutePath()));
			String s;
			while((s=read.readLine())!=null){
				sb.append(s);
				sb.append("\n");
			}
			read.close();
		}catch(IOException e){
			throw new RuntimeException(e);
		}
		return sb.toString();
	}
	public static void write(String fileName,String text){
		try {
			PrintWriter pw=new PrintWriter(new File(fileName).getAbsolutePath());
			try{
				pw.print(text);
			}finally{
				pw.close();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public TextFile(String fileName,String spliter){
		super(Arrays.asList(read(fileName).split(spliter)));
		if(get(0).equals(""))
				remove(0);
	}
	public TextFile(String fileName){
		this(fileName,"\n");
	}
	
	public void write(String fileName){
		try{
			PrintWriter print=new PrintWriter(new File(fileName).getAbsolutePath());
			for(String s: this){
				print.println(s);
			}
		}catch(IOException e){
			throw new RuntimeException(e);
		}
		
	}
	public static void main(String args[]){
		String file=read("TextFile.java");
		write("test.txt",file);
		TextFile text=new TextFile("test.txt");
		text.write("test2.txt");
		TreeSet<String>words=new TreeSet<String>(new TextFile("TextFile.java","\\w+"));
		System.out.println(words.headSet("a"));
	}

}
