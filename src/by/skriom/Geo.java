package by.skriom;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Geo {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#.000");
		int op=in.nextInt();
		switch (op) {
		case 0:
			double a=in.nextDouble();
			double b=in.nextDouble();
			double c=in.nextDouble();
			double area=((a+b)/2)*c;
			System.out.println("Trapecio");
			System.out.println(df.format(area));
			break;
		case 1: 
			double a1=in.nextDouble();
			double b1=in.nextDouble();
			double area1=((a1*b1)/2);
			System.out.println("Triangulo");
			System.out.println(df.format(area1));
			break;
		case 2: 
			double a2=in.nextDouble();
			double area2=((a2*a2));
			System.out.println("Cuadrado");
			System.out.println(df.format(area2));
			break;
		case 3: 
			double a3=in.nextDouble();
			double b3=in.nextDouble();
			double area3=((a3*b3));
			System.out.println("Rectangulo");
			System.out.println(df.format(area3));
			break;
		case 4: 
			double radio=in.nextDouble();
			double area4=(3.1416*radio*radio);
			System.out.println("Circulo");
			System.out.println(df.format(area4));
			break;
		default:
			System.out.println("Figura no valida");
			break;
		}

	}

}
