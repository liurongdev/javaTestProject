package org.cn.vo;

import static org.cn.vo.SwingConsole.run;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
public class Popup extends JFrame{
	private JPopupMenu popup=new JPopupMenu();
	private JTextField t=new JTextField(10);
	public Popup(){
		setLayout(new FlowLayout());
		ActionListener al=new ActionListener(){
			public void actionPerformed(ActionEvent e){
				t.setText(((JMenuItem)e.getSource()).getText());
			}
		};
		add(t);
		JMenuItem m=new JMenuItem("Hello");
		m.addActionListener(al);
		popup.add(m);
		JMenuItem m2=new JMenuItem("liurong");
		m2.addActionListener(al);
		popup.add(m2);
		PopupListener listener=new PopupListener();
		super.addMouseListener(listener);
		t.addMouseListener(listener);
	}
	class PopupListener extends MouseAdapter{
		public void mousePressed(MouseEvent e){
			maybeshowPopup(e);
		}
		public void mouseReleased(MouseEvent e){
			maybeshowPopup(e);
		}
		
	}
	public void maybeshowPopup(MouseEvent e){
		popup.show(e.getComponent(), e.getX(), e.getY());
	}
	public static void main(String[] args) throws InvocationTargetException, InterruptedException{
		run(new Popup(),300,300);
	}
}
