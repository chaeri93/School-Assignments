import java.util.Scanner;

public class Sixth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �׼��� �Է��ϼ���>>");
		int money = scanner.nextInt();
		int a=money/50000;
		int b=money%50000/10000;
		int c=money%50000%10000/1000;
		int d=money%50000%10000%1000/500;
		int e=money%50000%10000%1000%500/100;
		int f=money%50000%10000%1000%500%100/10;
		int g=money%50000%10000%1000%500%100%10;
		System.out.println("������"+a+"��, ����"+b+"��, õ��"+c+", 500��"+d+"��, 100��"+e+"��, 10��"+f+"��, 1��"+g+"��");
		scanner.close();
		

	}

}
