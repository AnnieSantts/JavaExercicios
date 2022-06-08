package exerciciosJava;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
	/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
	número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
	ímpar exiba o número elevado ao quadrado. */
		
		int valor = 0;
		System.out.println(" Informe um valor");
		Scanner leia = new Scanner(System.in);
		valor = leia.nextInt();
		if(valor % 2 == 0) {
			double raiz = Math.sqrt(valor);
			System.out.println("O número digitado foi par e sua raiz quadrada é de: " + raiz);
		
		}
		else {
			double elevacao = Math.pow(valor,2);
				System.out.println("O número digitado foi ímpar e a elevação ao quadrado foi de: " + elevacao);
		}
	}

}
