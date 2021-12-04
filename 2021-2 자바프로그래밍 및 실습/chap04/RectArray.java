package chap04;
import java.util.Scanner;

class Rect{
	private int width, height;
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getArea() {
		return width*height;
	}
}

public class RectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Rect[] Array = new Rect[4];
		int sum=0;
		
		for (int i=0;i<4;i++) {
			System.out.print((i+1)+"�ʺ�� ���� >>");
			Array[i] = new Rect(scanner.nextInt(),scanner.nextInt());
			sum+=Array[i].getArea();
		}
		
		System.out.println("�����Ͽ����ϴ�...");
		System.out.println("�簢���� ��ü ���� " + sum);
		scanner.close();

	}

}
