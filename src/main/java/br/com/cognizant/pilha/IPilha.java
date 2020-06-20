package br.com.cognizant.pilha;

public interface IPilha {

	void push(String inicioPilha);

	String pop();

	int size();

	void clear();

	boolean isEmpty();

	boolean isFull();

}