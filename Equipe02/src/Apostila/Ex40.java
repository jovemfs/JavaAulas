package Apostila;

import java.util.Scanner;

public class Ex40 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float valorUni, total, valorFinal;
		int desconto, quantidade;
		
		System.out.println("Nome do produto: ");
		String produto = sc.next();
		
		System.out.println("Quantidade adquirida: ");
		quantidade = sc.nextInt();
		
		System.out.println("Valor por unidade: ");
		valorUni = sc.nextFloat();
		
		total = quantidade*valorUni;
		
		if (quantidade<=5) {
		    desconto = (int) (total*(2/100));
		} else if ((quantidade > 5) && (quantidade<=10)) {
		    desconto = (int) (total*(3/100));
		} else {
		    desconto = (int) (total*(5/100));
		}

		valorFinal = total-desconto;
		
		System.out.println("Com essa quantidade, o produto "+produto+" custará: R$"+valorFinal);
		sc.close();
	}
}
