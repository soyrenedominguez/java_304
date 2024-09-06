package by.skriom;

import java.util.Scanner;

public class Formula {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		double x=in.nextDouble();
		double y=in.nextDouble();
		double z=in.nextDouble();
		double r=(((2*x+y)/(z))*(y*y*y-z))/((x+(2*y)+(3*z))/(z-(2*y)-(3*x))+(x*x)+(z*z));
		System.out.println(r);
	}

}
