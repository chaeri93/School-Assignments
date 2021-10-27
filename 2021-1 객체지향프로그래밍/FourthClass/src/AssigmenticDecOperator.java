
public class AssigmenticDecOperator {

	public static void main(String[] args) {
		int a=3, b=3, c=3;
		
		a+=3;//a=6
		b*=3;//b=9
		c%=2;//c=1
		
		System.out.println("a="+a+"  b="+b+ "  c="+c);
		
		int d=3;
		a=d++;
		System.out.println("a="+a+"  d="+d);
		a=++d;
		System.out.println("a="+a+"  d="+d);
		a=d--;
		System.out.println("a="+a+"  d="+d);
		a=--d;
		System.out.println("a="+a+"  d="+d);

	}

}
