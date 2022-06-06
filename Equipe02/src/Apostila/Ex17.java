package Apostila;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Primeira nota: ");
		int nota1 = sc.nextInt();
		
		System.out.println("Segunda nota: ");
		int nota2 = sc.nextInt();
		
		int notaFinal = (nota1+nota2)/2;

		if (notaFinal < 6) {
			System.out.println("REPROVADO. Nota final:"+notaFinal);   
		} else {
			System.out.println("APROVADO. Nota final:"+notaFinal);
		}
		
		sc.close();
	}
}
