package app;

import java.util.Scanner;

public class Exemplo_Vetor_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] numeros = new int [6];
		
		for(int i = 5; i >= 0; i--) {
			System.out.println("Digite um número: ");
			numeros[i] = sc.nextInt();
		}
	}

}
