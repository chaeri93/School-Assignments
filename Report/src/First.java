import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first;
		int second;
		int result;
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� ������ �Է��ϼ���>>");
		first = scanner.nextInt();
		second = scanner.nextInt();
		result = first+second;
		System.out.println(first +"+"+ second+"�� "+ result );
		scanner.close();
		

	}

}
