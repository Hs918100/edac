package assingment11;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class Tester {

	@Test
	void testBubbleSortPostiveInput() {
		int data[] = {32,21,4,3,21,5,7,4,1,0};
		SortAlgos bs = new SortAlgos();
		int expected[] = {0,1,3,4,4,5,7,21,21,32};
		bs.bubbleSort(data);
		assertArrayEquals(expected,data );
	}
	@Test
	void testBubbleSortNegativeInput() {
		int data[] = {-32,-21,-4,-3,-21,-5,-7,-4,-1,0};
		SortAlgos bs = new SortAlgos();
		int expected[] = {-32,-21,-21,-7,-5,-4,-4,-3,-1,0};
		bs.bubbleSort(data);
		assertArrayEquals(expected,data );
	}
	@Test
	void testBubbleSortPostiveNegativeInput() {
		int data[] = {32,21,4,-3,-21,5,-7,4,1,0};
		SortAlgos bs = new SortAlgos();
		int expected[] = {-21,-7,-3,0,1,4,4,5,21,32};
		bs.bubbleSort(data);
		assertArrayEquals(expected,data );
	}
	
	@Test
	void testSelectionSortPostiveInput() {
		int data[] = {32,21,4,3,21,5,7,4,1,0};
		SortAlgos bs = new SortAlgos();
		int expected[] = {0,1,3,4,4,5,7,21,21,32};
		bs.selectionSort(data);
		assertArrayEquals(expected,data );
	}
	@Test
	void testSelectionSortNegativeInput() {
		int data[] = {-32,-21,-4,-3,-21,-5,-7,-4,-1,0};
		SortAlgos bs = new SortAlgos();
		int expected[] = {-32,-21,-21,-7,-5,-4,-4,-3,-1,0};
		bs.selectionSort(data);
		assertArrayEquals(expected,data );
	}
	@Test
	void testSelectionSortPostiveNegativeInput() {
		int data[] = {32,21,4,-3,-21,5,-7,4,1,0};
		SortAlgos bs = new SortAlgos();
		int expected[] = {-21,-7,-3,0,1,4,4,5,21,32};
		bs.selectionSort(data);
		assertArrayEquals(expected,data );
	}
	@Test
	void testInsertionSortPostiveInput() {
		int data[] = {32,21,4,3,21,5,7,4,1,0};
		SortAlgos bs = new SortAlgos();
		int expected[] = {0,1,3,4,4,5,7,21,21,32};
		bs.insertionSort(data);
		assertArrayEquals(expected,data );
	}
	@Test
	void testInsertionSortNegativeInput() {
		int data[] = {-32,-21,-4,-3,-21,-5,-7,-4,-1,0};
		SortAlgos bs = new SortAlgos();
		int expected[] = {-32,-21,-21,-7,-5,-4,-4,-3,-1,0};
		bs.insertionSort(data);
		assertArrayEquals(expected,data );
	}
	@Test
	void testInsertionSortPostiveNegativeInput() {
		int data[] = {32,21,4,-3,-21,5,-7,4,1,0};
		SortAlgos bs = new SortAlgos();
		int expected[] = {-21,-7,-3,0,1,4,4,5,21,32};
		bs.insertionSort(data);
		assertArrayEquals(expected,data );
	}
	@Test
	void testInsertionSortDuplicateValuePosInput() {
		int data[] = {2,1,3,2,1,3,2,1,3,2,1,3,2,1,3};
		SortAlgos bs = new SortAlgos();
		int expected[] = {1,1,1,1,1,2,2,2,2,2,3,3,3,3,3};
		bs.insertionSort(data);
		assertArrayEquals(expected,data );
	}
	@Test
	void testInsertionSortDuplicateValueNegInput() {
		int data[] = {-2,-1,-3,-2,-1,-3,-2,-1,-3,-2,-1,-3,-2,-1,-3};
		SortAlgos bs = new SortAlgos();
		int expected[] = {-3,-3,-3,-3,-3,-2,-2,-2,-2,-2,-1,-1,-1,-1,-1};
		bs.insertionSort(data);
		assertArrayEquals(expected,data );
	}
	@Test
	void testInsertionSortLinkedListPostiveInput() {

		SortAlgos bs = new SortAlgos();
		SinglyLinkedList list = new SinglyLinkedList();
		list.AddAtFront(0);
		list.AddAtFront(1);
		list.AddAtFront(4);
		list.AddAtFront(7);
		list.AddAtFront(4);
		list.AddAtFront(3);
		list.AddAtFront(5);
		list.AddAtFront(21);
		list.AddAtFront(32);
		list.AddAtFront(21);
		SinglyListNode head = list.getHead();
		SinglyListNode sortedhead = bs.insertionSort(head);
		
		int expected[] = {0,1,3,4,4,5,7,21,21,32};
		assertArrayEquals(expected,outputlist(sortedhead));
		
	}
	@Test
	void testInsertionSortNegativeInputLinkedList() {
	SinglyLinkedList list = new SinglyLinkedList();
	SortAlgos bs = new SortAlgos();
	list.AddAtFront(0);
	list.AddAtFront(-32);
	list.AddAtFront(-21);
	list.AddAtFront(-4);
	list.AddAtFront(-3);
	list.AddAtFront(-21);
	list.AddAtFront(-5);
	list.AddAtFront(-7);
	list.AddAtFront(-4);
	list.AddAtFront(-1);
	SinglyListNode head = list.getHead();
	SinglyListNode sortedhead = bs.insertionSort(head);
	
		int expected[] = {-32,-21,-21,-7,-5,-4,-4,-3,-1,0};
		assertArrayEquals(expected,outputlist(sortedhead));
	
	}
	@Test
	void testInsertionSortPostiveNegativeInputLinkedList() {
		SinglyLinkedList list = new SinglyLinkedList();
		SortAlgos bs = new SortAlgos();
		list.AddAtFront(0);
		list.AddAtFront(32);
		list.AddAtFront(21);
		list.AddAtFront(4);
		list.AddAtFront(-3);
		list.AddAtFront(-21);
		list.AddAtFront(5);
		list.AddAtFront(-7);
		list.AddAtFront(4);
		list.AddAtFront(1);
		SinglyListNode head = list.getHead();
		SinglyListNode sortedhead = bs.insertionSort(head);
		int data[] = {32,21,4,-3,-21,5,-7,4,1,0};
		int expected[] = {-21,-7,-3,0,1,4,4,5,21,32};
		assertArrayEquals(expected,outputlist(sortedhead) );
	}
//	@Test
//	void testInsertionSortDuplicateValuePosInput() {
//		int data[] = {2,1,3,2,1,3,2,1,3,2,1,3,2,1,3};
//		SortAlgos bs = new SortAlgos();
//		int expected[] = {1,1,1,1,1,2,2,2,2,2,3,3,3,3,3};
//		bs.insertionSort(data);
//		System.out.println(Arrays.toString(data));
//		assertArrayEquals(expected,data );
//	}
//	@Test
//	void testInsertionSortDuplicateValueNegInput() {
//		int data[] = {-2,-1,-3,-2,-1,-3,-2,-1,-3,-2,-1,-3,-2,-1,-3};
//		SortAlgos bs = new SortAlgos();
//		int expected[] = {-3,-3,-3,-3,-3,-2,-2,-2,-2,-2,-1,-1,-1,-1,-1};
//		bs.insertionSort(data);
//		System.out.println(Arrays.toString(data));
//		assertArrayEquals(expected,data );
//	}
	int[] outputlist(SinglyListNode head)
	{
		int[] result  = new int[10];
	    int i = 0;
		while (head != null)
	    {
			result[i++]=head.data;
	        head = head.next;
	    }
	    return result;

	}

}
