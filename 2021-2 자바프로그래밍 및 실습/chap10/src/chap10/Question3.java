package chap10;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Question3 extends JFrame{
	private JRadioButton [] rb = new JRadioButton[2];
	private String [] color = { "Red", "Blue" };

	public Question3() {
		this.setTitle("Two Radio Button");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		ButtonGroup bg = new ButtonGroup();
		
		for(int i = 0; i < rb.length; i++) {
			rb[i] = new JRadioButton(color[i]);
			c.add(rb[i]);
			rb[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JRadioButton r = (JRadioButton)e.getSource();
					if(e.getActionCommand() == "Red") {
						c.setBackground(Color.RED);
					}
					else {
						c.setBackground(Color.BLUE);
					}
				}
			});
			bg.add(rb[i]);
		}
		
		this.setSize(300, 100);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Question3();
	}
}