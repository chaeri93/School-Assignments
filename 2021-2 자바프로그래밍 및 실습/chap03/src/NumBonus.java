
public class NumBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[][]=new int[3][4];
		
		for(int i=0;i<3;i++)
			for(int j=0;j<4;j++)
				array[i][j]=(int)(Math.random()*10);
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) 
				System.out.print(array[i][j]+"\t"); // 0~9의 랜덤 정수 
			System.out.println();
		}
		int sum=0, x=0;
		while(x<3) {
			for(int i=0;i<4;i++)
				sum+=array[x][i];
			x++;
		}
		System.out.println("합은 "+sum);
	}

}
