package Javacontrolsystem;

public class CompundIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double p= 1000000;
double n= 5;
double r= 6.75;
double x=1+r/100;
double y= Math.pow(x, n);
double z=p*y;
double ci=z-p;
System.out.print(ci);

	}

}
