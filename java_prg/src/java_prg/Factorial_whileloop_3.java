package java_prg;

public class Factorial_whileloop_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5,i=1;
		long fact=1;
		while(i<=n) {
			fact*=i;
			i++;
		}
		System.out.println("Factorial of 5 is:"+fact);

	}

}
