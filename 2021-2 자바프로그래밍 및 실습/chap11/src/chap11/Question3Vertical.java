package chap11;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Question3Vertical extends JFrame {
	
	public Question3Vertical() {
		this.setTitle("");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(getOwner());
	
		this.setContentPane(new MyPanel());
		
		this.setSize(300, 300);
		this.setVisible(true);
	}
	
	private class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			Image img1 = new ImageIcon("image/a.jpg").getImage();
			Image img2 = new ImageIcon("image/b.jpg").getImage();
			
			g.drawImage(img1, 0, 0, getWidth(), getHeight()/2, this);
			g.drawImage(img2, 0, getHeight()/2, getWidth(), getHeight()/2, this);
		}
	}
	
	public static void main(String[] args) {
		new Question3Vertical();
	}
}

