import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerRunnable implements Runnable{
	private Container c; //Ÿ�̸� ���� ��µǴ� ���̺�
	public TimerRunnable (Container c ) {
		this.c= c ;
	}
	public void colorchange() {
		Container c ;
		
	}
	//������ �ڵ� . run()�� �����ϸ� ������ ����
	@Override
	public void run() {
		Container c ;
		int n=0; // Ÿ�̸� ī��Ʈ ��;
		while(n<11){ // ���� ����
			n++; //ī��Ʈ ����
		try {
			Thread.sleep(1000); // 1 �ʵ��� ���� �ܴ�
		}
		catch(InterruptedException e) {return;}
		}
	}
}
public class Final extends JFrame{
	public Final() {
		setTitle("10�� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c =getContentPane();
		c.setLayout(new FlowLayout());
		
		TimerRunnable runnable = new TimerRunnable (c);
		Thread th = new Thread (runnable);
		
		setSize(250,150);
		setVisible(true);
		
		th.start(); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Final();

	}

}
