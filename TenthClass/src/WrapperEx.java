public class WrapperEx{
	public static void main(String[] args ) {
	// Character사용
	System.out.println(Character.toLowerCase ('A')); // ' 를 소문자로 변환
	char c1='4', c2='F';
	if(Character.isDigit ( c1)) // 문자 c1 이 숫자이면 true
		System.out.println(c1 + "는 숫자");
	if(Character.isAlphabetic ( c2)) // 문자 c2 가 영문자이면 true
		System.out.println(c2 + "는 영문자");
	// Integer사용
	System.out.println(Integer.parseInt (" 28")); // 문자열 " 을 10 진수로 변환
	System.out.println(Integer.toString ( 28)); // 정수 28 을 2 진수 문자열로 변환
	System.out.println(Integer.toBinaryString ( 28)); // 28 을 16 진수 문자열로 변환
	System.out.println(Integer.bitCount ( 28)); // 28 에 대한 2 진수의 1 의 개수
	Integer i = Integer.valueOf (28);
	System.out.println(i.doubleValue()); // 정수를 double 값으로 변환 . 28.0
	// Double사용
	Double d =Double.valueOf (3.14);
	System.out.println(d.toString()); // Double 을 문자열 " 로 변환
	System.out.println(Double.parseDouble (" 3.14")); // 문자열을 실수 3.14 로 변환
	// Boolean사용
	boolean b = (4>3); // b 는 true
	System.out.println(Boolean.toString ( b)); // true 를 문자열 " 로 변환
	System.out.println(Boolean.parseBoolean (" false")); // 문자열을 false 로 변환
	}
}