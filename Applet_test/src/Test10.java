import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Test10 extends Applet implements MouseMotionListener {
	int gx = 0;
	int gy = 0;
	Graphics Grp;
	Button btnRed;
	Button btnBla;
	Button btnBlue;
	public void init(){
		Grp = getGraphics();
		addMouseMotionListener(this);
		add(btnRed = new Button("��"));
		add(btnBla = new Button("��"));
		add(btnBlue = new Button("��"));
	}
	public void mouseDragged(MouseEvent e) {
		Grp.drawLine(gx,gy,e.getX(),e.getY());gx = e.getX();gy = e.getY();
	}
	public void mouseMoved(MouseEvent e) {
		gx = e.getX();	gy = e.getY();
	}
	public boolean action(Event e,Object o){
		if(o.equals("��")) {
			Grp.setColor(new Color(255,0,0));
		}
		if(o.equals("��")) {
			Grp.setColor(new Color(0,0,0));
		}
		if(o.equals("��")) {
			Grp.setColor(new Color(0,0,255));
		}
		return true;
	}
}