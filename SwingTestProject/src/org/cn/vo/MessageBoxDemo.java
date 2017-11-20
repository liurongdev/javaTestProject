package org.cn.vo;

import static org.cn.vo.SwingConsole.run;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class MessageBoxDemo extends JFrame{
	private JButton[] jbs={
			new JButton("Alert"),new JButton("Yes/no"),
			new JButton("Color"),new JButton("Input"),
			new JButton("3 vals")
	};
	private JTextField txt=new JTextField(20);
	private ActionListener listener=new ActionListener(){
		public void actionPerformed(ActionEvent e){
			String id=((JButton)e.getSource()).getText();
			if(id.equals("Alert")){
				JOptionPane.showMessageDialog(null,"this is bug for you","Hey",JOptionPane.ERROR_MESSAGE);
			}else if(id.equals("Yes/no")){
				JOptionPane.showConfirmDialog(null,"or no","Choose yes",JOptionPane.YES_NO_CANCEL_OPTION);
			}else if(id.equals("Color")){
				Object[] options={"Red","Blue"};
				int sel=JOptionPane.showOptionDialog(null, "choose a color", "Warning", 
						JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
				if(sel!=JOptionPane.CLOSED_OPTION){
					txt.setText("color selected:"+options[sel]);
				}
			}else if(id.equals("Input")){
				String val=JOptionPane.showInputDialog("How many fingers do you see?");
				txt.setText(val);
			}else if(id.equals("3 vals")){
				Object[] selections={"first","second","third"};
				Object val=JOptionPane.showInputDialog(null,"Choose one", "Input",
						JOptionPane.INFORMATION_MESSAGE, null, selections, selections[0]);
				if(val!=null){
					txt.setText(val.toString());
				}
			}
		}
	};
	public MessageBoxDemo(){
		super.setLayout(new FlowLayout());
		for(int i=0;i<jbs.length;i++){
			jbs[i].addActionListener(listener);
			add(jbs[i]);
		}
		add(txt);
	}
	public static void main(String[] args) throws InvocationTargetException, InterruptedException{
		run(new MessageBoxDemo(),300,400);
	}
}	
