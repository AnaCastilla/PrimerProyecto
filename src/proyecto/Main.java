package proyecto;

import proyecto.Keyboard.Comparation;

public class Main {

	public static void main(String[] args) {

		/*
		 * En esta clase se realizarán las pruebas manuales de los métodos de la clase Keyboard con ejemplos
		 * para comprobar que hacen su función
		 */
		
		//Leer un carácter de tipo char
		//System.out.print("Introduzca un carácter: ");
		//System.out.println(Keyboard.readChar());
		
		//Lectura de un boolean
		//System.out.println(Keyboard.readBoolean("¿Cómo te llamas?", "Ana", "Maria"));
		//System.out.println(Keyboard.readBoolean("¿Estás estudiando?"));
		
		//Lectura de un número
		/*System.out.println("Número byte: ");
		System.out.println(Keyboard.readByte());
		System.out.println("Número short: ");
		System.out.println(Keyboard.readShort());
		System.out.println("Número int: ");
		System.out.println(Keyboard.readInt());
		System.out.println("Número long: ");
		System.out.println(Keyboard.readLong());
		System.out.println("Número float: ");
		System.out.println(Keyboard.readFloat());
		System.out.println("Número double: ");
		System.out.println(Keyboard.readDouble());*/
		
		System.out.println(Keyboard.readComparation(7, Comparation.GREATER_OR_EQUAL));
		System.out.println(Keyboard.readComparation(100, Comparation.MINOR_OR_EQUAL));
		System.out.println(Keyboard.readComparation(9872, Comparation.GREATER));
		System.out.println(Keyboard.readComparation(72186, Comparation.MINOR));
		System.out.println(Keyboard.readComparation(7.564, Comparation.GREATER_OR_EQUAL));
		System.out.println(Keyboard.readComparation(687.6814, Comparation.MINOR));
		
	}
}
