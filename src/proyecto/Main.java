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
		boolean exit = true, loop = true, choose;
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
			} else if (elec == 4) {
				do {
				typeNumMenu();
				elec = Keyboard.readByte();
				if (elec != 1 && elec != 2 && elec != 3 && elec != 4 && elec != 5 && elec != 6) {
					System.out.println("Número incorrecto, elige del 1 al 6");
					loop = false;
				} else {
					if (elec == 1) {
						System.out.println(Keyboard.readByte());
					} else if (elec == 2) {
						System.out.println(Keyboard.readShort());
					} else if (elec == 3) {
						System.out.println(Keyboard.readInt());
					} else if (elec == 4) {
						System.out.println(Keyboard.readLong());
					} else if (elec == 5) {
						System.out.println(Keyboard.readFloat());
					} else if (elec == 6) {
						System.out.println(Keyboard.readDouble());
					}
					choose = Keyboard.readBoolean("¿Quieres probar otra cosa?", "Sí", "No");
					if (choose == true) {
						exit = false;
					} else {
						exit = true;
					}
				}
				} while (!loop);	
			} else if (elec == 5) {
				do {
					typeNumMenu();
					elec = Keyboard.readByte();
					if (elec != 1 && elec != 2 && elec != 3 && elec != 4 && elec != 5 && elec != 6) {
						System.out.println("Número incorrecto, elige del 1 al 6");
						loop = false;
					} else {
						if (elec == 1) {
							System.out.println(Keyboard.readComparation((byte)120, Comparation.GREATER));
							System.out.println(Keyboard.readComparation((byte)120, Comparation.GREATER_OR_EQUAL));
							System.out.println(Keyboard.readComparation((byte)120, Comparation.MINOR));
							System.out.println(Keyboard.readComparation((byte)120, Comparation.MINOR_OR_EQUAL));
						} else if (elec == 2) {
							System.out.println(Keyboard.readComparation((short)120, Comparation.GREATER));
							System.out.println(Keyboard.readComparation((short)120, Comparation.GREATER_OR_EQUAL));
							System.out.println(Keyboard.readComparation((short)120, Comparation.MINOR));
							System.out.println(Keyboard.readComparation((short)120, Comparation.MINOR_OR_EQUAL));
						} else if (elec == 3) {
							System.out.println(Keyboard.readComparation((int)120, Comparation.GREATER));
							System.out.println(Keyboard.readComparation((int)120, Comparation.GREATER_OR_EQUAL));
							System.out.println(Keyboard.readComparation((int)120, Comparation.MINOR));
							System.out.println(Keyboard.readComparation((int)120, Comparation.MINOR_OR_EQUAL));
						} else if (elec == 4) {
							System.out.println(Keyboard.readComparation((long)120, Comparation.GREATER));
							System.out.println(Keyboard.readComparation((long)120, Comparation.GREATER_OR_EQUAL));
							System.out.println(Keyboard.readComparation((long)120, Comparation.MINOR));
							System.out.println(Keyboard.readComparation((long)120, Comparation.MINOR_OR_EQUAL));
						} else if (elec == 5) {
							System.out.println(Keyboard.readComparation((float)120, Comparation.GREATER));
							System.out.println(Keyboard.readComparation((float)120, Comparation.GREATER_OR_EQUAL));
							System.out.println(Keyboard.readComparation((float)120, Comparation.MINOR));
							System.out.println(Keyboard.readComparation((float)120, Comparation.MINOR_OR_EQUAL));
						} else if (elec == 6) {
							System.out.println(Keyboard.readComparation((double)120, Comparation.GREATER));
							System.out.println(Keyboard.readComparation((double)120, Comparation.GREATER_OR_EQUAL));
							System.out.println(Keyboard.readComparation((double)120, Comparation.MINOR));
							System.out.println(Keyboard.readComparation((double)120, Comparation.MINOR_OR_EQUAL));
						}
						choose = Keyboard.readBoolean("¿Quieres probar otra cosa?", "Sí", "No");
						if (choose == true) {
							exit = false;
						} else {
							exit = true;
						}	
					}
				} while (!loop);	
			} else if (elec == 6) {
				do {
					typeNumMenu();
					elec = Keyboard.readByte();
					if (elec != 1 && elec != 2 && elec != 3 && elec != 4 && elec != 5 && elec != 6) {
						System.out.println("Número incorrecto, elige del 1 al 6");
						loop = false;
					} else {
						if (elec == 1) {
							System.out.println(Keyboard.readMinMaxValues((byte)50, (byte)100, MinMaxValue.BOTH_EXCLUDED));
							System.out.println(Keyboard.readMinMaxValues((byte)50, (byte)100, MinMaxValue.BOTH_INCLUDED));
							System.out.println(Keyboard.readMinMaxValues((byte)50, (byte)100, MinMaxValue.MINEXC_MAXINCL));
							System.out.println(Keyboard.readMinMaxValues((byte)50, (byte)100, MinMaxValue.MININC_MAXEXC));
						} else if (elec == 2) {
							System.out.println(Keyboard.readMinMaxValues((short)50, (short)100, MinMaxValue.BOTH_EXCLUDED));
							System.out.println(Keyboard.readMinMaxValues((short)50, (short)100, MinMaxValue.BOTH_INCLUDED));
							System.out.println(Keyboard.readMinMaxValues((short)50, (short)100, MinMaxValue.MINEXC_MAXINCL));
							System.out.println(Keyboard.readMinMaxValues((short)50, (short)100, MinMaxValue.MININC_MAXEXC));
						} else if (elec == 3) {
							System.out.println(Keyboard.readMinMaxValues((int)50, (int)100, MinMaxValue.BOTH_EXCLUDED));
							System.out.println(Keyboard.readMinMaxValues((int)50, (int)100, MinMaxValue.BOTH_INCLUDED));
							System.out.println(Keyboard.readMinMaxValues((int)50, (int)100, MinMaxValue.MINEXC_MAXINCL));
							System.out.println(Keyboard.readMinMaxValues((int)50, (int)100, MinMaxValue.MININC_MAXEXC));
						} else if (elec == 4) {
							System.out.println(Keyboard.readMinMaxValues((long)50, (long)100, MinMaxValue.BOTH_EXCLUDED));
							System.out.println(Keyboard.readMinMaxValues((long)50, (long)100, MinMaxValue.BOTH_INCLUDED));
							System.out.println(Keyboard.readMinMaxValues((long)50, (long)100, MinMaxValue.MINEXC_MAXINCL));
							System.out.println(Keyboard.readMinMaxValues((long)50, (long)100, MinMaxValue.MININC_MAXEXC));
						} else if (elec == 5) {
							System.out.println(Keyboard.readMinMaxValues((float)50, (float)100, MinMaxValue.BOTH_EXCLUDED));
							System.out.println(Keyboard.readMinMaxValues((float)50, (float)100, MinMaxValue.BOTH_INCLUDED));
							System.out.println(Keyboard.readMinMaxValues((float)50, (float)100, MinMaxValue.MINEXC_MAXINCL));
							System.out.println(Keyboard.readMinMaxValues((float)50, (float)100, MinMaxValue.MININC_MAXEXC));
						} else if (elec == 6) {
							System.out.println(Keyboard.readMinMaxValues((double)50, (double)100, MinMaxValue.BOTH_EXCLUDED));
							System.out.println(Keyboard.readMinMaxValues((double)50, (double)100, MinMaxValue.BOTH_INCLUDED));
							System.out.println(Keyboard.readMinMaxValues((double)50, (double)100, MinMaxValue.MINEXC_MAXINCL));
							System.out.println(Keyboard.readMinMaxValues((double)50, (double)100, MinMaxValue.MININC_MAXEXC));
						}
						choose = Keyboard.readBoolean("¿Quieres probar otra cosa?", "Sí", "No");
						if (choose == true) {
							exit = false;
						} else {
							exit = true;
						}
					}
				} while (!loop);
			
			} else if (elec == 7) {
				Keyboard.closeKeyboard();
			} else {
				System.out.println("Error, tienes que elegir del 1 al 7");
				exit = false;
			}
		} while (!exit);
		
	}
	
	public static void menu() {
		System.out.println("¿Qué quieres probar?\n1. Lectura de un carácter\n2. Lectura de una cadena\n3. Lectura de un boolean"
				+ "\n4. Lectura de un número\n5. Lectura de un número con un límite\n6. Lectura de un número dentro de un rango\n7. Cerrar teclado");
	}
	
	public static void typeNumMenu() {
		System.out.println("¿Qué tipo quieres probar?\n1. Tipo byte\n2. Tipo short\n3. Tipo int\n4. Tipo long\n5. Tipo float"
				+ "\n6. Tipo double");
	}
	
}
