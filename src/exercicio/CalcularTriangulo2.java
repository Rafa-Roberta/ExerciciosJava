package exercicio;

import java.util.Scanner;

/* Dado os três lados de um triângulo determinar se o triangulo e escaleno, isoceles ou
 * equilatero */

public class CalcularTriangulo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Informe o lado do triangulo: ");
		double lado1 = sc.nextDouble();
		System.out.println(" Informe o lado do Triangulo: ");
		double lado2 = sc.nextDouble();
		System.out.println(" Informe o lado do Triangulo: ");
		double lado3 = sc.nextDouble();
		
		if ((lado1 == lado2) && (lado2 == lado3)) {
			System.out.println("Equilatero");
		} else if ((lado1 == lado2) || (lado2 == lado3) || (lado1 == lado3)) {
			System.out.println("Isoceles");
		
		} else {
			
			System.out.println("Escaleno");
		}
		sc.close();
	}
	
}


/* AND 
 * OR apenas uma seja verdadeira
 * && mesmo que and
 * ! mesmo que nao
 * || or
 * */