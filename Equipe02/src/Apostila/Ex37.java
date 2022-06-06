package Apostila;

import java.util.Scanner;


public class Ex37 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int p1,p2;

		System.out.println("Quantidade (em Kg) de morangos comprados: ");
		int morango = sc.nextInt();
		
		System.out.println("Quantidade (em Kg) de maçãs compradas:");
		int macas = sc.nextInt();
		
		if (morango>5){
		    p1=(int) (morango*2.2);
		} else {
		    p1=(int) (morango*2.5);
		}

		if (macas>5){
		    p2=(int) (macas*1.5);
		} else {
		    p2=(int) (macas*1.8);
		}

		int kgTotal = macas+morango;

		int precoTotal = p1+p2;

		if ((precoTotal>25) || (kgTotal>8)){
			System.out.println("Valor final: R$ "+(precoTotal-(precoTotal*10/100)));
		} else {
			System.out.println("Valor final: R$ "+precoTotal);
		}
		sc.close();
	}
}
