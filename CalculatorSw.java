import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorSw extends JFrame{
	public CalculatorSw(String title){
		super(title);
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		this.setLayout(new FlowLayout());
		p2.setLayout(new GridLayout(3,3,1,1));
		
		JTextField t1 = new JTextField("Results",15);

		ActionListener al = new ActionListener(){
			boolean editable = true;
			double op1=0;
			public void actionPerformed(ActionEvent ae){
				String command = ae.getActionCommand();
				//System.out.println(command);
				if(command.equals("c")){
					t1.setText("");
					//prevCommand = "";
				}
				else if(command.equals("+")){
					//prevCommand = command;
					editable = false;
					String input = t1.getText();
					//t1.setText("");
					if(!input.equals(""))
						op1 += Double.parseDouble(input);
					t1.setText(op1+"");
				}
				else{
						if(editable){
							t1.setText(t1.getText()+command);
						}
						else{
							editable = true;
							t1.setText(command);
						}
				}
			}
		};

		p1.add(t1);

		for(int i=0;i<=9;i++){
			JButton b1 = new JButton(i+"");
			b1.addActionListener(al);
			p2.add(b1);
		}

		JButton clear = new JButton("c");
		clear.addActionListener(al);
		p2.add(clear);
		JButton plus = new JButton("+");
		plus.addActionListener(al);
		p2.add(plus);
		//p2.add(new JButton("+"));
		p2.add(new JButton("-"));
		p2.add(new JButton("*"));
		p2.add(new JButton("/"));
		this.add(p1);
		this.add(p2);
	}

	public static void main(String[] s){
		CalculatorSw calc1 = new CalculatorSw("Calculator");
		calc1.setSize(225, 300);
		calc1.setVisible(true);
		calc1.setResizable(false);
	}
}