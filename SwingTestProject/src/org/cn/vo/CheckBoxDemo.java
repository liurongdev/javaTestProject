package org.cn.vo;

import static org.cn.vo.SwingConsole.run;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
public class CheckBoxDemo extends JFrame{
	private JTextArea t=new JTextArea(16,10);
	private JCheckBox
		box1=new JCheckBox("box1"),
		box2=new JCheckBox("box2"),
		box3=new JCheckBox("box3");
	
	public CheckBoxDemo(){
		box1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
					trace("1",box1);
			}

		});
		box2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
					trace("2",box2);
			}

		});
		box3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
					trace("3",box3);
			}

		});
		super.setLayout(new FlowLayout());
		super.add(new JScrollPane(t));
		super.add(box1);
		super.add(box2);
		super.add(box3);
	}
	public void trace(String b,JCheckBox box){
		//t.setText("");
		if(box.isSelected()){
			t.append("Box"+b+" set\n");
		}else{
			t.append("Box"+b+" cleared\n");
		}
	}
	public static void main(String[] args){
		try {
			run(new CheckBoxDemo(),300,200);
		} catch (InvocationTargetException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}	
