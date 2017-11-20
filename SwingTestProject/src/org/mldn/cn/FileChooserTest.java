package org.mldn.cn;

import static org.mldn.cn.SwingConsole.run;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class FileChooserTest extends JFrame{
	private JTextField
			fileName=new JTextField(),
			dir=new JTextField();
	private JButton
		open=new JButton("open"),
		save=new JButton("Save");
	public FileChooserTest(){
		JPanel p=new JPanel();
		open.addActionListener(new OpenL());
		p.add(open);
		save.addActionListener(new SaveL());
		p.add(save);
		add(p,BorderLayout.SOUTH);
		fileName.setEnabled(false);
		dir.setEditable(false);	
		p=new JPanel();
		p.setLayout(new GridLayout(2,1));
		p.add(fileName);
		p.add(dir);
		add(p,BorderLayout.NORTH);
	}
	class OpenL implements ActionListener{
		public void actionPerformed(ActionEvent e){
			JFileChooser c=new JFileChooser();
			int rVal=c.showOpenDialog(FileChooserTest.this);
			if(rVal==JFileChooser.APPROVE_OPTION){
				fileName.setText(c.getSelectedFile().getName());
				dir.setText(c.getCurrentDirectory().toString());
			}
			if(rVal==JFileChooser.CANCEL_OPTION){
				fileName.setText("you Pressed Canced");
				dir.setText("");
			}
		}
	}
	class SaveL implements ActionListener{
		public void actionPerformed(ActionEvent e){
			JFileChooser c=new JFileChooser();
			int rVal=c.showSaveDialog(FileChooserTest.this);
			if(rVal==JFileChooser.APPROVE_OPTION){
				fileName.setText(c.getSelectedFile().getName());
				dir.setText(c.getCurrentDirectory().toString());
			}
			if(rVal==JFileChooser.CANCEL_OPTION){
				fileName.setText("you Pressed Canced");
          				dir.setText("");
			}
		}
	}
	public static void main(String[] args) throws InvocationTargetException, InterruptedException{
		run(new FileChooserTest(),300,400);
	}
}
