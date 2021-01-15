import java.util.Scanner;

public class ejercicios {
	
	
	static final float PI=(float) 3.14;
	static final int MAXELEMENTOS=10;
	static final char APODO = 'D';
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		float x;
//		int num;
//		x=PI*3;
//		Double num2;
//		char letra;
		String cadena;
		
//		System.out.println("Hola Mundo");
//		System.out.println("El valor de x es:" + x +" y se acabo");
//		System.out.println("Introduce un número");
//		num = Integer.parseInt(teclado.nextLine());
//		System.out.println("El número que acabas de introducir es " + num);
//		System.out.println("Introduce un número");
//		num2 = Double.parseDouble(teclado.nextLine());
//		System.out.println("El número que acabas de introducir es " + num2);
//		System.out.println("Introduce una letra");
//		letra = teclado.nextLine().charAt(0);
//		System.out.println("Tu letra es la letra " + letra);
		System.out.println("Introduce tu nombre");
		cadena = teclado.nextLine();
		System.out.println("Tu nombre es " + cadena);
	}

}
