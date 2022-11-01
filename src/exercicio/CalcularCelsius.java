package exercicio;

import java.util.Scanner;

/* Dado que a fórmula para conversão de Fahrenheit para Celsius
 *  é C = 5/9 (F – 32), leu um
valor de temperatura em Fahrenheit e exibi-lo em Celsius */

public class CalcularCelsius {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Favor digite seu nome: ");
		String nome = sc.nextLine();
		
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		
		double f = sc.nextDouble();
		
		double c = (f - 32) * 5/9;
		
		System.out.printf("%s, a temperatura %.2f Fahrenheit em celsius e: %.2f\n", nome, f, c);
		System.out.println(nome + " a temperatura " + f + " Fahrenheit em celsiusm e: " + c);
		
		
		sc.close();

	}

}
