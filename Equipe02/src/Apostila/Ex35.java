package Apostila;

import java.util.Scanner;

public class Ex35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float valorFinal;
		
		System.out.println("Informe o tipo, sendo 1 para gasolina e 2 para álcool");
		int combustivel = sc.nextInt();
		
		System.out.println("Quantidade de litros: ");
		float litros = sc.nextFloat();
		
		if ((combustivel ==1) && (litros<=20)) {
			valorFinal = (float) (3.3*(litros*(1-4/100)));
		    System.out.println("Preço: R$ "+valorFinal);
		} else if ((combustivel == 1) && (litros>20)) {
			valorFinal = (float) (3.3*(litros*(1-(6/100))));
		    System.out.println("Preço: R$ "+valorFinal);
		} else if ((combustivel == 2) && (litros<=20)) {
			valorFinal= (float) (2.9*(litros*(1-(3/100))));
		    System.out.println("Preço: R$ "+valorFinal);
		} else if ((combustivel == 2) && (litros>20)) {
			valorFinal= (float) (2.9*(litros*(1-(5/100))));
		    System.out.println("Preço: R$ "+valorFinal);
		}
		sc.close();
	}
}
