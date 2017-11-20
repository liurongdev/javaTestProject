package org.cn.vo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingDesktop extends JFrame implements Runnable{
	private int number=0;
	private JLabel back;
	private JLabel[] mouses;
	private ImageIcon imageMouse;
	private JLabel scoreText;
	public SwingDesktop(){
		setResizable(false);
		getContentPane().setLayout(null);
		setTitle("打地鼠游戏");
		this.setBounds(100, 100,1000,700);
		
		back=new JLabel();
		ImageIcon image=new ImageIcon(this.getClass().getResource("back.jpg"));
		back.setIcon(image);
		back.setBounds(0,-150,1000,1000);
		this.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(Toolkit.getDefaultToolkit().getImage("src/org/cn/vo/cz.jpg"),new Point(),"self"));
		imageMouse=new ImageIcon(this.getClass().getResource("mouse.jpg"));
		mouses=new JLabel[9];
		for(int i=0;i<mouses.length;i++){
			mouses[i]=new JLabel();
			mouses[i].setSize(imageMouse.getIconWidth(), imageMouse.getIconHeight());
			//mouses[i].setIcon(imageMouse);
			mouses[i].addMouseListener(new MouseAdapter(){
				@Override
				public void mouseClicked(MouseEvent e){
					Object object=e.getSource();
					if(object instanceof JLabel){
						JLabel label=(JLabel)(object);
						if(label.getIcon()!=null){
							number++;
							scoreText.setText("你的得分是："+number);
						}
						label.setIcon(null);
					}
				}
			});
			this.getContentPane().add(mouses[i]);
		}
		scoreText=new JLabel();
		scoreText.setBounds(800, 0, 150, 100);
		scoreText.setFont(new Font("",20,20));
		scoreText.setBackground(Color.BLACK);
		scoreText.setText("你的得分是： 分");
		mouses[0].setLocation(110, 160);
		mouses[1].setLocation(425, 160);
		mouses[2].setLocation(730, 160);
		mouses[3].setLocation(110, 300);
		mouses[4].setLocation(425, 300);
		mouses[5].setLocation(730, 300);
		mouses[6].setLocation(110, 440);
		mouses[7].setLocation(425, 440);
		mouses[8].setLocation(730, 440);
		add(scoreText);
		add(back);
		setVisible(true);
		
		
	}
	public void run(){
		while(true){
			try {
				Thread.sleep(500);
				int index=(int) (Math.random()*9);
				if(mouses[index].getIcon()==null){
					mouses[index].setIcon(imageMouse);
					Thread.sleep(800);
					if(mouses[index].isShowing()){
						mouses[index].setIcon(null);
					}
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
		
	}
	public static void main(String[] args){
		SwingDesktop p1=new SwingDesktop();
		Thread t1=new Thread(p1);
		t1.start();
	}
	
}
