package exercicio;
/* Dado o tamanho do raio de uma circunferência, calcular a área
 *  e o perímetro da mesma.
 *  area = PI * raio2
 *  perimetro = 2*PI*raio */

import java.util.Scanner;

public class CalcularRaio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double PI = 3.14;
		
		System.out.println(" Favor digitar o raio do circunferencia: ");
		double raio = sc.nextDouble();
		
		double area = PI * (raio * raio);
		double perimetro = 2 * PI * raio;
		
		System.out.printf(" A area da circunferencia: %.2f\n", area);
		System.out.printf("O perimetro da circunferencia: %.2f\n", perimetro);
		
		
		sc.close();
		
		
		
		

	}

}
