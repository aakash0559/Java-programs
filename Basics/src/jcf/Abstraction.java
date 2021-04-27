package jcf;

abstract class A2B {
	void b() {
		System.out.println("10");
	}

	abstract void tax();
}

class A2BIndia extends A2B {
	void tax() {
		System.out.println("5");
	}
}

class A2BUS extends A2B {
	void tax() {
		System.out.println("15");
	}
}

class A2BUK extends A2B {
	void tax() {
		System.out.println("20");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2BIndia i = new A2BIndia();
		i.tax();
	}
}
