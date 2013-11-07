package genericMaps;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleMapTest {

	@Test
	public void testPut() {
		Map<String> stringMap = new SimpleMap<String>();
		String expected = "debug";
		stringMap.put(MapTester.hash(expected), expected);
		String actual = stringMap.get(MapTester.hash(expected));
		assertEquals(expected, actual);
	}

//	@Test
	public void testGet() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsEmpty() {
		Map<String> stringMap = new SimpleMap<String>();

		boolean actual = stringMap.isEmpty();
		assertEquals(true, actual);
		
		String expected = "debug";
		stringMap.put(MapTester.hash(expected), expected);
		actual = stringMap.isEmpty();
		assertEquals(false, actual);	
	}

	@Test
	public void testRemove() {
		Map<String> stringMap = new SimpleMap<String>();
		String expected = "debug";
		stringMap.put(MapTester.hash(expected), expected);
		stringMap.remove(MapTester.hash(expected));
		boolean actual = stringMap.isEmpty();
		assertEquals(true, actual);

	}

}
