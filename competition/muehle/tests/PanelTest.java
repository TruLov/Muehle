package competition.muehle.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import competition.muehle.view.Panel;

/**
 * Test class for Panel class
 * 
 * tests multiple constructors
 * 
 * @author trulof
 * @author jbreih
 * @category Test
 *
 */
public class PanelTest {

	/**
	 * Test method for
	 * {@link competition.muehle.view.Panel#Panel(int, int, java.lang.String)}.
	 */
	@Test
	public final void testPanelIntIntString() {
		assertEquals(42, new Panel(42, 43, "TestPanel").getmWidth());
	}

	/**
	 * Test method for {@link competition.muehle.view.Panel#Panel(int, int)}.
	 */
	@Test
	public final void testPanelIntInt() {
		assertEquals(44, new Panel(43, 44).getmHeight());
	}

}
