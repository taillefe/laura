

	import java.util.Arrays;
	import java.util.Scanner;

	/*
	 * ​Implementar un programa que, obteniendo una frase del usuario, 
	 * guarde en un array multidimensional el conteo de apariciones de cada carácter. 
	 * Al final deberá imprimir un resultado con cada caracter seguido del número de apariciones 
	 * en la frase.
	 * Realizarlo con al menos tres métodos 
	 * (pedir texto, obtener el array de apariciones e imprimir).
	 */
	public class Ejercicio3Solucion {

		public static void main(String[] args) {
			String texto;
			String[][] arrayApariciones;
			texto=pedirTexto();
			arrayApariciones=obtenerArrayApariciones(texto);
			imprimir(arrayApariciones);

		}//main
		
		private static String pedirTexto()
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Introduce el texto:");
			return sc.nextLine();
		}
		
		private static void imprimir(String[][] array)
		{
			System.out.println("El resultado de búsqueda de apariciones es:");
			//System.out.println(Arrays.deepToString(array));
			for(int i=0; i<array[0].length;i++)
			{
				if(array[0][i]!=null)
				{
					System.out.printf("El caracter %s se repite %s veces\n",array[0][i],array[1][i]);
				}
			}
		}
		
		
		private static String[][] obtenerArrayApariciones(String cadena)
		{
			String[][] arrayApariciones= new String[2][cadena.length()];
			int contAparLetra=0;
			char letra;
			int posInsert=0;
			for(int i=0;i<cadena.length();i++)
			{
				letra=cadena.charAt(i);
				contAparLetra=obtenerNumeroApariciones(letra, cadena);
				if(!existeCaracter(letra, arrayApariciones[0]))
				{
					arrayApariciones[0][posInsert]=String.valueOf(letra);
					arrayApariciones[1][posInsert]=String.valueOf(contAparLetra);
					posInsert++;
				}
			}
			
			return arrayApariciones;
		}
		
		
		private static int obtenerNumeroApariciones(char c, String cadena)
		{
			int numero=0;
			for(int i=0;i<cadena.length();i++)
			{
				
				if(Character.compare(c, cadena.charAt(i))==0)//Los caracteres son iguales
					numero++;
			}
			return numero;
		}
		
		private static boolean existeCaracter(char car,String[] array)
		{
			boolean existe=false;
			for(int i=0;i<array.length;i++)
			{
				if(array[i]!=null && Character.compare(car,array[i].charAt(0))==0)
				{
					existe=true;
					break;
				}
			}
			return existe;
		}
		

	}//class
