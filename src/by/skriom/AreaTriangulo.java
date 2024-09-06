package by.skriom;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		double a=in.nextDouble();
		double b=in.nextDouble();
		double p=(a*b)/2;
		DecimalFormat df=new DecimalFormat("#.000");
		System.out.printf(df.format(p));
	}

}
