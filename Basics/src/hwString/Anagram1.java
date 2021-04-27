package hwString;

public class Anagram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "listen";
		String s2 = "silens";
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		if (c1.length == c2.length) {
			for (int i = 0; i < c1.length; i++) {
				for (int j = i + 1; j < c1.length; j++) {
					if (c1[i] > c1[j]) {
						char temp = c1[i];
						c1[i] = c1[j];
						c1[j] = temp;
					}
					if (c2[i] > c2[j]) {
						char temp = c2[i];
						c2[i] = c2[j];
						c2[j] = temp;
					}
				}
				System.out.print(c2[i]);
			}
			String x = String.valueOf(c1);
			String y = String.valueOf(c2);
			if (x.equals(y)) {
				System.out.println("\n anagram");
			} else {
				System.out.println("\n not anagram due to char set");
			}
		} else {
			System.out.println("not a anagram due to size");
		}
	}
}