package app;

import java.util.Scanner;

public class Exemplo_Vetor_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] pares = {0,2,4,6,8};
		
		
		System.out.println("Números pares: ");
		for(int i=0; i < 5; i++) {
			System.out.println(pares[i]);
		}
	}

}
