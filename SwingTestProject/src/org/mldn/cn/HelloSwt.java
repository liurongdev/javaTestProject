package org.mldn.cn;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class HelloSwt {
	public static void main(String[] args) throws InterruptedException{
		Display display=new Display();
		Shell shell=new Shell(display);
		shell.setText("hello Swt");
		shell.open();
		while(!shell.isDisposed()){
			if(!display.readAndDispatch()){
				display.sleep();
			}
			display.dispose();
		}
	}
}
