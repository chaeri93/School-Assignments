
public class NumSeven {
	public static void main(String[] args) {
		int count, x , y;
		for(int i=1; i<100;i++) {
			count =0;
			x=i/10;
			y=i%10;
			
			if(x!=0 && x%3==0)count++;
			if(y!=0 && y%3==0)count++;
			if(count==1) System.out.println(i+" �ڼ��ѹ�");
			else if(count==2) System.out.println(i+" �ڼ��ι�");
		}
	}
}
