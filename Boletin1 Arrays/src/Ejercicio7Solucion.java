

	import java.util.Arrays;

	import utilidades.UtilObtencionDatos;

	/*
	 * Realizar un programa que pida 5 n�meros, los introduzca en un array, 
	 * pida un nuevo n�mero y nos indique si est� en el array. 
	 * Realizarlo primero sin el uso de los m�todos de ordenaci�n y b�squeda de la clase Arrays y luego mediante estos m�todos.
	 */
	public class Ejercicio7Solucion {

		public static void main(String[] args) {
			int[] valoresArray;
			int numero;

			valoresArray = obtenerValoresArray();
			numero = obtenerValorNumero();

			//Comentar/Descomentar cada llamada para probarlo
			//if (existeNumeroArray(numero, valoresArray)) {
			if(existeNumeroArrayUsandoUtilidades(numero, valoresArray)) {
				System.out.printf("El n�mero %d SI existe en el array %s", numero, Arrays.toString(valoresArray));
			} else {
				System.out.printf("El n�mero %d NO existe en el array %s", numero, Arrays.toString(valoresArray));
			}

		}// main

		private static int[] obtenerValoresArray() {
			int[] valores = new int[5];
			for (int i = 0; i < 5; i++) {
				System.out.printf("Indica el valor %d del array:", i + 1);
				valores[i] = UtilObtencionDatos.obtenerValorEntero();
			}
			return valores;
		}// obtenerValoresArray

		private static int obtenerValorNumero() {
			System.out.println("Indica el valor a buscar");
			return UtilObtencionDatos.obtenerValorEntero();
		}// obtenerValorNumero

		// Busqueda sin usar los m�todos de Arrays
		private static boolean existeNumeroArray(int numero, int[] arrayBuscar) {
			boolean resultado = false;
			for (int i = 0; i < arrayBuscar.length; i++) {
				if (arrayBuscar[i] == numero) {
					resultado = true;
					break;
				}
			}
			return resultado;
		}// existeNumeroArray

		// Busqueda usando los m�todos de Arrays
		private static boolean existeNumeroArrayUsandoUtilidades(int numero, int[] arrayBuscar) {
			
			//Para poder usar la b�squeda binaria primero hay que ordenar el array
			Arrays.sort(arrayBuscar);
			//Ahora ya se puede usar la b�squeda binaria
			return (Arrays.binarySearch(arrayBuscar, numero)>=0);//Si se encuentra devuelve la posici�n. Si no devuelve un valor <0
			
		}// existeNumeroArrayUsandoUtilidades

	}// class
