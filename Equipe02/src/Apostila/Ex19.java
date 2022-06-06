package Apostila;

import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um valor: ");
		int n1 = sc.nextInt();
		
		System.out.println("Insira outro valor: ");
		int n2 = sc.nextInt();
		
		if (n1 > n2){
			System.out.println("O valor "+n1+" é maior que "+n2);
		} else {
			System.out.println("O valor "+n2+" é maior que "+n1);
		}
		
		sc.close();
	}
}
