package com.dio;

import com.dio.model.*;

public class PriomeiroPrograma {

	public static void main(String[] args) {
		Gato gato = new Gato();
		Livro livro = new Livro();
		
		System.out.println(gato);
		System.out.println(livro);
		
	}

}

class Livro {
	public String livro;
	public Integer numPag;
}
