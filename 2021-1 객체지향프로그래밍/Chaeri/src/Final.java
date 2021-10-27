import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerRunnable implements Runnable{
	private Container c; //타이머 값이 출력되는 레이블
	public TimerRunnable (Container c ) {
		this.c= c ;
	}
	public void colorchange() {
		Container c ;
		
	}
	//스레드 코드 . run()이 종료하면 스레드 종료
	@Override
	public void run() {
		Container c ;
		int n=0; // 타이머 카운트 값;
		while(n<11){ // 무한 루프
			n++; //카운트 증가
		try {
			Thread.sleep(1000); // 1 초동안 잠을 잔다
		}
		catch(InterruptedException e) {return;}
		}
	}
}
public class Final extends JFrame{
	public Final() {
		setTitle("10번 문제");
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
