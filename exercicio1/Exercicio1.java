package exercicio1;

import java.util.Scanner;

public class Exercicio1 {

	/*  Elabore um algoritmo para mostrar os números ímpares existentes em um intervalo. O
		usuário deverá fornecer os valores inicial (inicial > 0) e final (inicial < final) e os números
		ímpares existentes no intervalo ([inicial, final]) devem ser separados por um espaço em
		branco.
		Exemplo:
		Entrada: 2 13
		Saída: 3 5 7 9 11 13*
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int start = 0;
		int end = 0;
		
		System.out.print("Informe o número inicial (maior que 0 [zero]: ");
		start = sc.nextInt();
		System.out.print("Informe o número final (maior que o inicial): ");
		end = sc.nextInt();
		
		System.out.print("Resultado: ");
		if(start > 0 && end > start) {
			for (int i = start; i <= end; i++) {
				if(i % 2 == 1)
					System.out.print(i + " ");
			}
		}
		else {
			System.out.println("Informe os números de acordo com o solicitado.");
		}
		
		sc.close();
	}

}
