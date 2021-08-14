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
		int sort, contador = 0;

		while (contador < quantidadeNumeros) {
			sort = rd.nextInt(NUMERO_MAXIMO) + 1;
			if (sorteados.add(sort)) {
				contador++;
			}
		}
		return sorteados;
	}

}
