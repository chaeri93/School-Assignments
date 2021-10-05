import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit 을 입력하면 종료합니다");
		while(true) {
			System.out.print(">>");
		String text = scanner.nextLine();
		
		if(text.equals ("exit")) // " 이 입력되면 반복 종료
			break;// while 문을 벗어남
		}
		System.out.println("종료합니다...");
		scanner.close();

	}

}
