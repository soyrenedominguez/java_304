package repaso;

public class Repaso {
	int x=10;//variable global

	public static void main(String[] args) {
		int x=11;//variable local 		
		
		byte b;// entero 8 bits
		b=-128;
		System.out.println("Variable tipo byte 8 bits: "+b);
		
		short a; //entero 16 bits
		a=32767;
		System.out.println("Variable tipo short 16 bits: "+a);
		
		int edad;//enbitstero 32
		edad=2147483647;
		System.out.println("Variable tipo int 32 bits: "+edad);
		
		long c;// entero 64 bits
		c=9034222222342342335l;
		System.out.println("Variable tipon long 64 bits: "+c);		
		
		double n1;
		n1=10.23123;
		System.out.println("Decimal Double: "+ n1);
		
		float n2;
		n2=1223.213423424f;
		System.out.printf("Decimal Float\t%.2f\t\t%.3f\n",n2,n1);
		
		String texto;
		texto="Hola Mundo CECYTEM";
		System.out.println(texto);
		
		char letra;
		letra='a';
		System.out.println(letra);
		
		boolean bol;
		bol=true;
		System.out.println(bol);		
		
		//PARSING
		System.out.println("CONVERTIR TEXTO A NUMERO ENTERO");
		String num1="10";
		String num2="20";
		System.out.println(num1+num2);//1020, otro dicen que 30
		System.out.println(Integer.parseInt(num1)+num2);//60lesly dice que 30,ave dice que no sabe como varios de aqui
		System.out.println(Integer.parseInt(num1)+Integer.parseInt(num2));//60
		System.out.println(Integer.parseInt(num1+num2));
		System.out.println("CONVERTIR NUMERO ENTERO A TEXTO");
		int num3=10;
		int num4=20;
		System.out.println(num3+num4);
		System.out.println(String.valueOf(num3)+num4);
		System.out.println(String.valueOf(num3)+String.valueOf(num4));
		System.out.println(String.valueOf(num3+num4));
		
		System.out.println("CONVERTIR TEXTO A DECIMAL");
		String num5="12.2131a";
		double num6=Double.parseDouble(num5);

	}

}
