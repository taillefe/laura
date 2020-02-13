
import java.util.Scanner;

import utilidades.UtilObtencionDatos;

/*
 * Realizar un programa que, pidiendo una cantidad de dinero en Euros, muestre por pantalla la cantidad de billetes y 
 * monedas necesarios para llegar a esa cantidad.
	Para ello deberá tenerse un array unidimensional con los diferentes valores de monedas y billetes y otro 
	array bidimensional con los billetes necesarios y la cantidad de cada billete.
	Haced uso de funciones y procedimientos
 */
public class Ejercicio6Solucion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cantidad;
		int[][] resultado;
		
		cantidad=obtenerValorEuros();
		resultado=calcularCantidadesDinero(cantidad);
		imprimirResultado(cantidad, resultado);
	}
	
	private static int obtenerValorEuros()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Indicar el valor de euros a calcular");
		return UtilObtencionDatos.obtenerValorEnteroPositivo();
	}//obtenerValorEuros

	private static int[][] calcularCantidadesDinero(int cantidadEuros)
	{
		int[][] valorResultado= new int[2][8];
		int[] cantidades= {
				1,2,5,10,20,50,100,200
		};
		valorResultado[0] = cantidades.clone();
		for(int i=cantidades.length-1;i>=0;i--)//Recorremos el array de cantidades desde la derecha
		{
			int vCantidad=cantidades[i];
			int contCantidad=0;
			while(cantidadEuros>=vCantidad)
			{
				contCantidad++;
				cantidadEuros=cantidadEuros-vCantidad;
			}
			valorResultado[1][i]=contCantidad;
		}
		
		return valorResultado;
	}//calcularCantidadesDinero
	
	
	private static void imprimirResultado(int cantidad, int[][] resultado)
	{
		System.out.printf("La cantidad de %d € se puede obtener con:\n",cantidad);
		for(int i=resultado[0].length-1;i>=0;i--)
		{
			int cantResultado=resultado[1][i];
			if(cantResultado>0)
			{
				if(i<2)
				{
					System.out.printf("\t%d monedas de %d€\n",resultado[1][i],resultado[0][i]);
				}
				else
				{
					System.out.printf("\t%d billetes de %d€\n",resultado[1][i],resultado[0][i]);
				}
			}
			
		}
	}//imprimirResultado
	
}