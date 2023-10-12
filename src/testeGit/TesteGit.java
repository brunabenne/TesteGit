package testeGit;

import java.util.Arrays;
import java.util.Scanner;

public class TesteGit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] notas = new int [5];
		int soma = 0;
		
		for(int i = 0; i < 5; i++) {		
			System.out.println("Nota aluno " + (i+1) + ": ");
			notas[i] = sc.nextInt();
			soma += notas[i];
		}
		
		int media = soma/5;
		
		System.out.println("As notas são: " + Arrays.toString(notas));
		System.out.println("Soma das notas: " + soma);
		System.out.println("Média das notas: " + media);
		
		
		
		sc.close();
	}

}
