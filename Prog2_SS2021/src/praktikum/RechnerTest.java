package praktikum;

import static org.junit.Assert.*;

import org.junit.Test;

public class RechnerTest {

	@Test
	public void testAdd() {
		Rechner r = new Rechner();
		int erg = r.add(3,  5);
		assertEquals("3 + 5 muss 8 ergeben!", 8, erg);
	}

}
