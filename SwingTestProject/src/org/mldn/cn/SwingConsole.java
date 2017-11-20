package org.mldn.cn;

import java.lang.reflect.InvocationTargetException;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class SwingConsole {
	public static void run(final JFrame f,final int width,final int height) throws InvocationTargetException, InterruptedException{
		SwingUtilities.invokeAndWait(new Runnable(){
			public void run(){
				f.setTitle(f.getClass().getSimpleName());
				f.setSize(width, height);
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f.setVisible(true);
			}
		});
	}
}	
