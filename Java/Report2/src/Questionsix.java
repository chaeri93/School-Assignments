import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
public class Questionsix {
	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		System.out.println("** ����Ʈ ���� ���α׷��Դϴ� **");

		while (true) {
			System.out.print("�̸��� ������ �Է� >> ");
			String name = scanner.next();
			if(name.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�...");
				break;
			}
			else {
				int point = scanner.nextInt();
				if(h.containsKey(name)) {
					h.put(name, h.get(name) + point);
				}
				else {
					h.put(name, point);
				}
				Set<String> keys = h.keySet();
				Iterator<String> it = keys.iterator();
				while(it.hasNext()) {
					String key = it.next();
					int value = h.get(key);
					System.out.print("(" + key + ", " + value + ") ");
				}
				System.out.println();	
			}
		}
		scanner.close();
	}
}
