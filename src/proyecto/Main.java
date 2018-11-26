package proyecto;

import proyecto.Keyboard.Comparation;
import proyecto.Keyboard.MinMaxValue;

public class Main {

	public static void main(String[] args) {

		/*
		 * En esta clase se realizarán las pruebas manuales de los métodos de la clase Keyboard con ejemplos
		 * para comprobar que hacen su función
		 */
		
		//Leer un carácter de tipo char
		//System.out.println(Keyboard.readChar());
		
		//Lectura de un boolean
		System.out.println(Keyboard.readBoolean("¿Cómo te llamas?", "Ana", "Maria"));
		/*System.out.println(Keyboard.readBoolean("¿Estás estudiando?"));
		System.out.println(Keyboard.readChar("asfsafasf"));
		System.out.println(Keyboard.readChar());*/
		//Lectura de un número
		//System.out.println(Keyboard.readByte());
		/*
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
		
		/*System.out.println(Keyboard.readComparation(7, Comparation.GREATER_OR_EQUAL));
		System.out.println(Keyboard.readComparation(100, Comparation.MINOR_OR_EQUAL));
		System.out.println(Keyboard.readComparation(9872, Comparation.GREATER));
		System.out.println(Keyboard.readComparation(72186, Comparation.MINOR));
		System.out.println(Keyboard.readComparation(7.564, Comparation.GREATER_OR_EQUAL));
		System.out.println(Keyboard.readComparation(687.6814, Comparation.MINOR));*/
		
		/*System.out.println(Keyboard.readMinMaxValues(1, 10, MinMaxValue.BOTH_EXCLUDED));
		System.out.println(Keyboard.readMinMaxValues(50, 200, MinMaxValue.MINEXC_MAXINCL));
		System.out.println(Keyboard.readMinMaxValues(489465, 9867498, MinMaxValue.MININC_MAXEXC));
		System.out.println(Keyboard.readMinMaxValues(897986, 998748, MinMaxValue.BOTH_EXCLUDED));*/
		/*System.out.println(Keyboard.readMinMaxValues(78.89, 98.65, MinMaxValue.BOTH_INCLUDED));
		System.out.println(Keyboard.readMinMaxValues(894.65, 9547.78, MinMaxValue.BOTH_INCLUDED));*/
		
	}
}
