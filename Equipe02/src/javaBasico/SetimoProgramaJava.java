package javaBasico;

import java.util.Scanner;

public class SetimoProgramaJava {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um valor: ");
		int numero = sc.nextInt();
		System.out.println("Insira um valor: ");
		int numero1 = sc.nextInt();
		System.out.println("Resultado da divisão: " + (numero/numero1));
}
}
