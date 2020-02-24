package Ejercicios;

import java.util.Scanner;

public class B2Java 
{
//	EJERCICIOS JAVA 2.O

	/*
	 * 1)	Haz un programa en Java para jugar contra el ordenador a adivinar un número, generado aleatoriamente (Math.random(), entre 1 y 200. El usuario debe introducir un número por teclado 
	 *y el programa le dirá mediante los símbolos '<' o '>', si el número introducido es menor o mayor que el generado por el ordenador.
	 * Finalmente, se mostrará un mensaje informando de cuantos intentos se han necesitado para adivinar el número y si no se adivina se mostrará un mensaje diciendo que ha perdido. El número máximo de intentos se pedirá por teclado.
	 * @author Fco.Javier Cano
	 * @param año a verificar
	 * @return decir si el año es bisiesto.
	 */
	public static void randomGame()
	{
			Scanner input = new Scanner(System.in);
			boolean found = false;
			System.out.print("Introduzca el número máximo de intentos: ");
			int MaxTries = input.nextInt();
			int number = (int)(Math.random()*200);
			int tries = 0;
			int N;
			do 
			{
				System.out.print("Introduzca un número: ");
				N = input.nextInt();
				System.out.println();
				++tries;
				found = N == number;
				if (N > number)
				{
					System.out.println('>');
				}else if (N < number)
				{
					System.out.println('<');
				}
				
			} while (MaxTries > tries && !found);

			System.out.println((found) ? "Has acertado en "+tries+" intentos": "You lose");

			input.close();
	}

	/*
	 * 2)	Haz un programa en Java que muestre si dos números son o no amigos. 
	 * Los números se pedirán por teclado. 
	 * Dos números son amigos si la suma de los divisores del primero es el número y viceversa,
	 *  excluimos en la suma el propio número.
	 * @author Fco.Javier Cano
	 * @param año a verificar
	 * @return decir si el año es bisiesto.
	 */
	public static int SumDivi(int N)
	{
		int aux = 0;
		for (int i = 0; i < N; i++)
		{
			if (N % i == 0)
			{
				aux += i;
			}
		}
		return aux;
	}
	public static void amigos()
	{
		Scanner input = new Scanner(System.in);
		int a,b;
		a = input.nextInt();
		b = input.nextInt();
		boolean friends = ( a == SumDivi(b)) && (b == SumDivi(a));
		System.out.println(friends ? "Son amigos" :"No son amigos");
		
		input.close();
	}
	//	3)	Haz un programa que muestre un contador con 3 dígitos. Mostrará los números del 0-0-0 al 9-9-9, cada vez que aparezca un 3 lo sustituiremos por una E.
	/*
	 * @author Fco.Javier Cano
	 * @param año a verificar
	 * @return decir si el año es bisiesto.
	 */
	public static void count3E()
	{
		for (int i = 0; i <= 9; ++i)
		{
			System.out.print((i == 3 ? "E" : i)+"-");
			for (int j = 0; j <= 9; ++j)
			{
				System.out.print((j == 3 ? "E" : j)+"-");
				for (int p = 0; p <= 9; ++p)
				{
					System.out.print(p == 3 ? "E" : p);
				}	
			}
			System.out.println();
		}
		
	}
	//	4)	Modificar el programa anterior para que la cantidad de dígitos del contador venga dada por el usuario.
	/*

	 * @author Fco.Javier Cano
	 * @param año a verificar
	 * @return decir si el año es bisiesto.
	 */
	public static void unlimitedCounterDigits()
	{
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		
		for (int i = 0; i <= 9; ++i)
		{
			for (int n = 0; n < N; ++n)
			{
				System.out.print(i == 3 ? "E" : i);					
				System.out.print(N-1 == n ? "\n" : "-");
			}			
			
		}
		input.close();
	}
	//	5)	Para obtener el número del tarot de una persona, hay que sumar los números de su fecha de nacimiento y reducirlo a un solo dígito. Ejemplo de Julio de 1980 sería igual a: 1+7+1980 = 1988 → 1+9+9+8 = 27 → 2+7=9, por lo tanto, el número del tarot sería el 9. 
	/*
	 * 3.	Realiza un programa que, dado un año, diga si es bisiesto. 
	 * Un año es bisiesto si es múltiplo de 4, exceptuando los múltiplos de 100,
	 * que solo son bisiestos cuando son múltiplos además de 400.
	 * @author Fco.Javier Cano
	 * @param año a verificar
	 * @return decir si el año es bisiesto.
	 */
	public static boolean esBisiesto(int _year)
	{
		boolean esBisiesto = _year%4 == 0 && _year % 100 != 0;
		return esBisiesto;
	}
	//	Realiza un programa que pida una fecha de nacimiento por teclado (elige el formato que creas adecuado) y escriba el número del tarot, prueba con la edad de tus compañeros.
//	6)	Realiza un programa que pida números hasta que se introduzca cero o un número negativo, tras esto, se deberá mostrar la cantidad de números introducidos.
	/*
	 * 3.	Realiza un programa que, dado un año, diga si es bisiesto. 
	 * Un año es bisiesto si es múltiplo de 4, exceptuando los múltiplos de 100,
	 * que solo son bisiestos cuando son múltiplos además de 400.
	 * @author Fco.Javier Cano
	 * @param año a verificar
	 * @return decir si el año es bisiesto.
	 */
	public static boolean esBisiesto(int _year)
	{
		boolean esBisiesto = _year%4 == 0 && _year % 100 != 0;
		return esBisiesto;
	}
	//	7)	Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las facturas. En cada factura figura: el código del artículo, la cantidad vendida en litros y el precio por litro. Se pide de 5 facturas introducidas: Facturación total, cantidad en litros vendidos del artículo con código 1. cuantas facturas se emitieron de más de 600 €.
	/*
	 * 3.	Realiza un programa que, dado un año, diga si es bisiesto. 
	 * Un año es bisiesto si es múltiplo de 4, exceptuando los múltiplos de 100,
	 * que solo son bisiestos cuando son múltiplos además de 400.
	 * @author Fco.Javier Cano
	 * @param año a verificar
	 * @return decir si el año es bisiesto.
	 */
	public static boolean esBisiesto(int _year)
	{
		boolean esBisiesto = _year%4 == 0 && _year % 100 != 0;
		return esBisiesto;
	}
	//	8)	Modificar el programa anterior para la empresa solo tenga tres productos, con los siguientes precios:  1- 0,6 €/litro, 2- 3 €/litro y 3- 1,25 €/litro.
	/*
	 * 3.	Realiza un programa que, dado un año, diga si es bisiesto. 
	 * Un año es bisiesto si es múltiplo de 4, exceptuando los múltiplos de 100,
	 * que solo son bisiestos cuando son múltiplos además de 400.
	 * @author Fco.Javier Cano
	 * @param año a verificar
	 * @return decir si el año es bisiesto.
	 */
	public static boolean esBisiesto(int _year)
	{
		boolean esBisiesto = _year%4 == 0 && _year % 100 != 0;
		return esBisiesto;
	}
	//	9)	Realiza un programa que pida números hasta que se introduzca cero o un número negativo, y diga cuál es el mayor número introducido y cuantas veces se repite.
	/*
	 * 3.	Realiza un programa que, dado un año, diga si es bisiesto. 
	 * Un año es bisiesto si es múltiplo de 4, exceptuando los múltiplos de 100,
	 * que solo son bisiestos cuando son múltiplos además de 400.
	 * @author Fco.Javier Cano
	 * @param año a verificar
	 * @return decir si el año es bisiesto.
	 */
	public static boolean esBisiesto(int _year)
	{
		boolean esBisiesto = _year%4 == 0 && _year % 100 != 0;
		return esBisiesto;
	}
	//	10)	Haz un programa que pida un número n, y diga cuantos y cuales números primos hay entre 1 y n.

	/*
	 * 3.	Realiza un programa que, dado un año, diga si es bisiesto. 
	 * Un año es bisiesto si es múltiplo de 4, exceptuando los múltiplos de 100,
	 * que solo son bisiestos cuando son múltiplos además de 400.
	 * @author Fco.Javier Cano
	 * @param año a verificar
	 * @return decir si el año es bisiesto.
	 */
	public static boolean esBisiesto(int _year)
	{
		boolean esBisiesto = _year%4 == 0 && _year % 100 != 0;
		return esBisiesto;
	}
	//	11)	Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios.
	/*
	 * 3.	Realiza un programa que, dado un año, diga si es bisiesto. 
	 * Un año es bisiesto si es múltiplo de 4, exceptuando los múltiplos de 100,
	 * que solo son bisiestos cuando son múltiplos además de 400.
	 * @author Fco.Javier Cano
	 * @param año a verificar
	 * @return decir si el año es bisiesto.
	 */
	public static boolean esBisiesto(int _year)
	{
		boolean esBisiesto = _year%4 == 0 && _year % 100 != 0;
		return esBisiesto;
	}
	//	12)	Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por espacios. Muestra también el máximo, el mínimo y la media de esos números.
	/*
	 * 3.	Realiza un programa que, dado un año, diga si es bisiesto. 
	 * Un año es bisiesto si es múltiplo de 4, exceptuando los múltiplos de 100,
	 * que solo son bisiestos cuando son múltiplos además de 400.
	 * @author Fco.Javier Cano
	 * @param año a verificar
	 * @return decir si el año es bisiesto.
	 */
	public static boolean esBisiesto(int _year)
	{
		boolean esBisiesto = _year%4 == 0 && _year % 100 != 0;
		return esBisiesto;
	}
	//	13)	Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El programa pedirá la altura. Ejemplo:
	/*
	 * 3.	Realiza un programa que, dado un año, diga si es bisiesto. 
	 * Un año es bisiesto si es múltiplo de 4, exceptuando los múltiplos de 100,
	 * que solo son bisiestos cuando son múltiplos además de 400.
	 * @author Fco.Javier Cano
	 * @param año a verificar
	 * @return decir si el año es bisiesto.
	 */
	public static boolean esBisiesto(int _year)
	{
		boolean esBisiesto = _year%4 == 0 && _year % 100 != 0;
		return esBisiesto;
	}
	//	 
//	14)	Haz un programa que pida un número, entre 0 y 10, y escriba un triángulo invertido con dichos números. Por ejemplo, si n=10: 
	/*
	 * 3.	Realiza un programa que, dado un año, diga si es bisiesto. 
	 * Un año es bisiesto si es múltiplo de 4, exceptuando los múltiplos de 100,
	 * que solo son bisiestos cuando son múltiplos además de 400.
	 * @author Fco.Javier Cano
	 * @param año a verificar
	 * @return decir si el año es bisiesto.
	 */
	public static boolean esBisiesto(int _year)
	{
		boolean esBisiesto = _year%4 == 0 && _year % 100 != 0;
		return esBisiesto;
	}
	//	15)	Realiza un programa que devuelva la cantidad de vocales, consonantes y espacios en una cadena dada. Supondremos que no las vocales no estarán acentuadas.
	/*
	 * 3.	Realiza un programa que, dado un año, diga si es bisiesto. 
	 * Un año es bisiesto si es múltiplo de 4, exceptuando los múltiplos de 100,
	 * que solo son bisiestos cuando son múltiplos además de 400.
	 * @author Fco.Javier Cano
	 * @param año a verificar
	 * @return decir si el año es bisiesto.
	 */
	public static boolean esBisiesto(int _year)
	{
		boolean esBisiesto = _year%4 == 0 && _year % 100 != 0;
		return esBisiesto;
	}
	//	16)	Pedir un número entero y decir si es capicúa, es decir, por ejemplo: 1001 es capicúa.
	/*
	 * 3.	Realiza un programa que, dado un año, diga si es bisiesto. 
	 * Un año es bisiesto si es múltiplo de 4, exceptuando los múltiplos de 100,
	 * que solo son bisiestos cuando son múltiplos además de 400.
	 * @author Fco.Javier Cano
	 * @param año a verificar
	 * @return decir si el año es bisiesto.
	 */
	public static boolean esBisiesto(int _year)
	{
		boolean esBisiesto = _year%4 == 0 && _year % 100 != 0;
		return esBisiesto;
	}
	//	17)	Realiza un programa que muestre al azar el nombre de una carta de la baraja francesa (cuatro palos: picas, corazones, diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A que sería el 1).
	/*
	 * 3.	Realiza un programa que, dado un año, diga si es bisiesto. 
	 * Un año es bisiesto si es múltiplo de 4, exceptuando los múltiplos de 100,
	 * que solo son bisiestos cuando son múltiplos además de 400.
	 * @author Fco.Javier Cano
	 * @param año a verificar
	 * @return decir si el año es bisiesto.
	 */
	public static boolean esBisiesto(int _year)
	{
		boolean esBisiesto = _year%4 == 0 && _year % 100 != 0;
		return esBisiesto;
	}
	//	18)	Modificar el ejercicio anterior para que trabaje con la baraja española. Esta consta de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
	/*
	 * 3.	Realiza un programa que, dado un año, diga si es bisiesto. 
	 * Un año es bisiesto si es múltiplo de 4, exceptuando los múltiplos de 100,
	 * que solo son bisiestos cuando son múltiplos además de 400.
	 * @author Fco.Javier Cano
	 * @param año a verificar
	 * @return decir si el año es bisiesto.
	 */
	public static boolean esBisiesto(int _year)
	{
		boolean esBisiesto = _year%4 == 0 && _year % 100 != 0;
		return esBisiesto;
	}
	//	19)	Dadas dos fechas, mostrar el número de días que hay de diferencia. Para una mayor comodidad, supondremos que todos los meses tienen 30 días.
	/*
	 * 3.	Realiza un programa que, dado un año, diga si es bisiesto. 
	 * Un año es bisiesto si es múltiplo de 4, exceptuando los múltiplos de 100,
	 * que solo son bisiestos cuando son múltiplos además de 400.
	 * @author Fco.Javier Cano
	 * @param año a verificar
	 * @return decir si el año es bisiesto.
	 */
	public static boolean esBisiesto(int _year)
	{
		boolean esBisiesto = _year%4 == 0 && _year % 100 != 0;
		return esBisiesto;
	}
	//	20)	Realizar un programa que muestre el producto de los N primeros números impares.
	/*
	 * 3.	Realiza un programa que, dado un año, diga si es bisiesto. 
	 * Un año es bisiesto si es múltiplo de 4, exceptuando los múltiplos de 100,
	 * que solo son bisiestos cuando son múltiplos además de 400.
	 * @author Fco.Javier Cano
	 * @param año a verificar
	 * @return decir si el año es bisiesto.
	 */
	public static boolean esBisiesto(int _year)
	{
		boolean esBisiesto = _year%4 == 0 && _year % 100 != 0;
		return esBisiesto;
	}
	//	21)	Diseña una aplicación que muestre las tablas de multiplicar del 1 al 10.
	/*
	 * 3.	Realiza un programa que, dado un año, diga si es bisiesto. 
	 * Un año es bisiesto si es múltiplo de 4, exceptuando los múltiplos de 100,
	 * que solo son bisiestos cuando son múltiplos además de 400.
	 * @author Fco.Javier Cano
	 * @param año a verificar
	 * @return decir si el año es bisiesto.
	 */
	public static boolean esBisiesto(int _year)
	{
		boolean esBisiesto = _year%4 == 0 && _year % 100 != 0;
		return esBisiesto;
	}
	//	22)	Dada una cadena, devolver la mitad de esta.
	/*
	 * 3.	Realiza un programa que, dado un año, diga si es bisiesto. 
	 * Un año es bisiesto si es múltiplo de 4, exceptuando los múltiplos de 100,
	 * que solo son bisiestos cuando son múltiplos además de 400.
	 * @author Fco.Javier Cano
	 * @param año a verificar
	 * @return decir si el año es bisiesto.
	 */
	public static boolean esBisiesto(int _year)
	{
		boolean esBisiesto = _year%4 == 0 && _year % 100 != 0;
		return esBisiesto;
	}
	//	23)	Modificar el programa anterior para que nos permita elegir si queremos obtener la mitad izquierda o derecha.
	/*
	 * 3.	Realiza un programa que, dado un año, diga si es bisiesto. 
	 * Un año es bisiesto si es múltiplo de 4, exceptuando los múltiplos de 100,
	 * que solo son bisiestos cuando son múltiplos además de 400.
	 * @author Fco.Javier Cano
	 * @param año a verificar
	 * @return decir si el año es bisiesto.
	 */
	public static boolean esBisiesto(int _year)
	{
		boolean esBisiesto = _year%4 == 0 && _year % 100 != 0;
		return esBisiesto;
	}
	//	24)	Dada una cadena, reemplaza todas las letras a por una e y devuelve cuantas has letras has reemplazado.
	/*
	 * 3.	Realiza un programa que, dado un año, diga si es bisiesto. 
	 * Un año es bisiesto si es múltiplo de 4, exceptuando los múltiplos de 100,
	 * que solo son bisiestos cuando son múltiplos además de 400.
	 * @author Fco.Javier Cano
	 * @param año a verificar
	 * @return decir si el año es bisiesto.
	 */
	public static boolean esBisiesto(int _year)
	{
		boolean esBisiesto = _year%4 == 0 && _year % 100 != 0;
		return esBisiesto;
	}
	//	25)	Realiza una calculadora que nos pida dos operandos enteros y un signo matemático. Tras realizar la operación indicada, nos deberá mostrar el resultado. Las operaciones soportadas son: +, -, *, /, ^ (potencia, primer operando base y segundo exponente) y %.
	/*
	 * 3.	Realiza un programa que, dado un año, diga si es bisiesto. 
	 * Un año es bisiesto si es múltiplo de 4, exceptuando los múltiplos de 100,
	 * que solo son bisiestos cuando son múltiplos además de 400.
	 * @author Fco.Javier Cano
	 * @param año a verificar
	 * @return decir si el año es bisiesto.
	 */
	public static boolean esBisiesto(int _year)
	{
		boolean esBisiesto = _year%4 == 0 && _year % 100 != 0;
		return esBisiesto;
	}
	
	public static void main(String[] args) 
	{
		randomGame();	
	}
}


