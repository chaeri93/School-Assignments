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
		super("�ؽ�Ʈ ���ƶ�");
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
		
		c.setFocusable(true);//Ű�����Ҷ��� �ٿ��ֱ�
		c.requestFocus();//Ű�����Ҷ��� �ٿ��ֱ�,���콺�� �ڵ� ����
	}
	class MyKeyListner extends KeyAdapter{//����� �� ����ͷ� ����� extends�̰� interspace�� ����ϴ� ���� implements!
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			int keycode = e.getKeyCode();//�����ڵ尡 �ƴϱ� ������ �� ���� ��
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
