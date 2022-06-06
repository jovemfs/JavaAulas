package Apostila;

import java.util.Scanner;

public class Ex28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int maior;
		
		System.out.println("Primeiro valor: ");
		int n1 = sc.nextInt();
		
		System.out.println("Segundo valor: ");
		int n2 = sc.nextInt();
		
		System.out.println("Terceiro valor: ");
		int n3 = sc.nextInt();
		
		if (n1>=n2) {
		   maior = n1;
		} else {
		   maior = n2;
		};

		if (n3>=maior) {
		   maior = n3;
		}
		
		System.out.println("Maior valor: "+maior);
		
		sc.close();
	}
}
