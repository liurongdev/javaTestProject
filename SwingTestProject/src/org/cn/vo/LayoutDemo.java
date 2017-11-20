package org.cn.vo;
import static org.cn.vo.SwingConsole.run;

import java.awt.FlowLayout;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JButton;
import javax.swing.JFrame;
public class LayoutDemo extends JFrame{
	public LayoutDemo(){
		/**
		 * 	
		add(BorderLayout.CENTER,new JButton("center"));
		add(BorderLayout.SOUTH,new JButton("south"));
		add(BorderLayout.NORTH,new JButton("north"));
		add(BorderLayout.EAST,new JButton("east"));
		add(BorderLayout.WEST,new JButton("west"));
		 */
		setLayout(new FlowLayout());
		for(int i=0;i<20;i++){
			add(new JButton("button"+i));
		}
	}
	public static void main(String[] args) throws InvocationTargetException, InterruptedException{
		run(new LayoutDemo(),300,300);
	}
}
