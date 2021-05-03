package array;

public class TofindFirstMiddleLastElementInAnArray4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={5,2,4,5,6,7};
System.out.println(a[0]);
if(a.length%2==0){
	System.out.println(a[a.length/2]);
	System.out.println(a[a.length/2-1]);
}
else{
	System.out.println(a[a.length/2]);
}
System.out.println(a[a.length-1]);
	}

}
