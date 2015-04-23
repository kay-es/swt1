package tut0;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LibraryTest {
	
	private Library lib;
	
	@BeforeClass
	public void createLibrary() {
		this.lib = new Library();
	}

	@AfterClass
	public void deleteLibrary() {
		this.lib = null;
	}

	@Before
	public void setUp() {
		lib.createBooks();
	}

	@After
	public void tearDown() {
		lib.deleteBooks();
	}

	@Test
	public void test() {
		lib.borrow(1771234, "Harry Potter");
		assertTrue(lib.isBorrowed("Harry Potter"));
	}
	
	@Test
	public void test2() {
		lib.borrow(1771234, "Harry Potter");
		assertEquals(1771234, lib.getMatnumber("Harry Potter"));
	}
}
