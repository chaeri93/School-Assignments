import java.util.Scanner;

public class NumSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String eng[] = {"student","love","java","happy","future"};
		String kor[] = {"학생","사랑","자바","행복한","미래"};
		
		while(true) {
			System.out.print("영어 단어를 입력하세요>>");
			String s = scanner.next();
			
			if(s.equals("exit")) break;
			for(int i=0;i<eng.length;i++) {
				if(s.equals(eng[i])) {
					System.out.println(kor[i]);
					break;
				}
				if(i == eng.length - 1) 
					System.out.println("그런 영어 단어가 없습니다.");
			}
		}
		System.out.println("종료합니다...");

	}

}
