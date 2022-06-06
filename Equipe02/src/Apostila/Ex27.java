package Apostila;

import java.util.Scanner;

public class Ex27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um valor: ");
		int numero = sc.nextInt();
		
		if (numero<= -1) {
			System.out.println("NEGATIVO");
		} else if (numero == 0) {
			System.out.println("ZERO");
		} else {
			System.out.println("POSITIVO");
		}
		sc.close();
	}
}
