package tester;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.app.SortedLinkedListImpl;

class SortedLinkedListTest {

	@Test
	void testIsInitEmpty() {
		SortedLinkedListImpl myList = new SortedLinkedListImpl();
		assertTrue(myList.getAllElements().length==0);
	}
	@Test
	void testInsert() {
		SortedLinkedListImpl myList = new SortedLinkedListImpl();
		myList.insert(10);
		assertTrue(myList.getAllElements().length==1 && myList.getAllElements()[0]==10);
	}
	@Test
	void testSortingProperty() {
		SortedLinkedListImpl myList = new SortedLinkedListImpl();
		
		myList.insert(10);
		myList.insert(20);
		myList.insert(4);
		myList.insert(5);
		myList.insert(0);
		myList.insert(11);
		int[] listElements = myList.getAllElements();
		System.out.println("test 3"+Arrays.toString(listElements));
		assertTrue(listElements.length==6);
		assertTrue(listElements[0]==0);
		assertTrue(listElements[4]==11);
		assertTrue(listElements[2]==5);
	}
	@Test
	void testSortingPropertyAllNegativeValues() {
		SortedLinkedListImpl myList = new SortedLinkedListImpl();
		
		myList.insert(-10);
		myList.insert(-20);
		myList.insert(0);
		myList.insert(-4);
		myList.insert(-21);
		
	
		int[] listElements = myList.getAllElements();
		System.out.println("test 4"+Arrays.toString(listElements));
		assertTrue(listElements.length==5);
		assertTrue(listElements[0]== -21);
		assertTrue(listElements[4]==0);
		assertFalse(listElements[2]== -20);
	}
	@Test
	void testSortingPropertyMixValues() {
		SortedLinkedListImpl myList = new SortedLinkedListImpl();
		
		myList.insert(-10);
		myList.insert(20);
		myList.insert(-4);
		myList.insert(5);
		myList.insert(0);
		myList.insert(-11);
		myList.insert(-51);
		//[-51,-11,-10,-4,0,5,20]
		int[] listElements = myList.getAllElements();
		System.out.println("in test 5"+Arrays.toString(listElements));
		assertTrue(listElements.length==7);
		assertTrue(listElements[0]==-51);
		assertTrue(listElements[5]==5);
		assertFalse(listElements[2]==-11);
	}
}
