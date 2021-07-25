import java.util.ArrayList;
import java.util.Scanner;

public class Questiontwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Character> a = new ArrayList<Character>();
		
		System.out.print("빈칸으로 분리하여 5개의 학점을 입력(A/B/C/D/F) >> ");
		for(int i = 0; i < 5; i++) {
			String s = scanner.next();
			char c = s.charAt(0);
			a.add(c);
		}
		for(int i=0;i<5;i++) {
			if(a.get(i)=='A')
				System.out.print("4.0 ");
			else if(a.get(i)=='B')
				System.out.print("3.0 ");
			else if(a.get(i)=='C')
				System.out.print("2.0 ");
			else if(a.get(i)=='D')
				System.out.print("1.0 ");
			else if(a.get(i)=='F')
				System.out.print("0.0 ");
			else
				System.out.print("잘못된 알파벳을 입력했습니다 ");
		}
		scanner.close();
	}

}