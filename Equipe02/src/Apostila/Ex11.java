package Apostila;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o salario fixo do funcionário: ");
		float salariofixo = sc.nextFloat();
		
		System.out.println("Informe quanto é recebido por cada carro vendido: ");
		float valorcarro = sc.nextFloat();
		
		System.out.println("Informe a quantidade de carros vendidos: ");
		float carrovendido = sc.nextFloat();
		
		System.out.println("Informe o valor total das vendas do funcionário: ");
		float vendast = sc.nextFloat();
		
		float comi1 = carrovendido*valorcarro;

		float comi2 = vendast*5/100;

		float finals = comi1 + comi2 + salariofixo;
		
		System.out.println("Valor final: R$"+finals);
		
		sc.close();
	}
}
