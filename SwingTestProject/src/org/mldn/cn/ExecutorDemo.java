package org.mldn.cn;
import static org.mldn.cn.SwingConsole.run;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JFrame;
class Task  implements Runnable{
	private static int counter=0;
	private final long id=counter++;
	public void run(){
		 try{
			 System.out.println(this+" started");
			 TimeUnit.SECONDS.sleep(3);
		 }catch(InterruptedException e){
			 System.out.println(this+" interrupted");
			 return;
		 }
		 System.out.println(this+" completed");
	}
	public String toString(){
		return "start:"+id;
	}
	public long id(){
		return id;
	}
}
public class ExecutorDemo extends JFrame{
	private JButton
		start=new JButton("start Task"),
		stop=new JButton("stop task");
	ExecutorService executor=Executors.newSingleThreadExecutor();
	public ExecutorDemo(){
		start.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Task task=new Task();
				executor.execute(task);
				System.out.println(task+" add to queue");
			}
		});
		stop.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				executor.shutdownNow();
			}
		});
		setLayout(new FlowLayout());
		add(start);
		add(stop);
	}
	public static void main(String[] args) throws InvocationTargetException, InterruptedException{
		run(new ExecutorDemo(),300,300);
	}
}
