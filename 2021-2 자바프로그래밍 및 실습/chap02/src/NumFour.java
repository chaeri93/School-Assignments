   
import java.util.Scanner;

public class NumFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� (x,y)�� ��ǥ�� �Է��ϼ���>>");
		x=scanner.nextInt();
		y=scanner.nextInt();
		if (x<=100 && x>=50) {
			if (y<=100 && y>=50)
				System.out.println("��("+x+","+y+")�� (50, 50)�� (100, 100)�� �簢�� ���� �ֽ��ϴ�.");
			else
				System.out.println("��("+x+","+y+")�� (50, 50)�� (100, 100)�� �簢�� ���� �����ϴ�.");
		}
		else System.out.println("��("+x+","+y+")�� (50, 50)�� (100, 100)�� �簢�� ���� �����ϴ�.");
		scanner.close();

	}

}