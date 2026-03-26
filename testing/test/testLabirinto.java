package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.ambienti.*;

import org.junit.jupiter.api.BeforeEach;

class testLabirinto {
	
	private Labirinto l;
	private Stanza inizio;
	private Stanza vince;
	
	
	@BeforeEach
	void setLab() {
		
		l = new Labirinto();
		
		inizio = l.getStanzaIniziale();
		vince = l.getStanzaVincente();
	}
	  @Test
	    void testStanzaInizialeNonNull() {
	        assertNotNull(inizio);
	    }

	    @Test
	    void testStanzaVincenteNonNull() {
	        assertNotNull(vince);
	    }

	    @Test
	    void testCollegamenti() {
	        Stanza est = inizio.getStanzaAdiacente("est");
	        assertNotNull(est);
	    }

}
