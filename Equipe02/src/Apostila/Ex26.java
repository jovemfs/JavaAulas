package Apostila;

import java.util.Scanner;

public class Ex26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantidade de produtos em estoque: ");
		int emEstoque = sc.nextInt();
		
		System.out.println("Quantidade máxima permitida em estoque: ");
		int estoqueMaximo = sc.nextInt();
		
		System.out.println("Quantidade mínima permitida em estoque: ");
		int estoqueMinimo = sc.nextInt();
		
		int media = (estoqueMaximo+estoqueMinimo)/2;

		if (emEstoque>=media) {
			System.out.println("Não compre.");
		} else {
			System.out.println("Compre.");
		}
		sc.close();
	}
}
