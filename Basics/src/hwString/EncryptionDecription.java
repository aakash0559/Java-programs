package hwString;

public class EncryptionDecription {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s=" Secret code is FAFBCD ";
//converting String into char array
	char c[]=s.toCharArray();
	for(int i=0;i<c.length;i++){
		c[i]=(char) (c[i]+1);
	System.out.print(c[i]);}
	//decryption
	System.out.println();
	for(int i=0;i<c.length;i++){
		c[i]=(char) (c[i]-1);
	System.out.print(c[i]);}
	}

}
