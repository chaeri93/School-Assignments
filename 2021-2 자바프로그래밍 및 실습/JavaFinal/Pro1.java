import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class Pro1 extends JFrame {
    int x;
    int y;
    int index;
    Color[] colors = {
            new Color(255, 0, 0),
            new Color(0,255,0),
            new Color(0, 0, 255),
            new Color(255, 255, 0),
            new Color(0, 0, 0),
    };

    public Pro1(){
        super("그래픽 문제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanel());
        setSize(400,300);
        setVisible(true);
    }

    class MyPanel extends JPanel implements ActionListener {
        public MyPanel() {
            setLayout(new FlowLayout());
            JButton btn = new JButton("클릭하세요");
            btn.addActionListener(this);
            add(btn);
        }
        public void paintComponent(Graphics g){

            super.paintComponent(g);

            g.setColor(colors[index]);
            g.fillOval(x,y,50,50);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Random r =new Random();
            index = (int)(Math.random()*4);
            x = r.nextInt(getWidth());
            y = r.nextInt(getHeight());
            repaint();
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Pro1();
    }
}
