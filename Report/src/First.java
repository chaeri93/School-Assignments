import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first;
		int second;
		int result;
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 정수를 입력하세요>>");
		first = scanner.nextInt();
		second = scanner.nextInt();
		result = first+second;
		System.out.println(first +"+"+ second+"은 "+ result );
		scanner.close();
		

	}

}
