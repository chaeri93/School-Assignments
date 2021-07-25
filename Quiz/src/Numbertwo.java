import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Numbertwo extends JFrame{
	private JLabel la = new JLabel("   Move me");
	public Numbertwo() {
		// TODO Auto-generated constructor stub
		setTitle("마우스 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		
		c.setLayout(null);
		la.setSize(80,20);
		la.setLocation(100,80);
		c.add(la);
		
		setSize(320,200);
		setVisible(true);

	}
	
	class MyMouseListener implements MouseListener, MouseMotionListener{
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			la.setLocation(e.getX(),e.getY());
			setTitle("mousePressed("+e.getX()+","+e.getY()+")");
			
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			la.setLocation(e.getX(),e.getY());
			setTitle("mouseReleased("+e.getX()+","+e.getY()+")");
			
		}
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			Component comp = (Component)e.getSource();
			comp.setBackground(Color.CYAN);
		}
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			Component comp = (Component)e.getSource();
			comp.setBackground(Color.YELLOW);
			setTitle("mouseExited("+e.getX()+","+e.getY()+")");
		}
		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			la.setLocation(e.getX(),e.getY());
			setTitle("mouseDragged("+e.getX()+","+e.getY()+")");
		}
		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			la.setLocation(e.getX(),e.getY());
			setTitle("mouseMoveed("+e.getX()+","+e.getY()+")");
		}
		
	}
	public static void main(String[] args) {
		new Numbertwo();
	}

}
