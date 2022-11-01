package oo;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int operacao = 0;
		
		System.out.println(" Digite o primeiro numero: ");
		a = sc.nextInt();
		System.out.println(" Digite o segundo numero: ");
		b = sc.nextInt();
		
		System.out.println("Qual a operacao voce deseja? 1(+), 2(-), 3(*): ");
		operacao = sc.nextInt();
		
		if (operacao == 1) {
			Soma soma = new Soma();
			soma.somar (a, b);
			
		} if (operacao == 2) {
			Diferenca diference = new Diferenca();
			diference.diference(a, b);
			
			
		} if (operacao == 3) {
			Multiply multiply = new Multiply();
			multiply.multiply(a, b);
			
		}	
		
	
	}

}
