import java.util.Scanner;

public class Ten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ŀ�Ǹ� �ֹ��ϼ���>>");
		String coffee = scanner.next();
		int a = scanner.nextInt();
		switch(coffee) {
			case "īǪġ��":
				System.out.println(3000*a+"�� �Դϴ�");
				break;
			case "����������":
				if(a<10)
					System.out.println(2000*a+"�� �Դϴ�");
				else
					System.out.println((int)(2000*a*0.95)+"�� �Դϴ�");
				break;
			case "�Ƹ޸�ī��":
				System.out.println(2500*a+"�� �Դϴ�");
				break;
			case "ī���":
				System.out.println(3500*a+"�� �Դϴ�");
				break;
		}
		scanner.close();

	}

}