package HWString;

public class FirstRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s = "malala got nobel prize! for peace, in swiz.";
			s = s.toLowerCase();
			char c[] = new char[s.length()];
			int k=0;
			for (int i = 0; i < c.length; i++) {
				for (int j = i + 1; j < c.length; j++) {
					if (s.charAt(i)>='a'&&s.charAt(i)<='z') {
						if(s.charAt(i)==s.charAt(j)){
						c[k] = s.charAt(i);
						k++;}
					}
				}
			}System.out.print("First Reapeted char is -->  "+c[0]);
	}

}
