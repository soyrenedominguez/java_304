package by.skriom;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Pitagoras {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		double a=in.nextDouble();
		double b=in.nextDouble();
		double hip=Math.sqrt((a*a)+(b*b));
		DecimalFormat df=new DecimalFormat("#.000");
		System.out.println(df.format(hip));
	}
}
