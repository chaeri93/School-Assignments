import java.awt.*;
import javax.swing.*;

class TimerThread extends Thread{
	private JLabel timerLabel; //Ÿ�̸� ���� ��µǴ� ���̺�
	public TimerThread (JLabel timerLabel ) {
		this.timerLabel= timerLabel ;
	}
	//������ �ڵ� . �� �����ϸ� ������ ����
	@Override
	public void run() {
		int n=0; // Ÿ�̸� ī��Ʈ ��
		while(true){ // ���� ����
			timerLabel.setText(Integer.toString (n));
			n++; //ī��Ʈ ����
		try {
			Thread.sleep(1000); // 1 �ʵ��� ���� �ܴ�
		}
		catch(InterruptedException e) {return;}
		}
	}
}
public class ThreadtimerEx extends JFrame{
	public ThreadtimerEx () {
		setTitle("Thread �� ��ӹ��� Ÿ�̸� ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c =getContentPane();
		c.setLayout(new FlowLayout());//������ �־�� ��
		
		//Ÿ�̸� ���� ����� ���̺� ����
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC ,80));
		c.add(timerLabel);
		
		TimerThread th = new TimerThread (timerLabel);
		setSize(250,150);
		setVisible(true);
		th.start(); // Ÿ�̸� �������� ������ �����ϰ� �Ѵ�
	}
	public static void main(String[]args) {
		new ThreadtimerEx();
	}
}