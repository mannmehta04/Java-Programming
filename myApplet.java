/*
 <applet code="myApplet.class" height="500" width="500">
 </applet>
*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class myApplet extends Applet implements ActionListener{
	
	Button b1;
	int count;

	public void init(){
		b1 = new Button("Button 1");
		count = 0;

		this.add(b1);
		b1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		showStatus(" " + ++count);
	}
}