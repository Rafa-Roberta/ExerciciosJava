package exercicio;

/* Escreva um codigo que conte de 1 ate 10 e, se o numero for multiplo de 5, exiba a frase " E multiplo de 5" */

public class Contador {
// while eu uso quando eu nao tenho ideia de quantas vezes o loop ira rodar. 
	
	public static void main(String[] args) {
		for (int i = 1; i <=10; i++) {
			if (i%5!=0) {
			System.out.println(i);
			}
			if (i%5== 0) {
				System.out.println(i + " E multiplo de 5");
		
			}
			
		}
	}
}

/* + A + B = X
- a - b = y
* a * b = w
/ a / b = t
% a / b = t resto da divisao
= atribuicao 
== comparacao 
 */
