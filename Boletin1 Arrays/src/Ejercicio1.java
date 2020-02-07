import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
	
		String frase;
		char[] lista; 
		
		frase = obtenerTexto();
		lista = obtenerArray(frase);
		//
		//
		//
		

	}




	public static String obtenerTexto()
	{
		System.out.println("Introduce una frase");
		Scanner sc = new Scanner(System.in);
		String texto = sc.nextLine();
		return texto;
	}
	
	public static char[] obtenerArray(String t)
	{
		
		String s="fdfdsdf";
		String s8= new String(t.toCharArray()); // to CharArray convierte un string en array de caracteres
												// y el constructor new String convierte un array de caracteres en un string
		return null;
	}
}