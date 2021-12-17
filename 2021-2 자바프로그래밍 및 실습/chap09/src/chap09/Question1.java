package chap09;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Question1 extends JFrame {
	public Question1() {
		this.setTitle("Java");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
				
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("자기야");
		
		label.addMouseListener(new MouseListener() {
			public void mouseEntered(MouseEvent e) {
				label.setText("사랑해");
			}
			public void mouseExited(MouseEvent e) {
				label.setText("자기야");
			}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
			public void mouseClicked(MouseEvent e) {}
		});
		
		c.add(label);
		
		this.setSize(300, 300);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Question1();
	}
}