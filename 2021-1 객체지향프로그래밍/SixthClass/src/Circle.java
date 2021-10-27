
public class Circle {
	int radius;//원의 반지름
	String name;//원의 이름
	
	public double getArea () { // 함수, 멤버 메소드
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle pizza;//Circle pizza = new Circle(); 두줄을 한줄로 줄여서 이렇게 쓸 수 있음
		pizza = new Circle();// Circle 객체 생성
		pizza.radius = 10; // 피자의 반지름을 10 으로 설정
		pizza.name = "자바피자 "; // 피자의 이름 설정
		double area = pizza.getArea (); // 피자의 면적 알아내기
		System.out.println(pizza.name + "의 면적은 " + area);
		Circle donut = new Circle();// Circle 객체 생성
		donut.radius = 2; // 도넛의 반지름을 2 로 설정
		donut.name = "자바도넛 "; // 도넛의 이름 설정
		area =donut.getArea (); // 도넛의 면적 알아내기
		System.out.println(donut.name + "의 면적은 " + area);

	}

}
