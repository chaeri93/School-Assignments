

import java.util.Scanner;

public class NumThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Scanner scanner = new Scanner(System.in);
		System.out.print("x 값을 입력하세요>>");
		x = scanner.nextInt();
		y = x*x-3*x+7;
		System.out.println("x="+x+", y="+y);
		scanner.close();
	}

}
