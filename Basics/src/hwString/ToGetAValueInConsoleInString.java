package hwString;

import java.util.Scanner;

public class ToGetAValueInConsoleInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(System.in);
		System.out.println("Enter a word:");
		String s = c.next();
		System.out.println(s);
		String a = c.nextLine();
		System.out.println("Enter a line:");
		String d = c.nextLine();
		System.out.println(d);
	//	char b = c.next().charAt(0);
		System.out.println("Enter a char:");
		char e = c.next().charAt(0);
		System.out.println(e);
		c.close();
	}

}
