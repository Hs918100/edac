import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class DoublyLinkedListTest {

	@Test
	void testCreateEmptyLinkedList() {
		DoublyLinkedList list = new DoublyLinkedList();
		assertArrayEquals(new int[] {}, list.GetAllElements());
		assertArrayEquals(new int[] {}, list.GetAllElementsInReverse());
	}
	@Test
	void testAddElementAtFront() {
		DoublyLinkedList list = new DoublyLinkedList();
		list.AddAtFront(1);
		list.AddAtFront(3);
		list.AddAtFront(5);
		list.AddAtFront(2);
		int items[]  = list.GetAllElements();
		assertTrue(2==items[0]&& items[3]==1 && items[2]==3);
	}
	@Test
	void testAddElementAtFront1() {
		DoublyLinkedList list = new DoublyLinkedList();
		list.AddAtFront(1);
		list.AddAtFront(0);
		list.AddAtFront(-3);
		list.AddAtFront(10);
		list.AddAtFront(45);
		list.AddAtFront(11);
		int items[]  = list.GetAllElements();
		assertTrue(11==items[0]&& items[3]==-3 && items[2]==10 && items[4]==0);
	}
	@Test
	void testGetAllelements() {
		DoublyLinkedList list = new DoublyLinkedList();
		list.AddAtFront(1);
		list.AddAtFront(0);
		int items[]  = list.GetAllElements();
		assertTrue(items.length == 2);
		assertArrayEquals(new int[] {0,1}, items);
	}
	@Test
	void testGetAllelements1() {
		DoublyLinkedList list = new DoublyLinkedList();
		list.AddAtFront(1);
		list.AddAtFront(100);
		list.AddAtFront(1000);
		list.AddAtFront(10000);
		int items[]  = list.GetAllElements();
		assertTrue(items.length == 4);
		assertArrayEquals(new int[] {10000,1000,100,1}, items);
	}
	@Test
	void testGetAllelementsInReverse() {
		DoublyLinkedList list = new DoublyLinkedList();
		list.AddAtFront(1);
		list.AddAtFront(0);
		int items[]  = list.GetAllElementsInReverse();
		assertTrue(items.length == 2);
		assertArrayEquals(new int[] {1,0}, items);
	}
	@Test
	void testGetAllelementsInReverse1() {
		DoublyLinkedList list = new DoublyLinkedList();
		list.AddAtFront(1);
		list.AddAtFront(100);
		list.AddAtFront(1000);
		list.AddAtFront(10000);
		int items[]  = list.GetAllElementsInReverse();
		assertTrue(items.length == 4);
		assertArrayEquals(new int[] {1,100,1000,10000}, items);
	}
	
	@Test
	void testaddElementAtPositionEmptyList() {
		DoublyLinkedList list = new DoublyLinkedList();
		list.AddElementAtPosition(30, 5);
		int items[]  = list.GetAllElements();
		assertTrue(items.length == 1);
		assertTrue(items[0]==30);
		
	}
	@Test
	void testaddElementAtPositionEmptyList1() {
		DoublyLinkedList list = new DoublyLinkedList();
		list.AddElementAtPosition(30, 0);
		int items[]  = list.GetAllElements();
		assertTrue(items.length == 1);
		assertTrue(items[0]==30);
		
	}
	@Test
	void testaddElementAtPositionExceedSize() {
		DoublyLinkedList list = new DoublyLinkedList();
		list.AddAtFront(5);
		list.AddElementAtPosition(30, 10);
		int items[]  = list.GetAllElements();
		assertTrue(items.length == 2);
		assertTrue(items[0]==5 && items[1]==30);
		
	}
	@Test
	void testaddElementAtPosition() {
		DoublyLinkedList list = new DoublyLinkedList();
		list.AddAtFront(25);
		list.AddAtFront(20);
		list.AddAtFront(15);
		list.AddAtFront(10);
		list.AddElementAtPosition(12, 2);
		int items[]  = list.GetAllElements();
		assertTrue(items.length == 5);
		assertTrue(items[0]==10 && items[1]==12 && items[2]==15);
		
	}
	@Test
	void testaddElementAtPositionAtExtremeEndRight() {
		DoublyLinkedList list = new DoublyLinkedList();
		list.AddAtFront(25);
		list.AddAtFront(20);
		list.AddAtFront(15);
		list.AddAtFront(10);
		list.AddElementAtPosition(12, 4);
		int items[]  = list.GetAllElements();
		assertTrue(items.length == 5);
		assertTrue(items[0]==10 && items[1]==15 && items[3]==12);
		
	}
	@Test
	void testaddElementAtPositionAtExtremeEndLeft() {
		DoublyLinkedList list = new DoublyLinkedList();
		list.AddAtFront(25);
		list.AddAtFront(20);
		list.AddAtFront(15);
		list.AddAtFront(10);
		list.AddElementAtPosition(100, 1);
		int items[]  = list.GetAllElements();
		assertTrue(items.length == 5);
		assertTrue(items[0]==100 && items[1]==10 && items[4]==25);
		
	}
	@Test
	void testDeleteAllEmptyList() {
		DoublyLinkedList list = new DoublyLinkedList();
		list.DeleteAll(14);
		int items[]  = list.GetAllElements();
		assertTrue(items.length == 0);
		
	}
	@Test
	void testDeleteAllElementDoesNotExist() {
		DoublyLinkedList list = new DoublyLinkedList();
		list.AddElementAtPosition(5, 5);
		list.AddElementAtPosition(1, 1);
		list.AddElementAtPosition(2, 2);
		list.AddElementAtPosition(3, 3);
		list.AddElementAtPosition(4, 4);
		
		list.DeleteAll(14);
		int items[]  = list.GetAllElements();
		assertTrue(items.length == 5);
		
	}
	@Test
	void testDeleteAllElementOneElement() {
		DoublyLinkedList list = new DoublyLinkedList();
		list.AddAtFront(5);
		list.DeleteAll(5);
		int items[]  = list.GetAllElements();
		assertTrue(items.length == 0);
		
	}
	@Test
	void testDeleteAllElementSameElement() {
		DoublyLinkedList list = new DoublyLinkedList();
		list.AddElementAtPosition(1, 5);
		list.AddElementAtPosition(1, 1);
		list.AddElementAtPosition(1, 2);
		list.AddElementAtPosition(2, 3);
		list.AddElementAtPosition(1, 4);
		
		list.DeleteAll(1);
		
		int items[]  = list.GetAllElements();
		assertTrue(items.length == 1);
		
	}
	
	@Test
	void testDeleteAllElementDiffElement() {
		DoublyLinkedList list = new DoublyLinkedList();
		list.AddElementAtPosition(1, 5);
		list.AddElementAtPosition(10, 15);
		list.AddElementAtPosition(11, 20);
		list.AddElementAtPosition(12, 30);
		list.AddElementAtPosition(11, 40);
		list.AddElementAtPosition(13, 40);
		
		list.DeleteAll(11);
		int items[]  = list.GetAllElements();
		assertTrue(items.length == 4);
		assertTrue(items[0]==1 && items[1]==10 && items[2]==12 && items[3]==13);
		
	}
	
}
