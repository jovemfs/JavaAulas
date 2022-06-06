package Apostila;

import java.util.Scanner;

public class Ex24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o salário fixo: ");
		float salarioFixo = sc.nextFloat();
		
		System.out.println("Informe o valor das vendas neste mês: ");
		float valorVendas = sc.nextFloat();
		
		if (valorVendas<=1500) {
		    float salarioFinal = valorVendas*3/100+salarioFixo;
		    System.out.println("Salário final: "+salarioFinal);
		} else {
		    float salarioFinal = valorVendas*5/100+salarioFixo;
		    System.out.println("Salário final: "+salarioFinal);
		}
		sc.close();
	}
}
