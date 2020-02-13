package utilidades;

import java.util.Scanner;

public class UtilObtencionDatos {
	
	public static int  obtenerNumeroEntero()
	{
		int num=0;
		boolean valorCorrecto;
		
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.println("Introduce un numero entero");
			if (sc.hasNextInt())
			{
				num=sc.nextInt();
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
	}//obtenerNumeroEntero
	
	
	
		public static int  obtenerNumeroPositivoEntero()
		{
			int num=0;
			boolean valorCorrecto;
			
			Scanner sc = new Scanner(System.in);

			do
			{
				System.out.println("Introduce un numero entero positivo");
				if (sc.hasNextInt())
				{
					num=sc.nextInt();
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
		}//obtenerNumeroPositivoEntero
	
		public static double obtenerNumeroReal()
		{
			double num=0;
			boolean valorCorrecto;
			
			Scanner sc = new Scanner(System.in);

			do
			{
				System.out.println("Introduce un numero real");
				if (sc.hasNextDouble())
				{
					num=sc.nextDouble();
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
		}//obtenerNumeroReal
		
		public static double obtenerNumeroPositivoReal()
		{
			double num=0;
			boolean valorCorrecto;
			
			Scanner sc = new Scanner(System.in);

			do
			{
				System.out.println("Introduce un numero positivo real");
				if (sc.hasNextDouble())
				{
					num=sc.nextDouble();
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
		}//obtenerNumeroPositivoReal
		
		public static String obtenerFrase()
		{
			System.out.println("Introduce una frase");
			Scanner entradaEsc = new Scanner(System.in);
			String entradaTeclado = entradaEsc.nextLine();
			return entradaTeclado;
		}


	

}
