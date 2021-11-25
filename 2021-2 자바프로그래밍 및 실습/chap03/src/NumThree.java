import java.util.Scanner;

public class NumThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 >> ");
		
		try {
			int Num = scanner.nextInt();
			
			if(Num%2 == 0) {
				System.out.print("짝수");
			}
			else {
				System.out.print("홀수");
			}
		}
		catch(Exception e) {
			System.out.print("수를 입력하지 않아 프로그램을 종료합니다.");
		}
		
		scanner.close();

	}

}
