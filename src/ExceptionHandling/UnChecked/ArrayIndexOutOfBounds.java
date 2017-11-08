package ExceptionHandling.UnChecked;

public class ArrayIndexOutOfBounds {
	public static void main(String[] args){
		int a[] = {1, 2, 3, 5};
		try{
			System.out.println(a[5]);
		} catch(Exception e){
			System.out.println("Sorry! Index.of array is empty.");
		}
	}
}
