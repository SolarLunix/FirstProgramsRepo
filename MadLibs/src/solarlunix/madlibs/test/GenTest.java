/**
 * 
 */
package solarlunix.madlibs.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import solarlunix.madlibs.Gen;
import solarlunix.madlibs.Lists;

/**
 * Testing the Gen Class
 * @author SolarLunix a.k.a. Melissa Melaugh
 * Date Created:	02 October 2016
 * Date Edited:		02 October 2016
 */
public class GenTest {
	public Gen madLib;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		Lists.populateLists();
		this.madLib = new Gen();
	}

	/**
	 * Test method for {@link solarlunix.madlibs.Gen#Gen()}.
	 */
	@Test
	public void testGen() {
		assertTrue(this.madLib.getMadLib().equalsIgnoreCase("true"));
	}

	/**
	 * Test method for {@link solarlunix.madlibs.Gen#generate()}.
	 */
	@Test
	public void testGenerate() {
		this.madLib.generate();
		assertTrue(!this.madLib.getMadLib().equalsIgnoreCase("getNoun"));
		assertTrue(!this.madLib.getMadLib().equalsIgnoreCase("getAdj"));
		assertTrue(!this.madLib.getMadLib().equalsIgnoreCase("getVerb"));
	}

}
