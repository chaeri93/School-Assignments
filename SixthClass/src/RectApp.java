import java.util.Scanner;

class Rectangle{
	int width; //����
	int height; //����
	public int getArea () {
		return width*height; //�簢�� �Լ�
	}
}
public class RectApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle(); // ��ü ����
		Scanner scanner =  new Scanner(System.in);
		System.out.print(">>");
		rect.width= scanner.nextInt();
		rect.height= scanner.nextInt();
		System.out.println("�簢���� ������ " + rect.getArea());
		scanner.close();
		

	}

}
