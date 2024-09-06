package figuras;

import java.util.Scanner;

public class Numeros {
	public static void main(String[] cecyto) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int anterior = 0,contador=1;
		for (int i = 1; i <= ((n * (n + 1)) / 2); i++) {			
			System.out.print(i+" ");
			if((i-anterior)==contador) {
				anterior=i;
				contador++;
				System.out.println("");				
			}
		}
	}
}
