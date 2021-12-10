package chap07;
import java.util.*;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Float> v = new Vector<Float>();
		
		for(int i = 0; i < 5; i++) {
			v.add(sc.nextFloat());
		}
		
		float max = 0;
		for(int i = 0; i < 4; i++) {
			if(v.get(i) > v.get(i+1)) {
				max = v.get(i);
			}
		}
		System.out.println("가장 큰 수는 " + max);
	}
}