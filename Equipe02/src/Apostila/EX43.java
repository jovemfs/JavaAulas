package Apostila;

import java.util.Scanner;

public class EX43 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float a,b,c;
		String tipo;

		System.out.println("Valor de A: ");
		a = sc.nextFloat();
		
		System.out.println("Valor de B: ");
		b = sc.nextFloat();
		
		System.out.println("Valor de C: ");
		c = sc.nextFloat();
		
		if ((a < b+c) && (b <a+c) && (c <a+b)){
		    if((a==b) && (b==c)){
		    	tipo = "Triângulo EQUILÁTERO.";
		    } else if ((a==b) || (b==c) || (a==c)){
		    	tipo = "Triângulo ISOCELES.";
		    } else {
		    	tipo = "Triângulo ESCALENO.";
		    }
		} else {
			tipo = "NÃO FORMA um triângulo.";
		}
		
		System.out.println(tipo);
		
		sc.close();
	}
}
