/*
 <applet code="applet4.class" height="500" width="500">
 </applet>
*/


import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
// import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class applet4 extends Applet implements ActionListener{
	
	Button b;
	int flag = 0;
	public void init(){
		b = new Button("Change Color");
		this.add(b);
		b.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(flag == 0){
			setBackground(Color.BLACK);
			flag =  1;
		}	
		else{
			flag = 0;
			setBackground(Color.RED);
		}
	} 
}
