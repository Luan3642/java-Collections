package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	public static void main(String[] args) {
		String aula1 = "conhecendo mais de listas";
		String aula2 = "modelando a classe aula";
		String aula3 = "Trabalhando com cursos e sets";

//		criando um arrayList
		ArrayList<String> aulas = new ArrayList<String>();

//		adicionando aulas no arrayList
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

//		imprimindo essas aulas
		System.out.println(aulas);

//		removendo uma aula a partir do seu �ndice
		aulas.remove(2);

		System.out.println(aulas);

		System.out.println();

		for (String i : aulas) {
			System.out.println(i);
		}

		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula �: " + primeiraAula);
		System.out.println();

//		obtendo valores a partir de um for comum
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println(aulas.get(i));
		}

//		percorrendo a lista a partir de um forEach, usando Lambda

//		para cada aula que est� dentro de aulas fa�a...
		aulas.forEach(aula -> {
			System.out.println("percorrendo: " + aula);
		});
		
		System.out.println();
		aulas.add("Aumentando nosso conhecimento");
		System.out.println(aulas);
		System.out.println("Depois de ordenado:");
		
		
//		ordenando as aulas 
		Collections.sort(aulas); 
		System.out.println(aulas);

	}
}
