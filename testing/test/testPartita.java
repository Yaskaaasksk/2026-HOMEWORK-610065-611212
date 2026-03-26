package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Stanza;

import org.junit.jupiter.api.BeforeEach;

class testPartita {
	
	private Partita p;
	private Stanza atrio;
	private Stanza biblioteca;
	

	@BeforeEach
	void setPartita() {
		
		p = new Partita();
		
		atrio = p.getStanzaCorrente();
		
		biblioteca = p.getStanzaVincente();
		
		
	}
	
	 @Test
	void testIsVinta() {
		p.setStanzaCorrente(biblioteca);
		assertTrue(p.vinta());
	}
	 
	@Test
	void testCfuFiniti() {
		p.setCfu(0);
		assertTrue(p.isFinita());
	}
	
	@Test
	void testGetStanzaCorrente() {
		assertEquals(atrio, p.getStanzaCorrente());
	}
	

}
