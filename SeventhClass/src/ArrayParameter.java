
public class ArrayParameter {
	static void replaceSpace (char a[]) {
		for (int i =0; i< a.length ;i++)
			if (a[i] == ' ')//공백이 들어오면
				a[i] = ',';//,로 바꿔라
	}
	static void printCharArray (char a[]) {
	for (int i =0; i< a.length ;i++)
		System.out.print(a[i]);
	System.out.println();//줄바꿈
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[]= { 'T','h','i','s',' ','i','s',' ','a',' ', 'p','e','n','c','i','l'};
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
		}

}
