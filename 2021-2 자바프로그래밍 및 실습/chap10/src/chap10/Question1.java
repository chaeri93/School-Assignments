package chap10;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Question1 extends JFrame{
	private JLabel [] label = new JLabel[4];
	private ImageIcon [] ii = { new ImageIcon("images/apple.jpg"),
			new ImageIcon("images/banana.jpg"),
			new ImageIcon("images/cherry.jpg"),
			new ImageIcon("images/mango.jpg")
	};
	public Question1() {
		this.setTitle("4 Images");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new GridLayout());
		
		for(int i = 0; i < label.length; i++) {
			label[i] = new JLabel(ii[i]);
			c.add(label[i]);
		}
		
		this.setSize(500, 180);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Question1();
	}
}