package hwString;

public class Anogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "listen";
		s = s.toLowerCase();
		String w = "";
		char a[] = new char[s.length()];
		for (int i = 0; i < a.length; i++) {
			a[i] = s.charAt(i);
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					char temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			w = w + a[i];
		}
		String t = "silent";
		t = t.toLowerCase();
		String w1 = "";
		char a1[] = new char[t.length()];
		for (int i = 0; i < a1.length; i++) {
			a1[i] = t.charAt(i);
		}

		for (int i = 0; i < a1.length; i++) {
			for (int j = i + 1; j < a1.length; j++) {
				if (a1[i] > a1[j]) {
					char temp = a1[i];
					a1[i] = a1[j];
					a1[j] = temp;
				}
			}
			w1 = w1 + a1[i];
		}
		if (w.equals(w1)) {
			System.out.println("Anogram");
		}

		else {
			System.out.println("not a Anogram");
		}
	}
}
