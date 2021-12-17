import java.io.*;
import java.util.Scanner;

public class Pro4{

    public static void main(String[] args) throws InterruptedException, IOException {
        // TODO Auto-generated method stub
        StopThread th = new StopThread();
        th.start();

        BufferedReader in = new BufferedReader(new FileReader("test.txt"));
        String str;
        while ((str = in.readLine()) != null) {
            System.out.println(str);
            Thread.sleep(1000);
        }
        in.close();

    }

    static class StopThread extends Thread {
        Scanner s = new Scanner(System.in);

        @Override
        public void run() {
            while (true) {
                String str = s.next();
                if (str.equals("q")) {
                    System.out.println("[키입력으로 종료됨]");
                    System.exit(0);
                    Thread.currentThread().interrupt();
                }
            }
        }

    }
}
