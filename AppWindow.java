import java.awt.*;
import java.awt.event.*;

public class AppWindow extends Frame{
	String keyMessage = "";
	String mouseMessage = "";
	int mouseX = 30;
	int mouseY = 30;
	String title;

	public AppWindow(String title){
		super(title);
		this.addMouseListener(new MyMouseAdapter(this));
		this.addKeyListener(new MyKeyAdapter(this));
		this.addWindowListener(new MyWindowAdapter());
	}
	public void paint(Graphics g){
		g.drawString(keyMessage,10,40); // key message
		g.drawString(mouseMessage,mouseX,mouseY); // mouse message
	}

	public static void main(String[] s){
		AppWindow window1 = new AppWindow("Clicks and Characters");
		window1.setSize(500, 500);
		window1.setVisible(true);
	}
}

class MyKeyAdapter extends KeyAdapter{
	AppWindow aw;
	public MyKeyAdapter(AppWindow aw){
		this.aw = aw;
	}
	public void keyTyped(KeyEvent ke){
		aw.keyMessage += ke.getKeyChar();
		aw.repaint();
	}
}

class MyMouseAdapter extends MouseAdapter{
	AppWindow aw;
	public MyMouseAdapter(AppWindow aw){
		this.aw = aw;
	}

	public void mousePressed(MouseEvent me){
		aw.mouseX = me.getX();
		aw.mouseY = me.getY();
		aw.mouseMessage = "Mouse pressed at ("+me.getX()+","+me.getY()+")";
		aw.repaint();
	}
}

class MyWindowAdapter extends WindowAdapter{
	public void windowClosing(WindowEvent we){
		System.exit(0);
	}
}