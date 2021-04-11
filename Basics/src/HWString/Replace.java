package HWString;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Malala got nobel prize! for peace,in swiz.";
		// System.out.println(s.replace('a', '@'));
		char replace = '@';
		char c[] = new char[s.length()];
		for (int i = 0; i < c.length; i++) {
			c[i] = s.charAt(i);
			if (c[i] == 'a') {
				c[i] = replace;
			}
			System.out.print(c[i]);
		}
	}

}
