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
	 * 
	 * 2. Mostrar un mensaje al usuario con la petición del carácter
	 * 	2.1. El usuario introduce el carácter
	 * 	2.2. Comprobar si es un solo carácter
	 * 		2.2.1. Si es más de un carácter, informar al usuario y se lo vuelvo a pedir
	 * 		2.2.2. Si es uno, la función devuelve el carácter
	 * 
	 * 3. Mostrar un mensaje al usuario con la petición de una cadena
	 * 	3.1. El usuario introduce la cadena
	 * 	3.2. La función devuelve la cadena introducida
	 * 
	 * 4. El usuario tiene que introducir por parámetro tres mensajes:
	 * 		4.1. Primer parámetro: pregunta o cuestión a responder
	 * 		4.2. Segundo parámetro: 1. Respuesta 1
	 * 		4.3. Tercer parámetro: 2. Respuesta 2
	 * 	  El segundo y tercer parámetro son las respuestas que el usuario responderá según guste:
	 *		4.4. Si no introduce ni 1 ni 2, se le vuelve a pedir
	 * 		4.5. Si elige la Respuesta 1, tendrá que introducir (1) y la función devolverá true
	 * 		4.6. Si elige la Respuesta 2, tendrá que introducir (2) y la función devolverá false
	 * 
	 * 5. El usuario tiene que introducir por parámetro una pregunta que deberá responder
	 * 	  con 's', 'S', 'n' o 'N'.
	 * 	    5.1. Si introduce otra cosa, se le vuelve a pedir
	 * 		5.2. Si responde 's' o 'S', la función devolverá true
	 * 		5.3. Si responde 'n' o 'N', la función devolverá false
	 * 	*** utilizar sobrecarga para que se llame igual que la función anterior (punto 4) ***
	 * 
	 * -- LECTURA DE UN NÚMERO -- (este planteamiento vale para las siguientes 6 funciones)
	 * 6. Mostrar un mensaje al usuario de que introduzca un número
	 * 	6.1. El usuario introduce un número
	 * 	6.2. Si introduce otra cosa o un número no válido, se le vuelve a pedir
	 * 	6.3. Si el número es correcto, la función devuelve dicho número
	 *  
	 * Se crea un enum para indicar que un número puede ser:
	 * 	- mayor o igual
	 * 	- menor o igual
	 * 	- mayor 
	 * 	- menor
	 * 
	 * -- LECTURA DE UN NÚMERO MAYOR, MENOR O IGUAL QUE UNO INTRODUCIDO POR PARÁMETRO -- (este planteamiento vale para las siguientes 6 funciones)
	 * 	*** utilizar sobrecarga para que las funciones se llamen igual para todos los tipos ***
	 * 7. Se muestra un mensaje el cual le pide al usuario un número
	 * 	7.1. El usuario introduce un número, el cual puede ser:
	 * 		7.1.1. Mayor o igual que el número límite
	 * 			7.1.1.1. Si cumple esto, la función devuelve dicho número
	 * 			7.1.1.2. Si se introduce un número menor o que no es igual que el número límite, se le pedirá de nuevo
	 * 		7.1.2. Menor o igual que el número límite
	 *			7.1.2.1. Si cumple esto, la función devuelve dicho número
	 * 			7.1.2.2. Si se introduce un número mayor o que no es igual que el número límite, se le pedirá de nuevo
	 * 		7.1.3. Mayor que el número límite
	 * 			7.1.3.1. Si cumple esto, la función devuelve dicho número
	 * 			7.1.3.2. Si se introduce un número menor que el número límite, se le pedirá de nuevo
	 * 		7.1.4. Menor que el número límite
	 * 			7.1.4.1. Si cumple esto, la función devuelve dicho número
	 * 			7.1.4.2. Si se introduce un número mayor que el número límite, se le pedirá de nuevo
	 * 
	 * Se crea un enum para indicar que un valor mínimo y máximo pueden estar:
	 * 	- ambos incluidos
	 * 	- ambos excluidos
	 * 	- el mínimo incluido y el máximo excluido
	 * 	- el mínimo excluido y el máximo incluido
	 * 
	 * -- LECTURA DE UN NÚMERO SITUADO ENTRE UN VALOR MÍNIMO Y MÁXIMO INTRODUCIDOS POR PARÁMETRO -- (este planteamiento vale para las siguientes 6 funciones)
	 * 8. Lectura de un número que debe estar entre un valor mínimo y un valor máximo que se pasarán como parámetros
	 * 		-> Si el valor mínimo es mayor que el valor máximo, se lanza la excepción IllegalArgumentException
	 * 		-> Ambos valores pueden ser iguales 
	 * 	*** utilizar sobrecarga para que las funciones se llamen igual para todos los tipos ***
	 */

public class Keyboard {

	static Scanner keyboard = new Scanner(System.in);
	
	//1. Cerrar el teclado
	public static void closeKeyboard() {
		keyboard.close();
	}
	
	/*
	 * 2. Mostrar un mensaje al usuario con la petición del carácter
	 * 	2.1. El usuario introduce el carácter
	 * 	2.2. Comprobar si es un solo carácter
	 * 		2.2.1. Si es más de un carácter, informar al usuario y se lo vuelvo a pedir
	 * 		2.2.2. Si es uno, la función devuelve el carácter 
	 */
	public static char readChar() {
		String char1;
		char char2;
		boolean exit = true;
		
		do {
			//2. Mostrar un mensaje al usuario con la petición del carácter
			System.out.print("Introduce un carácter: ");
			//2.1. El usuario introduce el carácter
			//char1 es String porque uso esa variable para usar el método length para comprobar si se ha introducido más de un carácter
			//y en char2 se guardará el primer carácter de char1 con el método charAt
			char1 = keyboard.next();
			char2 = char1.charAt(0);
			exit = true;
			//2.2. Comprobar si es un solo carácter
			if (char1.length() > 1) {
				//2.2.1. Si es más de un carácter, informar al usuario y se lo vuelvo a pedir
				System.out.println("Has introducido más de un carácter, inténtalo de nuevo");
				exit = false;
				keyboard.nextLine();
			} 
		} while (!exit);
		
		//2.2.2. Si es uno, la función devuelve el carácter 
		return char2;
	}
	
	/*
	 * 3. Mostrar un mensaje al usuario con la petición de una cadena
	 * 	3.1. El usuario introduce la cadena
	 * 	3.2. La función devuelve la cadena introducida
	 */
	public static String readString() {
		String string;
		
		//3. Mostrar un mensaje al usuario con la petición de una cadena
		System.out.print("Introduce una cadena: ");
		//3.1. El usuario introduce la cadena
		//al ser un nextLine se cogerá todo lo que se introduzca, ya sean letras, números, caracteres...
		string = keyboard.nextLine();
		
		//3.2. La función devuelve la cadena introducida
		return string;
	}
	
	/*
	 * 4. El usuario tiene que introducir por parámetro tres mensajes:
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
	 * 5. El usuario tiene que introducir por parámetro una pregunta que deberá responder con 's', 'S', 'n' o 'N'.
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
	
	/*
	 * 	 -- LECTURA DE UN NÚMERO -- (este planteamiento vale para las siguientes 6 funciones)
	 * 6. Mostrar un mensaje al usuario de que introduzca un número
	 * 	6.1. El usuario introduce un número
	 * 	6.2. Si introduce otra cosa o un número no válido, se le vuelve a pedir
	 * 	6.3. Si el número es correcto, la función devuelve dicho número
	 */
	public static byte readByte() {
		byte num = 0;
		boolean isValid = false;
		
		do {
			try {
				//6. Mostrar un mensaje al usuario de que introduzca un número
				System.out.println("Introduce un número: ");
				//6.1. El usuario introduce un número
				num = keyboard.nextByte();
				isValid = true;
			//6.2. Si introduce otra cosa o un número no válido, se le vuelve a pedir
			} catch (InputMismatchException e) {
				System.out.println("Error, inténtalo de nuevo");
				isValid = false;
			} finally {
				keyboard.nextLine(); //Se limpia el buffer
			}
		} while (!isValid);
		
		//6.3. Si el número es correcto, la función devuelve dicho número
		return num;
	}
	
	public static short readShort() {
		short num = 0;
		boolean isValid = false;
		
		do {
			try {
				//6. Mostrar un mensaje al usuario de que introduzca un número
				System.out.println("Introduce un número: ");
				//6.1. El usuario introduce un número
				num = keyboard.nextShort();
				isValid = true;
			//6.2. Si introduce otra cosa o un número no válido, se le vuelve a pedir
			} catch (InputMismatchException e) {
				System.out.println("Error, inténtalo de nuevo");
				isValid = false;
			} finally {
				keyboard.nextLine(); //Se limpia el buffer
			}
		} while (!isValid);
		
		//6.3. Si el número es correcto, la función devuelve dicho número
		return num;
	}

	public static int readInt() {
		int num = 0;
		boolean isValid = false;
		
		do {
			try {
				//6. Mostrar un mensaje al usuario de que introduzca un número
				System.out.println("Introduce un número: ");
				//6.1. El usuario introduce un número
				num = keyboard.nextInt();
				isValid = true;
			//6.2. Si introduce otra cosa o un número no válido, se le vuelve a pedir
			} catch (InputMismatchException e) {
				System.out.println("Error, inténtalo de nuevo");
				isValid = false;
			} finally {
				keyboard.nextLine(); //Se limpia el buffer
			}
		} while (!isValid);
		
		//6.3. Si el número es correcto, la función devuelve dicho número
		return num;
	}
	
	public static long readLong() {
		long num = 0;
		boolean isValid = false;
		
		do {
			try {
				//6. Mostrar un mensaje al usuario de que introduzca un número
				System.out.println("Introduce un número: ");
				//6.1. El usuario introduce un número
				num = keyboard.nextLong();
				isValid = true;
			//6.2. Si introduce otra cosa o un número no válido, se le vuelve a pedir
			} catch (InputMismatchException e) {
				System.out.println("Error, inténtalo de nuevo");
				isValid = false;
			} finally {
				keyboard.nextLine(); //Se limpia el buffer
			}
		} while (!isValid);
		
		//6.3. Si el número es correcto, la función devuelve dicho número
		return num;
	}
	
	public static float readFloat() {
		float num = 0;
		boolean isValid = false;
		
		do {
			try {
				//6. Mostrar un mensaje al usuario de que introduzca un número
				System.out.println("Introduce un número: ");
				//6.1. El usuario introduce un número
				num = keyboard.nextFloat();
				isValid = true;
			//6.2. Si introduce otra cosa o un número no válido, se le vuelve a pedir
			} catch (InputMismatchException e) {
				System.out.println("Error, inténtalo de nuevo");
				isValid = false;
			} finally {
				keyboard.nextLine(); //Se limpia el buffer
			}
		} while (!isValid);
		
		//6.3. Si el número es correcto, la función devuelve dicho número
		return num;
	}
	
	public static double readDouble() {
		double num = 0;
		boolean isValid = false;
		
		do {
			try {
				//6. Mostrar un mensaje al usuario de que introduzca un número
				System.out.println("Introduce un número: ");
				//6.1. El usuario introduce un número
				num = keyboard.nextDouble();
				isValid = true;
			//6.2. Si introduce otra cosa o un número no válido, se le vuelve a pedir
			} catch (InputMismatchException e) {
				System.out.println("Error, inténtalo de nuevo");
				isValid = false;
			} finally {
				keyboard.nextLine(); //Se limpia el buffer
			}
		} while (!isValid);
		
		//6.3. Si el número es correcto, la función devuelve dicho número
		return num;
	}
	
	/*
	 * Se crea un enum para indicar que un número puede ser:
	 * 	- mayor o igual
	 * 	- menor o igual
	 * 	- mayor 
	 * 	- menor
	 */
	public static enum Comparation {
		GREATER_OR_EQUAL, MINOR_OR_EQUAL, GREATER, MINOR
	}
	
	/*
	 * -- LECTURA DE UN NÚMERO MAYOR, MENOR O IGUAL QUE UNO INTRODUCIDO POR PARÁMETRO -- (este planteamiento vale para las siguientes 6 funciones)
	 * 	*** utilizar sobrecarga para que las funciones se llamen igual para todos los tipos ***
	 * 7. Se muestra un mensaje el cual le pide al usuario un número
	 * 	7.1. El usuario introduce un número, el cual puede ser:
	 * 		7.1.1. Mayor o igual que el número límite
	 * 			7.1.1.1. Si cumple esto, la función devuelve dicho número
	 * 			7.1.1.2. Si se introduce un número menor o que no es igual que el número límite, se le pedirá de nuevo
	 * 		7.1.2. Menor o igual que el número límite
	 *			7.1.2.1. Si cumple esto, la función devuelve dicho número
	 * 			7.1.2.2. Si se introduce un número mayor o que no es igual que el número límite, se le pedirá de nuevo
	 * 		7.1.3. Mayor que el número límite
	 * 			7.1.3.1. Si cumple esto, la función devuelve dicho número
	 * 			7.1.3.2. Si se introduce un número menor que el número límite, se le pedirá de nuevo
	 * 		7.1.4. Menor que el número límite
	 * 			7.1.4.1. Si cumple esto, la función devuelve dicho número
	 * 			7.1.4.2. Si se introduce un número mayor que el número límite, se le pedirá de nuevo
	 * 	
	 */
	public static byte readComparation(byte num, Comparation comparation) {
		byte res;
		boolean isValid = false;
		
		do {
			//7. Se muestra un mensaje el cual le pide al usuario un número
			System.out.printf("Introduce un número %s que %d: " , comparation, num);
			//7.1. El usuario introduce un número, el cual puede ser:
			res = keyboard.nextByte();
			
			switch (comparation) {
			//7.1.1. Mayor o igual que el número límite
			case GREATER_OR_EQUAL:
				//7.1.1.1. Si cumple esto, la función devuelve dicho número
				if (res >= num) {
					isValid = true; //al ser true, se sale del bucle y por lo tanto se hará el return con dicho número
				//7.1.1.2. Si se introduce un número menor o que no es igual que el número límite, se le pedirá de nuevo
				} else {
					System.out.printf("%d no es mayor o igual que %d, inténtalo de nuevo\n" , res, num);
					isValid = false;
				}
				break;
			//7.1.2. Menor o igual que el número límite
			case MINOR_OR_EQUAL:
				//7.1.2.1. Si cumple esto, la función devuelve dicho número
				if (res <= num) {
					isValid = true;
				//7.1.2.2. Si se introduce un número mayor o que no es igual que el número límite, se le pedirá de nuevo
				} else {
					System.out.printf("%d no es menor o igual que %d, inténtalo de nuevo\n" , res, num);
					isValid = false;
				}
				break;
			//7.1.3. Mayor que el número límite
			case GREATER:
				//7.1.3.1. Si cumple esto, la función devuelve dicho número
				if (res > num) {
					isValid = true;
				//7.1.3.2. Si se introduce un número menor que el número límite, se le pedirá de nuevo
				} else {
					System.out.printf("%d no es mayor que %d, inténtalo de nuevo\n" , res, num);
					isValid = false;
				}
				break;
			//7.1.4. Menor que el número límite
			case MINOR:
				//7.1.4.1. Si cumple esto, la función devuelve dicho número
				if (res < num) {
					isValid = true;
				//7.1.4.2. Si se introduce un número mayor que el número límite, se le pedirá de nuevo
				} else {
					System.out.printf("%d no es menor que %d, inténtalo de nuevo\n" , res, num);
				}
			}
			
		} while (!isValid);
		
		return res;
	}
	
	public static short readComparation(short num, Comparation comparation) {
		short res;
		boolean isValid = false;
		
		do {
			//7. Se muestra un mensaje el cual le pide al usuario un número
			System.out.printf("Introduce un número %s que %d: " , comparation, num);
			//7.1. El usuario introduce un número, el cual puede ser:
			res = keyboard.nextShort();
			
			switch (comparation) {
			//7.1.1. Mayor o igual que el número límite
			case GREATER_OR_EQUAL:
				//7.1.1.1. Si cumple esto, la función devuelve dicho número
				if (res >= num) {
					isValid = true; //al ser true, se sale del bucle y por lo tanto se hará el return con dicho número
				//7.1.1.2. Si se introduce un número menor o que no es igual que el número límite, se le pedirá de nuevo
				} else {
					System.out.printf("%d no es mayor o igual que %d, inténtalo de nuevo\n" , res, num);
					isValid = false;
				}
				break;
			//7.1.2. Menor o igual que el número límite
			case MINOR_OR_EQUAL:
				//7.1.2.1. Si cumple esto, la función devuelve dicho número
				if (res <= num) {
					isValid = true;
				//7.1.2.2. Si se introduce un número mayor o que no es igual que el número límite, se le pedirá de nuevo
				} else {
					System.out.printf("%d no es menor o igual que %d, inténtalo de nuevo\n" , res, num);
					isValid = false;
				}
				break;
			//7.1.3. Mayor que el número límite
			case GREATER:
				//7.1.3.1. Si cumple esto, la función devuelve dicho número
				if (res > num) {
					isValid = true;
				//7.1.3.2. Si se introduce un número menor que el número límite, se le pedirá de nuevo
				} else {
					System.out.printf("%d no es mayor que %d, inténtalo de nuevo\n" , res, num);
					isValid = false;
				}
				break;
			//7.1.4. Menor que el número límite
			case MINOR:
				//7.1.4.1. Si cumple esto, la función devuelve dicho número
				if (res < num) {
					isValid = true;
				//7.1.4.2. Si se introduce un número mayor que el número límite, se le pedirá de nuevo
				} else {
					System.out.printf("%d no es menor que %d, inténtalo de nuevo\n" , res, num);
				}
			}
			
		} while (!isValid);
		
		return res;
	}

	public static int readComparation(int num, Comparation comparation) {
		int res;
		boolean isValid = false;
		
		do {
			//7. Se muestra un mensaje el cual le pide al usuario un número
			System.out.printf("Introduce un número %s que %d: " , comparation, num);
			//7.1. El usuario introduce un número, el cual puede ser:
			res = keyboard.nextInt();
			
			switch (comparation) {
			//7.1.1. Mayor o igual que el número límite
			case GREATER_OR_EQUAL:
				//7.1.1.1. Si cumple esto, la función devuelve dicho número
				if (res >= num) {
					isValid = true; //al ser true, se sale del bucle y por lo tanto se hará el return con dicho número
				//7.1.1.2. Si se introduce un número menor o que no es igual que el número límite, se le pedirá de nuevo
				} else {
					System.out.printf("%d no es mayor o igual que %d, inténtalo de nuevo\n" , res, num);
					isValid = false;
				}
				break;
			//7.1.2. Menor o igual que el número límite
			case MINOR_OR_EQUAL:
				//7.1.2.1. Si cumple esto, la función devuelve dicho número
				if (res <= num) {
					isValid = true;
				//7.1.2.2. Si se introduce un número mayor o que no es igual que el número límite, se le pedirá de nuevo
				} else {
					System.out.printf("%d no es menor o igual que %d, inténtalo de nuevo\n" , res, num);
					isValid = false;
				}
				break;
			//7.1.3. Mayor que el número límite
			case GREATER:
				//7.1.3.1. Si cumple esto, la función devuelve dicho número
				if (res > num) {
					isValid = true;
				//7.1.3.2. Si se introduce un número menor que el número límite, se le pedirá de nuevo
				} else {
					System.out.printf("%d no es mayor que %d, inténtalo de nuevo\n" , res, num);
					isValid = false;
				}
				break;
			//7.1.4. Menor que el número límite
			case MINOR:
				//7.1.4.1. Si cumple esto, la función devuelve dicho número
				if (res < num) {
					isValid = true;
				//7.1.4.2. Si se introduce un número mayor que el número límite, se le pedirá de nuevo
				} else {
					System.out.printf("%d no es menor que %d, inténtalo de nuevo\n" , res, num);
				}
			}
			
		} while (!isValid);
		
		return res;
	}

	public static long readComparation(long num, Comparation comparation) {
		long res;
		boolean isValid = false;
		
		do {
			//7. Se muestra un mensaje el cual le pide al usuario un número
			System.out.printf("Introduce un número %s que %d: " , comparation, num);
			//7.1. El usuario introduce un número, el cual puede ser:
			res = keyboard.nextLong();
			
			switch (comparation) {
			//7.1.1. Mayor o igual que el número límite
			case GREATER_OR_EQUAL:
				//7.1.1.1. Si cumple esto, la función devuelve dicho número
				if (res >= num) {
					isValid = true; //al ser true, se sale del bucle y por lo tanto se hará el return con dicho número
				//7.1.1.2. Si se introduce un número menor o que no es igual que el número límite, se le pedirá de nuevo
				} else {
					System.out.printf("%d no es mayor o igual que %d, inténtalo de nuevo\n" , res, num);
					isValid = false;
				}
				break;
			//7.1.2. Menor o igual que el número límite
			case MINOR_OR_EQUAL:
				//7.1.2.1. Si cumple esto, la función devuelve dicho número
				if (res <= num) {
					isValid = true;
				//7.1.2.2. Si se introduce un número mayor o que no es igual que el número límite, se le pedirá de nuevo
				} else {
					System.out.printf("%d no es menor o igual que %d, inténtalo de nuevo\n" , res, num);
					isValid = false;
				}
				break;
			//7.1.3. Mayor que el número límite
			case GREATER:
				//7.1.3.1. Si cumple esto, la función devuelve dicho número
				if (res > num) {
					isValid = true;
				//7.1.3.2. Si se introduce un número menor que el número límite, se le pedirá de nuevo
				} else {
					System.out.printf("%d no es mayor que %d, inténtalo de nuevo\n" , res, num);
					isValid = false;
				}
				break;
			//7.1.4. Menor que el número límite
			case MINOR:
				//7.1.4.1. Si cumple esto, la función devuelve dicho número
				if (res < num) {
					isValid = true;
				//7.1.4.2. Si se introduce un número mayor que el número límite, se le pedirá de nuevo
				} else {
					System.out.printf("%d no es menor que %d, inténtalo de nuevo\n" , res, num);
				}
			}
			
		} while (!isValid);
		
		return res;
	}
	
	public static float readComparation(float num, Comparation comparation) {
		float res;
		boolean isValid = false;
		
		do {
			//7. Se muestra un mensaje el cual le pide al usuario un número
			System.out.printf("Introduce un número %s que %d: " , comparation, num);
			//7.1. El usuario introduce un número, el cual puede ser:
			res = keyboard.nextFloat();
			
			switch (comparation) {
			//7.1.1. Mayor o igual que el número límite
			case GREATER_OR_EQUAL:
				//7.1.1.1. Si cumple esto, la función devuelve dicho número
				if (res >= num) {
					isValid = true; //al ser true, se sale del bucle y por lo tanto se hará el return con dicho número
				//7.1.1.2. Si se introduce un número menor o que no es igual que el número límite, se le pedirá de nuevo
				} else {
					System.out.printf("%d no es mayor o igual que %d, inténtalo de nuevo\n" , res, num);
					isValid = false;
				}
				break;
			//7.1.2. Menor o igual que el número límite
			case MINOR_OR_EQUAL:
				//7.1.2.1. Si cumple esto, la función devuelve dicho número
				if (res <= num) {
					isValid = true;
				//7.1.2.2. Si se introduce un número mayor o que no es igual que el número límite, se le pedirá de nuevo
				} else {
					System.out.printf("%d no es menor o igual que %d, inténtalo de nuevo\n" , res, num);
					isValid = false;
				}
				break;
			//7.1.3. Mayor que el número límite
			case GREATER:
				//7.1.3.1. Si cumple esto, la función devuelve dicho número
				if (res > num) {
					isValid = true;
				//7.1.3.2. Si se introduce un número menor que el número límite, se le pedirá de nuevo
				} else {
					System.out.printf("%d no es mayor que %d, inténtalo de nuevo\n" , res, num);
					isValid = false;
				}
				break;
			//7.1.4. Menor que el número límite
			case MINOR:
				//7.1.4.1. Si cumple esto, la función devuelve dicho número
				if (res < num) {
					isValid = true;
				//7.1.4.2. Si se introduce un número mayor que el número límite, se le pedirá de nuevo
				} else {
					System.out.printf("%d no es menor que %d, inténtalo de nuevo\n" , res, num);
				}
			}
			
		} while (!isValid);
		
		return res;
	}
	
	public static double readComparation(double num, Comparation comparation) {
		double res;
		boolean isValid = false;
		
		do {
			//7. Se muestra un mensaje el cual le pide al usuario un número
			System.out.printf("Introduce un número %s que %d: " , comparation, num);
			//7.1. El usuario introduce un número, el cual puede ser:
			res = keyboard.nextDouble();
			
			switch (comparation) {
			//7.1.1. Mayor o igual que el número límite
			case GREATER_OR_EQUAL:
				//7.1.1.1. Si cumple esto, la función devuelve dicho número
				if (res >= num) {
					isValid = true; //al ser true, se sale del bucle y por lo tanto se hará el return con dicho número
				//7.1.1.2. Si se introduce un número menor o que no es igual que el número límite, se le pedirá de nuevo
				} else {
					System.out.printf("%d no es mayor o igual que %d, inténtalo de nuevo\n" , res, num);
					isValid = false;
				}
				break;
			//7.1.2. Menor o igual que el número límite
			case MINOR_OR_EQUAL:
				//7.1.2.1. Si cumple esto, la función devuelve dicho número
				if (res <= num) {
					isValid = true;
				//7.1.2.2. Si se introduce un número mayor o que no es igual que el número límite, se le pedirá de nuevo
				} else {
					System.out.printf("%d no es menor o igual que %d, inténtalo de nuevo\n" , res, num);
					isValid = false;
				}
				break;
			//7.1.3. Mayor que el número límite
			case GREATER:
				//7.1.3.1. Si cumple esto, la función devuelve dicho número
				if (res > num) {
					isValid = true;
				//7.1.3.2. Si se introduce un número menor que el número límite, se le pedirá de nuevo
				} else {
					System.out.printf("%d no es mayor que %d, inténtalo de nuevo\n" , res, num);
					isValid = false;
				}
				break;
			//7.1.4. Menor que el número límite
			case MINOR:
				//7.1.4.1. Si cumple esto, la función devuelve dicho número
				if (res < num) {
					isValid = true;
				//7.1.4.2. Si se introduce un número mayor que el número límite, se le pedirá de nuevo
				} else {
					System.out.printf("%d no es menor que %d, inténtalo de nuevo\n" , res, num);
				}
			}
			
		} while (!isValid);
		
		return res;
	}
	
	/*
	 * Se crea un enum para indicar que un valor mínimo y máximo pueden estar:
	 * 	- ambos incluidos
	 * 	- ambos excluidos
	 * 	- el mínimo incluido y el máximo excluido
	 * 	- el mínimo excluido y el máximo incluido
	 */
	
	public static enum MinMaxValue {
		BOTH_INCLUDED, BOTH_EXCLUDED, MININC_MAXEXC, MINEXC_MAXINCL
	}
	
	/*
	 *  Lectura de un número que debe estar entre un valor mínimo y un valor máximo que se pasarán como parámetros
	 * 	-> Si el valor mínimo es mayor que el valor máximo, se lanza la excepción IllegalArgumentException
	 * 	-> Ambos valores pueden ser iguales 
	 * 	*** utilizar sobrecarga para que las funciones se llamen igual para todos los tipos ***
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
					System.out.printf("%d no está entre los límites %d y %d, %d excluido y %d incluido\n", res, min, max, min, max);
					isValid = false;
				}
				break;
			case MININC_MAXEXC:
				if (res >= min && res < max) {
					isValid = true;
				} else {
					System.out.printf("%d no está entre los límites %d y %d, %d incluido y %d excluido\n", res, min, max, min, max);
					isValid = false;
				}
				break;
			}
		} while (!isValid);
		
		return res;
	}
	
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
					System.out.printf("%d no está entre los límites %d y %d, %d excluido y %d incluido\n", res, min, max, min, max);
					isValid = false;
				}
				break;
			case MININC_MAXEXC:
				if (res >= min && res < max) {
					isValid = true;
				} else {
					System.out.printf("%d no está entre los límites %d y %d, %d incluido y %d excluido\n", res, min, max, min, max);
					isValid = false;
				}
				break;
			}
		} while (!isValid);
		
		return res;
	}
	
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
					System.out.printf("%d no está entre los límites %d y %d, %d excluido y %d incluido\n", res, min, max, min, max);
					isValid = false;
				}
				break;
			case MININC_MAXEXC:
				if (res >= min && res < max) {
					isValid = true;
				} else {
					System.out.printf("%d no está entre los límites %d y %d, %d incluido y %d excluido\n", res, min, max, min, max);
					isValid = false;
				}
				break;
			}
		} while (!isValid);
		
		return res;
	}
	
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
					System.out.printf("%d no está entre los límites %d y %d, %d excluido y %d incluido\n", res, min, max, min, max);
					isValid = false;
				}
				break;
			case MININC_MAXEXC:
				if (res >= min && res < max) {
					isValid = true;
				} else {
					System.out.printf("%d no está entre los límites %d y %d, %d incluido y %d excluido\n", res, min, max, min, max);
					isValid = false;
				}
				break;
			}
		} while (!isValid);
		
		return res;
	}
	
	public static float readMinMaxValues(float min, float max, MinMaxValue minmaxvalue) {
		float res;
		boolean isValid = false;
		
		if (min > max) {
			throw new IllegalArgumentException("Error, el valor mínimo tiene que ser menor que el máximo");
		}
		
		do {
			System.out.printf("Introduce un número entre los valores %.4f y %.4f sabiendo que %s: ", min, max, minmaxvalue);
			res = keyboard.nextFloat();
			
			switch (minmaxvalue) {
			case BOTH_INCLUDED:
				if (res >= min && res <= max) {
					isValid = true;
				} else {
					System.out.printf("%.4f no está entre los límites %.4f y %.4f, ambos incluidos\n", res, min, max);
					isValid = false;
				}
				break;
			case BOTH_EXCLUDED:
				if (res > min && res < max) {
					isValid = true;
				} else {
					System.out.printf("%.4f no está entre los límites %.4f y %.4f, ambos excluidos\n", res, min, max);
				}
				break;
			case MINEXC_MAXINCL:
				if (res > min && res <= max) {
					isValid = true;
				} else {
					System.out.printf("%.4f no está entre los límites %.4f y %.4f, %.4f excluido y %.4f incluido\n", res, min, max, min, max);
					isValid = false;
				}
				break;
			case MININC_MAXEXC:
				if (res >= min && res < max) {
					isValid = true;
				} else {
					System.out.printf("%.4f no está entre los límites %.4f y %.4f, %.4f incluido y %.4f excluido\n", res, min, max, min, max);
					isValid = false;
				}
				break;
			}
		} while (!isValid);
		
		return res;
	}
	
	public static double readMinMaxValues(double min, double max, MinMaxValue minmaxvalue) {
		double res;
		boolean isValid = false;
		
		if (min > max) {
			throw new IllegalArgumentException("Error, el valor mínimo tiene que ser menor que el máximo");
		}
		
		do {
			System.out.printf("Introduce un número entre los valores %.4f y %.4f sabiendo que %s: ", min, max, minmaxvalue);
			res = keyboard.nextDouble();
			
			switch (minmaxvalue) {
			case BOTH_INCLUDED:
				if (res >= min && res <= max) {
					isValid = true;
				} else {
					System.out.printf("%.4f no está entre los límites %.4f y %.4f, ambos incluidos\n", res, min, max);
					isValid = false;
				}
				break;
			case BOTH_EXCLUDED:
				if (res > min && res < max) {
					isValid = true;
				} else {
					System.out.printf("%.4f no está entre los límites %.4f y %.4f, ambos excluidos\n", res, min, max);
				}
				break;
			case MINEXC_MAXINCL:
				if (res > min && res <= max) {
					isValid = true;
				} else {
					System.out.printf("%.4f no está entre los límites %.4f y %.4f, %.4f excluido y %f incluido\n", res, min, max, min, max);
					isValid = false;
				}
				break;
			case MININC_MAXEXC:
				if (res >= min && res < max) {
					isValid = true;
				} else {
					System.out.printf("%.4f no está entre los límites %.4f y %.4f, %.4f incluido y %.4f excluido\n", res, min, max, min, max);
					isValid = false;
				}
				break;
			}
		} while (!isValid);
		
		return res;
	}
		
}
