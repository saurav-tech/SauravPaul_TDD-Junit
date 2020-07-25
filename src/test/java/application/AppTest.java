package application;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;



class AppTest {
	
	@Test
	void test1() {
		App app = new App();
		assertEquals("BCD", app.removeFirst2A("ABCD"));
	}
	
	@Test
	void test2() {
		App app = new App();
		assertEquals("BBAA", app.removeFirst2A("BBAA"));
	}
	
	@Test
	void test3() {
		App app = new App();
		assertEquals("CD", app.removeFirst2A("AACD"));
	}
	
	@Test
	void test4() {
		App app = new App();
		assertEquals("BCD", app.removeFirst2A("BACD"));
	}
	
	@Test
	void test5() {
		App app = new App();
		assertEquals("BAA", app.removeFirst2A("AABAA"));
	}
}
