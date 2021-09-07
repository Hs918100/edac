package com.app;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SinglyLinkedListTest {
	@Test
	void testEmptyList() {
		SinglyLinkedList slist = new SinglyLinkedList();
		int[] listElements = slist.GetAllElements();
		assertTrue(listElements.length == 0);
	}
	@Test
	void testAddAtFrontOneElement() {
		SinglyLinkedList slist = new SinglyLinkedList();
		int element = 5;

		slist.AddAtFront(element);

		int[] listElements = slist.GetAllElements();

		assertTrue((listElements.length == 1) && (listElements[0] == element));
	}
	@Test
	void testAddAtFrontTwoElement() {
		SinglyLinkedList slist = new SinglyLinkedList();
		int element1 = 5;
		int element2 = 10;

		slist.AddAtFront(element1); // head -> 5
		slist.AddAtFront(element2); // head -> 10 -> 5

		int[] listElements = slist.GetAllElements(); // 10, 5

		assertTrue((listElements.length == 2) &&
				(listElements[0] == element2) && (listElements[1] == element1));
	}

	@Test
	void testDeleteInEmptyList( ) {
		SinglyLinkedList slist = new SinglyLinkedList();
		slist.Delete(5);
		assertTrue(slist.GetNodeCount() == 0);
	}
	@Test
	void testDeleteFirstElement( ) {
		SinglyLinkedList slist = new SinglyLinkedList();
		int element1 = 5;
		int element2 = 10;
		slist.AddAtFront(element1); // head -> 5
		slist.AddAtFront(element2); // head -> 10 -> 5
		slist.Delete(10); // head -> 5
		int[] listElements = slist.GetAllElements(); // 5
		assertTrue((listElements.length == 1) &&
				(listElements[0] == element1));
	}
	@Test
	void testDeleteElementNotInList( ) {
		SinglyLinkedList slist = new SinglyLinkedList();
		int element1 = 5;
		int element2 = 10;
		slist.AddAtFront(element1); // head -> 5
		slist.AddAtFront(element2); // head -> 10 -> 5
		slist.Delete(100); // head -> 10 -> 5
		int[] listElements = slist.GetAllElements(); // 10 -> 5
		assertTrue((listElements.length == 2) &&
				(listElements[0] == element2) &&
				(listElements[1] == element1));
	}
	@Test
	void testDeleteLastElement( ) {
		SinglyLinkedList slist = new SinglyLinkedList();
		int element1 = 5;
		int element2 = 10;
		slist.AddAtFront(element1); // head -> 5
		slist.AddAtFront(element2); // head -> 10 -> 5
		slist.Delete(5); // head -> 10
		int[] listElements = slist.GetAllElements(); // 10
		assertTrue((listElements.length == 1) &&
				(listElements[0] == element2));
	}
	@Test
	void testDeleteMiddleElement( ) {
		SinglyLinkedList slist = new SinglyLinkedList();
		int element1 = 5;
		int element2 = 10;
		slist.AddAtFront(element1); // head -> 5
		slist.AddAtFront(1);        // head -> 1 -> 5
		slist.AddAtFront(element2); // head -> 10 -> 1 -> 5
		slist.Delete(1); // head -> 10 -> 5
		int[] listElements = slist.GetAllElements(); // 10 -> 5
		assertTrue((listElements.length == 2) &&
				(listElements[0] == element2) &&
				(listElements[1] == element1));
	}
	//adding more tests 
	@Test
	void testAddAtRearUsingTailOneElement( ) {
		SinglyLinkedList slist = new SinglyLinkedList();
		int element1 = 5;
		slist.AddAtRear(element1); // head -> 5
		int[] listElements = slist.GetAllElements(); // 10 -> 5
		assertTrue((listElements.length == 1) &&
				(listElements[0] == element1) );
	}
	@Test
	void testAddAtRearUsingTailManyElement( ) {
		SinglyLinkedList slist = new SinglyLinkedList();
		int element1 = 5;
		int element2 = 10;
		int element3 = 15;
		int element4 = 35;
		slist.AddAtRear(element1);
		slist.AddAtRear(element2);
		slist.AddAtRear(element3);
		slist.AddAtRear(element4);
		int[] listElements = slist.GetAllElements(); // 10 -> 5
		System.out.println(listElements.length);
		assertTrue((listElements.length == 4) &&
				(listElements[0] == element1)&&
				(listElements[1] == element2)&&
				(listElements[2] == element3)&&
				(listElements[3] == element4) );
	}
	@Test
	void testDeleteFirstElementWithTail( ) {
		SinglyLinkedList slist = new SinglyLinkedList();
		int element1 = 5;
		int element2 = 10;
		int element3 = 100;
		slist.AddAtFront(element1); // head -> 5
		slist.AddAtFront(element2); // head -> 10 -> 5
		slist.AddAtFront(element3);
		slist.Delete(10); // head -> 5
		int[] listElements = slist.GetAllElements(); // 5
		assertTrue((listElements.length == 2) &&
				(listElements[0] == element3));
	}

	@Test
	void testDeleteLastElementWithTail( ) {
		SinglyLinkedList slist = new SinglyLinkedList();
		int element1 = 5;
		int element2 = 10;
		slist.AddAtFront(element1); // head -> 5
		slist.AddAtFront(element2); // head -> 10 -> 5
		slist.Delete(5); // head -> 10
		int[] listElements = slist.GetAllElements(); // 10
		assertTrue((listElements.length == 1) &&
				(listElements[0] == element2));
	}
	@Test
	void testDeleteMiddleElementWithTail( ) {
		SinglyLinkedList slist = new SinglyLinkedList();
		int element1 = 5;
		int element2 = 10;
		slist.AddAtFront(element1); // head -> 5
		slist.AddAtFront(1);        // head -> 1 -> 5
		slist.AddAtFront(element2); // head -> 10 -> 1 -> 5
		slist.Delete(1); // head -> 10 -> 5
		int[] listElements = slist.GetAllElements(); // 10 -> 5
		assertTrue((listElements.length == 2) &&
				(listElements[0] == element2) &&
				(listElements[1] == element1));
	}
	
	
	
}
