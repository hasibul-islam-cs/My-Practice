package SessionSecond;

import java.math.BigInteger;
import java.util.Scanner;

class BigIntegerLogicTest{
	BigInteger bi = new BigInteger("6984");
	BigInteger bi1 = new BigInteger("6984");
}

public class BigintegerLogic {
	public static void main(String[] args){
		BigIntegerLogicTest bilt = new BigIntegerLogicTest();
		String str = bilt.bi.pow(Integer.parseInt(bilt.bi1.toString())).toString();
		System.out.println("Length: "+str.length()+"\nNumber: "+str);
	}
}
