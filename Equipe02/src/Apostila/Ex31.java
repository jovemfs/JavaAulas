package Apostila;

import java.util.Scanner;

public class Ex31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Valor de A: ");
		int a = sc.nextInt();
		
		System.out.println("Valor de B: ");
		int b = sc.nextInt();
		
		System.out.println("Valor de C: ");
		int c = sc.nextInt();
		
		if ((a+b) < c){
			System.out.println("NÃO FORMA um triângulo.");
		} else if ((b+c) < a){
			System.out.println("NÃO FORMA um triângulo.");
		} else if ((a+c) < b){
			System.out.println("NÃO FORMA um triângulo.");
		} else {
			System.out.println("FORMA um triângulo.");
		}
		sc.close();
	}
}
