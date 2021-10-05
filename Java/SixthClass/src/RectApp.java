import java.util.Scanner;

class Rectangle{
	int width; //변수
	int height; //변수
	public int getArea () {
		return width*height; //사각형 함수
	}
}
public class RectApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle(); // 객체 생성
		Scanner scanner =  new Scanner(System.in);
		System.out.print(">>");
		rect.width= scanner.nextInt();
		rect.height= scanner.nextInt();
		System.out.println("사각형의 면적은 " + rect.getArea());
		scanner.close();
		

	}

}
