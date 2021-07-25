import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InnerClassListener extends JFrame{
	
	public InnerClassListener() {
		// TODO Auto-generated constructor stub
		setTitle("����Ŭ������ �̺�Ʈ �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		//btn.addActionListener(new MyActionListener());//�׼��� ������ �� �׼��� �ٿ��� 
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton b=(JButton)e.getSource();//�̺�Ʈ ������ ����
				if(b.getText().equals("Action"))
					b.setText("�׼�");//�׼����� �ٲ��
				else
					b.setText("Action");
				//�۾� �ٲ�
				setTitle(b.getText());
				
			}
		});
		
		c.add(btn);
		
		setSize(250,120);
		setVisible(true);
	}

	/*
	 //����Ŭ����
	class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton b=(JButton)e.getSource();//�̺�Ʈ ������ ����
			if(b.getText().equals("Action"))
				b.setText("�׼�");//�׼����� �ٲ��
			else
				b.setText("Action");
			
			//�۾� �ٲ�
			InnerClassListener.this.setTitle(b.getText());
			
		}
		
	}*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InnerClassListener();
	}

}
