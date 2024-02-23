package java_prg;

import java.util.Arrays;
public class ThirdLargeNum_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {10,20,25,63,96,57};
		int size=array.length;
		Arrays.sort(array);
		System.out.println("sorted array:"+Arrays.toString(array));
		int rest=array[size-3];
		System.out.println("3rd largest number is"+rest);

	}

}
