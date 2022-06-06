package Apostila;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantidade de maçãs compradas: ");
		int macas = sc.nextInt();
		
		if (macas<12) {
				float vfinal = (float) (macas*1.30);
				System.out.println("Valor final: R$"+ vfinal);
		} else {
		    	float vfinal = (float) (macas*1.00);
		    	System.out.println("Valor final: R$"+ vfinal);

		}
		
		sc.close();
	}
}
