   
import java.util.Scanner;

public class NumFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Scanner scanner = new Scanner(System.in);
		System.out.print("점 (x,y)의 좌표를 입력하세요>>");
		x=scanner.nextInt();
		y=scanner.nextInt();
		if (x<=100 && x>=50) {
			if (y<=100 && y>=50)
				System.out.println("점("+x+","+y+")은 (50, 50)과 (100, 100)의 사각형 내에 있습니다.");
			else
				System.out.println("점("+x+","+y+")은 (50, 50)과 (100, 100)의 사각형 내에 없습니다.");
		}
		else System.out.println("점("+x+","+y+")은 (50, 50)과 (100, 100)의 사각형 내에 없습니다.");
		scanner.close();

	}

}