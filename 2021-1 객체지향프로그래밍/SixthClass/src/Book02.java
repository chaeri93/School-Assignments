
public class Book02 {
	String title;
	String author;
	
	void show() {
		System.out.println(title + " " + author);
	}
	public Book02() { //������
		this("","");
		System.out.println("������ ȣ���");
		}
	public Book02(String title) {
		this(title,"���ڹ̻�");
		
	}
	public Book02(String title, String author) { //������
		this.title = title; 
		this.author = author;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book02 littleprince = new Book02("�����","�����㺣��");
		Book02 lovestory = new Book02("������");
		Book02 emptybook = new Book02();
		
		lovestory.show();
	}

}
