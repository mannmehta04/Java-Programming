/*
 <applet code="myApplet2.class" height="500" width="500">
 </applet>
*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class myApplet2 extends Applet implements ActionListener{
	
	Button b1, b2, b3, b4;
	int count1;
	int count2;
	int tCount = 0;

	public void init(){
		b1 = new Button("Button 1");
		b2 = new Button("Button 2");
		b3 = new Button("Button 3");
		b4 = new Button("Button 4");
		count1 = 0;
		count2 = 0;

		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1){
			showStatus("Kalp is Great");
		}
		else if(e.getSource() == b2){
			showStatus("Ayush is Pussy");
		}
		// if(e.getActionCommand().equals("Button 1")){
		// 	tCount++;
		// 	// System.out.println(tCount);
		// 	if(tCount % 2 == 0){
		// 		showStatus(" " + ++count1 + " "+count2);
		// 	}
		// 	else{
		// 		showStatus(" " + count1 + " "+count2);
		// 	}
		// }
		// else if(e.getActionCommand().equals("Button 2"))
		// 	showStatus(" " + count1 + " "+ ++count2);
		// else if(e.getActionCommand().equals("Button 3")){
		// 	count1 = 0;
		// 	showStatus(" " + count1 + " "+ count2);
		// }
		// else if(e.getActionCommand().equals("Button 4")){
		// 	count2 = 0;
		// 	showStatus(" " + count1 + " "+ count2);
		// }
	}
}
