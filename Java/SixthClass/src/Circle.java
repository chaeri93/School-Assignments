
public class Circle {
	int radius;//���� ������
	String name;//���� �̸�
	
	public double getArea () { // �Լ�, ��� �޼ҵ�
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle pizza;//Circle pizza = new Circle(); ������ ���ٷ� �ٿ��� �̷��� �� �� ����
		pizza = new Circle();// Circle ��ü ����
		pizza.radius = 10; // ������ �������� 10 ���� ����
		pizza.name = "�ڹ����� "; // ������ �̸� ����
		double area = pizza.getArea (); // ������ ���� �˾Ƴ���
		System.out.println(pizza.name + "�� ������ " + area);
		Circle donut = new Circle();// Circle ��ü ����
		donut.radius = 2; // ������ �������� 2 �� ����
		donut.name = "�ڹٵ��� "; // ������ �̸� ����
		area =donut.getArea (); // ������ ���� �˾Ƴ���
		System.out.println(donut.name + "�� ������ " + area);

	}

}