import java.util.Scanner;

public class Fifth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("논리 연산을 입력하세요>>");
		boolean a=scanner.nextBoolean();
		String op=scanner.next();
		boolean b=scanner.nextBoolean();
		switch(op) {
			case "AND":
				if (a=b) {
					if (a= true)
						System.out.println("true");
					else
						System.out.println("false");
				}
				else 
					System.out.println("false");
				break;
			case "OR":
				if (a=b){
					if (a=true)
						System.out.println("true");
					else
						System.out.println("false");
				} 
				else 
					System.out.println("true");
				break;	
		}
		scanner.close();
	}

}
