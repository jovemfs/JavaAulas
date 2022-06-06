package Apostila;

import java.util.Scanner;

public class Ex32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o nome do primeiro time: ");
		String time1 = sc.next();
		
		System.out.println("Quantos gols o time "+time1+" fez?");
		int gols1 = sc.nextInt();
		
		System.out.println("nforme o nome do primeiro time: ");
		String time2 = sc.next();
		
		System.out.println("Quantos gols o time "+time2+" fez?");
		int gols2 = sc.nextInt();
		
		if (gols1>gols2) {
			System.out.println("O time "+time1+" foi o vencedor por "+gols1+"x"+gols2+", derrotando o time "+time2);
		} else if (gols1==gols2) {
			System.out.println("O time "+time1+" e o time "+time2+" EMPATARAM.");
		} else {
			System.out.println("O time "+time2+" foi o vencedor por "+gols2+"x"+gols1+", derrotando o time "+time1);
		}
		
		sc.close();
	}
}
