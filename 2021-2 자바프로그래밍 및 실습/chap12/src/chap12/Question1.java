package chap12;
import java.awt.*;
import javax.swing.*;
 
public class Question1 extends JFrame {
    public Question1() {
        this.setTitle("");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(getOwner());
        
        getContentPane().setBackground(Color.YELLOW);
        
        thread t = new thread();
        t.start();
        
        this.setSize(300, 200);
        this.setVisible(true);
    }
    
    private class thread extends Thread {
        public void run() {
            setTitle("실행 시작");
            try {
                Thread.sleep(10000);
            }
            catch(InterruptedException e) { return; }
            setTitle("실행 종료");
            getContentPane().setBackground(Color.BLUE);
        }
    }
    
    public static void main(String[] args) {
        new Question1();
    }
}
