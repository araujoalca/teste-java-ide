package br.com.araujoalca.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a, b;

		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		scan.close();

		int soma = soma(a, b);
		int subtracao = subtracao(a, b);
		int multiplicacao = multiplicacao(a, b);
		double divisao = divisao(a, b);

		System.out.println(a + " + " + b + "\t= " + soma);
		System.out.println(a + " - " + b + "\t= " + subtracao);
		System.out.println(a + " * " + b + "\t= " + multiplicacao);
		System.out.println(a + " / " + b + "\t= " + divisao);

	}

	public static int soma(int a, int b) {
		return a + b;
	}

	public static int subtracao(int a, int b) {
		return a - b;
	}

	public static int multiplicacao(int a, int b) {
		return a * b;
	}

	public static double divisao(int a, int b) {
		return Double.valueOf(a) / Double.valueOf(b);
	}

}
