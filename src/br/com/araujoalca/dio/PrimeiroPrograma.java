package br.com.araujoalca.dio;

import br.com.araujoalca.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Livros livro = new Livros();
		
		int anoAtual = 	2022;
		int idade = 55;
		System.out.println("Ol�, Mundo!!\nVoc� nasceu no ano de " + (anoAtual - idade));
		
		System.out.println("Gato = " + gato);
		System.out.println("Livro = " + livro);

	}

}


class Livros {
	private String nome;
	private String nPag;
}