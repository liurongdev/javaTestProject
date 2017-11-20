package org.cn.vo;

import static org.cn.vo.SwingConsole.run;

import java.awt.BorderLayout;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class TabbedPanelDemo extends JFrame{
	private String[] name={
			"liurong","xixi","zhangsan","wang"	
	};
	private JTabbedPane tabs=new JTabbedPane();
	private JTextField txt=new JTextField();
	public TabbedPanelDemo(){
		int i=0;
		for(String name2:name){
			tabs.addTab(name[i],new JButton("tabbedPane"+i++));
			tabs.addChangeListener(new ChangeListener(){
				public void stateChanged(ChangeEvent e){
					txt.setText("Tab selected:"+tabs.getSelectedIndex());
				}
			});
		}
		super.add(BorderLayout.SOUTH,txt);
		add(tabs);
	}
	public static void main(String[] args) throws InvocationTargetException, InterruptedException{
		run(new TabbedPanelDemo(),300,300);
	}
}
