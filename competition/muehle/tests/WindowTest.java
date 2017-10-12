package competition.muehle.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import competition.muehle.view.Window;

/**
 * Test class for Window class
 * 
 * tests multiple constructors
 * 
 * @author trulof
 * @author jbreih
 * @category Test
 *
 */
public class WindowTest {

	/**
	 * Test method for
	 * {@link competition.muehle.view.Window#Window(int, int, java.lang.String)}.
	 */
	@Test
	public final void testWindowIntIntString() {
		assertEquals(42, new Window(42, 43, "testWindowIntIntString").getmWidth());
	}

	/**
	 * Test method for
	 * {@link competition.muehle.view.Window#Window(int, java.lang.String)}.
	 */
	@Test
	public final void testWindowIntString() {
		assertEquals(44, new Window(44, "testWindowIntString").getmWidth());
	}

	/**
	 * Test method for {@link competition.muehle.view.Window#Window(int)}.
	 */
	@Test
	public final void testWindowInt() {
		assertEquals(45, new Window(45).getmWidth());
	}

	/**
	 * Test method for
	 * {@link competition.muehle.view.Window#Window(java.lang.String)}.
	 */
	@Test
	public final void testWindowString() {
		assertEquals(500, new Window("testWindowIntString").getmWidth());
	}

	/**
	 * Test method for {@link competition.muehle.view.Window#Window()}.
	 */
	@Test
	public final void testWindow() {
		assertEquals(500, new Window().getmWidth());
	}
}
