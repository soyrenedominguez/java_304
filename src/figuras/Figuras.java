package figuras;

import java.util.Scanner;

public class Figuras {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int op = -1;
		do {
			System.out.println("\n\n     MENU     ");
			System.out.println("1. LINEA");
			System.out.println("2. CUADRO");
			System.out.println("3. TRIANGULO");
			System.out.println("4. RECTANGULO");
			System.out.println("5. CUADRO CONTORNO");
			System.out.println("6. ROMBO");
			System.out.println("7. TRIANGULO CONTORNO");
			System.out.println("8. ROMBO CONTORNO");
			System.out.println("9. FLECHA");
			System.out.println("0. SALIR");
			System.out.println("ELIGE OPCION???");
			op = in.nextInt();
			switch (op) {
			case 1:
				System.out.println("\n______LINEA______\n");
				System.out.println("Tamaño?");
				int n = in.nextInt();
				for (int i = 0; i < n; i++) {
					System.out.print("█");
				}
				break;
			case 2:
				System.out.println("\n______CUADRO______\n");
				System.out.println("Tamaño?");
				int n1 = in.nextInt();
				for (int j = 0; j < n1; j++) {
					for (int i = 0; i < n1; i++) {
						System.out.print("██");
					}
					System.out.println("");
				}
				break;
			case 3:
				System.out.println("\n______TRIANGULO______\n");
				System.out.println("Tamaño?");
				int n2 = in.nextInt();
				for (int j = 0; j <= n2; j++) {
					for (int i = 0; i < n2 - j; i++) {
						System.out.print(" ");
					}
					for (int i = 0; i < (j * 2) - 1; i++) {
						System.out.print("■");
					}
					System.out.println("");
				}
				break;
			case 4:
				System.out.println("\n______RECTANGULO______\n");
				System.out.println("Base?");
				int n3 = in.nextInt();
				System.out.println("Altura?");
				int n4 = in.nextInt();
				for (int j = 0; j < n4; j++) {
					for (int i = 0; i < n3; i++) {
						System.out.print("██");
					}
					System.out.println("");
				}
				break;
			case 5:
				System.out.println("\n______CUADRO CONTORNO______\n");
				System.out.println("Tamaño?");
				int n5 = in.nextInt();
				for (int i = 0; i < n5; i++) {
					System.out.print("▄▄");
				}
				System.out.println("");
				for (int j = 0; j < n5-2; j++) {
					System.out.print("█ ");
					for (int i = 0; i < n5-2; i++) {
						System.out.print("  ");
					}
					System.out.println(" █");
				}
				for (int i = 0; i < n5; i++) {
					System.out.print("▀▀");
				}
				break;
			case 6:
				System.out.println("\n______ROMBO______\n");
				System.out.println("Tamaño?");
				int n6 = in.nextInt();
				for (int j = 0; j <= n6; j++) {
					for (int i = 0; i < n6 - j; i++) {
						System.out.print(" ");
					}
					for (int i = 0; i < (j * 2) - 1; i++) {
						System.out.print("■");
					}
					System.out.println("");
				}
				for (int j = 0; j <= n6; j++) {
					for (int i = 0; i <=j; i++) {
						System.out.print(" ");
					}
					for (int i = 1; i < ((n6 * 2)-(j*2))-2; i++) {
						System.out.print("■");
					}
					System.out.println("");
				}
				break;
			case 7:
				System.out.println("\n______TRIANGULO CONTORNO______\n");
				System.out.println("Tamaño?");
				int n7 = in.nextInt();
				for (int j = 0; j <n7-1; j++) {
					for (int i = 0; i < (n7 - j)-1; i++) {
						System.out.print(" ");
					}
					if(j>0) {
						System.out.print("█");
					}
					for (int i = 0; i < (j * 2) - 1; i++) {
						System.out.print(" ");
					}
					System.out.println("█");
				}
				for (int i = 0; i <(n7 * 2) - 1; i++) {
					System.out.print("▀");
				}
				break;
			case 8:
				System.out.println("\n______ROMBO CONTORNO______\n");
				System.out.println("Tamaño?");
				int n9 = in.nextInt();
				for (int j = 0; j <n9; j++) {
					for (int i = 0; i < (n9 - j)-1; i++) {
						System.out.print(" ");
					}
					if(j>0) {
						System.out.print("█");
					}
					for (int i = 0; i < (j * 2) - 1; i++) {
						System.out.print(" ");
					}
					System.out.println("█");
				}
				for (int j = 0; j <n9-1; j++) {
					for (int i = 0; i <=j; i++) {
						System.out.print(" ");
					}
					if(j<(n9-2)) {
						System.out.print("█");
					}
					for (int i = 1; i < ((n9-j-1) * 2) - 2; i++) {
						System.out.print(" ");
					}
					System.out.println("█");
				}
				break;
			case 9:
				System.out.println("\n______FLECHA______\n");
				System.out.println("Tamaño?");
				int n8 = in.nextInt();
				for (int j = 0; j <= n8; j++) {
					for (int i = 0; i < n8 - j; i++) {
						System.out.print(" ");
					}
					for (int i = 0; i < j; i++) {
						System.out.print("█");
					}
					int tam=(n8%2==0)?(n8/2):((n8-1)/2);
					if((j-1)>tam) {
						for (int i = 0; i < n8; i++) {
							System.out.print("██");
						}
					}
					System.out.println("");
				}
				for (int j = 0; j <= n8; j++) {
					for (int i = 0; i < j; i++) {
						System.out.print(" ");
					}
					for (int i = 0; i < n8-j; i++) {
						System.out.print("█");
					}
					int tam=(n8%2==0)?(n8/2):((n8-1)/2);
					if((j+1)<tam) {
						for (int i = 0; i < n8; i++) {
							System.out.print("██");
						}
					}
					System.out.println("");
				}
				break;
			default:
				System.out.println("OPCION NO VALIDA");
				break;
			}
		} while (op != 0);

	}

}
