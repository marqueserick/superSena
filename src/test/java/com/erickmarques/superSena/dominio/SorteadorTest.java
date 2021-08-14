package com.erickmarques.superSena.dominio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import static com.erickmarques.superSena.dominio.Sorteador.jogarMegaSena;

public class SorteadorTest {

	@Test
	void deveSortear6Numeros() {
		assertEquals(6, jogarMegaSena(6).size());
	}

	@Test
	void naoDeveRepetirNumerosSorteados() {
		Set<Integer> sorteados = new HashSet<Integer>();
		sorteados = jogarMegaSena(8);
		Integer[] numeros = sorteados.toArray(new Integer[0]);

		for (int i = 0; i < (sorteados.size()-1); i++) {
			for (int j=i+1; j < sorteados.size(); j++) {
				assertNotEquals(numeros[i], numeros[j]);
			}
		}
	}

}
