package com.app;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DoublySortedLinkedListTest {
	@Test
	void testEmptyList() {
		DoublySortedLinkedList slist = new DoublySortedLinkedList();
		int[] listElements = slist.GetAllElements();
		assertTrue(listElements.length == 0);
	}

	@Test
	void testInsertOneElement() {
		DoublySortedLinkedList slist = new DoublySortedLinkedList();
		int element = 5;

		slist.Insert(element);

		int[] listElements = slist.GetAllElements();

		assertTrue((listElements.length == 1) && (listElements[0] == element));
	}
	@Test
	void testInsertTwoElement() {
		DoublySortedLinkedList slist = new DoublySortedLinkedList();
		int element1 = 5;
		int element2 = 10;

		slist.Insert(element1); // head -> 5
		slist.Insert(element2); // head -> 10 -> 5

		int[] listElements = slist.GetAllElements(); // 10, 5

		assertTrue((listElements.length == 2) &&
				(listElements[0] == element1) && (listElements[1] == element2));
	}
	@Test
	void testInsertManyPositiveElement() {
		DoublySortedLinkedList slist = new DoublySortedLinkedList();
		int[] arr= {10,11,4,8,15,9,5};
		//4,5,8,9,10,11,15
		for(int i = 0;i<arr.length;i++) {
			System.out.println("inserted "+arr[i]);
			slist.Insert(arr[i]);
		}

		int[] listElements = slist.GetAllElements(); // 10, 5

		assertTrue((listElements.length == arr.length) &&
				(listElements[0] == 4) && (listElements[1] == 5)
				 && (listElements[arr.length-1] == 15)
				 && (listElements[2] == 8));
	}
	@Test
	void testInsertManyNegativeElement() {
		DoublySortedLinkedList slist = new DoublySortedLinkedList();
		int[] arr= {-10,-11,0,-8,-15,-92,-5};
		//-92,-15,-11,-10,-8,-5,0
		for(int i = 0;i<arr.length;i++) {
			slist.Insert(arr[i]);
		}

		int[] listElements = slist.GetAllElements(); // 10, 5

		assertTrue((listElements.length == arr.length) &&
				(listElements[0] == -92) && (listElements[3] == -10)
				 && (listElements[arr.length-1] == 0)
				 && (listElements[1] == -15));
		
	}
	@Test
	void testInsertManyPosNegElement() {
		DoublySortedLinkedList slist = new DoublySortedLinkedList();
		int[] arr= {10,11,-4,0,-15,-9,5};
		//-15,-9,-4,0,5,10,11
		for(int i = 0;i<arr.length;i++) {
			slist.Insert(arr[i]);
		}

		int[] listElements = slist.GetAllElements(); // 10, 5

		assertTrue((listElements.length == arr.length) &&
				(listElements[0] == -15) && (listElements[1] == -9)
				 && (listElements[arr.length-1] == 11)
				 && (listElements[3] == 0));
	}

	

	

	
	
}
