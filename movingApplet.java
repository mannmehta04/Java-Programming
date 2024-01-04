/*
 <applet code="movingApplet.class" height="1100" width="1100">
 </applet>
*/

import java.applet.Applet;
import java.awt.*;
public class movingApplet extends Applet implements Runnable{
	int x,y;
	int flag = 0;
	Thread t;
	// Thread y1;
	public void init(){
		x = 100;
		y = 100;
		t = new Thread(this,"Kalp");
		// y1 = new Thread(this,"Ayush");
	}

	public void start(){
		t.start();
		// y1.start();
	}

	@Override
	 public void run() {
		for(;;){
		if(x > 500){
			flag = 1;
		}
		if(x <= 0){
			flag = 0;
		}
		if(flag == 1){
			x = x - 50;
		}
		if(flag == 0){
			x = x + 50;
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		repaint();
		}
	}
	
	public void paint(Graphics g){
		g.drawString("Created by Kalp", x, y);
	}
}
