import java.util.Scanner;

public class NumEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str[] = {"가위", "바위", "보"};
		int i;
		
		while(true) {
			int ran = (int)(Math.random()*3);
			System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
			System.out.print("가위 바위 보!>>");
			
			String s = scanner.next();
			if(s.equals("그만")) break;
			for(i =0;i<str.length;i++) {
				if(s.equals(str[i])) break;
			}
			if(i==ran)
				System.out.println("사용자는 = "+str[i]+", 컴퓨터는 = "+str[ran]+", 비겼습니다.");
			else if(i == 0 && ran == 2 || i == 1 && ran == 0 || i == 2 && ran == 1)
				System.out.println("사용자는 = "+str[i]+", 컴퓨터는 = "+str[ran]+", 사용자가 이겼습니다.");
			else
				System.out.println("사용자는 = "+str[i]+", 컴퓨터는 = "+str[ran]+", 컴퓨터가 이겼습니다.");
			
		}
		System.out.println("게임을 종료합니다...");
	}
}
