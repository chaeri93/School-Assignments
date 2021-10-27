
public class Questionthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row[] = new int[3];
		while(true) {
			for(int i = 0;i<3;i++) {
				row[i] = (int)(Math.random()*3+1);
				System.out.print(row[i]+" ");
			}
			System.out.println();
			if(row[0]==row[1]&&row[1]==row[2]) {
				System.out.println("¼º°ø");
				break;
			}
			else 
				continue;
		}

	}

}