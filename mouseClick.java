import java.applet.Applet;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/*
 <applet code="mouseClick.class" height="500" width="500">
 </applet>
*/
public class mouseClick extends Applet implements MouseMotionListener{
	int x = 0;
	int y = 0;

	public void init(){
		addMouseMotionListener(this);
	}
	public void start(){
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		x = e.getX();
		y = e.getY();

		showStatus(x + "  " + y);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		x = e.getX();
		y = e.getY();

		showStatus(x + "  " + y);
	}
	
}