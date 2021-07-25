interface PhoneInterface { // �������̽� ����
	final int TIMEOUT = 10000; // ��� �ʵ� ����
	void sendCall (); // �߻� �޼ҵ�
	void receiveCall (); // �߻� �޼ҵ�
	default void printLogo () { // default �޼ҵ�
		System.out.println("** Phone **");
	}
}

class Calc{
	public int calculator(int x, int y) {
		return x+y;
	}
}

class SamsungPhone extends Calc implements PhoneInterface { // �������̽� ����
	//PhoneInterface �� ��� �޼ҵ� ����
	@Override
	public void sendCall () {
		System.out.println("�츮������");
	}
	@Override
	public void receiveCall () {
		System.out.println("��ȭ�� �Խ��ϴ�");
	}
	//�޼ҵ� �߰� �ۼ�
	public void flash() {
		System.out.println ("��ȭ�⿡ ���� �������ϴ� .");
	}
	public void schedule(){
		System.out.println ("���������մϴ�");
	}
}	
public class InterfaceEx{
	public static void main(String[] args) {
	SamsungPhone phone = new SamsungPhone();
	phone.printLogo();
	phone.sendCall();
	phone.receiveCall();
	phone.flash();
	System.out.println ("3�� 5�� ���ϸ�"+phone.calculator(3,5));
	phone.schedule();
	}
}