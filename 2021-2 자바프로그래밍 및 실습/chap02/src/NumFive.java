import java.util.Scanner;

public class NumFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("�� ������ �Է��ϼ���>>");

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
			System.out.println("�߸��� �Է��Դϴ�.");
			break;
		}
		scanner.close();
	}

}
