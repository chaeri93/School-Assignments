package chap10;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Question5 extends JFrame{
	private JTextArea ta = new JTextArea(7, 28);

	public Question5() {
		this.setTitle("���� ����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout());
		
		creatMenu();
		ta.setLineWrap(true);
		c.add(new JScrollPane(ta), BorderLayout.CENTER);
		
		this.setSize(320, 200);
		this.setVisible(true);
	}
	
	public void creatMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu m = new JMenu("����");
		JMenuItem mi = new JMenuItem("����");
		
		mi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ta.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "�Է��� �ؽ�Ʈ�� �����ϴ�", "����", JOptionPane.ERROR_MESSAGE);
				}
				else {
					String fileName = JOptionPane.showInputDialog("������ ���ϸ��� �Է��ϼ���");
					if(fileName == null) {
						return;
					}
					try {
						FileWriter fout = new FileWriter(fileName);
						String s = ta.getText();
						StringTokenizer st = new StringTokenizer(ta.getText(), "\n");
						
						while(st.hasMoreTokens()) {
							fout.write(st.nextToken());
							fout.write("\r\n");
						}
					}
					catch (IOException e1) {};
				}
			}
		});
		
		m.add(mi);
		mb.add(m);
		
		setJMenuBar(mb);
	}
	
	public static void main(String[] args) {
		new Question5();
	}
}