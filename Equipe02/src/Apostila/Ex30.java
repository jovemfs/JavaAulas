package Apostila;

import java.util.Scanner;

public class Ex30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Primeiro valor: ");
		int n1 = sc.nextInt();
		
		System.out.println("Segundo valor: ");
		int n2 = sc.nextInt();
		
		System.out.println("Terceiro valor: ");
		int n3 = sc.nextInt();
		
		if ((n1 < n2) && (n2 < n3) && (n3 > n1) && (n3 > n2)){
			System.out.println(n1 +" < "+ n2 +" < "+ n3);
		} else if ((n1 < n2) && (n1 < n3) && (n2 > n1) && (n2 > n3)) {
			System.out.println(n1 +" < "+ n3 +" < "+ n2);
		}else if ((n1 > n2) && (n1 < n3) && (n2 < n3) && (n3 > n1)) {
			System.out.println(n2 +" < "+ n1 +" < "+ n3);
		}else if ((n3 < n1) && (n3 < n2) && (n2 > n3) && (n2 > n1)) {
			System.out.println(n3 +" < "+ n1 +" < "+ n2);
		}else if ((n3 < n1) && (n3 < n2) && (n2 < n1) && (n2 > n3)) {
			System.out.println((n3 +" < "+ n2 +" < "+ n1));
		}else if ((n1 > n2) && (n1 > n3) && (n2 < n3) && (n3 < n1)) {
			System.out.println((n2 +" < "+ n3 +" < "+ n1));
		}
		sc.close();
	}
}
