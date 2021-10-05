
public class Book02 {
	String title;
	String author;
	
	void show() {
		System.out.println(title + " " + author);
	}
	public Book02() { //생성자
		this("","");
		System.out.println("생성자 호출됨");
		}
	public Book02(String title) {
		this(title,"작자미상");
		
	}
	public Book02(String title, String author) { //생성자
		this.title = title; 
		this.author = author;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book02 littleprince = new Book02("어린왕자","생텍쥐베리");
		Book02 lovestory = new Book02("춘향전");
		Book02 emptybook = new Book02();
		
		lovestory.show();
	}

}
