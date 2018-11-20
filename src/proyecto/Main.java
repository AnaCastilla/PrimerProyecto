package proyecto;

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
		System.out.println(Keyboard.readBoolean("¿Cómo te llamas?", "Ana", "Maria"));
		System.out.println(Keyboard.readBoolean("¿Estás estudiando?"));
	}

}
