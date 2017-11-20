package org.cn.vo;

import static org.cn.vo.SwingConsole.run;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
public class MenusDemo extends JFrame{
	private String[] flavors={
			"liurong","xixi","wang","zhang","cheng","yang","wu","liu","he","zhou"
	};
	private JTextField t=new JTextField("no flavors",30);
	private JMenuBar mb1=new JMenuBar();
	private JMenu
			f=new JMenu("File"),
			m=new JMenu("Flavors"),
			s=new JMenu("Safety");
	private JCheckBoxMenuItem[] safety={
			new JCheckBoxMenuItem("Guard"),
			new JCheckBoxMenuItem("Hide")
	};
	private JMenuItem[] file={
			new JMenuItem("Open")
	};
	private JMenuBar mb2=new JMenuBar();
	private JMenu fooBar=new JMenu("fooBar");
	private JMenuItem[] other={
			new JMenuItem("Foo",KeyEvent.VK_F),
			new JMenuItem("Bar",KeyEvent.VK_A),
			new JMenuItem("Baz")
	};
	private JButton b=new JButton("swap menu");
	class BL implements ActionListener{
		public void actionPerformed(ActionEvent e){
			JMenuBar m=getJMenuBar(); 
			setJMenuBar(m==mb1?mb2:mb1);
			validate();
		}
	}
	class ML implements ActionListener{
		public void actionPerformed(ActionEvent e){
			JMenuItem targer=(JMenuItem)e.getSource();
			String actionCommand=targer.getActionCommand();
			if(actionCommand.equals("Open")){
				String s=t.getText();
				boolean chosen=false;
				for(String flavor:flavors){
					if(s.equals(flavor)){
						chosen=true;
					}
				}
				if(!chosen){
					t.setText("Choose a flavor first");
				}else{
					t.setText("Opening "+s+" . Mm mm!");
				}
			}
		}
	}
	class FL implements ActionListener{
		public void actionPerformed(ActionEvent e){
			JMenuItem target=(JMenuItem)e.getSource();
			t.setText(target.getText());
		}
	}
	class FooL implements ActionListener{
		public void actionPerformed(ActionEvent e){
			t.setText("Foo selected");
		}
	}
	class BarL implements ActionListener{
		public void actionPerformed(ActionEvent e){
			t.setText("Bar selected");
		}
	}
	class BazL implements ActionListener{
		public void actionPerformed(ActionEvent e){
			t.setText("Baz selected");
		}
	}
	class CMIL implements ItemListener{
		public void itemStateChanged(ItemEvent e){
			JCheckBoxMenuItem target=(JCheckBoxMenuItem)e.getSource();
			String actionCommand=target.getActionCommand();
			if(actionCommand.equals("Guard")){
				t.setText("Guard the ice cream "+" Guarding is "+target.getClass());
			}else if(actionCommand.equals("Hide")){
				t.setText("Hide the ice cream "+" is it Hide? "+target.getState());
			}
		}
	}
	public MenusDemo(){
		ML ml=new ML();
		CMIL cmil=new CMIL();
		safety[0].setActionCommand("Guard");
		safety[0].setMnemonic(KeyEvent.VK_G);
		safety[0].addItemListener(cmil);
		safety[1].setActionCommand("Hide");
		safety[1].setMnemonic(KeyEvent.VK_H);
		safety[1].addItemListener(cmil);
		other[0].addActionListener(new FooL());
		other[1].addActionListener(new BarL());
		other[2].addActionListener(new BazL());
		FL fl=new FL();
		int n=0;
		for(String flavor:flavors){
			JMenuItem mi=new JMenuItem(flavor);
			mi.addActionListener(fl);
			m.add(mi);
			if((n++ +1)%3 == 0){
				m.addSeparator();
			}
		}
		for(JCheckBoxMenuItem sfty:safety){
			s.add(sfty);
		}
		s.setMnemonic(KeyEvent.VK_A);
		f.add(s);
		f.setMnemonic(KeyEvent.VK_F);
		for(int i=0;i<file.length;i++){
			file[i].addActionListener(ml);
			f.add(file[i]);
		}
		mb1.add(f);
		mb1.add(m);
		setJMenuBar(mb1);
		t.setEnabled(false);
		add(t,BorderLayout.CENTER);
		b.addActionListener(new BL());
		b.setMnemonic(KeyEvent.VK_S);
		add(b,BorderLayout.NORTH);
		for(JMenuItem oth:other){
			fooBar.add(oth);
		}
		fooBar.setMnemonic(KeyEvent.VK_B);
		mb2.add(fooBar);
	}
	public static void main(String[] args) throws InvocationTargetException, InterruptedException{
		run(new MenusDemo(),300,400);
	}
}
