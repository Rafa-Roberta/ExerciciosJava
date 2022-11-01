package exercicio;

import java.util.Scanner;

/*Ler um número inteiro e exibir o seu sucessor.*/
public class Sucessor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean parar = false;
		
		while (!parar) {			
			String resposta = "";
			System.out.println("Informe um numero: ");
			int numero = sc.nextInt();
			
			int sucessor = numero + 1;
			System.out.println("o numero sucessor "+ sucessor);
						
			System.out.println(" Deseja continuar? s ou n: ");
			resposta = sc.next();
			
			if ( resposta.equalsIgnoreCase("n")) {
				System.out.println("Finalizou");
				parar = true;
			}else {
				parar = false;
			}
		
		}
		
	}
}


