import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/*
 <applet code="mousePrint.class" height="500" width="500">
 </applet>
*/

public class mousePrint extends Applet implements MouseMotionListener {

	int x,y;

	public void init(){
		this.addMouseMotionListener(this);
	}

	@Override
	public void mouseDragged(MouseEvent e) {}

	@Override
	public void mouseMoved(MouseEvent e) {
		x=e.getX();
		y=e.getY();
		repaint();
	}

	public void paint(Graphics g){
		g.drawString("Tini", x, y);
	}
}
