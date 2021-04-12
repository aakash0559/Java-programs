package hwString;

public class EncryptionDecryptionHighLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Secret code is FAFBCD";
		char c[] = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (i % 2 == 0) {
				c[i] = (char) (c[i] + (i * 2 - i));
			} else {
				c[i] = (char) (c[i] - (i * 3 + i));
			}
			System.out.print(c[i]);
		}
		System.out.println();
		// decrption
		for (int i = 0; i < c.length; i++) {
			if (i % 2 == 0) {
				c[i] = (char) (c[i] - (i * 2 - i));
			} else {
				c[i] = (char) (c[i] + (i * 3 + i));
			}
			System.out.print(c[i]);
		}
	}
}
