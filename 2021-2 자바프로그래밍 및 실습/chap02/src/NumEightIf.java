import java.util.Scanner;

public class NumEightIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Ŀ�Ǹ� �ֹ��ϼ���>>");
		String coffee = scanner.next();
		int a = scanner.nextInt();
		if (coffee.equals("īǪġ��"))
			System.out.println(3000*a+"�� �Դϴ�");
		else if (coffee.equals("����������"))
			System.out.println(2000*a+"�� �Դϴ�");
		else if (coffee.equals("�Ƹ޸�ī��"))
			System.out.println(2500*a+"�� �Դϴ�");
		else if (coffee.equals("ī���"))
			System.out.println(3500*a+"�� �Դϴ�");
		scanner.close();
	}

}
