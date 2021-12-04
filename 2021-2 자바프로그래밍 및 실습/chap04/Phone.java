package chap04;
import java.util.Scanner;

public class Phone {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�̸��� ��ȭ��ȣ �Է� >>");
		Phone firstPerson = new Phone(scanner.next(), scanner.next());
		System.out.print("�̸��� ��ȭ��ȣ �Է� >> ");
		Phone secondPerson = new Phone(scanner.next(), scanner.next());
		
		System.out.println(firstPerson.getName() + "�� ��ȣ " + firstPerson.getTel());
		System.out.println(secondPerson.getName() + "�� ��ȣ " + secondPerson.getTel());

		scanner.close();
	}

}
