package test;
import static org.junit.jupiter.api.Assertions.*;
import it.uniroma3.diadia.giocatore.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
class testGiocatore {
	
	private Giocatore giocatore;
	
	@BeforeEach
	void setGiocatore() {
		giocatore = new Giocatore();
	}

	 @Test
	    void testCfuIniziali() {
	        assertEquals(20, giocatore.getCfu());
	    }

	    @Test
	    void testSetCfu() {
	        giocatore.setCfu(10);
	        assertEquals(10, giocatore.getCfu());
	    }

	    @Test
	    void testBorsaNonNull() {
	        assertNotNull(giocatore.getBorsa());
	    }

}
