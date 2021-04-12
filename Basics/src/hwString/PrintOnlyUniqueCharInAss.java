package HWString;

public class PrintOnlyUniqueCharInAss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Malala got nobel prize! for peace, in swiz.";
		s = s.toLowerCase();
		char c[] = new char[s.length()];
		for (int i = 0; i < c.length; i++) {
			if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
			c[i] = s.charAt(i); }
		}
		for(int i=0;i<c.length;i++){
			for (int j = i+1; j < c.length; j++) {
				if (c[i]==c[j]){
				c[i]=' ';} 
				if (c[j] < c[i]) {
				char temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				s.trim();}
			}
			System.out.print(c[i]);
		}
		}

}
