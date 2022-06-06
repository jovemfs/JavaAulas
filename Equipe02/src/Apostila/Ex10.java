package Apostila;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o custo original do carro: ");
		float custo = sc.nextFloat();
		
		float pImpos = custo*45/100;
		
		float pDist = custo*28/100;
		
		float custofinal = custo + pDist +pImpos;
		
		System.out.println("Custo final: R$"+custofinal);
		
		sc.close();
	}
}
