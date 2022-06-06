package Apostila;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um valor qualquer: ");
		float n = sc.nextFloat();
		
		if (n<0){
			System.out.println("Negativo.");
		} else if (n==0) {
			System.out.println("Neutro.");
		} else {
			System.out.println("Positivo.");
		}
		
		sc.close();
	}
}
