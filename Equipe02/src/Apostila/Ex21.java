package Apostila;

import java.util.Scanner;

public class Ex21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Horário de início: ");
		int inicioJogo = sc.nextInt();
		
		System.out.println("Horário de término: ");
		int terminoJogo = sc.nextInt();
		
		if (terminoJogo >= inicioJogo) {
		    int duracao = terminoJogo-inicioJogo;
		    System.out.println("Duração: "+duracao+" horas.");
		} else {
		    int duracao = (24-inicioJogo)+terminoJogo;
		    System.out.println("Duração: "+duracao+" horas.");
		}
		
		sc.close();
	}
}
