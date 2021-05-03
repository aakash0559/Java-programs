package arrayBuiltInFunctions;

import java.util.Arrays;

public class ArraySortpredefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a[] = { 7, 5, 4, 11, 9 };
		Arrays.sort(a);
		for (int i : a) {
			System.out.println(i);
		}
		int b[] = { 7, 5, 4, 11, 9 };
System.out.println(Arrays.equals(a, b));
System.out.println();*/
int c[] = { 7, 5, 4, 11, 9,8 };
Arrays.sort(c);
System.out.println(Arrays.binarySearch(c, 11));
	}

}
