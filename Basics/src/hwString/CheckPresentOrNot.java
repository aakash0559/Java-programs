package hwString;

public class CheckPresentOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Malala got nobel prize! for peace, in swiz.";
		s = s.toLowerCase();
		boolean flag = false;
		char c[] = new char[s.length()];
		for (int i = 0; i < c.length; i++) {
			c[i] = s.charAt(i);
			if (c[i] == 'z') {
				flag = true;
			}
		}
		if(flag){
			System.out.println("z is present");
		}else{
			System.out.println("z is not present");
		}
	}

}
