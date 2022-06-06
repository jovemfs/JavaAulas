package Apostila;

import java.util.Scanner;

public class Ex23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		String nome = sc.next();
		
		System.out.println("Informe seu sexo, sendo (1) para MASCULINO e (2) para FEMININO: ");
		int sexo = sc.nextInt();
		
		System.out.println("Informe sua altura: ");
		float altura = sc.nextFloat();
		
		if (sexo == 1) {
		    float pesoIdeal = (float) ((72.7*altura)-58);
		    System.out.println("Seja bem-vindo, "+nome+". O seu peso ideal é "+pesoIdeal+"kg.");
		} else if (sexo == 2) {
		    float pesoIdeal = (float) ((62.1*altura)-44.7);
		    System.out.println("Seja bem-vinda, "+nome+". O seu peso ideal é "+pesoIdeal+"kg.");
		}
		
		sc.close();
		
	}
}
