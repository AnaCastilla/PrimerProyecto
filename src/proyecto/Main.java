package proyecto;

import proyecto.Keyboard.Comparation;
import proyecto.Keyboard.MinMaxValue;

public class Main {

	public static void main(String[] args) {

		/*
		 * En esta clase se realizarán las pruebas manuales, que se mostrarán con un menú, de los métodos 
		 * de la clase Keyboard para comprobar que hacen su función
		 */
		char character;
		boolean exit = true, choose;
		byte elec;
		
		System.out.println("PRUEBAS DEL TECLADO");
		
		do {
			menu();
			elec = Keyboard.readByte();
			
			if (elec == 1) {
				choose = Keyboard.readBoolean("¿Quieres introducir un mensaje por parámetro?");
				if (choose == true) {
					character = Keyboard.readChar("Introduce un carácter");
					System.out.println(character);
				} else {
					System.out.print("Introduce un carácter: ");
					System.out.println(Keyboard.readChar());
				}
				choose = Keyboard.readBoolean("¿Quieres probar otra cosa?", "Sí", "No");
				if (choose == true) {
					exit = false;
				} else {
					exit = true;
				}
			} else if (elec == 2) {
				System.out.println(Keyboard.readString());
				choose = Keyboard.readBoolean("¿Quieres probar otra cosa?", "Sí", "No");
				if (choose == true) {
					exit = false;
				} else {
					exit = true;
				}
			} else if (elec == 3) {
				choose = Keyboard.readBoolean("¿Qué función para leer un boolean quieres probar?", "Introducir 1 o 2", "Introducir 's' o 'n'");
				if (choose == true) {
					System.out.println(Keyboard.readBoolean("¿Estás estudiando programación?", "Sí", "No"));
				} else {
					System.out.println(Keyboard.readBoolean("¿Has hecho el proyecto?"));
				}
				choose = Keyboard.readBoolean("¿Quieres probar otra cosa?", "Sí", "No");
				if (choose == true) {
					exit = false;
				} else {
					exit = true;
				}
			}
		} while (!exit);
		
	}
	
	public static void menu() {
		System.out.println("¿Qué quieres probar?\n1. Lectura de un carácter\n2. Lectura de una cadena\n3. Lectura de un boolean"
				+ "\n4. Lectura de un número\n5. Lectura de un número con un límite\n6. Lectura de un número dentro de un rango");
	}
	
	public static void typeNumMenu() {
		System.out.println();
	}
	
}
