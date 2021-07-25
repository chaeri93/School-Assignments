import java.util.Scanner;
import java.util.StringTokenizer;

public class QuestionFour {
	
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);	
		String num = scanner.nextLine();
		
		StringTokenizer st = new StringTokenizer(num, "+");
		int n = st.countTokens();
	    int [] c = new int[n];
		int sum = 0;
		while(st.hasMoreTokens()) {
			for (int i=0;i<n;i++) {
			String token = st.nextToken();
			String s = token.trim();
			c[i] = Integer.parseInt(s);
			sum += c[i];
			}
		}
		System.out.println("гую╨ " + sum);
		scanner.close();
	}
}