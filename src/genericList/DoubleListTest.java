package genericList;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DoubleListTest {
	private List<Integer> intList = null;
	
	
	@Before
	public void init() {
		intList = new DoubleList<Integer>();
	}
	
	@After
	public void reset() {
		intList = null;
	}
	
	@Test
	public void testAdd() {
		intList.add(5);
		intList.add(6);
		intList.add(7);
		intList.add(8);
		
		int actual = ((DoubleList<Integer>) intList).getSize();
		int expected = 4;
		assertEquals(expected, actual);
	}

	@Test
	public void testRemove() {
		DoubleListNode<Integer> firstNode = new DoubleListNode<Integer>(5);
		DoubleListNode<Integer> secondNode = new DoubleListNode<Integer>(6);
		DoubleListNode<Integer> thirdNode = new DoubleListNode<Integer>(7);
		DoubleListNode<Integer> fouthNode = new DoubleListNode<Integer>(8);
		intList.add(firstNode);
		intList.add(secondNode);
		intList.add(thirdNode);
		intList.add(fouthNode);

		intList.remove(thirdNode);
		
		int actual = ((DoubleList<Integer>) intList).getSize();
		int expected = 3;
		assertEquals(expected, actual);	
		
	}
	
	@Test
	public void addOneRemove(){
		DoubleListNode<Integer> firstNode = new DoubleListNode<Integer>(5);
		DoubleListNode<Integer> secondNode = new DoubleListNode<Integer>(6);

		intList.add(firstNode);
		intList.remove(firstNode);
		intList.add(secondNode);
		int actual = intList.peek();
		int expected = 6;
		assertEquals(expected, actual);
	}

	@Test
	public void testPop() {
		intList.add(5);
		intList.add(6);
		intList.add(7);
		intList.add(8);
		int actual = intList.pop();
		int expected = 5;
		assertEquals(expected, actual);
		
		actual = intList.peek();
		expected = 6;
		assertEquals(expected, actual);
	
	}

	@Test
	public void testPeek() {
		intList.add(5);
		intList.add(6);
		intList.add(7);
		intList.add(8);
		int actual = intList.peek();
		int expected = 5;
		assertEquals(expected, actual);
	}

	@Test
	public void testGetSize() {
		int actual = ((DoubleList<Integer>) intList).getSize();
		int expected = 0;
		assertEquals(expected, actual);		
	}


}
