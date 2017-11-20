package org.cn.vo;

import static org.cn.vo.SwingConsole.run;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
class SineDraw extends JPanel{
	private static final int NUMBER=200;
	private int cycles;
	private int points;
	private double[] sines;
	private int[] pts;
	public SineDraw(){
		setCycle(5);
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		int maxWidth=super.getWidth();
		int maxHeight=super.getHeight();
		double hstep=(double)maxWidth/(double)points;
		pts=new int[points];
		for(int i=0;i<points;i++){
			pts[i]=(int) (sines[i]*maxHeight/2*0.95+maxHeight/2);
		}
		g.setColor(Color.red);
		for(int i=1;i<points;i++){
			int x1=(int)((i-1)*hstep);
			int x2=(int)(i*hstep);
			int y1=pts[i-1];
			int y2=pts[i];
			g.drawLine(x1, y1, x2, y2);
		}
	}
	public void setCycle(int n){
		this.cycles=n;
		points=NUMBER*cycles*2;
		sines=new double[points];
		for(int i=0;i<points;i++){
			double radians=(Math.PI/NUMBER)*i;
			sines[i]=Math.sin(radians);
		}
		repaint();
	}
}
public class SineWave extends JFrame{
	private SineDraw sines=new SineDraw();
	private JSlider adjustCycles=new JSlider(1,30,5);
	public SineWave(){
		add(sines);
		adjustCycles.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent e){
				sines.setCycle(((JSlider)e.getSource()).getValue());
			}
		});
	}
	public static void main(String[] args)throws Exception{
		run(new SineWave(),700,400);
	}
}
