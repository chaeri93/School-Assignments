import java.util.Scanner;

public class NumEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str[] = {"����", "����", "��"};
		int i;
		
		while(true) {
			int ran = (int)(Math.random()*3);
			System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
			System.out.print("���� ���� ��!>>");
			
			String s = scanner.next();
			if(s.equals("�׸�")) break;
			for(i =0;i<str.length;i++) {
				if(s.equals(str[i])) break;
			}
			if(i==ran)
				System.out.println("����ڴ� = "+str[i]+", ��ǻ�ʹ� = "+str[ran]+", �����ϴ�.");
			else if(i == 0 && ran == 2 || i == 1 && ran == 0 || i == 2 && ran == 1)
				System.out.println("����ڴ� = "+str[i]+", ��ǻ�ʹ� = "+str[ran]+", ����ڰ� �̰���ϴ�.");
			else
				System.out.println("����ڴ� = "+str[i]+", ��ǻ�ʹ� = "+str[ran]+", ��ǻ�Ͱ� �̰���ϴ�.");
			
		}
		System.out.println("������ �����մϴ�...");
	}
}
