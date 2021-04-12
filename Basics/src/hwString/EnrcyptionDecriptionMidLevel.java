package hwString;

public class EnrcyptionDecriptionMidLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=" Secret code is FAFBCD ";
			char c[]=s.toCharArray();
			for(int i=0;i<c.length;i++){
           if(i%2==0){
        	   c[i]=(char) (c[i]+i);
           }
           else{
        	   c[i]=(char) (c[i]-i);
           }System.out.print(c[i]);
           }
			System.out.println();
			//decrption
			for(int i=0;i<c.length;i++){
           if(i%2==0){
        	   c[i]=(char) (c[i]-i);
           }
           else{
        	   c[i]=(char) (c[i]+i);
           }System.out.print(c[i]);
           }
			
			
	}

}
