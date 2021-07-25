import java.util.Scanner;

public class Sixth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("돈의 액수를 입력하세요>>");
		int money = scanner.nextInt();
		int a=money/50000;
		int b=money%50000/10000;
		int c=money%50000%10000/1000;
		int d=money%50000%10000%1000/500;
		int e=money%50000%10000%1000%500/100;
		int f=money%50000%10000%1000%500%100/10;
		int g=money%50000%10000%1000%500%100%10;
		System.out.println("오만원"+a+"개, 만원"+b+"개, 천원"+c+", 500원"+d+"개, 100원"+e+"개, 10원"+f+"개, 1원"+g+"개");
		scanner.close();
		

	}

}
