import java.util.Arrays;
import java.util.Scanner;



public class Ejercicio4 {

	public static void main(String[] args) {
		
		//pedir numero de filas y columnas
		int filas;
		int columnas;
		int [][]matriz;

		
		filas = numerofilas();
		columnas =numerocolumnas();
		matriz = new int [filas][columnas];
		
		System.out.println("Introducir los valores del array : ");
		
		for ( int i = 0 ; i < filas; i ++)
		{
			for (int j = 0; j < columnas; j++)
			{
				matriz[i][j] = valoresarray(i,j);
			}
		}
		
		
				
		
		
	}
	
	public static int numerofilas()
	{
		System.out.println("Numero de filas del array : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}
	
	public static int numerocolumnas()
	{
		System.out.println("Numero de columnas del array : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}
	
	public static int valoresarray(int fila, int columna)
	{
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("m[" + fila + "]["+ columna +"] =  ");
		

		boolean valorCorrecto;
		
		do
		{
			if (sc.hasNextInt())
			{
				num =sc.nextInt();
				if (num<=0)
					valorCorrecto=false;
				else
					valorCorrecto = true;
			}
			else
			{
				sc.next();
				valorCorrecto=false;
			}
		}	
		while (valorCorrecto==false);
				
		return num;
	}
	public static void calcularEImprimir (int [][] array)
	{
		
	}
	
}
	
