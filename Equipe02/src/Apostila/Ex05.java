package Apostila;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira um valor: ");
		int numero = sc.nextInt();


		int resultado = numero-1;

		System.out.println("O numero antecessor ao seu numero é: "+resultado);
		sc.close();
		}
}
