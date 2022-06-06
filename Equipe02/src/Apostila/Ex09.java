package Apostila;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe seu salário atual: ");
		float salario = sc.nextFloat();

		System.out.println("Informe o reajuste de seu salário (em porcentagem): ");
		int reajuste = sc.nextInt();

		int aumento = (int) (salario*reajuste/100);

		float salarioFinal = salario+aumento;

		System.out.println("O novo salário, já com o aumento, será R$ "+salarioFinal);
		
		sc.close();
	}
}
