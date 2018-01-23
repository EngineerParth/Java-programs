import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuessNumberSw extends JFrame{
	JLabel l1 = new JLabel("The number is");
	JTextField t1 = new JTextField(10);
	JButton generate = new JButton("generate");
	JLabel l2 = new JLabel("Enter your guess");
	JTextField t2 = new JTextField(10);
	JLabel message = new JLabel("");
	int n;

	public GuessNumberSw(String title){
		//this.setTitle(title);

		super(title);
		//this.addWindowListener(new MyWindowListener());
		this.setLayout(new FlowLayout());
		this.add(l1);
		this.add(t1);
		this.add(generate);
		this.add(l2);
		this.add(t2);
		this.add(message);
		generate.addMouseListener(new MyMouseListener(this));
		t2.addKeyListener(new MyKeyListener(this));
	}

	public static void main(String[] s){
		GuessNumberSw app1 = new GuessNumberSw("Guess the number");
		app1.setSize(300, 200);
		app1.setVisible(true);
		app1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MyMouseListener extends MouseAdapter{
	GuessNumberSw localRef;
	public MyMouseListener(GuessNumberSw t){
		localRef = t;
	}
	public void mouseClicked(MouseEvent me){
		int random = (int)(100*Math.random());
		localRef.n = random;
		localRef.t1.setText("**");
		localRef.t1.setEnabled(false);
	}

}

class MyKeyListener extends KeyAdapter{
	GuessNumberSw localRef;
	public MyKeyListener(GuessNumberSw t){	
		localRef = t;
	}

	public void keyPressed(KeyEvent ke){
		if(ke.getKeyCode() == KeyEvent.VK_ENTER){
			int typedNum = Integer.parseInt(localRef.t2.getText());
			if(typedNum > localRef.n){
				localRef.message.setText("Try Lower");
			} else if(typedNum < localRef.n){
				localRef.message.setText("Try Higher");
			} else{
				localRef.message.setText("You got it!");
			}

		}
	}
}

class MyWindowListener extends WindowAdapter{
	public void windowClosing(WindowEvent we){
		System.exit(0);
	}
}







