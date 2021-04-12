package hwString;

public class ChangingCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aakasH";
		char c[]=new char[s.length()];
		for(int i=0;i<c.length;i++){
			c[i]=s.charAt(i);
		}	
		for(int i=0;i<c.length;i++){
			if(c[i]>='a'&&c[i]<='z'){
			System.out.println((char)(c[i]-32));}
			else{
				System.out.println(c[i]);
			}
		}
	}

}
