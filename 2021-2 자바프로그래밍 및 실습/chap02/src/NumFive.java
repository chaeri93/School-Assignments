import java.util.Scanner;

public class NumFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("논리 연산을 입력하세요>>");

		boolean a = scanner.nextBoolean();
		String operator = scanner.next();
		boolean b = scanner.nextBoolean();

		switch (operator) {
		case "AND":
			System.out.println(a&b);
			break;
		case "OR":
			System.out.println(a||b);
			break;

		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}
		scanner.close();
	}

}
