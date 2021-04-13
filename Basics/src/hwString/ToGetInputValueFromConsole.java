package hwString;

import java.util.Scanner;

public class ToGetInputValueFromConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
	System.out.println("Enter a:");
	int a=sc.nextInt();
	System.out.println("Enter b:");
	int b=sc.nextInt();
	int c=a+b;
	System.out.println("sum value"+c);
	sc.close();
	}
}
