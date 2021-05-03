package PatternPrograms;

public class RightAngleTriangle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i-1; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j<=a-i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
