import java.util.Scanner;

public class Ten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("커피를 주문하세요>>");
		String coffee = scanner.next();
		int a = scanner.nextInt();
		switch(coffee) {
			case "카푸치노":
				System.out.println(3000*a+"원 입니다");
				break;
			case "에스프레소":
				if(a<10)
					System.out.println(2000*a+"원 입니다");
				else
					System.out.println((int)(2000*a*0.95)+"원 입니다");
				break;
			case "아메리카노":
				System.out.println(2500*a+"원 입니다");
				break;
			case "카페라떼":
				System.out.println(3500*a+"원 입니다");
				break;
		}
		scanner.close();

	}

}
