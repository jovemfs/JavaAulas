package Apostila;

import java.util.Scanner;

public class Ex33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Primeiro valor: ");
		int n1 = sc.nextInt();
		
		System.out.println("Segundo valor: ");
		int n2 = sc.nextInt();
		
		if (n1>n2) {
			System.out.println(n1+" é o maior");
		} else if (n1<n2) {
			System.out.println(n2+" é o maior");
		} else if (n1==n2) {
			System.out.println("Valores iguais");
		}
		sc.close();
	}
}
