package proyecto;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
	 * Este proyecto se trata de crear métodos estáticos que serán invocados desde otras clases y proyectos para
	 * leer los datos introducidos por teclado, con su correspondiente manejo de excepciones, más fácilmente y sin tener que
	 * repetir la escritura de estas operaciones cada vez que queramos pedir dicho dato. 
	 * Si el usuario no introduce lo que se le pide, se le volverá a repetir hasta que lo que introduzca sea correcto y no tenga excepciones.
	 * Los métodos a realizar son los siguientes:
	 * 
	 * 1. Cerrar el teclado
	 * 2. Leer un carácter de tipo char 
	 * 3. Leer una cadena de tipo String
	 * 4. Leer un boolean (1 o 2): se le pasa al usuario por parámetro tres mensajes:
	 * 		4.1. Primer parámetro: pregunta o cuestión a responder
	 * 		4.2. Segundo parámetro: 1. Respuesta 1
	 * 		4.3. Tercer parámetro: 2. Respuesta 2
	 * 	  El segundo y tercer parámetro son las respuestas que el usuario responderá según guste:
	 *		4.4. Si no introduce ni 1 ni 2, se le vuelve a pedir
	 * 		4.5. Si elige la Respuesta 1, tendrá que introducir (1) y la función devolverá true
	 * 		4.6. Si elige la Respuesta 2, tendrá que introducir (2) y la función devolverá false
	 * 5. Lectura de un boolean (s/n): se le pasa al usuario por parámetro una pregunta que deberá responder
	 * 	  con 's', 'S', 'n' o 'N'.
	 * 	    5.1. Si introduce otra cosa, se le vuelve a pedir
	 * 		5.2. Si responde 's' o 'S', la función devolverá true
	 * 		5.3. Si responde 'n' o 'N', la función devolverá false
	 * 	*** utilizar sobrecarga para que se llame igual que la función anterior (punto 4) ***
	 * 6. Lectura de un número. Si se sale del rango del tipo o se introduce otra cosa, se le vuelve a pedir.:
	 * 		6.1. Tipo byte
	 * 		6.2. Tipo short
	 * 		6.3. Tipo int
	 * 		6.4. Tipo long
	 * 		6.5. Tipo float
	 * 		6.6. Tipo double
	 * 7. Crear un enum para indicar que un número puede ser:
	 * 	- mayor o igual
	 * 	- menor o igual
	 * 	- mayor 
	 * 	- menor
	 * 8. Lectura de un número que se comprobará mediante el enum introducido por parámetro si dicho número es 
	 * 	  mayor, menor o igual que un número introducido por parámetro también
	 * 	*** utilizar sobrecarga para que las funciones se llamen igual para todos los tipos ***
	 * 		8.1. Tipo byte
	 * 		8.2. Tipo short
	 * 		8.3. Tipo int
	 * 		8.4. Tipo long
	 * 		8.5. Tipo float
	 * 		8.6. Tipo double
	 * 9. Crear un enum para indicar que un valor mínimo y máximo pueden estar:
	 * 	- ambos incluidos
	 * 	- ambos excluidos
	 * 	- el mínimo incluido y el máximo excluido
	 * 	- el mínimo excluido y el máximo incluido
	 * 10. Lectura de un número que debe estar entre un valor mínimo y un valor máximo que se pasarán como parámetros
	 * 		-> Si el valor mínimo es mayor que el valor máximo, se lanza la excepción IllegalArgumentException
	 * 		-> Ambos valores pueden ser iguales 
	 * 	*** utilizar sobrecarga para que las funciones se llamen igual para todos los tipos ***
	 * 		10.1. Tipo byte
	 * 		10.2. Tipo short
	 * 		10.3. Tipo int
	 * 		10.4. Tipo long
	 * 		10.5. Tipo float
	 * 		10.6. Tipo double
	 */

public class Keyboard {

	static Scanner keyboard = new Scanner(System.in);
	
	//1. Cerrar el teclado
	public static void closeKeyboard() {
		keyboard.close();
	}
	
	//2. Leer un carácter de tipo char  
	public static char readChar() {
		char character;
		
		System.out.print("Introduce un carácter: ");
		//charAt(0) cogerá el primer índice de lo que se haya introducido
		character = keyboard.next().charAt(0);
			
		return character;
	}
	
	//3. Leer una cadena de tipo String
	public static String readString() {
		String string;
		
		System.out.print("Introduce una cadena: ");
		//al ser un nextLine se cogerá todo lo que se introduzca, ya sean letras, números, caracteres...
		string = keyboard.nextLine();
		
		return string;
	}
	
	/*
	 * 4. Leer un boolean (1 o 2): se le pasa al usuario por parámetro tres mensajes:
	 * 		4.1. Primer parámetro: pregunta o cuestión a responder
	 * 		4.2. Segundo parámetro: 1. Respuesta 1
	 * 		4.3. Tercer parámetro: 2. Respuesta 2
	 * 	  El segundo y tercer parámetro son las respuestas que el usuario responderá según guste
	 */
	public static boolean readBoolean (String question, String answer1, String answer2) {
		boolean res;
		byte elec;
				
		do {
			System.out.printf("%s\n1. %s\n2. %s\n" , question, answer1, answer2);
			elec = keyboard.nextByte();
			//4.4. Si no introduce ni 1 ni 2, se le vuelve a pedir
			if (elec != 1 && elec != 2) {
				System.out.println("Error, tienes que introducir 1 o 2, inténtalo de nuevo");
			}
		} while (elec != 1 && elec != 2);
		/*
		 * 	4.5. Si elige la Respuesta 1, tendrá que introducir (1) y la función devolverá true
		 * 	4.6. Si elige la Respuesta 2, tendrá que introducir (2) y la función devolverá false
		 */
		return res = (elec == 1)?true:false;
	}
	
	/*
	 * 5. Lectura de un boolean (s/n): se le pasa al usuario por parámetro una pregunta que deberá responder
	 * 	  con 's', 'S', 'n' o 'N'.
	 * 	*** utilizar sobrecarga para que se llame igual que la función anterior (punto 4) ***
	 */
	
	public static boolean readBoolean (String question) {
		boolean res;
		char elec;
		
		do {
			System.out.printf("%s (s/n): " , question);
			//si se introduce en mayúscula, toLowerCase lo convertirá en minúscula
			elec = Character.toLowerCase(readChar());
			//5.1. Si introduce otra cosa, se le vuelve a pedir
			if (elec != 's' && elec != 'n') {
				System.out.println("Error, tienes que introducir 's' o 'n', inténtalo de nuevo");
			}
		} while (elec != 's' && elec != 'n');
		/*
		 * 5.2. Si responde 's' o 'S', la función devolverá true
		 * 5.3. Si responde 'n' o 'N', la función devolverá false
		 */
		return res = (elec == 's' || elec == 'S')?true:false;
	}
	
	 /* 6. Lectura de un número. Si se sale del rango del tipo o se introduce otra cosa, se le vuelve a pedir.
	 * 		6.1. Tipo byte
	 */
	public static byte readByte() {
		byte num = 0;
		boolean isValid = false;
		
		do {
			try {
				System.out.println("Introduce un número: ");
				num = keyboard.nextByte();
				isValid = true;
			} catch (InputMismatchException e) {
				System.out.println("Error, inténtalo de nuevo");
				isValid = false;
			} finally {
				keyboard.nextLine(); //Se limpia el buffer
			}
		} while (!isValid);
		
		return num;
	}
	
	//6.2. Tipo short
	public static short readShort() {
		short num = 0;
		boolean isValid = false;
		
		do {
			try {
				System.out.println("Introduce un número: ");
				num = keyboard.nextShort();
				isValid = true;
			} catch (InputMismatchException e) {
				System.out.println("Error, inténtalo de nuevo");
				isValid = false;
			} finally {
				keyboard.nextLine(); //Se limpia el buffer
			}
		} while (!isValid);
		
		return num;
	}
	
	//6.3. Tipo int
	public static int readInt() {
		int num = 0;
		boolean isValid = false;
		
		do {
			try {
				System.out.println("Introduce un número: ");
				num = keyboard.nextInt();
				isValid = true;
			} catch (InputMismatchException e) {
				System.out.println("Error, inténtalo de nuevo");
				isValid = false;
			} finally {
				keyboard.nextLine(); //Se limpia el buffer
			}
		} while (!isValid);
		
		return num;
	}
	
	//6.4. Tipo long
	public static long readLong() {
		long num = 0;
		boolean isValid = false;
		
		do {
			try {
				System.out.println("Introduce un número: ");
				num = keyboard.nextLong();
				isValid = true;
			} catch (InputMismatchException e) {
				System.out.println("Error, inténtalo de nuevo");
				isValid = false;
			} finally {
				keyboard.nextLine(); //Se limpia el buffer
			}
		} while (!isValid);
		
		return num;
	}
	
	//6.5. Tipo float
	public static float readFloat() {
		float num = 0;
		boolean isValid = false;
		
		do {
			try {
				System.out.println("Introduce un número: ");
				num = keyboard.nextFloat();
				isValid = true;
			} catch (InputMismatchException e) {
				System.out.println("Error, inténtalo de nuevo");
				isValid = false;
			} finally {
				keyboard.nextLine(); //Se limpia el buffer
			}
		} while (!isValid);
		
		return num;
	}
	
	//6.6. Tipo double
	public static double readDouble() {
		double num = 0;
		boolean isValid = false;
		
		do {
			try {
				System.out.println("Introduce un número: ");
				num = keyboard.nextDouble();
				isValid = true;
			} catch (InputMismatchException e) {
				System.out.println("Error, inténtalo de nuevo");
				isValid = false;
			} finally {
				keyboard.nextLine(); //Se limpia el buffer
			}
		} while (!isValid);
		
		return num;
	}
	
	/*
	 * 7. Crear un enum para indicar que un número puede ser:
	 * 	- mayor o igual
	 * 	- menor o igual
	 * 	- mayor 
	 * 	- menor
	 */
	public static enum Comparation {
		GREATER_OR_EQUAL, MINOR_OR_EQUAL, GREATER, MINOR
	}
	
	/*
	 * 8. Lectura de un número que se comprobará mediante el enum introducido por parámetro si dicho número es 
	 * 	  mayor, menor o igual que un número introducido por parámetro también
	 * 	*** utilizar sobrecarga para que las funciones se llamen igual para todos los tipos ***
	 * 		8.1. Tipo byte
	 */
	public static byte readComparation(byte num, Comparation comparation) {
		byte res;
		boolean isValid = false;
		
		do {
			System.out.printf("Introduce un número %s que %d: " , comparation, num);
			res = keyboard.nextByte();
			
			switch (comparation) {
			case GREATER_OR_EQUAL:
				if (res >= num) {
					isValid = true;
				} else {
					System.out.printf("%d no es mayor o igual que %d, inténtalo de nuevo\n" , res, num);
					isValid = false;
				}
				break;
			case MINOR_OR_EQUAL:
				if (res <= num) {
					isValid = true;
				} else {
					System.out.printf("%d no es menor o igual que %d, inténtalo de nuevo\n" , res, num);
					isValid = false;
				}
				break;
			case GREATER:
				if (res > num) {
					isValid = true;
				} else {
					System.out.printf("%d no es mayor que %d, inténtalo de nuevo\n" , res, num);
					isValid = false;
				}
				break;
			case MINOR:
				if (res < num) {
					isValid = true;
				} else {
					System.out.printf("%d no es menor que %d, inténtalo de nuevo\n" , res, num);
				}
			}
			
		} while (!isValid);
		
		return res;
	}
	
	//8.2. Tipo short
	public static short readComparation(short num, Comparation comparation) {
		short res;
		boolean isValid = false;
		
		do {
			System.out.printf("Introduce un número %s que %d: " , comparation, num);
			res = keyboard.nextShort();
			
			switch (comparation) {
			case GREATER_OR_EQUAL:
				if (res >= num) {
					isValid = true;
				} else {
					System.out.printf("%d no es mayor o igual que %d, inténtalo de nuevo\n" , res, num);
					isValid = false;
				}
				break;
			case MINOR_OR_EQUAL:
				if (res <= num) {
					isValid = true;
				} else {
					System.out.printf("%d no es menor o igual que %d, inténtalo de nuevo\n" , res, num);
					isValid = false;
				}
				break;
			case GREATER:
				if (res > num) {
					isValid = true;
				} else {
					System.out.printf("%d no es mayor que %d, inténtalo de nuevo\n" , res, num);
					isValid = false;
				}
				break;
			case MINOR:
				if (res < num) {
					isValid = true;
				} else {
					System.out.printf("%d no es menor que %d, inténtalo de nuevo\n" , res, num);
				}
			}
			
		} while (!isValid);
		
		return res;
	}
	
	//8.3. Tipo int
	public static int readComparation(int num, Comparation comparation) {
		int res;
		boolean isValid = false;
		
		do {
			System.out.printf("Introduce un número %s que %d: " , comparation, num);
			res = keyboard.nextInt();
			
			switch (comparation) {
			case GREATER_OR_EQUAL:
				if (res >= num) {
					isValid = true;
				} else {
					System.out.printf("%d no es mayor o igual que %d, inténtalo de nuevo\n" , res, num);
					isValid = false;
				}
				break;
			case MINOR_OR_EQUAL:
				if (res <= num) {
					isValid = true;
				} else {
					System.out.printf("%d no es menor o igual que %d, inténtalo de nuevo\n" , res, num);
					isValid = false;
				}
				break;
			case GREATER:
				if (res > num) {
					isValid = true;
				} else {
					System.out.printf("%d no es mayor que %d, inténtalo de nuevo\n" , res, num);
					isValid = false;
				}
				break;
			case MINOR:
				if (res < num) {
					isValid = true;
				} else {
					System.out.printf("%d no es menor que %d, inténtalo de nuevo\n" , res, num);
				}
			}
			
		} while (!isValid);
		
		return res;
	}
	
	//8.4. Tipo long
	public static long readComparation(long num, Comparation comparation) {
		long res;
		boolean isValid = false;
		
		do {
			System.out.printf("Introduce un número %s que %d: " , comparation, num);
			res = keyboard.nextLong();
			
			switch (comparation) {
			case GREATER_OR_EQUAL:
				if (res >= num) {
					isValid = true;
				} else {
					System.out.printf("%d no es mayor o igual que %d, inténtalo de nuevo\n" , res, num);
					isValid = false;
				}
				break;
			case MINOR_OR_EQUAL:
				if (res <= num) {
					isValid = true;
				} else {
					System.out.printf("%d no es menor o igual que %d, inténtalo de nuevo\n" , res, num);
					isValid = false;
				}
				break;
			case GREATER:
				if (res > num) {
					isValid = true;
				} else {
					System.out.printf("%d no es mayor que %d, inténtalo de nuevo\n" , res, num);
					isValid = false;
				}
				break;
			case MINOR:
				if (res < num) {
					isValid = true;
				} else {
					System.out.printf("%d no es menor que %d, inténtalo de nuevo\n" , res, num);
				}
			}
			
		} while (!isValid);
		
		return res;
	}
	
	//8.5. Tipo float
	public static float readComparation(float num, Comparation comparation) {
		float res;
		boolean isValid = false;
		
		do {
			System.out.printf("Introduce un número %s que %d: " , comparation, num);
			res = keyboard.nextFloat();
			
			switch (comparation) {
			case GREATER_OR_EQUAL:
				if (res >= num) {
					isValid = true;
				} else {
					System.out.printf("%d no es mayor o igual que %d, inténtalo de nuevo\n" , res, num);
					isValid = false;
				}
				break;
			case MINOR_OR_EQUAL:
				if (res <= num) {
					isValid = true;
				} else {
					System.out.printf("%d no es menor o igual que %d, inténtalo de nuevo\n" , res, num);
					isValid = false;
				}
				break;
			case GREATER:
				if (res > num) {
					isValid = true;
				} else {
					System.out.printf("%d no es mayor que %d, inténtalo de nuevo\n" , res, num);
					isValid = false;
				}
				break;
			case MINOR:
				if (res < num) {
					isValid = true;
				} else {
					System.out.printf("%d no es menor que %d, inténtalo de nuevo\n" , res, num);
				}
			}
			
		} while (!isValid);
		
		return res;
	}
	
	//8.6. Tipo double
	public static double readComparation(double num, Comparation comparation) {
		double res;
		boolean isValid = false;
		
		do {
			System.out.printf("Introduce un número %s que %d: " , comparation, num);
			res = keyboard.nextDouble();
			
			switch (comparation) {
			case GREATER_OR_EQUAL:
				if (res >= num) {
					isValid = true;
				} else {
					System.out.printf("%d no es mayor o igual que %d, inténtalo de nuevo\n" , res, num);
					isValid = false;
				}
				break;
			case MINOR_OR_EQUAL:
				if (res <= num) {
					isValid = true;
				} else {
					System.out.printf("%d no es menor o igual que %d, inténtalo de nuevo\n" , res, num);
					isValid = false;
				}
				break;
			case GREATER:
				if (res > num) {
					isValid = true;
				} else {
					System.out.printf("%d no es mayor que %d, inténtalo de nuevo\n" , res, num);
					isValid = false;
				}
				break;
			case MINOR:
				if (res < num) {
					isValid = true;
				} else {
					System.out.printf("%d no es menor que %d, inténtalo de nuevo\n" , res, num);
				}
			}
			
		} while (!isValid);
		
		return res;
	}
	
	/*
	 * 9. Crear un enum para indicar que un valor mínimo y máximo pueden estar:
	 * 	- ambos incluidos
	 * 	- ambos excluidos
	 * 	- el mínimo incluido y el máximo excluido
	 * 	- el mínimo excluido y el máximo incluido
	 */
	
	public static enum MinMaxValue {
		BOTH_INCLUDED, BOTH_EXCLUDED, MININC_MAXEXC, MINEXC_MAXINCL
	}
	
	/*
	 * 10. Lectura de un número que debe estar entre un valor mínimo y un valor máximo que se pasarán como parámetros
	 * 	-> Si el valor mínimo es mayor que el valor máximo, se lanza la excepción IllegalArgumentException
	 * 	-> Ambos valores pueden ser iguales 
	 * 	*** utilizar sobrecarga para que las funciones se llamen igual para todos los tipos ***
	 * 		10.1. Tipo byte
	 */
	
	public static byte readMinMaxValues(byte min, byte max, MinMaxValue minmaxvalue) {
		byte res;
		boolean isValid = false;
		
		if (min > max) {
			throw new IllegalArgumentException("Error, el valor mínimo tiene que ser menor que el máximo");
		}
		
		do {
			System.out.printf("Introduce un número entre los valores %d y %d sabiendo que %s: ", min, max, minmaxvalue);
			res = keyboard.nextByte();
			
			switch (minmaxvalue) {
			case BOTH_INCLUDED:
				if (res >= min && res <= max) {
					isValid = true;
				} else {
					System.out.printf("%d no está entre los límites %d y %d, ambos incluidos\n", res, min, max);
					isValid = false;
				}
				break;
			case BOTH_EXCLUDED:
				if (res > min && res < max) {
					isValid = true;
				} else {
					System.out.printf("%d no está entre los límites %d y %d, ambos excluidos\n", res, min, max);
				}
				break;
			case MINEXC_MAXINCL:
				if (res > min && res <= max) {
					isValid = true;
				} else {
					System.out.printf("%d no está entre los límites %d y %d, %d excluido y %d incluido", res, min, max, min, max);
					isValid = false;
				}
				break;
			case MININC_MAXEXC:
				if (res >= min && res < max) {
					isValid = true;
				} else {
					System.out.printf("%d no está entre los límites %d y %d, %d incluido y %d excluido", res, min, max, min, max);
					isValid = false;
				}
				break;
			}
		} while (!isValid);
		
		return res;
	}
	
	//10.2. Tipo short
	public static short readMinMaxValues(short min, short max, MinMaxValue minmaxvalue) {
		short res;
		boolean isValid = false;
		
		if (min > max) {
			throw new IllegalArgumentException("Error, el valor mínimo tiene que ser menor que el máximo");
		}
		
		do {
			System.out.printf("Introduce un número entre los valores %d y %d sabiendo que %s: ", min, max, minmaxvalue);
			res = keyboard.nextShort();
			
			switch (minmaxvalue) {
			case BOTH_INCLUDED:
				if (res >= min && res <= max) {
					isValid = true;
				} else {
					System.out.printf("%d no está entre los límites %d y %d, ambos incluidos\n", res, min, max);
					isValid = false;
				}
				break;
			case BOTH_EXCLUDED:
				if (res > min && res < max) {
					isValid = true;
				} else {
					System.out.printf("%d no está entre los límites %d y %d, ambos excluidos\n", res, min, max);
				}
				break;
			case MINEXC_MAXINCL:
				if (res > min && res <= max) {
					isValid = true;
				} else {
					System.out.printf("%d no está entre los límites %d y %d, %d excluido y %d incluido", res, min, max, min, max);
					isValid = false;
				}
				break;
			case MININC_MAXEXC:
				if (res >= min && res < max) {
					isValid = true;
				} else {
					System.out.printf("%d no está entre los límites %d y %d, %d incluido y %d excluido", res, min, max, min, max);
					isValid = false;
				}
				break;
			}
		} while (!isValid);
		
		return res;
	}
	
	//10.3. Tipo int
	public static int readMinMaxValues(int min, int max, MinMaxValue minmaxvalue) {
		int res;
		boolean isValid = false;
		
		if (min > max) {
			throw new IllegalArgumentException("Error, el valor mínimo tiene que ser menor que el máximo");
		}
		
		do {
			System.out.printf("Introduce un número entre los valores %d y %d sabiendo que %s: ", min, max, minmaxvalue);
			res = keyboard.nextInt();
			
			switch (minmaxvalue) {
			case BOTH_INCLUDED:
				if (res >= min && res <= max) {
					isValid = true;
				} else {
					System.out.printf("%d no está entre los límites %d y %d, ambos incluidos\n", res, min, max);
					isValid = false;
				}
				break;
			case BOTH_EXCLUDED:
				if (res > min && res < max) {
					isValid = true;
				} else {
					System.out.printf("%d no está entre los límites %d y %d, ambos excluidos\n", res, min, max);
				}
				break;
			case MINEXC_MAXINCL:
				if (res > min && res <= max) {
					isValid = true;
				} else {
					System.out.printf("%d no está entre los límites %d y %d, %d excluido y %d incluido", res, min, max, min, max);
					isValid = false;
				}
				break;
			case MININC_MAXEXC:
				if (res >= min && res < max) {
					isValid = true;
				} else {
					System.out.printf("%d no está entre los límites %d y %d, %d incluido y %d excluido", res, min, max, min, max);
					isValid = false;
				}
				break;
			}
		} while (!isValid);
		
		return res;
	}
	
	//10.4. Tipo long
	public static long readMinMaxValues(long min, long max, MinMaxValue minmaxvalue) {
		long res;
		boolean isValid = false;
		
		if (min > max) {
			throw new IllegalArgumentException("Error, el valor mínimo tiene que ser menor que el máximo");
		}
		
		do {
			System.out.printf("Introduce un número entre los valores %d y %d sabiendo que %s: ", min, max, minmaxvalue);
			res = keyboard.nextLong();
			
			switch (minmaxvalue) {
			case BOTH_INCLUDED:
				if (res >= min && res <= max) {
					isValid = true;
				} else {
					System.out.printf("%d no está entre los límites %d y %d, ambos incluidos\n", res, min, max);
					isValid = false;
				}
				break;
			case BOTH_EXCLUDED:
				if (res > min && res < max) {
					isValid = true;
				} else {
					System.out.printf("%d no está entre los límites %d y %d, ambos excluidos\n", res, min, max);
				}
				break;
			case MINEXC_MAXINCL:
				if (res > min && res <= max) {
					isValid = true;
				} else {
					System.out.printf("%d no está entre los límites %d y %d, %d excluido y %d incluido", res, min, max, min, max);
					isValid = false;
				}
				break;
			case MININC_MAXEXC:
				if (res >= min && res < max) {
					isValid = true;
				} else {
					System.out.printf("%d no está entre los límites %d y %d, %d incluido y %d excluido", res, min, max, min, max);
					isValid = false;
				}
				break;
			}
		} while (!isValid);
		
		return res;
	}
	
	//10.5. Tipo float
	public static float readMinMaxValues(float min, float max, MinMaxValue minmaxvalue) {
		float res;
		boolean isValid = false;
		
		if (min > max) {
			throw new IllegalArgumentException("Error, el valor mínimo tiene que ser menor que el máximo");
		}
		
		do {
			System.out.printf("Introduce un número entre los valores %d y %d sabiendo que %s: ", min, max, minmaxvalue);
			res = keyboard.nextFloat();
			
			switch (minmaxvalue) {
			case BOTH_INCLUDED:
				if (res >= min && res <= max) {
					isValid = true;
				} else {
					System.out.printf("%d no está entre los límites %d y %d, ambos incluidos\n", res, min, max);
					isValid = false;
				}
				break;
			case BOTH_EXCLUDED:
				if (res > min && res < max) {
					isValid = true;
				} else {
					System.out.printf("%d no está entre los límites %d y %d, ambos excluidos\n", res, min, max);
				}
				break;
			case MINEXC_MAXINCL:
				if (res > min && res <= max) {
					isValid = true;
				} else {
					System.out.printf("%d no está entre los límites %d y %d, %d excluido y %d incluido", res, min, max, min, max);
					isValid = false;
				}
				break;
			case MININC_MAXEXC:
				if (res >= min && res < max) {
					isValid = true;
				} else {
					System.out.printf("%d no está entre los límites %d y %d, %d incluido y %d excluido", res, min, max, min, max);
					isValid = false;
				}
				break;
			}
		} while (!isValid);
		
		return res;
	}
	
	//10.6. Tipo double
	public static double readMinMaxValues(double min, double max, MinMaxValue minmaxvalue) {
		double res;
		boolean isValid = false;
		
		if (min > max) {
			throw new IllegalArgumentException("Error, el valor mínimo tiene que ser menor que el máximo");
		}
		
		do {
			System.out.printf("Introduce un número entre los valores %d y %d sabiendo que %s: ", min, max, minmaxvalue);
			res = keyboard.nextDouble();
			
			switch (minmaxvalue) {
			case BOTH_INCLUDED:
				if (res >= min && res <= max) {
					isValid = true;
				} else {
					System.out.printf("%d no está entre los límites %d y %d, ambos incluidos\n", res, min, max);
					isValid = false;
				}
				break;
			case BOTH_EXCLUDED:
				if (res > min && res < max) {
					isValid = true;
				} else {
					System.out.printf("%d no está entre los límites %d y %d, ambos excluidos\n", res, min, max);
				}
				break;
			case MINEXC_MAXINCL:
				if (res > min && res <= max) {
					isValid = true;
				} else {
					System.out.printf("%d no está entre los límites %d y %d, %d excluido y %d incluido", res, min, max, min, max);
					isValid = false;
				}
				break;
			case MININC_MAXEXC:
				if (res >= min && res < max) {
					isValid = true;
				} else {
					System.out.printf("%d no está entre los límites %d y %d, %d incluido y %d excluido", res, min, max, min, max);
					isValid = false;
				}
				break;
			}
		} while (!isValid);
		
		return res;
	}
		
}
