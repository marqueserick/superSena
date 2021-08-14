package com.erickmarques.superSena;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.erickmarques.superSena.dominio.Sorteador.jogarMegaSena;

public class SuperSena {

	private static Scanner s;

	public static void main(String[] args) {
		int quantidadeSorteios = 0, quantidadeNumeros = 0;

		try {
			s = new Scanner(System.in);
			System.out.println("Quantos jogos voc� deseja criar?");
			quantidadeSorteios = s.nextInt();
			if (quantidadeSorteios < 1) {
				throw new InputMismatchException();
			}
			System.out.println("Quantos n�meros voc� deseja em seus jogos?");
			quantidadeNumeros = s.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("O valor inserido n�o � v�lido\nVamos sortear apenas 1 jogo com 6 n�meros");
			quantidadeSorteios = 1;
			quantidadeNumeros = 6;
		} catch (Exception e) {
			System.out.println("Ocorreu um erro inesperado...");
		}

		try {
			for (int i = 0; i < quantidadeSorteios; i++) {
				System.out.println("Jogo n�" + (i + 1) + " " + jogarMegaSena(quantidadeNumeros));
			}
		} catch (RuntimeException e) {
			System.out.println(
					"Voc� deve escolher entre 6 e 15 n�meros em seus jogos"
					+ "\nVamos sortear " + quantidadeSorteios + " jogo(s) com 6 n�meros");
			quantidadeNumeros = 6;
			for (int i = 0; i < quantidadeSorteios; i++) {
				System.out.println("Jogo n�" + (i + 1) + " " + jogarMegaSena(quantidadeNumeros));
			}
		} catch (Exception e) {
			System.out.println("Ocorreu um erro inesperado...");
		}
	}
}
