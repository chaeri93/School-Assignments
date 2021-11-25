import java.util.Scanner;

public class NumOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("알파벳 한 문자를 입력하세요>>");
		String s= scanner.next();
		char c = s.charAt(0);
		
		for(int i=0; i<=c-'a';i++) {
			for(int j=i;j<=c-'a';j++) {
				System.out.print((char)('a'+j));
			}
			System.out.println();
		}
	}

}
