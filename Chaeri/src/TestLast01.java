interface  Num01{

	int add(int x, int y); // x�� y�� ���� �����Ѵ�
	
	int add(int n); //1���� n������ ������ ���� �����Ѵ�.

}

 

class Ave implements Num01{

	public double average(int[] a) {
	
		double sum = 0;
		
		for(int i = 0; i < a.length; i++)
		
			sum += a[i];
			
			return sum/a.length;

   }

}


public class TestLast01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ave av = new Ave();
		av.add(4,6);
		av.add(5);
		int a[]= {4,9,11};
		av.average(a);
	}

}
