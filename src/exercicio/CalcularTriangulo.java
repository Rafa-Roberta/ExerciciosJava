package exercicio;

import java.util.Scanner;

/* Dado os três lados de um triângulo determinar o perímetro do mesmo. */

public class CalcularTriangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Informe o lado do triangulo: ");
		double lado1 = sc.nextDouble();
		System.out.println(" Informe o lado do Triangulo: ");
		double lado2 = sc.nextDouble();
		System.out.println(" Informe o lado do Triangulo: ");
		double lado3 = sc.nextDouble();
		
		double perimetro = lado1 + lado2 + lado3;
		System.out.printf(" O perimetro do triangulo e: %.2f", perimetro);
		
		sc.close();

	}

}
