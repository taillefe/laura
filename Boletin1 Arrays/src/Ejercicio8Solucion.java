import utilidades.UtilObtencionDatos;

/*
 * Realizar un programa que pida dos matrices 3x3, obtenga los valores, 
 * y muestre el resultado de la multiplicación de una matriz por otra (cada elemento de la misma posición)
 */
public class Ejercicio8Solucion {

	public static void main(String[] args) {
		int [][] matriz1;
		int [][] matriz2;
		
		matriz1=obtenerValoresMatriz();
		matriz2=obtenerValoresMatriz();

		System.out.println("El resultado de imprimir");
		imprimirMatriz(matriz1);
		System.out.println("Por");
		imprimirMatriz(matriz2);
		System.out.println("Es");
		imprimirMatriz(obtenerMultiplicacionMatrices(matriz1,matriz2));
		
		
	}
	
	private static int[][] obtenerValoresMatriz()
	{
		int [][] matriz= new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				matriz[i][j]=UtilObtencionDatos.obtenerValorEntero(String.format("Indica el valor [%d][%d] de la matriz:",i,j));
			}
		}
		return matriz;
	}//obtenerValoresMatriz
	
	private static int[][]  obtenerMultiplicacionMatrices(int [][] matriz1,int [][] matriz2)
	{
		int [][] matrizResultado= new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				matrizResultado[i][j]=matriz1[i][j]*matriz2[i][j];
			}
		}
		return matrizResultado;
	}//obtenerMultiplicacionMatrices
	
	private static void imprimirMatriz(int[][] matriz)
	{
		for(int i=0;i<matriz.length;i++)
		{
			for(int j=0;j<matriz.length;j++)
			{
				System.out.printf("\t%d\t",matriz[i][j]);
			}
			System.out.printf("\n");
		}//for
	}//imprimirMatriz

}