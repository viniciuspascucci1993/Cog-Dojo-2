package br.com.cognizant.pilha;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.cognizant.pilha.impl.Pilha;

public class PilhaTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void seAdiciona() {
		String valor = "valor";
		IPilha pilha = new Pilha();
		int valorinicial = pilha.size();
		pilha.push(valor);
		int valorFinal = pilha.size();
		assertEquals(valorFinal, valorinicial + 1);
	}

	@Test
	public void seRemove() {
		String valor = "valor";
		IPilha pilha = new Pilha();
		int valorinicial = pilha.size();
		pilha.push(valor);		
		String excluido = pilha.pop();
		int valorFinal = pilha.size();
		assertEquals(valorFinal, valorinicial);
		assertEquals(excluido, valor);

	}

	@Test
	public void seLimpa() {
		String valor = "valor";
		IPilha pilha = new Pilha();
		pilha.push(valor);
		pilha.push(valor);
		pilha.push(valor);
		pilha.push(valor);
		
		pilha.clear();

		int valorFinal = pilha.size();
		assertEquals(valorFinal, 0);
	}

	@Test
	public void seVazio(){
		IPilha pilha = new Pilha();

		assertTrue(pilha.isEmpty());
		
	}
	
	@Test
	public void seCheio(){
		IPilha pilha = new Pilha();
		for(int i = 0; i<50; i++){
			pilha.push(""+i);
		}
		assertTrue(pilha.isFull());
	}
}
