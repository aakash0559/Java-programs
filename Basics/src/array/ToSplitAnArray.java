package array;

public class ToSplitAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 7, 5, 4, 3, 1, 11, 13, 0, 9, 7, 6 };
		if (a.length % 2 != 0) {
			int x[] = new int[a.length / 2 + 1];
			int y[] = new int[a.length / 2];
			for (int i = 0; i < x.length; i++) {
				x[i] = a[i];// first 6 element of a[] to x[]
				System.out.println(x[i]);
			}
			System.out.println();
			for (int i = 0; i < y.length; i++) {
				y[i] = a[x.length + i]; // first 5 element of a[] to y[]
				System.out.println(y[i]);
			}
		} else {
			int x[] = new int[a.length];
			int y[] = new int[a.length / 2];

		}
	}
}
