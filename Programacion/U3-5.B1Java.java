package Ejercicios;

import java.util.Scanner;

public class B1Java
{
	/*
	 * 1.Realizar un programa que sume 10 n�meros le�dos por teclado.
	 * @author Fco.Javier Cano
	 */
	public static void sumar10numeros()
	{
		System.out.println("Suma de los valroes le�dos"+sumarNnumeros(10));
	}
	/*
	 * 2.Modificar el ejercicio anterior para sumar una cantidad N de n�meros dados
	 * @author Fco.Javier Cano
	 * @param cantidad de n�meros a leer
	 * @return resultado de la suma de los n�meros le�dos
	 */
	public static double sumarNnumeros(int _cantidad)
	{
		double cantidad = 0.0d;
		Scanner input = new Scanner(System.in);
		for(int i=0;i<_cantidad;++i)
		{
			cantidad += input.nextDouble();
		}
		input.close();
		return cantidad;
	}
	/*
	 * 3.	Realiza un programa que, dado un a�o, diga si es bisiesto. 
	 * Un a�o es bisiesto si es m�ltiplo de 4, exceptuando los m�ltiplos de 100,
	 * que solo son bisiestos cuando son m�ltiplos adem�s de 400.
	 * @author Fco.Javier Cano
	 * @param a�o a verificar
	 * @return decir si el a�o es bisiesto.
	 */
	public static boolean esBisiesto(int _year)
	{
		boolean esBisiesto = (_year%4 == 0 && _year % 100 != 0) || _year % 400 == 0;
		return esBisiesto;
	}
	/*
	 * 4.	Tras haber realizado el ejercicio anterior, ll�valo a una funci�n para poder utilizarlo en este ejercicio. 
	 * Hacer un programa que dado un d�a D, un mes M y un a�o A, calcule cual es el d�a siguiente. 
	 *  Se debe tener en cuenta que en los a�os bisiestos Febrero tiene 29 d�as y en los no bisiestos 28. 
	 * Un a�o es bisiesto si es m�ltiplo de 4, exceptuando los m�ltiplos de 100,
	 * que solo son bisiestos cuando son m�ltiplos adem�s de 400.
	 * @author Fco.Javier Cano
	 * @param a�o a verificar
	 * @return decir si el a�o es bisiesto.
	 */
	public static int nextDay(int _day, int _month, int _year)
	{
		int nextDay = 0;
		switch (_month)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				nextDay = (_day < 31) ? _day +1 : 1;
				if (_day == 31)
				{
					if (_month < 12) 
					{
						++_month;
					}
					else
					{
						_month = 1;
						++_year;
					}
				}
			break;
			case 4:
			case 6:
			case 9:
			case 11:
				nextDay = (_day < 30) ? _day +1 : 1;
				if (_day == 30)
				{
					if (_month < 12) 
					{
						++_month;
					}
					else
					{
						_month = 1;
						++_year;
					}
				}

			break;
			case 2:
				int checkDay = esBisiesto(_year)? 29 : 28;
				nextDay = _day < checkDay ? _day +1 : 1;
				if (_day == checkDay)
				{
					if (_month < 12) 
					{
						++_month;
					}
					else
					{
						_month = 1;
						++_year;
					}
				}
			break;
			default:
				System.out.println("System error.");
				break;
		}
		return nextDay;
	}

	/*
	 * 5.	Haz un programa que mediante una interfaz (podamos seleccionar el tipo de conversi�n antes de realizarla) nos permita convertir:
	 * a)	Dada una cantidad determinada de galones a litros y escriba el resultado. 1 gal�n = 3.7854.
	 * b)	Dada una cantidad de pies, realice la conversi�n a: pulgadas (1 pie = 12 pulgadas y 1 pulgada = a 2,54 cm), yardas (1 yarda = 0.94 metros), cm y metros.
	 * @author Fco.Javier Cano
	 * @param a�o a verificar
	 * @return decir si el a�o es bisiesto.
	 */
	public static void conversiones()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Seleccione la conversi�n a realizar\n1)Galones a litros\n2)Pies a pulgadas,yardas, cm y metros");
		int codOp = input.nextInt();
		double cantidad;
		switch (codOp)
		{
			case 1://galones a litros
				System.out.println("Inserte la cantidad de galones a convertir;");
				cantidad = input.nextDouble();
				System.out.println(cantidad+" galones son "+(cantidad*3.7854)+ " litros");
			break;
			case 2://pies a a pulgadas
				System.out.println("Inserte la cantidad de pies a convertir;");
				cantidad = input.nextDouble();
				System.out.println(cantidad+" pies son "+(cantidad*12)+ " pulgadas, "+((cantidad*12)*2.54)+ " cent�metros "+(((cantidad*12)*2.54)/100)+ " metros y "+((((cantidad*12)*2.54)/100)/0.94)+" yardas");			
			break;
			default:
			break;
		}
		input.close();
	}

	/*
	 * 6.	Modifica el apartado a) para que realice una todas las conversiones de 1 hasta 100 galones, cada 10 galones, imprimir� una l�nea en blanco. 
	 * @author Fco.Javier Cano
	 * @param a�o a verificar
	 * @return decir si el a�o es bisiesto.
	 */
	public static void allConversiones()
	{
		for (int i = 1; i <= 100; ++i)
		{
			System.out.println(i+" galones son "+(i*3.7854)+ " litros");		
			if (i%10 == 0)
			{
				System.out.println();
			}
		}
	}
	/*
	 * 7.	Realiza un programa que calcule la sucesi�n de Fibonacci: an=an-1+an-2 para n>2, donde a1=1 y a2=1.
	 *  El programa deber� permitirnos calcular N t�rminos dados de la sucesi�n.
	 * @author Fco.Javier Cano
	 * @param a�o a verificar
	 * @return decir si el a�o es bisiesto.
	 */
	public static void Fibonacci(int _NTermino)
	{
		int anterior = 1, actual = 1, siguiente = 0;
		
		for (int i = 0; i < _NTermino; ++i)
		{
			siguiente = actual + anterior;
			anterior = actual;
			actual = siguiente;
		}
		System.out.println(_NTermino);
	}
	
	/*
	 * 8.	Haz un programa que calcule los 100 primeros n�meros pares.
	 * @author Fco.Javier Cano
	 * @param a�o a verificar
	 * @return decir si el a�o es bisiesto.
	 */
	public static void _100pares()
	{
		int contador = 0;
		for(int i = 2; contador < 100; ++i)
		{
			if(i%2==0)
			{
				System.out.println(i+" es par.");
				++contador;
			}
		}
	}

	/*
	 * 9.	Haz un programa que calcule los 100 primeros n�meros impares.
	 * @author Fco.Javier Cano
	 * @param a�o a verificar
	 * @return decir si el a�o es bisiesto.
	 */
	public static void _100impares()
	{
		int contador = 0;
		for(int i = 2; contador < 100; ++i)
		{
			if(i%2!=0)
			{
				System.out.println(i+" es impar.");
				++contador;
			}
		}
	}
	/*
	 * 10.	Haz un programa que calcule la suma de los n�meros pares comprendidos entre 10 y 50.
	 * @author Fco.Javier Cano
	 * @param a�o a verificar
	 * @return decir si el a�o es bisiesto.
	 */
	public static void sumaParesComprendida()
	{
		int suma = 10;
		for (int i = 10; i <= 50; ++i)
		{
			if (i % 2 == 0)
			{
				suma += i;
			}
		}
		System.out.println("Suma comprendida "+suma);
	}
	/*
	 * 11.	Realizar un programa que nos permita calcular el m�ximo com�n divisor o el m�nimo com�n m�ltiplo de dos n�meros dados.
	 * @author Fco.Javier Cano
	 * @param a�o a verificar
	 * @return decir si el a�o es bisiesto.
	 */
	public static void calcularMCDoMCM()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Introduzca dos n�meros:");
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println("Seleccione la operaci�n a realizar\n1)M�nimo com�n m�ltiplo \n2)M�ximo com�n divisor.");
		if (input.nextInt() == 1)
		{
			System.out.println("El m�nimo com�n m�ltiplo de "+a+" y de "+b+" es "+mcm(a,b));			
		}
		else
		{
			System.out.println("El m�ximo com�n divisor de "+a+" y de "+b+" es "+mcd(a,b));			
		}
		input.close();
	}
	public static int mcm(int a, int b)
	{
		int mcm = 1;
		int mcd = 1;
		int mayor = (a>b) ? a:b;
		int menor = (a<b) ? a:b;
		while (menor > 0)
		{
			mcd = menor;
			menor = mayor % menor;
			mayor = mcd;			
		}
		mcm = a * b /mcd;		
		return mcm;
	}
	
	public static int mcd(int a, int b)
	{
		int mcd = 1;
		int mayor = (a>b) ? a:b;
		int menor = (a<b) ? a:b;
		while (menor > 0)
		{
			mcd = menor;
			menor = mayor % menor;
			mayor = mcd;		
		}
		return mcd;
	}	
	/*
	 * 12.	Haz un programa que indique si un n�mero entero N es primo o no.
	 * @author Fco.Javier Cano
	 * @param a�o a verificar
	 * @return decir si el a�o es bisiesto.
	 */
	public static boolean esPrimo(int _N)
	{
		boolean esPrimo = _N > 1;
		int contador = 2;
		while(esPrimo && contador < _N) 
		{
			esPrimo = _N % contador != 0;
			++contador;
		}
		return esPrimo;
	}
	/*
	 * 13.	Hacer un programa que permita escribir los primeros 100 n�meros primos.
	 * @author Fco.Javier Cano
	 * @param a�o a verificar
	 * @return decir si el a�o es bisiesto.
	 */
	public static void first100Primos()
	{
		int nPrimos = 0;
		for (int i = 0; nPrimos < 100; ++i)
		{
			if (esPrimo(i))
			{
				System.out.println(i);
			}
		}

	}//
//	
	/*
	 * 14.	Modifica el ejercicio anterior para poder optimizar al m�ximo los c�lculos, es decir, 
	 * reducir al m�ximo el n�mero de comprobaciones. Es obligatorio llevarse este ejercicio a una funci�n.
	 * @author Fco.Javier Cano
	 * @param a�o a verificar
	 * @return decir si el a�o es bisiesto.
	 */
	public static boolean done(int _year)
	{
		return true;
	}//
//	 
	/*
	 * 15.	Haz un programa que calcule el total de una factura, partiendo de una lista de parejas importe,
	IVA pertenecientes a la misma factura. La lista finaliza cuando el importe sea 0. 
	El IVA puede ser el 4%, el 10% o el 21%, en cualquier otro caso se rechazan importe e IVA y se deben introducir de nuevo.
	 * @author Fco.Javier Cano
	 * @param a�o a verificar
	 * @return decir si el a�o es bisiesto.
	 */
	public static void calcularFactura()
	{
		Scanner input = new Scanner(System.in);
		double importe;
		int IVA;
		do 
		{
			System.out.println("Inserte un importe:");
			importe = input.nextDouble();
			if (importe > 0)
			{
				System.out.println("Inserte un IVA: 4, 10 o 21");
				IVA = input.nextInt();
				if( IVA == 4 || IVA == 10 || IVA == 21)
				{
					System.out.println("El importe es: "+(importe*(IVA/100)));
				}
				else
				{
					System.out.println("Has seleccionado un IVA incorrecto, vuelve a introducir los valores");
				}
			}
		} while (importe > 0);
		input.close();
	}
	/*
	 * 16.	Haz un programa que lea un capital y calcule e imprima en cuantos meses se triplica si se coloca
	 *  a un inter�s del 6% mensual
	 * @author Fco.Javier Cano
	 * @param a�o a verificar
	 * @return decir si el a�o es bisiesto.
	 */
	public static void triplicar()
	{
		
		Scanner input = new Scanner(System.in);
		System.out.println("Introduzca la cantidad a triplicar");
		double cantidad = input.nextDouble();
		double aux = cantidad;
		input.close();
		int meses = 0;
		while (aux < cantidad *3)
		{
			++meses;	
			aux *= 0.06;
		}
		System.out.println("La cantidad introducida, "+cantidad+" , se triplicar� en "+meses+" meses");
	}
	/*
	 * 17.	Haz un programa que lea una cantidad de inversi�n mensual y 
	 * calcule en cuantos meses duplicar� los beneficios, teniendo en cuenta que la rentabilidad media es de un 3% de dicha cantidad.
	 * @author Fco.Javier Cano
	 * @param a�o a verificar
	 * @return decir si el a�o es bisiesto.
	 */
	public static int cantidadAGanarEnMeses(double _cantidad, int _multiplo, double _rentabilidad)
	{
		
		double aux = _cantidad;
		int meses = 0;
		while (aux < _cantidad *_multiplo)
		{
			++meses;	
			aux *= _rentabilidad;
		}
		return meses;
	}

	public static void duplicarBeneficios(int _year)
	{
		double inversionMensual,crentabilidad;
		Scanner input = new Scanner(System.in);
		inversionMensual = input.nextDouble();
		crentabilidad = inversionMensual;
		int m;
		for (m = 1; crentabilidad < inversionMensual ; ++m) 
		{
			crentabilidad += inversionMensual *0.03;
		}
		System.out.println("En "+m+" meses duplicar� beneficios");
		input.close();
	}	
	/*
	 * 18.	Modifica el ejercicio para que, adem�s, nos permita realizar los c�lculos para el peor caso 1% 
	 * y el mejor caso un 5% de rentabilidad.
	 * @author Fco.Javier Cano
	 * @param a�o a verificar
	 * @return decir si el a�o es bisiesto.
	 */
	public static void mejorYPeorRentabilidad()
	{
		double inversionMensual;
		Scanner input = new Scanner(System.in);
		System.out.println("Inserte la cantidad a amortizar");
		inversionMensual = input.nextDouble();
		System.out.println("En el peor caso, se obtendr� la rentabilidad en "+cantidadAGanarEnMeses(inversionMensual,2,0.01)+" meses");
		System.out.println("En el mejor caso, se obtendr� la rentabilidad en "+cantidadAGanarEnMeses(inversionMensual,2,0.05)+" meses");
		input.close();
	}//
//	
	/*
	 * 19.	Hacer un programa en el que se pida por teclado un n�mero mayor que 2 (
	 * el programa controlar� que cumpla esto), 
	 * y lo imprima de todas las formas posibles como producto de dos factores (no se tiene en cuenta la multiplicaci�n por 1). Por ejemplo: Con el n�mero 36, tendr�a que visualizarse: 18*2, 12*3, 9*4, 6*6, 3*12, 4*9, 2*18.
	 * @author Fco.Javier Cano
	 * @param a�o a verificar
	 * @return decir si el a�o es bisiesto.
	 */
	public static void combinacionesProducto()
	{
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		for (int i = 1; i < number/2; i++)
		{
			for (int j = 1; j < number/2; j++)
			{
				if (i*j == number)
				{
					System.out.println(i+" x "+j+" = "+number);
				}				
			}			
		}
		input.close();
	}
	/*
	 * 20.	Hacer un programa para sumar los N primeros t�rminos de una progresi�n geom�trica de primer t�rmino A 
	 * y raz�n R (dados por teclado). Se debe realizar la suma sin emplear la f�rmula que existe para ello. 
	 * Muestra tambi�n los t�rminos de la serie.
	 * @author Fco.Javier Cano
	 * @param a�o a verificar
	 * @return decir si el a�o es bisiesto.
	 */
	public static void nTerminosProgresionGeomtrica()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Introduzca la cantidad de terminos a calcular");
		int N = input.nextInt();
		System.out.println("Introduzca el t�rmino");
		double termino = input.nextDouble();
		System.out.println("Introduzca la raz�n");
		double R = input.nextDouble();
		double razon;
		for (int i = 0; i < N; i++)
		{
			razon = Math.pow(R, i);
			/*
		 	razon = 1
			for (int j = 0; j <= i; j++) 
			{
				razon *= R;
			}
			*/
			System.out.println(termino * razon);
		}
		input.close();
	}
	/*
	 * 21.	Haz un programa que dado un n�mero N nos diga si es o no perfecto. 
	 * Se dice que un n�mero N es perfecto si la suma de sus divisores, excluido el propio n�mero es N. Por ejemplo, 
	 * 28 es perfecto, pues sus divisores son: 1, 2, 4, 7 y 14 y su suma es 1+2+4+7+14=28.
	 * @author Fco.Javier Cano
	 * @param a�o a verificar
	 * @return decir si el a�o es bisiesto.
	 */
	public static boolean esPerfecto(int N)
	{
		int aux = 0;
		for (int i = 0; i < N; i++)
		{
			if (N % i == 0)
			{
				aux += i;
			}
		}
		
		return (aux == N);
	}
	/*
	 * 22.	Modifica el programa anterior, para siga pidiendo n�meros, 
	 * para comprobar si son perfectos, mientras el n�mero introducido sea distinto de cero.
	 * @author Fco.Javier Cano
	 * @param a�o a verificar
	 * @return decir si el a�o es bisiesto.
	 */
	public static void mientrasSeaPerfecto(int _year)
	{
		Scanner input = new Scanner(System.in);
		int N;
		do 
		{
			N = input.nextInt();
			if (N > 0 && esPerfecto(N))
			{
				System.out.println(N+" es perfecto");
			}
		} while (N > 0);
		input.close();
	}
	/*
	 * 23.	Haz un programa que pida 2 n�meros por teclado y calcule su producto mediante sumas sucesivas. 
	 * Imprimir su resultado.
	 * @author Fco.Javier Cano
	 * @param a�o a verificar
	 * @return decir si el a�o es bisiesto.
	 */
	public static double sumasSucesivas()
	{
		int producto = 0;
		int a,b;
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		b = input.nextInt();
		do 
		{
			producto += a;
			--b;
		} while (b > 0);
		input.close();
		return producto;
	}
	/*
	 * 24.	Hacer un programa que pida 2 n�meros por teclado y calcule su divisi�n mediante restas sucesivas. 
	 * Imprimir su resultado. Divide siempre el m�s grande entre el m�s peque�o.
	 * @author Fco.Javier Cano
	 * @param a�o a verificar
	 * @return decir si el a�o es bisiesto.
	 */
	public static double restasSucesivas()
	{
		int resultado = 0;
		double a,b;
		Scanner input = new Scanner(System.in);
		a = input.nextDouble();
		b = input.nextDouble();
		while (a > b)
		{
			a -= b;
			++resultado;
		}
		input.close();
		return resultado;
	}
	
	/*
	 * 25.	Haz un programa que lea un n�mero entero N y calcule el resultado de la siguiente serie: 1+1/2+1/3+1/4+1/5+...+1/N.
	 * @author Fco.Javier Cano
	 * @param a�o a verificar
	 * @return decir si el a�o es bisiesto.
	 */
	public static void serieFracciones()
	{
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		double resultado = 0.0d;
		for (int i = 1; i <= N; ++i)
		{
			resultado += 1/i;
		}
		System.out.println("Resultado de la serie"+ N+" : "+resultado);
		input.close();
	}
	/*
	 * 	26.	 Haz un programa que lea un n�mero entero N y calcule el resultado de la siguiente serie: 1-1/2+1/3-1/4+1/5-...+1/N.
	 * @author Fco.Javier Cano
	 * @param a�o a verificar
	 * @return decir si el a�o es bisiesto.
	 */
	public static void serieFraccionesProgresion()
	{
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		double resultado = 0.0d;
		for (int i = 1; i <= N; ++i)
		{
			resultado += 1/i*(i%2==0?-1:1);
		}
		System.out.println("Resultado de la serie"+ N+" : "+resultado);
		input.close();
	}
	/*
	 * 27.	Escribir un programa que imprima cada uno de los t�rminos de la serie 2, 5, 7, 10, 12, 15, 17,..., 1800.
	 *  Adem�s, calcule e imprima la suma de los t�rminos.
	 * @author Fco.Javier Cano
	 * @param a�o a verificar
	 * @return decir si el a�o es bisiesto.
	 */
	public static void calcularEImprimirSumaTerminos()
	{
		int serie, total;
		total = 0;
		serie = 0;
		for (int i = 1; serie < 1800; i++)
		{
			serie += (i%2==0?3:2);
			total += serie;
		}
		System.out.println("Total de la serie: "+total);
	}
	/*
	 * 28.	Hacer un programa que lea por teclado un numero N e imprima un tri�ngulo rect�ngulo, de N filas. 
	 * EJ: N=5, se pintar� lo siguiente:
	 * @author Fco.Javier Cano
	 * @param a�o a verificar
	 * @return decir si el a�o es bisiesto.
	 */
	public static void rectanguloAsteriscos()
	{
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		for (int i = 1; i <= N; ++i)//Iteraci�n por filas
		{
			for (int j = 0; j < i; ++j)//Iteraci�n por columnas
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		input.close();
	}
	/*
	 * 29.	 Modifica el ejercicio anterior para que en vez de mostrar *, muestre n�meros naturales correlativos; ejemplo:
	 * @author Fco.Javier Cano
	 * @param a�o a verificar
	 * @return decir si el a�o es bisiesto.
	 */
	public static void naturalesCorrelativos()
	{
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		for (int i = 1; i <= N; ++i)//Iteraci�n por filas
		{
			for (int j = 0; j < i; ++j)//Iteraci�n por columnas
			{
				System.out.print((j+1)+" ");
			}
			System.out.println();
		}
		input.close();
	}

	/*
	 * 30.	Haz un programa para imprimir una tabla de tres columnas y N filas con los cuadrados
	 *  y los cubos de los N primeros n�meros. Pide N al usuario.
	 * @author Fco.Javier Cano
	 * @param a�o a verificar
	 * @return decir si el a�o es bisiesto.
	 */
	public static void imprimirTabla()
	{
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int potencia;
		for (int i = 1; i <= N; ++i)//Iteraci�n por filas
		{
			potencia = i;
			for (int j = 0; j < 3; ++j)//Iteraci�n por columnas
			{
				System.out.print(potencia+" ");
				potencia *= i; 
			}
			System.out.println();
		}
		input.close();
	}
	
	public static void main(String[] args)
	{
	}
}
