package AddTwoIntegerbyObject;

import java.util.Scanner;

class Addition{
	public int a;
	
	Addition(int i, int j){
		a = i+j;
	}
	
	@Override
	public String toString(){
		return Integer.toString(a);
	}
}

class Substraction{
	public int a;
	
	Substraction (int i, int j){
		a = i-j;
	}
	
	@Override
	public String toString(){
		return Integer.toString(a);
	}
}


public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter Four Integer Number: ");
		
		Addition object = new Addition (sc.nextInt(), sc.nextInt());
		Substraction object1 = new Substraction (sc.nextInt(), sc.nextInt());
		
		Addition object3 = new Addition(Integer.parseInt(object.toString()), Integer.parseInt(object1.toString()));
		
		System.out.println("The result is: "+object3);
		
		System.exit(0);
	}
}
