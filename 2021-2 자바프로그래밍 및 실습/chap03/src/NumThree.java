import java.util.Scanner;

public class NumThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� >> ");
		
		try {
			int Num = scanner.nextInt();
			
			if(Num%2 == 0) {
				System.out.print("¦��");
			}
			else {
				System.out.print("Ȧ��");
			}
		}
		catch(Exception e) {
			System.out.print("���� �Է����� �ʾ� ���α׷��� �����մϴ�.");
		}
		
		scanner.close();

	}

}
