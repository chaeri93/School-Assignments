package chap04;

import java.util.Scanner;

class Phone {
	private String name, tel;
	
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTel() {
		return tel;
	}
}

public class PhoneManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�ο���>>");
		int Persons = scanner.nextInt();
		
		Phone[] Array =new Phone[Persons];
		
		for(int i=0;i<Persons;i++) {
			System.out.print("�̸��� ��ȭ��ȣ(��ȣ�� ���������� �Է�) >> ");
			Array[i]= new Phone(scanner.next(),scanner.next());
		}
		
		System.out.println("����Ǿ����ϴ�...");
		
		label: while(true) {
				System.out.print("�˻��� �̸�  >> ");
				String searchName = scanner.next();
				for(int i=0; i<Persons;i++) {
					if(searchName.equals("exit"))
						break label;
					else if(searchName.equals(Array[i].getName()))
						System.out.println(Array[i].getName() + "�� ��ȣ�� " + Array[i].getTel() + " �Դϴ�.");
					else if(!searchName.equals(Array[i].getName()) && i == (Persons-1)) 
						System.out.println(searchName + "��(��) �����ϴ�.");
											
				}
		}
		System.out.println("���α׷��� �����մϴ�...");
		scanner.close();
	}

}
