package tester;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.app.SinglyLinkedList;

class SinglyLinkedListTester {
	@Test
	void testEmptyList() {
		SinglyLinkedList slist = new SinglyLinkedList();
		int[] listElements = slist.getAllElements();
		assertTrue(listElements.length == 0);
	}
	@Test
	void testAddAtFrontOneElement() {
		SinglyLinkedList slist = new SinglyLinkedList();
		int element = 5;

		slist.addAtFront(element);

		int[] listElements = slist.getAllElements();

		assertTrue((listElements.length == 1) && (listElements[0] == element));
	}
	@Test
	void testAddAtFrontTwoElement() {
		SinglyLinkedList slist = new SinglyLinkedList();
		int element1 = 5;
		int element2 = 10;

		slist.addAtFront(element1); // head -> 5
		slist.addAtFront(element2); // head -> 10 -> 5

		int[] listElements = slist.getAllElements(); // 10, 5

		assertTrue((listElements.length == 2) &&
				(listElements[0] == element2) && (listElements[1] == element1));
	}
	@Test
	void testAddElementAtrearAndFront(){
		SinglyLinkedList slist = new SinglyLinkedList();
		slist.addAtFront(1);
		slist.addAtRear(10);
		slist.addAtFront(5);
		
		int[] listElements = slist.getAllElements();
		System.out.println(Arrays.toString(listElements));
		assertTrue((listElements.length == 3) &&
				(listElements[0] == 5) && (listElements[1] == 1)&& (listElements[2] == 10));
	}
	@Test
	void testAddElementRear() {
		SinglyLinkedList slist = new SinglyLinkedList();
		slist.addAtRear(1);
		slist.addAtRear(10);
		slist.addAtRear(5);
		int[] listElements = slist.getAllElements();
		assertFalse(listElements[0]==4);
		assertTrue(listElements[2]==5);
	}
	@Test
	void testAddElementRearAndFront() {
		SinglyLinkedList slist = new SinglyLinkedList();
		slist.addAtRear(1);
		slist.addAtRear(10);
		slist.addAtRear(5);
		slist.addAtFront(8);
		slist.addAtFront(4);
		slist.addAtFront(2);
		slist.addAtRear(21);
		int[] listElements = slist.getAllElements();
		assertTrue(listElements[0]==2);
		assertTrue(listElements[6]==21);
		assertFalse(listElements[3]==4);
	}
}
