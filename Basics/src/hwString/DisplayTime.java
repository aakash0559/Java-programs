package hwString;

public class DisplayTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		for (int j = 30; j < 60; j++) {
			System.out.println(i + ":" + j);
		}
		int k = 11;
		for (int j = 0; j <= 30; j++) {
			if (j <= 9) {
				System.out.println(k + ":0" + j);
			} else {
				System.out.println(k + ":" + j);
			}
		}
	}
}
