package SomeAlgorithms;

import java.util.Scanner;
import java.math.BigInteger;

public class SummationOfDigit {
	private Scanner sc;
	BigInteger last;
	BigInteger checker2;
	
	BigInteger sum(BigInteger bi1){
		BigInteger s = new BigInteger("0");
		if (bi1.compareTo(last)==-1){
			return bi1;
		}
		else {
			while (bi1.compareTo(checker2)==1){
				s = s.add(bi1.mod(last));
				bi1 = bi1.divide(last);
			}
			return sum(s);
		}
	}
	
	BigInteger pow(BigInteger base, BigInteger power){
		BigInteger result = BigInteger.ONE;
		while (power.signum()>0){
			if (power.testBit(0)){
				result = result.multiply(base);
			}
			base = base.multiply(base);
			power = power.shiftRight(1);
		}
		return result;
	}
	
	public static void main(String[] args){
		SummationOfDigit tst = new SummationOfDigit();
		int t;
		BigInteger a;
		tst.sc = new Scanner(System.in);
		
		BigInteger bi1 = new BigInteger("0");
		
		t = tst.sc.nextInt(); 
		for (int i=1; i<=t; i++){
			tst.last = new BigInteger("10"); 			
			tst.checker2 = new BigInteger("0");
			
			bi1 = new BigInteger(tst.sc.next());
			a = new BigInteger(tst.sc.next());
			bi1 = tst.pow(bi1, a);
			System.out.println(tst.sum(bi1));
		}
	}
}
