package reto;

import java.util.Scanner;

public class Funciones1 {
 
	
	public static int sumar(Scanner sc) {
		System.out.print("Numero1: ");
		String cadena = sc.nextLine();
		int n1 = Integer.parseInt(cadena);
		System.out.print("Numero2: ");
		cadena = sc.nextLine();
		int n2 = Integer.parseInt(cadena);
		return n1+n2;
	}
	
	public static int restar(int n1,int n2) {
		return n1-n2;
	}
	
	public static boolean esPar(int n) {
		return n%2==0;
		
	}
	
	public static boolean esImpar(int n) {
		return n%2!=0;
	}
}
