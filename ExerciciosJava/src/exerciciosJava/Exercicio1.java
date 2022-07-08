package exerciciosJava;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	 
		
		int vetor[] = new int [3];
		int maiorNumero = 0;
		
		for(int i = 0; i <3; i ++) {
		int contador = i +1;
		System.out.println("Informe o "+ contador + "º valor");
		Scanner entrada = new Scanner(System.in);
		vetor[i] = entrada.nextInt();
		
			if(maiorNumero< vetor[i]) {
			maiorNumero = vetor[i];
			}
		}
		System.out.println("O maior valor digitado foi: " + maiorNumero);
	}
}
