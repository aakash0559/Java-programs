package hwString;

public class ChangingCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Aakash";
		char c[]=new char[s.length()];
			for(int i=0;i<c.length;i++){
				c[i]=s.charAt(i);
			}	
			for(int i=0;i<c.length;i++){
				if(c[i]>='A'&&c[i]<='Z'){
				System.out.println((char)(c[i]+32));}
				else{
					System.out.println(c[i]);
				}
			}
	}

}
