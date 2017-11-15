package ExceptionHandling.UnChecked;

public class CharacterIndexOutofBounds {
	public static void main(String[] args){
		String str = "Hello";
		try{
			System.out.println(str.charAt(6));
		}catch(Exception e){
			System.out.println("Sorry this index of array is empty");
		}
	}
}
