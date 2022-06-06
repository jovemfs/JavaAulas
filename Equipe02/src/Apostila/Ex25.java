package Apostila;

import java.util.Scanner;

public class Ex25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o número da conta: ");
		int numConta = sc.nextInt();
		
		System.out.println("Informe o saldo: ");
		float saldo = sc.nextFloat();
		
		System.out.println("Informe a quantidade de créditos: ");
		float credito = sc.nextFloat();
		
		System.out.println("Informe o valor a ser debitado: ");
		float debito = sc.nextFloat();
		
		float saldoAtual = saldo-debito+credito;
		
		if (saldoAtual <= -1) {
			System.out.println("A conta de número "+numConta+" se encontra NEGATIVA. Saldo atual: R$ "+saldoAtual);
		} else if (saldoAtual == 0) { 
			System.out.println("A conta de número "+numConta+" se encontra ZERADA. Saldo atual: R$ "+saldoAtual);
		} else {
			System.out.println("A conta de número "+numConta+" se encontra POSITIVA. Saldo atual: R$ "+saldoAtual);
		}
		
		sc.close();
	}
}
