import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class FlyingTextEx extends JFrame{
	
	JLabel la = new JLabel("Hello");

	public FlyingTextEx() {
		// TODO Auto-generated constructor stub
		super("텍스트 날아라");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		c.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		la.setSize(50,50);
		la.setLocation(100,20);
		c.add(la);
		
		setSize(200,2000);
		setVisible(true);
		
		c.setFocusable(true);//키보드할때만 붙여주기
		c.requestFocus();//키보드할때만 붙여주기,마우스는 자동 지원
	}
	class MyKeyListner extends KeyAdapter{//상속할 때 어댑터로 상속은 extends이고 interspace로 상속하는 것은 implements!
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			int keycode = e.getKeyCode();//유니코드가 아니기 때문에 이 줄이 들어감
			switch (keycode) {
			case KeyEvent.VK_UP:
				la.setLocation(la.getX(),la.getY()-10);
				break;
			case KeyEvent.VK_DOWN:
				la.setLocation(la.getX(),la.getY()+10);			
				break;
			case KeyEvent.VK_LEFT:
				la.setLocation(la.getX()-10,la.getY());
				break;
			case KeyEvent.VK_RIGHT:
				la.setLocation(la.getX()+10,la.getY()-10);
				break;
			default:
				break;
			}
			super.keyPressed(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlyingTextEx();

	}

}
