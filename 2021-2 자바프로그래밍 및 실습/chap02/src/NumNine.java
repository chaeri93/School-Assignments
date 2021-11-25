import java.util.Scanner;

public class NumNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 주문하세요>>");
		int x = scanner.nextInt();
		int first = x/10;
		int second= x%10;
		if(first==3||first==6||first==9) {
			if (second==3||second==6||second==9)
				System.out.println("박수짝짝");
			else
				System.out.println("박수짝");
		}
		else
			System.out.println("박수없음");
		scanner.close();		

	}

}
