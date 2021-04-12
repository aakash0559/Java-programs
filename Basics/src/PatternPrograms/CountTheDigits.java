package PatternPrograms;

public class CountTheDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=120559;
		int count=0;
		while(num!=0)
			{
			count +=1;
			num=num/10;
			}System.out.println(count);
	}

}
