import java.util.Scanner;
import java.util.Vector;

public class Problemfour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		Vector<Integer> v = new Vector<Integer>();
		
		System.out.println("2000~2009����� 1�� ������ Ű �Է�");
		System.out.print(">> ");
		for(int i = 0; i < 10; i++) {
			v.add(scanner.nextInt());
		}
		int max = 0;
		int maxyear = 0;
		for(int i = 0; i < 9; i++) {
			if(max < (v.get(i+1) - v.get(i))){
				max = v.get(i+1) - v.get(i);
				maxyear = i;
			}
			else
				continue;
		}	
		System.out.println("���� Ű�� ���� �ڶ� �⵵�� 200" + maxyear + "�� " + (float)max + "cm");
		scanner.close();
	}

}
