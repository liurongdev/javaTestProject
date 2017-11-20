package org.mldn.cn;

import static org.mldn.cn.SwingConsole.run;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JFrame;
public class LongThreadDemo extends JFrame{
	private JButton
			start=new JButton("start long task"),
			stop=new JButton("stop task");
	public LongThreadDemo(){
		start.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try {
					TimeUnit.SECONDS.sleep(3);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					System.out.println("Task InterRupted");
					return;
				}
			}
		});
		stop.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Thread.currentThread().interrupt();
			}
		});
		setLayout(new FlowLayout());
		add(start);
		add(stop);
	}
	public static void main(String[] args) throws InvocationTargetException, InterruptedException{
		run(new LongThreadDemo(),300,300);
	}
}
