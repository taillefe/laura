

	import java.util.Scanner;

	/*
	 * Ejercicio 1:​ 
	 * Implementar un programa que obtenga un valor de texto del usuario, 
	 * recorra ese texto y lo guarde en un array de caracteres. 
	 * Posteriormente se tendrá que imprimir por pantalla dicho array. 
	 * Para la realización de este ejercicio habrá que usar tres métodos: 
	 * 		Una función que obtenga el texto por consola. 
	 * 		Una función a la que se le pase el texto y devuelva el array de caracteres. 
	 * 		Un procedimiento que, pasado un array de caracteres, lo imprima por pantalla. 
	 */
	public class Ejercicio1Solucion {

		public static void main(String[] args) {
			String texto;
			char[] array;
			
			texto = obtenerTextoConsola();
			array=obtenerArrayCaracteres(texto);
			imprimirArray(array);

		}//main
		
		public static String obtenerTextoConsola()
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Introduce un texto:");
			return sc.nextLine();
		}//obtenerTextoConsola
		
		public static char[] obtenerArrayCaracteres(String texto)
		{
			char[] arrayCaract= new char[texto.length()];
			for(int i=0;i<texto.length();i++)
			{
				arrayCaract[i]=texto.charAt(i);
			}
			return arrayCaract;
			//return texto.toCharArray();
		}//obtenerArrayCaracteres
		
		
		public static void imprimirArray(char[] array)
		{
			System.out.println("El texto introducido es:\n");
			for(char c:array)
			{
				System.out.print(" "+c);
			}
			//System.out.println(array);
		}//imprimirArray

	}//class