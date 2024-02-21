package java_prg;

public class Fibonacci_Whileloop_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f1=0,f2=1,f3;
		int i=1;
		System.out.println(f1+" "+f2);
		while(i<=10) {
			f3=f2+f1;
			System.out.println(" "+f3);
			f1=f2;
			f2=f3;
			i++;
		}

	}

}
