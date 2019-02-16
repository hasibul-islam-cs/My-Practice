package ExceptionHandling.UnChecked;

import java.util.Scanner;

class HandleError{
	int a, b, c;
	int divition(){
		c = a/b;
		return 0;
	}
}

public class ArithematicException {
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		HandleError he = new HandleError();
		int x = 1;
		while (x<2){
			try{
				System.out.print("Enter two integer number: ");
				he.a = sc.nextInt();
				he.b = sc.nextInt();
				he.divition();
				System.out.println(he.c);
				x = 2;
			}catch (Exception e){
				System.out.println("Can not complete");
			}
		}
	}
}
