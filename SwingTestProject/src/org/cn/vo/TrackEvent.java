package org.cn.vo;

import static org.cn.vo.SwingConsole.run;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class TrackEvent extends JFrame{
	private Map<String,JTextField>map=new HashMap<String,JTextField>();
	private MyButton
			button1=new MyButton(Color.red,"mybutton1"),
			button2=new MyButton(Color.blue,"mybutton2");
	private String[] event={
			"focusGained","focusLosed","keyPressed",
			"keyReleased","keyTyped","mouseClicked",
			"mouseEntered","mouseExited","mousePressed",
			"mouseReleased","mouseDragged","mouseMoved"
	};
	public TrackEvent(){
		setLayout(new GridLayout(event.length+1,2));
		for(String eve:event){
			JTextField t=new JTextField();
			t.setEditable(false);
			JLabel label=new JLabel(eve,JLabel.RIGHT);
			add(label);
			add(t);
			map.put(eve, t);
		}
		super.add(button1);
		super.add(button2);
		for(Map.Entry<String, JTextField> entry:map.entrySet()){
			System.out.println(entry.getKey()+"--->"+entry.getValue());
		}
	}
	class MyButton extends JButton{
		public void report(String field,String msg){
			map.get(field).setText(msg);
		}
		MouseMotionListener mm1=new MouseMotionListener(){

			@Override
			public void mouseDragged(MouseEvent e) {
				report("mouseDraged",e.paramString());
				
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				report("mouseMoved",e.paramString());
			}
			
		};
		FocusListener f1=new FocusListener(){

			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				report("focusGained",e.paramString());
			}

			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				report("focusLost",e.paramString());
			}
			
		};
		KeyListener k1=new KeyListener(){
			@Override
			public void keyTyped(KeyEvent e) {
				report("keyTyped",e.paramString());
			}
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				report("keyPressed",e.paramString());
			}
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				report("keyReleased",e.paramString());
			}
			
		};
		MouseListener m1=new MouseListener(){
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				report("mouseClicked",e.paramString());
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				report("mousePressed",e.paramString());
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				report("mouseReleased",e.paramString());
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				report("mouseEntered",e.paramString());
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				report("mouseExited",e.paramString());
			}
			
		};
		public MyButton(Color color,String name){
			super(name);
			super.setBackground(color);
			super.addFocusListener(f1);
			super.addKeyListener(k1);
			super.addMouseListener(m1);
			super.addMouseMotionListener(mm1);
		}
	}
	public static void main(String[] args) throws Exception{
		run(new TrackEvent(),700,500);
	}
}
