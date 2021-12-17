package chap10;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Question7 extends JFrame {
	private JLabel label;
	private Point sp;
	
	public Question7() {
		this.setTitle("�̹��� �巡��");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Container c = getContentPane();
		
		c.setLayout(null);
		
		ImageIcon ii = new ImageIcon("images/apple.jpg");
		label = new JLabel(ii);
		
		int width = ii.getIconWidth();
		int height = ii.getIconHeight();
		
		label.setBounds(150, 150, width, height);
		
		label.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				sp = e.getPoint();
			}
		});
		
		label.addMouseMotionListener(new MouseMotionListener() {
			public void mouseDragged(MouseEvent e) {
				Point ep = e.getPoint();
                Point p = label.getLocation();
                label.setLocation(p.x + ep.x - sp.x, p.y + ep.y - sp.y);
            }
			public void mouseMoved(MouseEvent e) {}
		});
		
		c.add(label);
		
		this.setSize(400, 400);
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Question7();
	}
}