import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("이름, 도시, 나이, 체중, 독신여부를 분리하여 입력하세요");
		Scanner scanner;
		scanner = new Scanner(System.in);
		
		String name =scanner.next();
		System.out.println("당신의 이름은 "+ name+"입니다");
		
		String city=scanner.next();
		System.out.println("당신이 사는 도시는 "+ city+"입니다");
		
		String age=scanner.next();
		System.out.println("당신의 나이는 "+ age+"입니다");
		 
		double weight = scanner.nextDouble();
		System.out.println("당신의 체중은 "+ weight+"입니다");
		
		boolean single = scanner.nextBoolean();
		System.out.println("당신의 독신여부는 "+ single+"입니다");
		
		scanner.close();
	}

}
