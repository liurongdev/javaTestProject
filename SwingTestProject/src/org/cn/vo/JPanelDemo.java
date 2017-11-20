package org.cn.vo;
import static org.cn.vo.SwingConsole.run;

import java.awt.FlowLayout;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.border.TitledBorder;
public class JPanelDemo extends JFrame{
	private String[] ids={
			"xixi","zhang","liu","cheng"
	};
	public JPanel makeJPanel(Class<? extends AbstractButton> kind,String[] ids){
		ButtonGroup group=new ButtonGroup();
		String title=kind.getName();
		title=title.substring(title.lastIndexOf(".")+1);
		JPanel jpanel=new JPanel();
		jpanel.setBorder(new TitledBorder(title));
		for(String id:ids){
			AbstractButton button=new JButton("wrong");
			try{
				Constructor con=kind.getConstructor(String.class);
				button=(AbstractButton)con.newInstance(id);
			}catch(Exception e){
				System.out.println("create falied");
			}
			group.add(button);
			jpanel.add(button);
		}
		return jpanel;
	}
	public JPanelDemo(){
		super.setLayout(new FlowLayout());
		add(makeJPanel(JButton.class,ids));
		add(makeJPanel(JCheckBox.class,ids));
		add(makeJPanel(JRadioButton.class,ids));
		add(makeJPanel(JToggleButton.class,ids));
	}
	public static void main(String[] args) throws InvocationTargetException, InterruptedException {
		run(new JPanelDemo(),300,400);
	}

}
