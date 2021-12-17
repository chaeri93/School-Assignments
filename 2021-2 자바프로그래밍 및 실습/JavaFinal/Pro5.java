
import java.util.Scanner;

public class Pro5 {

	public static void main(String[] args) {
		MemberManager mm = new MemberManager();
		mm.generateData();

		Scanner scan = new Scanner(System.in);
		mm.printtAll();

		System.out.print("검색할 학번을 입력하세요: ");
		Member m = mm.search(scan.nextInt());

		System.out.print("검색 결과는: ");
		System.out.print(m.getNo() + "	" + m.getName() + "	" + m.getTel() + "	" + m.getEmail());

	}
}
