package com.app;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class CircularDoublyLinkedListTest {
	@Test
	void testEmptyList() {
		CircularDoublyLinkedList clist = new CircularDoublyLinkedList();
		int[] listElements = clist.GetAllElements();
		System.out.println(Arrays.toString(listElements));
		assertTrue(listElements.length == 1);
	}

	@Test
	void testInsertOneElement() {
		CircularDoublyLinkedList clist = new CircularDoublyLinkedList();
		int element = 5;

		clist.Insert(element);

		int[] listElements = clist.GetAllElements();

		assertTrue((listElements.length == 2) && (listElements[1] == element));
	}
	@Test
	void testInsertTwoElement() {
		CircularDoublyLinkedList clist = new CircularDoublyLinkedList();
		int element1 = 5;
		int element2 = 10;

		clist.Insert(element1); // head -> 5
		clist.Insert(element2); // head -> 10 -> 5

		int[] listElements = clist.GetAllElements(); // 10, 5

		assertTrue((listElements.length == 3) &&
				(listElements[1] == element1) && (listElements[2] == element2));
	}
	@Test
	void testInsertManyPositiveElement() {
		CircularDoublyLinkedList clist = new CircularDoublyLinkedList();
		int[] arr= {10,11,4,8,15,9,5};
		//4,5,8,9,10,11,15
		for(int i = 0;i<arr.length;i++) {
			System.out.println("inserted "+arr[i]);
			clist.Insert(arr[i]);
		}

		int[] listElements = clist.GetAllElements(); // 10, 5

		assertTrue((listElements.length == arr.length+1) &&
				(listElements[1] == 4) && (listElements[2] == 5)
				 && (listElements[arr.length] == 15)
				 && (listElements[3] == 8));
	}
	@Test
	void testInsertManyNegativeElement() {
		CircularDoublyLinkedList clist = new CircularDoublyLinkedList();
		int[] arr= {-10,-11,0,-8,-15,-92,-5};
		//-92,-15,-11,-10,-8,-5,0
		for(int i = 0;i<arr.length;i++) {
			clist.Insert(arr[i]);
		}

		int[] listElements = clist.GetAllElements(); // 10, 5

		assertTrue((listElements.length == arr.length+1) &&
				(listElements[1] == -92) && (listElements[4] == -10)
				 && (listElements[arr.length] == 0)
				 && (listElements[2] == -15));
		
	}
	@Test
	void testInsertManyPosNegElement() {
		CircularDoublyLinkedList clist = new CircularDoublyLinkedList();
		int[] arr= {10,11,-4,0,-15,-9,5};
		//-15,-9,-4,0,5,10,11
		for(int i = 0;i<arr.length;i++) {
			clist.Insert(arr[i]);
		}

		int[] listElements = clist.GetAllElements(); // 10, 5

		assertTrue((listElements.length == arr.length+1) &&
				(listElements[1] == -15) && (listElements[2] == -9)
				 && (listElements[arr.length] == 11)
				 && (listElements[4] == 0));
	}

	
	@Test
	void testDeleteOneElement() {
		CircularDoublyLinkedList clist = new CircularDoublyLinkedList();
		int element = 5;

		clist.Insert(element);
		clist.Delete(5);
		int[] listElements = clist.GetAllElements();

		assertTrue((listElements.length == 1) && (listElements[0] != element));
	}
	@Test
	void testDeleteTwoElement() {
		CircularDoublyLinkedList clist = new CircularDoublyLinkedList();
		int element1 = 5;
		int element2 = 10;
		
		clist.Insert(element1); // head -> 5
		clist.Insert(element2); // head -> 10 -> 5
		clist.Delete(element1); // head -> 5
		clist.Delete(element2);
		int[] listElements = clist.GetAllElements(); // 10, 5

		assertTrue((listElements.length == 1) );
	}
	@Test
	void testDeleteElementFromEmptyList() {
		CircularDoublyLinkedList clist = new CircularDoublyLinkedList();
		int element1 = 5;
		clist.Delete(element1); // head -> 5
		int[] listElements = clist.GetAllElements(); // 10, 5

		assertTrue((listElements.length == 1) );
	}
	@Test
	void testDeleteElementFromList() {
		CircularDoublyLinkedList clist = new CircularDoublyLinkedList();
		int element1 = 5;
		clist.Insert(element1);
		clist.Insert(20);
		clist.Insert(30);
		clist.Delete(element1); // head -> 5
		int[] listElements = clist.GetAllElements(); // 10, 5

		assertTrue((listElements.length == 3) );
		assertArrayEquals(new int[]{0,20,30},listElements);
	}
	@Test
	void testDeleteManyPositiveElement() {
		CircularDoublyLinkedList clist = new CircularDoublyLinkedList();
		int[] arr= {10,11,4,8,15,9,5};
		//4,5,8,9,10,11,15
		for(int i = 0;i<arr.length;i++) {
			System.out.println("inserted "+arr[i]);
			clist.Insert(arr[i]);
		}

		int[] listElements = clist.GetAllElements(); // 10, 5

		assertTrue((listElements.length == arr.length+1) &&
				(listElements[1] == 4) && (listElements[2] == 5)
				 && (listElements[arr.length] == 15)
				 && (listElements[3] == 8));
		clist.Delete(0);
		clist.Delete(15);
		clist.Delete(9);
		clist.Delete(4);
		listElements = clist.GetAllElements();
		assertArrayEquals(new int[] {0,5,8,10,11}, listElements);
	}
	@Test
	void testDeleteManyNegativeElement() {
		CircularDoublyLinkedList clist = new CircularDoublyLinkedList();
		int[] arr= {-10,-11,0,-8,-15,-92,-5};
		//-92,-15,-11,-10,-8,-5,0
		for(int i = 0;i<arr.length;i++) {
			clist.Insert(arr[i]);
		}

		int[] listElements = clist.GetAllElements(); // 10, 5

		assertTrue((listElements.length == arr.length+1) &&
				(listElements[1] == -92) && (listElements[4] == -10)
				 && (listElements[arr.length] == 0)
				 && (listElements[2] == -15));
		clist.Delete(5);
		clist.Delete(-15);
		clist.Delete(-92);
		clist.Delete(-4);
		listElements = clist.GetAllElements();
		assertArrayEquals(new int[] {0,-11,-10,-8,-5,0}, listElements);
	}
	
	

	
	
}
