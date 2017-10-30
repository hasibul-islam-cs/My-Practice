package SomeAlgorithms;

import java.util.Scanner;

class ExponentialModulas{
	long binarybit[] = new long[1000], bit, i, d;
	long binaryconvert(long p){
		while(p!=1){
			binarybit[(int)bit++] = p%2;
			p=p/2;
		}
		binarybit[(int)bit] = 1;
		i=(int)bit;
		return 0;
	}
	
	long modulas(long m, long n, long c){
		d = (d*d)%c;
		if (binarybit[(int)i]==1){
			d = (d*m)%c;
		}
		if (bit-i == bit){
			return d;
		}
		i--;
		return modulas(m, n, c);
	}
	
	long binary(long p){
		if (p==0){
			i = (int)bit;
			return binarybit[(int)bit] = 1;
		}
		else{
			binarybit[(int)bit++] = p%2;
			return binary(p/2);
		}
	}
}

public class ExponentialBigmodAlgorithm {
	private static ExponentialModulas em;
	private static Scanner sc;
	public static void main(String[] args){
		em = new ExponentialModulas();
		sc = new Scanner(System.in);
		long m, n, c;
		while(true){
			em.bit =0; em.i = 0; em.d = 1;
			m = sc.nextLong();
			n = sc.nextLong();
			c = sc.nextLong();
			em.binaryconvert(n);
			/* 
			 * This is for just convert binary 
			 * em.binary(n);
			 * for (int j = (int)em.i-1; j>=0; j--){
			 * System.out.print(em.binarybit[j]);
			 * }
			 */
			System.out.println(em.modulas(m, n, c));
		}
	}
}
