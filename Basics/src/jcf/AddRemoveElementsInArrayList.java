package jcf;

import java.util.ArrayList;
import java.util.Scanner;

public class AddRemoveElementsInArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList food = new ArrayList();
		food.add("idly");
		food.add("dosa");
		food.add("biriyani");
		food.add("parota");
		food.add("grill");
		// Scanner sc = new Scanner(System.in);
		// String s ="";
		// while (!s.equalsIgnoreCase("close")) {
		// s= sc.nextLine();
		// if(!s.equalsIgnoreCase("close")){
		// food.add(s);
		// }
		// }
		// System.out.println(food);
		System.out.println(food);
		food.remove(1);
		food.add(1, "pongal");
		System.out.println(food);
	}
}
