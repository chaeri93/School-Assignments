import java.util.Scanner;

public class Seventh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("학점을 입력하세요>>");
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
