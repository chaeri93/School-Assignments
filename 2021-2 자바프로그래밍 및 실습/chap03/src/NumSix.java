import java.util.Scanner;

public class NumSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String eng[] = {"student","love","java","happy","future"};
		String kor[] = {"�л�","���","�ڹ�","�ູ��","�̷�"};
		
		while(true) {
			System.out.print("���� �ܾ �Է��ϼ���>>");
			String s = scanner.next();
			
			if(s.equals("exit")) break;
			for(int i=0;i<eng.length;i++) {
				if(s.equals(eng[i])) {
					System.out.println(kor[i]);
					break;
				}
				if(i == eng.length - 1) 
					System.out.println("�׷� ���� �ܾ �����ϴ�.");
			}
		}
		System.out.println("�����մϴ�...");

	}

}
