package Apostila;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um valor: ");
		int n1 = sc.nextInt();
		
		System.out.println("Insira outro valor: ");
		int n2 = sc.nextInt();
		
		if (n1 > n2) {
			System.out.println(n1+" > "+n2);
		} else {
			System.out.println(n2+" > "+n1);
		}
		
		sc.close();
	}
}
