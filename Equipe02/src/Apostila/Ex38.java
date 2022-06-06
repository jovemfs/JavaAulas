package Apostila;

import java.util.Scanner;

public class Ex38 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id1,id2,senha1,senha2;
		
		System.out.println("-=-=-= REGISTRO =-=-=-");

		System.out.println("ID de Usuario: ");
		id1 = sc.nextInt();
		
		System.out.println("Senha pessoal: ");
		senha1 = sc.nextInt();
		
		System.out.println("-=-=-= LOGIN =-=-=-");
		
		System.out.println("ID de Usuario: ");
		id2 = sc.nextInt();
		
		if (id2 == id1) {
			System.out.println("Senha pessoal: ");
			senha2 = sc.nextInt();
			if (senha2 == senha1) {
				System.out.println("SUCESSO NO LOGIN. BEM-VINDO!");
			} else {
				System.out.println("Senha inválida.");
			}
		} else {
			System.out.println("ID inválido.");
		}
		sc.close();
	}
}
