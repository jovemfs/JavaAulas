package Apostila;

import java.util.Scanner;

public class Ex42 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ID do funcionário: ");
		int idFuncionario = sc.nextInt();
		
		System.out.println("Ano de nascimento (4 dígitos): ");
		int nascimento = sc.nextInt();
		
		System.out.println("Ano atual (4 dígitos): ");
		int ano = sc.nextInt();
		
		System.out.println("Ano de ingressão na empresa (4 dígitos): ");
		int ingressaoEmp = sc.nextInt();
		
		int idade = ano-nascimento;

		int tempoTrabalhado = ano - ingressaoEmp;

		if (idade >= 65) {
			System.out.println("O funcionário de ID ["+idFuncionario+"] requer aposentadoria.");
		} else if (tempoTrabalhado >= 30) {
			System.out.println("O funcionário de ID ["+idFuncionario+"] requer aposentadoria.");
		} else if ((tempoTrabalhado >= 25) && (idade >= 60)) {
			System.out.println("O funcionário de ID ["+idFuncionario+"] requer aposentadoria.");
		} else {
			System.out.println("O funcionário de ID ["+idFuncionario+"] não requer  requer aposentadoria.");
		}
		sc.close();
	}
}
