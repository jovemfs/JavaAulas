package Apostila;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe sua idade: ");
		int anos = sc.nextInt();

		System.out.println("Quantos meses se passaram desde seu aniversário? ");
		int meses = sc.nextInt();

		System.out.println("Quantos dias se passaram desde seu mesversário? ");
		int dias = sc.nextInt();

		int diasDeVida = anos*365+meses*30+dias;

		System.out.println("Você tem "+diasDeVida+" dias de vida.");
		sc.close();
		}
}
