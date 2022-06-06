package Apostila;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um valor qualquer: ");
		float n = sc.nextFloat();
		
		if (n>10) {
			System.out.println("MAIOR que 10.");
		} else 
		    if (n==10){
		    	System.out.println("IGUAL a 10.");
		    } else {
		    	System.out.println("MENOR que 10.");
		    }
		
		sc.close();
	}
}
