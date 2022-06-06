package Apostila;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Primeira nota: ");
		float nota1 = sc.nextFloat();
		
		System.out.println("Segunda nota: ");
		float nota2 = sc.nextFloat();
		
		System.out.println("Terceira nota: ");
		float nota3 = sc.nextFloat();
		
		int media = (int) ((nota1*2+nota2*3+nota3*5)/10);
		
		System.out.println("Média final: "+media);
		
		sc.close();
	}
}
