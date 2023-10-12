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
		
		
		
		System.out.println("As notas são: ");
		System.out.println(Arrays.toString(notas));
		System.out.println("Soma das notas:");
		System.out.println(soma);
		
		sc.close();
	}

}
