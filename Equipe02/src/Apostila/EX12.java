package Apostila;

import java.util.Scanner;

public class EX12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Temperatura em Fahrenheit: ");
		float fahrenheit = sc.nextFloat();
		
		float celsius = 5*(fahrenheit-32)/9;
		
		System.out.println("Temperatura convertida em Celsius: "+celsius+"°C.");
		sc.close();
	}
}
