package HWString;

public class TotalNoOfSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		String s = "Malala got nobel prize! for peace, in swiz.";
		s = s.toLowerCase();
	char c[] = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			c[i] = s.charAt(i);
	
		if (  ! (c[i]>='a' &&c[i]<='z')){//&& c[i]!=' '){
				count += 1;
		}
		}	System.out.println("consonent-->= " + count);
	
	
	}
}
