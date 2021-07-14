package introducao;

import junit.framework.TestCase;

public class SomaTest extends TestCase {

	Soma somar = new Soma();
	public void testSomar() {
		//fail("Not yet implemented");
		
		assertEquals(20,somar.somar(10, 10)) ;
	}

}
