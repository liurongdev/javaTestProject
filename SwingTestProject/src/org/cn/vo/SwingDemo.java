package org.cn.vo;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class SwingDemo {
	public static void main(String[] args) throws InterruptedException, InvocationTargetException{
		JFrame frame=new JFrame("this is jframe");
		JLabel lable=new JLabel("this is lable");
		frame.add(lable);
		frame.setSize(200, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		TimeUnit.SECONDS.sleep(1);
		SwingUtilities.invokeAndWait(new Runnable(){
			public void run(){
				lable.setText("this is liurong");
			}
		});
		//lable.setText("this is liurong");
		System.out.println("hello liurong");
		
	}
}
