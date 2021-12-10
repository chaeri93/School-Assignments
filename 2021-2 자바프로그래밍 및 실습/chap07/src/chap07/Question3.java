package chap07;
import java.util.*;

public class Question3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		
		h.put("에스프레소", 2000);
		h.put("아메리카노", 2500);
		h.put("카푸치노", 3000);
		h.put("카페라테", 3500);
		
		
		System.out.println("에스프레소, 아메리카노, 카푸치노, 카페라테 있습니다.");
		
		while(true) {
			Set<String> keys = h.keySet();
			Iterator<String> it = keys.iterator();
			System.out.print("주문 >> ");
			String s = sc.next();
			if(s.equals("그만")) {
				break;
			}
			while(it.hasNext()) {
				String key = it.next();
				if(s.equals(key)) {
					System.out.println(s + "는 " + h.get(key) + "원 입니다.");
					break;
				}
			}
		}
	}
}