package chap10;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Question9 extends JFrame{
	private HashMap<String, String> h = new HashMap<String, String>();
	private JTextField tf1;
	private JTextField tf2;
	private JButton [] btn = new JButton[2];
	private String [] btn_text = { "����", "ã��" };
	private Color [] btn_color = { Color.YELLOW, Color.GREEN };
	private JLabel label;
	private JTextArea ta;

	public Question9() {
		this.setTitle("�ܾ� ���� �����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(getOwner());
	
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
				
		tf1 = new JTextField(8);
		tf2 = new JTextField(8);
		ta = new JTextArea(7, 20);
		label = new JLabel(Integer.toString(h.size()));
		
		c.add(new JLabel("����"));
		c.add(tf1);
		c.add(new JLabel("�ѱ�"));
		c.add(tf2);
		
		for(int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(btn_text[i]);
			btn[i].setBackground(btn_color[i]);
			c.add(btn[i]);
			btn[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JButton b = (JButton)e.getSource();
					if(b == btn[0] && !tf1.getText().equals("")) {
						if(h.containsKey(tf1.getText())) {
							h.put(tf1.getText(), tf2.getText());
							ta.setText(ta.getText() + "���� " + "(" + tf1.getText() + ", " + tf2.getText() + ")" + "\n");
						}
						else {
							h.put(tf1.getText(), tf2.getText());
							ta.setText(ta.getText() + "���� " + "(" + tf1.getText() + ", " + tf2.getText() + ")" + "\n");
							label.setText(Integer.toString(h.size()));
						}
						tf1.setText("");
						tf2.setText("");
					}
					else {
						Set<String> keys = h.keySet();
						Iterator<String> it = keys.iterator();
						while(it.hasNext()) {
							String key = it.next();
							String value = h.get(key);
							if(tf1.getText().equals(key)) {
								tf2.setText(value);
							}
						}
					}
				}
			});
		}
		
		c.add(label);
		c.add(new JScrollPane(ta));
		
		this.setSize(300, 250);
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Question9();
	}
}