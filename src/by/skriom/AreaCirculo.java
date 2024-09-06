package by.skriom;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaCirculo {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		double a=in.nextDouble();
		double p=Math.PI*a*a;
		DecimalFormat df=new DecimalFormat("#.00");
		System.out.printf(df.format(p));
	}
}
