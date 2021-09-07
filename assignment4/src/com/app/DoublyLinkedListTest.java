package com.app;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DoublyLinkedListTest {
	@Test
	void testEmptyList() {
		DoublyLinkedList slist = new DoublyLinkedList();
		int[] listElements = slist.GetAllElements();
		assertTrue(listElements.length == 0);
	}

	@Test
	void testAddAtFrontOneElement() {
		DoublyLinkedList slist = new DoublyLinkedList();
		int element = 5;

		slist.AddAtFront(element);

		int[] listElements = slist.GetAllElements();

		assertTrue((listElements.length == 1) && (listElements[0] == element));
	}
	@Test
	void testAddAtFrontTwoElement() {
		DoublyLinkedList slist = new DoublyLinkedList();
		int element1 = 5;
		int element2 = 10;

		slist.AddAtFront(element1); // head -> 5
		slist.AddAtFront(element2); // head -> 10 -> 5

		int[] listElements = slist.GetAllElements(); // 10, 5

		assertTrue((listElements.length == 2) &&
				(listElements[0] == element2) && (listElements[1] == element1));
	}
	@Test
	void testAddAtRearOneElement() {
		DoublyLinkedList slist = new DoublyLinkedList();
		int element = 12;

		slist.AddAtRear(element);

		int[] listElements = slist.GetAllElements();

		assertTrue((listElements.length == 1) && (listElements[0] == element));
	}
	@Test
	void testAddAtRearTwoElement() {
		DoublyLinkedList slist = new DoublyLinkedList();
		int element1 = 5;
		int element2 = 10;

		slist.AddAtRear(element1); // head -> 5
		slist.AddAtRear(element2); // head -> 10 -> 5

		int[] listElements = slist.GetAllElements(); // 10, 5

		assertTrue((listElements.length == 2) &&
				(listElements[0] == element1) && (listElements[1] == element2));
	}
	@Test
	void testAddAtRearManyElement() {
		DoublyLinkedList slist = new DoublyLinkedList();
		int element1 = 5;
		int element2 = 10;
		int element3 = 130;
		int element4 = 41;
		int element5 = 90;

		slist.AddAtRear(element1); // head -> 5
		slist.AddAtRear(element2);
		slist.AddAtRear(element3);
		slist.AddAtRear(element4);
		slist.AddAtRear(element5);// head -> 10 -> 5

		int[] listElements = slist.GetAllElements(); // 10, 5

		assertTrue((listElements.length == 5) &&
				(listElements[0] == element1) && (listElements[1] == element2)
				&& (listElements[2] == element3)
				&& (listElements[3] == element4)
				&& (listElements[4] == element5)
				);
	}
	@Test
	void testGetAllElemetsInReverseOrder() {
		DoublyLinkedList slist = new DoublyLinkedList();
		int element1 = 5;
		int element2 = 10;
		int element3 = 130;
		int element4 = 41;
		int element5 = 90;

		slist.AddAtRear(element1); // head -> 5
		slist.AddAtRear(element2);
		slist.AddAtRear(element3);
		slist.AddAtRear(element4);
		slist.AddAtRear(element5);// head -> 10 -> 5

		int[] listElements = slist.GetAllElementsInReverseOrder(); // 10, 5

		assertTrue((listElements.length == 5) &&
				(listElements[0] == element5) && (listElements[1] == element4)
				&& (listElements[2] == element3)
				&& (listElements[3] == element2)
				&& (listElements[4] == element1)
				);
	}
	@Test
	void testGetAllElemetsInReverseOrder2() {
		DoublyLinkedList slist = new DoublyLinkedList();
		int element1 = 5;
		int element2 = 10;
		int element3 = 12;
		slist.AddAtFront(element1); // head -> 5
		slist.AddAtFront(element2); // head -> 10 -> 5
		slist.AddAtFront(element3);
		int[] listElements = slist.GetAllElementsInReverseOrder(); // 10, 5

		assertTrue((listElements.length == 3) &&
				(listElements[0] == element1)
				 && (listElements[1] == element2)
				 && (listElements[2] == element3));
	}
	
	
}
