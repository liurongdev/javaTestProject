package org.mldn.cn;

import static org.mldn.cn.SwingConsole.run;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JPanel;
class Box extends JPanel implements Runnable{
	private int pause;
	private static Random rand=new Random();
	private Color color=new Color(0);
	public Box(int pause){
		this.pause=pause;
	}
	@Override
	public void paintComponent(Graphics g) {
		//super.paintComponent(g);
		g.setColor(color);
		Dimension d=getSize();
		g.fillRect(0, 0, d.width, d.height);
	}
	public void run(){
		try{
			while(!Thread.interrupted()){
				color=new Color(rand.nextInt(0XFFFFFF));
				repaint();
				TimeUnit.SECONDS.sleep(pause);
			}
		}catch(InterruptedException e){
			System.out.println("InterruptedException");
		}
		
	}
}
public class BoxDemo extends JFrame {
	private int grid=2;
	private int pause=2;
	private static ExecutorService executor=Executors.newCachedThreadPool();
	public void setUp(){
		setLayout(new GridLayout(grid,grid));
		for(int i=0;i<grid*grid;i++){
			Box box=new Box(pause);
			add(box);
			executor.execute(box);
		}
	}
	public static void main(String[] args) throws InvocationTargetException, InterruptedException{
		BoxDemo demo=new BoxDemo();
		if(args.length>0){
			demo.grid=new Integer(args[0]);
		}
		if(args.length>1){
			demo.grid=new Integer(args[1]);
		}
		demo.setUp();
		run(new BoxDemo(),400,400);
	}
}
