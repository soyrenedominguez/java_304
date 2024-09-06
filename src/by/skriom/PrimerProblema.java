package by.skriom;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PrimerProblema {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		double d = in.nextDouble();
		double e = in.nextDouble();
		double p = (a + b + c + d + e) / 5;
		DecimalFormat df = new DecimalFormat("#.0");
		System.out.printf(df.format(p));
	}

}
