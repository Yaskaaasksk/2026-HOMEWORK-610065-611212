package test;
import static org.junit.jupiter.api.Assertions.*;
import it.uniroma3.diadia.giocatore.*;
import it.uniroma3.diadia.attrezzi.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testBorsa {
	
	private Borsa borsa;
	private Attrezzo osso;
	private Attrezzo lanterna;
	
	@BeforeEach
	void setBorsa() {
		
		borsa = new Borsa();
		osso = new Attrezzo("osso", 1);
		lanterna = new Attrezzo("lanterna", 3);
		
	}
	

	@Test
	void testAddAttrezzo() {
		borsa.addAttrezzo(lanterna);
		assertEquals(lanterna, borsa.getAttrezzo("lanterna"));
	}
	
	@Test
	void testRimuoviAttrezzo() {
		borsa.addAttrezzo(osso);
		borsa.removeAttrezzo("osso");
		assertNull(borsa.getAttrezzo("osso"));
	}
	
	@Test
	void testPesoMax() {
		Attrezzo piuma = new Attrezzo("piuma", 20);
		assertFalse(borsa.addAttrezzo(piuma));
	}	
}
