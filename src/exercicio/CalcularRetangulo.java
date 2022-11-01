package exercicio;

import java.util.Scanner;

/*1. Dado o tamanho da base e da altura de um retângulo,
 *  calcular a sua área e o seu
perímetro.*/

public class CalcularRetangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Favor digitar a altura do retangulo: ");
		double altura = sc.nextDouble();
		
		System.out.println("Favor digitar a base do retangulo: ");
		double base = sc.nextDouble();
		
		double area = (altura) * (base);
		double perimetro = (altura*2) + (base*2);
		
		System.out.printf("A area do Retangulo e: %.2f\n", area);
		System.out.printf("O perimetro do Retangulo e: %.2f\n ", perimetro);
		
		sc.close();
		
	}

}
