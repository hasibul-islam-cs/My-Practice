package test;

import java.util.Scanner;

class Binomial{
	int Factorial(int n){
		if (n==0)
			return 1;
		else if (n==1)
			return 1;
		else
			return n*Factorial(n-1);
	}
}

public class TestClass{
	public static void main(String[] args){
		Binomial bm = new Binomial();
		Scanner sc = new Scanner(System.in);
		
		int m, x, mx;
		System.out.print(" M X ->\t");
		for (int i=0; i<=10; i++)
			System.out.print(i+"_\t_");
		System.out.println();
		for (m = 0; m<=10; m++){
			System.out.print(" "+m+"\t|");
			for (x= 0; x<=m; x++){
				System.out.print(bm.Factorial(m)/(bm.Factorial(x)*bm.Factorial(m-x))+"\t");
			}
			System.out.println("");
		}
	}
}