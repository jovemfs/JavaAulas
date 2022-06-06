package Apostila;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ano de nascimento (4 dígitos): ");
		int dataNasc = sc.nextInt();
		
		System.out.println("Ano ATUAL (4 dígitos): ");
		int anoAtual = sc.nextInt();
		
		int situacaoVoto = anoAtual-dataNasc;

		if (situacaoVoto> 17) {
			System.out.println("Deve votar.");
		} else {
			System.out.println("Não pode votar");
		}
		
		sc.close();
	}
}
