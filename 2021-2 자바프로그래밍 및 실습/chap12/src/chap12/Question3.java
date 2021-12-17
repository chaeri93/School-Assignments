package chap12;
import java.awt.*;
import javax.swing.*;
 
public class Question3 extends JFrame {
    private JLabel WalkingLabel;
    private String text;
    private int length;
    private int index = 1;
    public Question3() {
        this.setTitle("걸어서 나오는 문자열");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(getOwner());
        
        getContentPane().setLayout(new FlowLayout());
        
        WalkingLabel = new JLabel("나는 당신을 사랑합니다.");
        
        add(WalkingLabel);
        
        text = WalkingLabel.getText();
        length = text.length();
        
        Thread t = new Thread(new thread());
        t.start();
        
        this.setSize(300, 200);
        this.setVisible(true);
    }
    
    private class thread implements Runnable {
        public void run() {
            while(true) {
                WalkingLabel.setText(text.substring(0, index));
                try {
                    Thread.sleep(500);
                }
                catch(InterruptedException e) { return; }
                index++;
                if(index > length) index = 0;
            }
        }
    }
    
    public static void main(String[] args) {
        new Question3();
    }
}
