package java_prg;

public class SwapTwoNum_WitOutuseTempVar_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=9;
		System.out.println("before swap: a="+a+" b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swap: a="+a+" b="+b);

	}

}
