package Apostila;

import java.util.Scanner;

public class Ex22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Horas trabalhadas neste mês: ");
		int horasTrabalhadas = sc.nextInt();
		
		System.out.println("Valor recebido por hora: ");
		int valorHora = sc.nextInt();
		
		if (horasTrabalhadas > 160) {
		    int comissao = (horasTrabalhadas-160)*valorHora+valorHora*50/100;
		    int sF = 160*valorHora+comissao;
		    System.out.println("Salário final: R$ "+sF);
		} else {
		    int sF = horasTrabalhadas*valorHora;
		    System.out.println("Salário final: R$ "+sF);
		}
		
		sc.close();
	}
}
