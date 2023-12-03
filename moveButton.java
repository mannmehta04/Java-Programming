/*
 <applet code="moveButton.class" height="500" width="500">
 </applet>
*/

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class moveButton extends Applet implements Runnable, ActionListener{
	int x,y;
	int flag = 0;
	Thread t;
	Button b;
	// Thread y1;
	public void init(){
		x = 100;
		y = 100;
		t = new Thread(this,"Kalp");

		b = new Button("move");
		add(b);
		b.addActionListener(this);
		// y1 = new Thread(this,"Ayush");
	}

	// public void start(){
		
	// 	// y1.start();
	// }

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

	@Override
	public void actionPerformed(ActionEvent e) {
		t.start();
	}
}
