package com.dio;

import com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
	//	System.out.println("olá mundo");
		
		Gato objetoGato = new Gato();
		Livros livros = new Livros();
		System.out.println(objetoGato);
		System.out.println(livros);

	}

}

class Livros{
	private String nome;
	private String npg;
}