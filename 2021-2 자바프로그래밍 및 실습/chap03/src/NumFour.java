import java.util.Scanner;

public class NumFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		char[] day = {'��', '��', 'ȭ', '��', '��', '��', '��'};

		while(true) {
			System.out.print("������ �Է��ϼ��� >> ");
			try {
				int num=scanner.nextInt();
				if(num<0) {
					System.out.print("���α׷��� �����մϴ�...");
					break;
				}
				System.out.println(day[num % day.length]);
			}
			catch(Exception e) {
				System.out.println("���! ���� �Է����� �ʾҽ��ϴ�.");
				scanner.nextLine();
			}
		}
		scanner.close();
	}
}
