package chap07;
import java.util.*;

public class Question3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		
		h.put("����������", 2000);
		h.put("�Ƹ޸�ī��", 2500);
		h.put("īǪġ��", 3000);
		h.put("ī�����", 3500);
		
		
		System.out.println("����������, �Ƹ޸�ī��, īǪġ��, ī����� �ֽ��ϴ�.");
		
		while(true) {
			Set<String> keys = h.keySet();
			Iterator<String> it = keys.iterator();
			System.out.print("�ֹ� >> ");
			String s = sc.next();
			if(s.equals("�׸�")) {
				break;
			}
			while(it.hasNext()) {
				String key = it.next();
				if(s.equals(key)) {
					System.out.println(s + "�� " + h.get(key) + "�� �Դϴ�.");
					break;
				}
			}
		}
	}
}