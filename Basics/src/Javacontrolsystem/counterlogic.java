package Javacontrolsystem;

public class counterlogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Counter = 0;
		for (int i = 1; i <= 10000; i++) {
			if (i % 9 == 0 && i % 7 == 0) {
				Counter = Counter + 1;
				// System.out.println(i);
			}
		}
		System.out.print(Counter);
	}

}
