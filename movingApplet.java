/*
 <applet code="movingApplet.class" height="1100" width="1100">
 </applet>
*/

import java.applet.Applet;
import java.awt.*;
public class movingApplet extends Applet implements Runnable{
	int x,y;
	Thread t;
	Thread y1;
	public void init(){
		x = 100;
		y = 100;
		t = new Thread(this,"Kalp");
		y1 = new Thread(this,"Ayush");
	}

	public void start(){
		t.start();
		y1.start();
	}

	@Override
	 public void run() {
		for(;;){
		if(Thread.currentThread().getName().equals("Kalp")){
			x = x + 50;
			repaint();
		}
		else{
			y = y + 50;
			repaint();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		}
	}
	
	public void paint(Graphics g){
		g.drawString("Created by Kalp", x, y);
	}
}
