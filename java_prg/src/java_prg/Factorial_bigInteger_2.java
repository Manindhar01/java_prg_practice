package java_prg;

import java.math.BigInteger;

public class Factorial_bigInteger_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=30;
		BigInteger fact=BigInteger.ONE;
		for(int i=1;i<=num;i++) {
			fact=fact.multiply(BigInteger.valueOf(i));
		}
		System.out.println("Factorial is:"+fact);

	}

}
