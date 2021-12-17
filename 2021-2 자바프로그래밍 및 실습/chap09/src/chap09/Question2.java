package chap09;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Question2 extends JFrame {
	public Question2() {
		this.setTitle("Java");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
				
		Container c = getContentPane();
		
		c.setBackground(Color.CYAN);
		
		c.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == 'R') {
					c.setBackground(Color.RED);
				}
			}
			public void keyReleased(KeyEvent e) {
				c.setBackground(Color.CYAN);
			}
			public void keyTyped(KeyEvent e) {}
		});
		
		this.setSize(300, 300);
		this.setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public static void main(String[] args) {
		new Question2();
	}
}