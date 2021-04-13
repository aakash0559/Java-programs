package hwString;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Malayalam";
		s=s.toLowerCase();
		String r = "";
		char a[] = new char[s.length()];
		for (int i = a.length - 1; i >= 0; i--) {
			r = r + s.charAt(i);
		}System.out.print(s+" is--> ");
		if (r.equals(s)) {
			System.out.println("palindrom");
		}

		else {
			System.out.println("not a palindrom");
		}

	}

}
