import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class Test09 extends Applet implements MouseMotionListener {
	int gx = 0;    //X蠎ｧ讓吶ｒ菫晄戟縺吶ｋ螟画焚
	int gy = 0;    //Y蠎ｧ讓吶ｒ菫晄戟縺吶ｋ螟画焚
	Graphics Grp;
	public void init(){
		Grp = getGraphics();
		addMouseMotionListener(this);
	}
	public void mouseDragged(MouseEvent e) {
		//マウスドラッグ時に、画面に出力
		Grp.drawLine(gx,gy,e.getX(),e.getY());
		gx = e.getX();
		gy = e.getY();
	}
	public void mouseMoved(MouseEvent e) {
		//現在のマウスの座標を保持
		gx = e.getX();
		gy = e.getY();
	}
}