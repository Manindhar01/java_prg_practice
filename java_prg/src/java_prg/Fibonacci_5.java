package java_prg;

public class Fibonacci_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f1=0,f2=1,f3;
		System.out.println(f1);
		System.out.println(" "+f2);
		for(int i=2;i<=10;i++) {
			f3=f2+f1;
			System.out.println(" "+f3);
			f1=f2;
			f2=f3;
		}

	}

}
