import java.applet.Applet;
import java.awt.Graphics;
import java.util.Calendar;
public class Test12 extends Applet implements Runnable{
	static int h;
	static int m;
	static int s;
	boolean a = true;
	Thread th;

	public void init(){
		th = new Thread(this);
		th.start();
	}

	public void paint(Graphics g) {
		g.drawString(h+":"+m+":"+s,10,10);
	}
	public void run() {
		while(a==true){
			h = 
		Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
			m = Calendar.getInstance().get(Calendar.MINUTE);
			s= Calendar.getInstance().get(Calendar.SECOND);
			repaint();
			try{
				Thread.sleep(1000);  //スリープ１�
			}catch(InterruptedException e){
			}
		}
	}
}
	