import java.util.Scanner;

public class Seventh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���>>");
		String grade = scanner.next();
		switch(grade) {
		case "A":
		case "B":
			System.out.println("Exellent");
			break;
		case "C":
		case "D":
			System.out.println("Good");
			break;
		case "F":
			System.out.println("Good");
			break;
		}
	scanner.close();
	}

}
