package Apostila;

import java.util.Scanner;

public class Ex34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String alternativa;

		System.out.println("Valor de X: ");
		int x = sc.nextInt();
		
		System.out.println("Valor de Y: ");
		int y = sc.nextInt();
		
		int z = x*y+5;

		if (z<=0) {
			alternativa = "A";
		} else if (z<=100) {
			alternativa = "B";
		} else {
			alternativa = "C";
		}
		
		System.out.println("Total: "+z+" "+alternativa);
		
		sc.close();
	}
}
