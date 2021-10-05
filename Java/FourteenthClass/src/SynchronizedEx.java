public class SynchronizedEx{
	public static void main(String[]args ) {
		SharedPrinter p = new SharedPrinter (); // ���� ������ ����
		String [] engText = { "Wise men say",
							  "only fools rush in",
							  "But I can't help, ",
							  "falling in love with you",
							  "Shall I stay? ",
							  "Would it be a sin?",
							  "If I can't help, ",
							  "falling in love with you" };
		String [] korText = { "���ع��� ��λ��� ������ �⵵�� ",
							  "�ϴ����� �����ϻ� �츮 ���� ����",
							  "����ȭ ��õ�� ȭ������, ",
							  "���� ��� �������� ���� �����ϼ�",
							  "���� ���� �� �ҳ��� , ö���� �θ� ��",
							  "�ٶ����� �Һ����� �츮 ����ϼ�",
							  "����ȭ ��õ�� ȭ������, ",
							  "���� ��� �������� ���� �����ϼ�" };	
		
		Thread th1 =new WorkerThread (p, engText);// ������½�����
		Thread th2 =new WorkerThread (p, korText);// ������½�����
		
		//�� �����带 �����Ų��
		th1.start();
		th2.start();
	}
}
	
//�� WorkerThread �����忡 ���� ���� ���ٵǴ� ���� ������
class SharedPrinter {
	// synchronized�� �����ϸ�
	//�ѱ۰� ��� �� �ٿ� ���� ��µǴ� ��찡 �߻��Ѵ�
	synchronized void print(String text) {
		//Thread.yield();
		for(int i =0; i< text.length (); i++)
			System.out.print(text.charAt(i));
		System.out.println();
	}
}
//������ Ŭ����
class WorkerThread extends Thread {
	private SharedPrinter p; // ���� ������ �ּ�
	private String [] text;
	public WorkerThread(SharedPrinter p, String[] text) {
		this.p = p; this.text = text;
	}
	//������� �ݺ������� ���� �����Ϳ� 10 �� ���� text[] ���
	@Override
	public void run() {
		for (int i =0; i <text.length ; i ++) // �� �پ� ���
			p.print(text[ i ]); // ���� �����Ϳ� ���
	}
}