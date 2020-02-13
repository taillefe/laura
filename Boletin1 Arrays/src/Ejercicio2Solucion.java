

	import java.util.Arrays;
	import java.util.BitSet;

	/*
	 * Dado el siguiente array, realizar la ordenaci�n e impresi�n del array resultado. 
	 * int[] arrayDesordenado= {121,24,1,258,0,-3,8} 
	 * Realizarlo con dos m�todos. 
	 * 		Uno para ordenar el array y otro para la impresi�n. 
	 * 		Deber� realizarse �a mano� y no mediante ning�n m�todo de ordenaci�n como sort. 
	 */
	public class Ejercicio2Solucion {

		public static void main(String[] args) {
			int[] arrayDesordenado= {121,24,1,258,-3,-3,8}; 
//			imprimirArray(ordenarArrayPares(arrayDesordenado));
			Arrays.sort(arrayDesordenado);
			imprimirArray(arrayDesordenado);

		}//
		
		public static int[] ordenarArray(int[] arrayDesordenado)
		{
			//int[] arrayDesordenado= {121,24,1,258,0,-3,8} 
			int[] arrayOrdenado= new int[arrayDesordenado.length];
			int posicionInsertar=0;//posici�n de arrayOrdenado donde se insertar�
			int valorMaximo=Integer.MIN_VALUE; //valor que se insertar� al final
			int posValorMaximo=0;
			
			
			for(int i=0;i<arrayDesordenado.length;i++)			
			{
				valorMaximo=Integer.MIN_VALUE;
				posValorMaximo=-1;
							
				for(int j=0;j<arrayDesordenado.length;j++)
				{
					if(valorMaximo<arrayDesordenado[j])
					{
						valorMaximo=arrayDesordenado[j];
						posValorMaximo=j;
					}
				}
				arrayOrdenado[posicionInsertar]=valorMaximo;
				posicionInsertar++;
				arrayDesordenado[posValorMaximo]=Integer.MIN_VALUE;
			}
			
			
			return arrayOrdenado;
		}
		
		public static int[] ordenarArrayPares(int[] arrayDesordenado)
		{
			//int[] arrayDesordenado= {121,24,1,258,0,-3,8} 
			
			for(int i=0;i<arrayDesordenado.length;i++)
			{
				for(int j=i+1;j<arrayDesordenado.length;j++)
				{
					if(arrayDesordenado[i]<arrayDesordenado[j])
					{
						int aux=arrayDesordenado[j];
						arrayDesordenado[j]=arrayDesordenado[i];
						arrayDesordenado[i]=aux;
					}
				}
			}
			
			return arrayDesordenado;
		}
		
		
		
		
		public static void imprimirArray(int[] array)
		{
			System.out.println("El array ordenado es:\n");
			for(int c:array)
			{
				System.out.print(" "+c);
			}
			
		}//imprimirArray
		
		

	}
