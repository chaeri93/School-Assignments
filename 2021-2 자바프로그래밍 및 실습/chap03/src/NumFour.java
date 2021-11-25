import java.util.Scanner;

public class NumFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		char[] day = {'일', '월', '화', '수', '목', '금', '토'};

		while(true) {
			System.out.print("정수를 입력하세요 >> ");
			try {
				int num=scanner.nextInt();
				if(num<0) {
					System.out.print("프로그램을 종료합니다...");
					break;
				}
				System.out.println(day[num % day.length]);
			}
			catch(Exception e) {
				System.out.println("경고! 수를 입력하지 않았습니다.");
				scanner.nextLine();
			}
		}
		scanner.close();
	}
}
