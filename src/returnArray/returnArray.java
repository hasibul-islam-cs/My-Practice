package returnArray;

public class returnArray {
	
	static int[] arrayReturn(int a[]) {
		return a;
	}
	
	public static void main(String[] args) {
		int b[];
		int c[] = new int [5];
		
		c[0] = 10;
		
		b = arrayReturn(c);
		
		System.out.println(b.length);
	}
}
