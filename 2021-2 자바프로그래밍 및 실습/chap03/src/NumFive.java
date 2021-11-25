import java.util.Scanner;

public class NumFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 10개 입력>>");
		
		int align;
		int arr[] = new int[10];
		for(int i=0;i<10;i++)
			arr[i]=scanner.nextInt();
		
		for(int i=0;i<10;i++) {
			for(int j=i;j<10;j++) {
				if(arr[i]>arr[j]) {
					align = arr[i];
					arr[i] = arr[j];
					arr[j] = align;
				}
			}
		}
		for(int i=0;i<10;i++)
			System.out.print(arr[i]+" ");

	}

}
