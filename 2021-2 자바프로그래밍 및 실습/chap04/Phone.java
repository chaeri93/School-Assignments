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
		
		System.out.print("이름과 전화번호 입력 >>");
		Phone firstPerson = new Phone(scanner.next(), scanner.next());
		System.out.print("이름과 전화번호 입력 >> ");
		Phone secondPerson = new Phone(scanner.next(), scanner.next());
		
		System.out.println(firstPerson.getName() + "의 번호 " + firstPerson.getTel());
		System.out.println(secondPerson.getName() + "의 번호 " + secondPerson.getTel());

		scanner.close();
	}

}
