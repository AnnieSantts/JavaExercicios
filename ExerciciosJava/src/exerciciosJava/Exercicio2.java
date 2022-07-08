package exerciciosJava;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TFaça um programa que entre com três números e coloque em ordem crescente.
		
		int vetor[] = new int[3];
		int numero1;
		
		for(int i = 0; i<3; i ++) {
		System.out.println(" informe o número");
		Scanner leia = new Scanner(System.in);
		vetor[i] = leia.nextInt();
		}
		Arrays.sort(vetor);
		System.out.println("Os valores em ordem são: " + Arrays.toString(vetor));
		
	}

}
