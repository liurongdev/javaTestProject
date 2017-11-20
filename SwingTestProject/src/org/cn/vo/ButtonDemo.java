package org.cn.vo;
import static org.cn.vo.SwingConsole.run;

import java.awt.FlowLayout;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.basic.BasicArrowButton;
public class ButtonDemo extends JFrame{
	private JButton button=new JButton("button1");
	private BasicArrowButton 
		up=new BasicArrowButton(BasicArrowButton.NORTH),
		down=new BasicArrowButton(BasicArrowButton.SOUTH),
		right=new BasicArrowButton(BasicArrowButton.WEST),
		left=new BasicArrowButton(BasicArrowButton.EAST);
				
	public ButtonDemo(){
		setLayout(new FlowLayout());
		add(button);	
		add(new JToggleButton("JTooggleButton"));
		add(new JCheckBox("checkBox"));
		add(new JRadioButton("radioButton"));
		JPanel jp=new JPanel();
		jp.setBorder(new TitledBorder("Directions"));
		jp.add(up);
		jp.add(down);
		jp.add(right);
		jp.add(left);
		add(jp);
	}
	public static void  main(String[] args) throws InvocationTargetException, InterruptedException{
		run(new ButtonDemo(),300,400);
	}
}	
