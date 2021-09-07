package assingment10;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class Tester {

	@Test
	void testBubbleSortPostiveInput() {
		int data[] = {32,21,4,3,21,5,7,4,1,0};
		BubbleSort bs = new BubbleSort();
		int expected[] = {0,1,3,4,4,5,7,21,21,32};
		bs.sort(data);
		System.out.println(Arrays.toString(data));
		assertArrayEquals(expected,data );
	}
	@Test
	void testBubbleSortNegativeInput() {
		int data[] = {-32,-21,-4,-3,-21,-5,-7,-4,-1,0};
		BubbleSort bs = new BubbleSort();
		int expected[] = {-32,-21,-21,-7,-5,-4,-4,-3,-1,0};
		bs.sort(data);
		System.out.println(Arrays.toString(data));
		assertArrayEquals(expected,data );
	}
	@Test
	void testBubbleSortPostiveNegativeInput() {
		int data[] = {32,21,4,-3,-21,5,-7,4,1,0};
		BubbleSort bs = new BubbleSort();
		int expected[] = {-21,-7,-3,0,1,4,4,5,21,32};
		bs.sort(data);
		System.out.println(Arrays.toString(data));
		assertArrayEquals(expected,data );
	}
	@Test
	void testLinearSearch() {
		int data[] = {32,21,4,3,21,5,7,4,1,0};
		LinearSearch ls = new LinearSearch();
		ls.populateList(data);
		assertTrue(ls.findElement(7) );
		assertFalse(ls.findElement(22) );
		assertTrue(ls.findElement(0) );
		assertTrue(ls.findElement(32) );
	}
	@Test
	void testLinearSearch2() {
		int data[] = {32,-21,-4,3,21,-5,7,4,1,0};
		LinearSearch ls = new LinearSearch();
		ls.populateList(data);
		assertTrue(ls.findElement(-21) );
		assertFalse(ls.findElement(22) );
		assertTrue(ls.findElement(0) );
		assertTrue(ls.findElement(-5) );
	}
	@Test
	void testBinarySearch() {
		int data[] = {32,21,4,3,21,5,7,4,1,0};
		
		BubbleSort sort = new BubbleSort();
		sort.sort(data);
		BinarySearch bs = new BinarySearch(data);
		
		assertTrue(bs.search(7) );
		assertFalse(bs.search(22) );
		assertTrue(bs.search(0) );
		assertTrue(bs.search(32) );
	}
	@Test
	void testBinarySearch2() {
		int data[] = {32,-21,-4,3,21,-5,7,4,1,0};
		BubbleSort sort = new BubbleSort();
		sort.sort(data);
		BinarySearch bs = new BinarySearch(data);
		
		assertTrue(bs.search(-21) );
		assertFalse(bs.search(22) );
		assertTrue(bs.search(0) );
		assertTrue(bs.search(-5) );
	}
	@Test
	void testBinarySearchEmptyArray() {
		int data[] = {};
		BinarySearch bs = new BinarySearch(data);
		assertFalse(bs.search(22) );
	}
	@Test
	void testBinarySearchArrayOneElement() {
		int data[] = {0};
		BinarySearch bs = new BinarySearch(data);
		assertFalse(bs.search(5) );
		assertTrue(bs.search(0));
	}
	

}
