package jcf;

import java.util.ArrayList;
import java.util.TreeSet;

public class ArraylistToTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add("Aakash");
		al.add("Muthu");
		al.add("Thenarasu");
		al.add("Abi");
		al.add("Kabi");
		TreeSet at = new TreeSet();
		at.addAll(al);
		System.out.println(at);
	}
}
