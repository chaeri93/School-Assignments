import java.util.Scanner;

public class NumOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z;
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� ������ �Է��ϼ���>>");
		x = scanner.nextInt();
		y = scanner.nextInt();
		z = x+y;
		System.out.println(x+"+"+y+"�� "+z);
		scanner.close();
	}

}
