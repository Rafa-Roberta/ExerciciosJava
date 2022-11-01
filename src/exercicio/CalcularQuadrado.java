package exercicio;

import java.util.Scanner;

/*Dado o tamanho do lado de um quadrado,
 *  calcular a área e o perímetro do mesmo*/

public class CalcularQuadrado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Favor digitar o lado do quadrado: ");
		
		double lado = sc.nextDouble();
		
		double area = lado * lado;
		double perimetro = lado * 4; 
		
		System.out.printf("A area do quadrado e: %.2f\n", area);
		System.out.printf("O perimetro do quadrado e: %.2f\n", perimetro);
		
		
		sc.close();

	}

}
