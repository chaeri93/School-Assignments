import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class IndepClassListener extends JFrame{
	
	public IndepClassListener() {
		// TODO Auto-generated constructor stub
		setTitle("����Ŭ������ �̺�Ʈ �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyListener());//�׼��� ������ btn�� �׼��� �ٿ��� 
		c.add(btn);
		
		setSize(250,120);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new IndepClassListener();
	}

}

//����Ŭ����
class MyListener implements ActionListener{//�߻�Ŭ����

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b=(JButton)e.getSource();//�̺�Ʈ ������ ����
		if(b.getText().equals("Action"))
			b.setText("�׼�");//�׼����� �ٲ��
		else
			b.setText("Action");
	}
	
}