package view;

import java.util.Scanner;

import controller.SomaDigitosController;

public class Principal {

	public static void main(String[] args) {
		SomaDigitosController somaDig = new SomaDigitosController();
		Scanner leia = new Scanner(System.in);

		int a;
		
		System.out.println("Digite um número inteiro: ");
		
		while(!leia.hasNextInt()) {
			System.out.println("Número inválido! Digite um valor inteiro!\n");
			System.out.println("Digite um número inteiro: ");
			leia.next();
		}
		
		a = leia.nextInt();
		
		int res = somaDig.soma(a);

		System.out.println("A soma dos algarismos do número " + a + " é " + res);
		
		leia.close();

	}

}
