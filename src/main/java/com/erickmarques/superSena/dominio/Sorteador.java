package com.erickmarques.superSena.dominio;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Sorteador {
	private static int NUMERO_MAXIMO = 60;
	private static int MAXIMO_SORTEADOS = 15;
	private static int MINIMO_SORTEADOS = 6;

	public static Set<Integer> jogarMegaSena(int quantidadeNumeros) {

		if (quantidadeNumeros > MAXIMO_SORTEADOS || quantidadeNumeros < MINIMO_SORTEADOS) {
			throw new RuntimeException("Quantidade inválida");
		}

		Random rd = new Random();
		Set<Integer> sorteados = new HashSet<Integer>();
		int sorteado, contador = 0;

		while (contador < quantidadeNumeros) {
			// o rd.nextInt sorteará um numero entre 0 e 59, ao add 1, o numero sorteado irá de 1 a 60
			sorteado = rd.nextInt(NUMERO_MAXIMO) + 1;
			if (sorteados.add(sorteado)) {
				contador++;
			}
		}
		return sorteados;
	}

}
