package org.cn.vo;

import static org.cn.vo.SwingConsole.run;

import java.awt.FlowLayout;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JButton;
import javax.swing.JFrame;
public class JButtonDemo extends JFrame {
	private JButton
		button1=new JButton("button1"),
		button2=new JButton("button2");
	public JButtonDemo(){
		setLayout(new FlowLayout());
		add(button1);
		add(button2);
	}
	public static void main(String[] args) throws InvocationTargetException, InterruptedException{
		run(new JButtonDemo(),300,400);
	}
}
