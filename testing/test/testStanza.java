package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.attrezzi.Attrezzo;

import org.junit.jupiter.api.BeforeEach;

class testStanza {
	
	private Stanza s;
	private Attrezzo a;
	private Attrezzo martello;
	
	@BeforeEach
	void setTestStanza() {
		
		s = new Stanza("Atrio");
		
		a = new Attrezzo("osso", 1);
		
		martello = new Attrezzo("martello", 2);
		
	}
	

	@Test
	void testGetAttrezzo() {
		s.addAttrezzo(a);
		assertEquals(a, s.getAttrezzo("osso"));
	}
	
	@Test
    void testAddAttrezzoSuccesso() {
        s.addAttrezzo(martello);
        assertTrue(s.hasAttrezzo("martello"));
    }
	
	@Test
    void testGetAttrezzoRestituisceOggettoCorretto() {
        s.addAttrezzo(martello);
        assertEquals(martello, s.getAttrezzo("martello"));
    }
}
