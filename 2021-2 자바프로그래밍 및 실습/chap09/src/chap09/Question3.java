package chap09;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Question3 extends JFrame {
	public Question3() {
		this.setTitle("Java");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
				
		Container c = getContentPane();
		
		c.setBackground(Color.GREEN);
		
		c.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
				c.setBackground(Color.GREEN);
			}
			public void mousePressed(MouseEvent e) {}
			public void mouseClicked(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
		});
		
		c.addMouseMotionListener(new MouseMotionListener() {
			public void mouseDragged(MouseEvent e) {
				c.setBackground(Color.YELLOW);
			}
			public void mouseMoved(MouseEvent e) {}
		});
		
		this.setSize(300, 300);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Question3();
	}
}