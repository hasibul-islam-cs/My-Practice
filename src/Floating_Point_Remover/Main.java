package Floating_Point_Remover;

import java.util.Scanner;

class FloatingPointRemover{
	String str;
	
	void Remover(){
		char str1[] = str.toCharArray();
		for (int i=0; i<str.length(); i++){
			if (str1[i]=='.')
				continue;
			System.out.print(str1[i]);
		}
	}
}

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		FloatingPointRemover fpr = new FloatingPointRemover();
		
		int t;
		t = sc.nextInt();
		
		for (int cas = 0; cas<t; cas++){
			fpr.str = sc.next();
			fpr.Remover();
			System.out.println();
		}
	}
}
