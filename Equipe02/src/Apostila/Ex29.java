package Apostila;

import java.util.Scanner;

public class Ex29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total;
		
		System.out.println("Primeiro valor: ");
		int n1 = sc.nextInt();
		
		System.out.println("Segundo valor: ");
		int n2 = sc.nextInt();
		
		System.out.println("Terceiro valor: ");
		int n3 = sc.nextInt();
		
		if ((n1>n2) && (n2>n3)) {
		    total = n1 + n2;
		    System.out.println("Soma dos dois maiores valores: "+total);
		} else if ((n3>n2) && (n2>n1)) {
		    total = n3 + n2;
		    System.out.println("Soma dos dois maiores valores: "+total);
		} else if ((n3>n1) && (n1>n2)) {
		    total = n3 + n1;
		    System.out.println("Soma dos dois maiores valores: "+total);
		}
		
		sc.close();
	}
}
