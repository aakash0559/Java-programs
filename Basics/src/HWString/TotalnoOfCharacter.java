package HWString;

public class TotalnoOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int count=0;
		String s="Malala got nobel prize! for peace,in swiz.";
		char c[]=new char[s.length()];
		for(int i=0;i<c.length;i++){
	c[i]=s.charAt(i);
		count=count+1;
		}	System.out.println(count);
System.out.println("Total no of char -->"+s.length());
	
	}

}
