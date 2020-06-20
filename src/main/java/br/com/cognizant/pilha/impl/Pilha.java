package br.com.cognizant.pilha.impl;

import br.com.cognizant.pilha.IPilha;

public class Pilha implements IPilha {

	private int posicao;

	private String[] pilha;

	public Pilha() {
		this.pilha = new String[50];
		this.posicao = 0;
	}

	public void push(String valor) {
		pilha[posicao] = valor;
		posicao++;
	}

	public String pop() {
		posicao--;
		String removido = pilha[posicao];
		pilha[posicao] = null;
		return removido; 
	}

	public int size() {
		return posicao;
	}

	public void clear() {
		this.posicao = 0;
		this.pilha = new String[50];
	}

	public boolean isEmpty() {
		return posicao == 0;
	}

	public boolean isFull() {
		return posicao == 50;
	}

}
