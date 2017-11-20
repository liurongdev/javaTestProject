package org.cn.vo;

import static org.cn.vo.SwingConsole.run;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class JButtonDemo2 extends JFrame{
	private JButton 
			button1=new JButton("button1"),
			button2=new JButton("button2");
	private JTextField txt=new JTextField();
	private ButtonListener listener=new ButtonListener();
	public JButtonDemo2(){
		button1.addActionListener(listener);
		button2.addActionListener(listener);
		txt.setText("liurong");
		setLayout(new FlowLayout());
		add(button1);
		add(button2);
		add(txt);
	}
	class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String name=((JButton)e.getSource()).getText();
			txt.setText(name);
		}
	}
	public static void main(String[] args) throws InvocationTargetException, InterruptedException{
		run(new JButtonDemo2(),300,300);
	}
}
