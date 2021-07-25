import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N=scanner.nextInt();
		int array[]=new int[N];
		int count=0;
		for(int i =0;i<N;i++) {
			array[i] = scanner.nextInt();
		}
		for(int i =0;i<N;i++) {
			for(int j=N-1;j>=0;j--) {
				if(i==j)
					continue;
				else if(i>j) {
					while(array[i]<=array[j]) {
						count++;
						array[j] = array[j]-1;
					}
				}
				else if(i<j) {
					while(array[i]>=array[j]) {
						count++;
						array[i] = array[i]-1;
					}
				}
			}
		}
		
		System.out.println(count);

		
	}

}

