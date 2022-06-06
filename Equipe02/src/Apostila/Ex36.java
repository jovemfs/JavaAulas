package Apostila;

import java.util.Scanner;

public class Ex36 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade1,idade2;

		System.out.println("Idade do primeiro homem: ");
		int homem1 = sc.nextInt();
		
		System.out.println("Idade do segundo homem: ");
		int homem2 = sc.nextInt();
		
		System.out.println("Idade da primeira mulher: ");
		int mulher1 = sc.nextInt();
		
		System.out.println("Idade da segunda mulher: ");
		int mulher2 = sc.nextInt();
		
		if ((homem1>homem2) && (mulher1>mulher2)){
		    idade1 = homem1+mulher2;
		    idade2 = homem2+mulher1;
		    System.out.println("Soma das idades do homem mais velho e da mulher mais nova: "+idade1);
		    System.out.println("Soma das idades do homem mais novo e da mulher mais velha: "+idade2);
		} else if ((homem1>homem2) && (mulher1<mulher2)) {
		    idade1=homem1+mulher1;
		    idade2=homem2+mulher2;
		    System.out.println("Soma das idades do homem mais velho e da mulher mais nova: "+idade1);
		    System.out.println("Soma das idades do homem mais novo e da mulher mais velha: "+idade2);
		} else if ((homem1<homem2) && (mulher1>mulher2)) {
		    idade1=homem2+mulher2;
		    idade2=homem1+mulher1;
		    System.out.println("Soma das idades do homem mais velho e da mulher mais nova: "+idade1);
		    System.out.println("Soma das idades do homem mais novo e da mulher mais velha: "+idade2);
		} else if ((homem1<homem2) && (mulher1<mulher2)){
		    idade1=homem2+mulher1;
		    idade2=homem1+mulher2;
		    System.out.println("Soma das idades do homem mais velho e da mulher mais nova: "+idade1);
		    System.out.println("Soma das idades do homem mais novo e da mulher mais velha: "+idade2);
		}
		sc.close();
	}
}
