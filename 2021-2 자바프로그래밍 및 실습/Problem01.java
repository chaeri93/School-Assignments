import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int oman=0;
        int man=0;
        int ochun=0;
        int chun=0;
        int obeak=0;
        int beak=0;
        int ten=0;
        try{
            System.out.println("금액을 입력하시오>>");
            int money = sc.nextInt();
             oman = money/50000;
             man = money%50000/10000;
             ochun = money%50000%10000/5000;
             chun = money%50000%10000%5000/1000;
             obeak = money%50000%10000%5000%1000/500;
             beak = money%50000%10000%5000%1000%500/100;
             ten = money%50000%10000%5000%1000%500%100/10;
            System.out.println("5만원권 "+oman+"개, 1만원권 "+man+"개, 5천원권 "+ochun+"개, 천원권 "+chun+"개, 500원 "+obeak+"개, 100원 "+beak+"개, 10원 "+ten+"개");
        } catch (InputMismatchException e) {
            System.out.print("정수가 아닙니다" );
        }

    }
}
