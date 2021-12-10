package chap07;
import java.util.*;

public class Question5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		System.out.println("나라 이름과 인구를 5개 입력하세요.");
		for(int i = 0; i < 5; i++) {
			System.out.print("나라 이름, 인구 >> ");
			nations.put(sc.next(), sc.nextInt());
		}
		
		Set<String> keys = nations.keySet();
		Iterator<String> it = keys.iterator();
		
		int max = 0;
		String max_cont = null;
		while(it.hasNext()) {
			String key = it.next();
			int value = nations.get(key);
			if(max < value) {
				max = value;
				max_cont = key;
			}
		}
		
		System.out.println("제일 인구가 많은 나라는 (" + max_cont + ", " + nations.get(max_cont) + ")");
	}
}