import java.util.Arrays;
import java.util.Scanner;



public class Ejercicio3 {

	public static void main(String[] args) {
		

		String cadena = obtenerTexto();
		
		String [][] arrayApariciones = obtenerArrayApariciones (cadena);
		
		imprimir (arrayApariciones);

		
	}
	
	public static String obtenerTexto()
	{
		System.out.println("Introduce una frase");
		Scanner sc = new Scanner(System.in);
		String texto = sc.nextLine();
		return texto;
	}
	
	private static void imprimir (String[][] array)
	{
		System.out.println("El resultado de busqueda de apariciones es : ");
		for (int i=0; i< array[0].length; i++)
		{
			if (array[0][i] != null)
			{
				System.out.printf("El caracter %s se repite %s veces \n", array [0][i], array [1][i]);
			}
		}
		//System.out.println(Arrays.deepToString(array));
	}
	
	public static String [][] obtenerArrayApariciones (String cadena)
	{
		String[][] arrayApariciones = new String[2][cadena.length()];
		int contAparLetra ;
		char letra;
		int posInsert=0;
		
		for (int i = 0; i < cadena.length(); i++)
		{
			letra = cadena.charAt(i);
			contAparLetra = obtenerNumeroApariciones(letra,cadena);
			if (!existeCaracter(letra, arrayApariciones[0]))
			{
				arrayApariciones[0][posInsert]=String.valueOf(letra);
				arrayApariciones[1][posInsert]=String.valueOf(contAparLetra);
				posInsert++;
				
			}
				
			
	/*		for (int j = 1; j < cadena.length(); j++)
			{
				if (cadena.charAt(i) == cadena.charAt(j))
				{
					cont = cont + 1; // contar las apariciones de cada caracter
					
				}
				
			}
			//al salir del bucle j guardamos los datos en el array, el valor de la letra de la posicion i y su aparicion
			arrayApariciones[i][0] = c.charAt(i);
			arrayApariciones[i][1] = Character.forDigit(cont,10);  // forDigit transforma un digito integer en character
		*/	
		}
		return arrayApariciones;

		
	}
	private static int obtenerNumeroApariciones(char c, String cadena)
	{
		int numero =0;
		for (int i=0; i<cadena.length(); i++)
		{
			if (Character.compare(c,  cadena.charAt(i)) == 0) // los carateres son iguales
				numero ++;
		}
		return numero;
	}
	
	private static boolean existeCaracter(char car, String [] array)
	{
		boolean existe = false;
		for ( int i=0; i <array.length; i++)
		{
			String comparar = array[i];
			if (array[i] !=null && Character.compare (car, comparar.charAt(0))  == 0)
			{
				existe = true;
				break;
			}
		}
		return existe;
	}
	

}
