package com.dio.Calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner scann = new Scanner(System.in);
		
		
		
		double a, b;
		

		System.out.println("digite o primeiro valor: ");
		a = scann.nextInt();
		System.out.println("digite o segundo valor: ");
		b = scann.nextInt();
		
		double soma = soma(a,b);
		double subtracao = subtracao(a,b);
		double multiplicacao = multiplicacao(a,b);
		double divisao = divisao(a,b);
		
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(multiplicacao);
		System.out.println(divisao);
		

	} 

	
	public static double  soma(double a, double  b) {

		return a + b;
	}
	

	public static double  subtracao(double  a, double  b) {

		return a - b;
	}
	
	public static double  divisao(double  a, double  b) {

		return a / b;
	}
	
	public static double  multiplicacao(double  a, double  b) {

		return a * b;
	}
	

}
