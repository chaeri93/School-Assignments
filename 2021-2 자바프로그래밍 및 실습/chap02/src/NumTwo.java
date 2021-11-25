

import java.util.Scanner;

public class NumTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int floor;
		Scanner scanner = new Scanner(System.in);
		System.out.print("몇 층인지 입력하세요>>");
		floor = scanner.nextInt();
		System.out.println(floor*5+"m "+"입니다.");
		scanner.close();
	}

}
