package Apostila;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o total de votos válidos: ");
		int validos = sc.nextInt();

		System.out.println("Insira o total de votos brancos: ");
		int brancos = sc.nextInt();

		System.out.println("Insira o total de votos nulos: ");
		int nulos = sc.nextInt();

		int total = nulos+brancos+validos;

		int pVotosValidos = validos*100/total;
		int pVotosBrancos = brancos*100/total;
		int pVotosNulos = nulos*100/total;

		System.out.println("A porcentagem de votos validos foi de "+pVotosValidos+"%.");
		System.out.println("A porcentagem de votos brancos foi de "+pVotosBrancos+"%.");
		System.out.println("A porcentagem de votos nulos foi de "+pVotosNulos+"%.");
		sc.close();
		}
}
