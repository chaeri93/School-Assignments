
public class Circle02 {
	int radius;
	String name;
	
	public Circle02() {// �Ű� ���� ���� ������
		radius = 1; name = ""; // radius�� �ʱⰪ�� 1
		}
		public Circle02(int r, String n) { // �Ű� ������ ���� ������
		radius = r; name = n;
		}
		public double getArea () {
		return 3.14*radius*radius;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle02 pizza = new Circle02(10, " �ڹ����� "); // Circle ��ü ���� , ������ 10
		double area = pizza.getArea();		
		System.out.println(pizza.name + "�� ������ " + area);
		Circle02 donut =new Circle02(); // Circle ��ü ���� , ������ 1
		donut.name = "��������";
		area =donut.getArea();
		System.out.println(donut.name + "�� ������ " +area);
				
	}

}
