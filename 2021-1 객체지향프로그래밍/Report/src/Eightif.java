import java.util.Scanner;

public class Eightif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("커피를 주문하세요>>");
		String coffee = scanner.next();
		int a = scanner.nextInt();
		if (coffee.equals("카푸치노"))
			System.out.println(3000*a+"원 입니다");
		else if (coffee.equals("에스프레소"))
			System.out.println(2000*a+"원 입니다");
		else if (coffee.equals("아메리카노"))
			System.out.println(2500*a+"원 입니다");
		else if (coffee.equals("카페라떼"))
			System.out.println(3500*a+"원 입니다");
		scanner.close();


	}

}
