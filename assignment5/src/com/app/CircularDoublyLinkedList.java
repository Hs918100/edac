package com.app;

public class CircularDoublyLinkedList implements SortedLinkedListIntf {

	private DoublyListNode head;
	private DoublyListNode dummyNode;
	public static final int DUMMY_NODES_VALUE=0;
	 
	 public CircularDoublyLinkedList() {
		dummyNode = new DoublyListNode(DUMMY_NODES_VALUE);
		head = dummyNode;
		dummyNode.next = head;
		dummyNode.prev = head;
	}
	@Override
	public void Insert(int element) {
		DoublyListNode newNode = new DoublyListNode(element);
		DoublyListNode curr = head;
		//finding the position to insert
		do {
			//curr -> next
			curr = curr.next;
			if(curr.data > element)//found bigger element
				break;
		}while(curr != head);
		curr.prev.next = newNode;
		newNode.prev = curr.prev;
		newNode.next = curr;
		curr.prev = newNode;
	}
	
//	/*
//	 * delete(element) - In circular doubly list with dummy node. - Set current to
//	 * first data node (first data node => head’s next). - while current is not head
//	 * do - if current node’s data = element then - End the loop. - Set current to
//	 * current’s next node. - if current node is head then - Stop. // Element not
//	 * found. -
	//Set (current node’s previous) node’s next to (current node’s next).
//	 * - Set (current node’s next) node’s previous to (current node’s previous).
//	 */
	
	@Override
	public void Delete(int element) {
		DoublyListNode curr = head;
		//finding the element to delete
		do {
			//curr -> next
			curr = curr.next;
			if(curr.data == element)//found the element
				break;
		}while(curr != head);
		//if element is not in the list
		if(curr == head)
			return;
		//changing the pointers
		
		curr.prev.next = curr.next;
		curr.next.prev = curr.prev;
		curr = null;
	}
	
	@Override
	public int[] GetAllElements() {
		int[] listElements;


		listElements = new int[GetNodeCount()];
		int i = 0;
		DoublyListNode curr = head;
		
		do {
			listElements[i] = curr.data;
			++i;
			curr = curr.next;
		}while (curr != head);

		return listElements;
	}
	public int GetNodeCount() {
		int count = 0;
		DoublyListNode curr = head;

		// Algo: While current is not empty.
		do {
			++count;
			curr = curr.next;
		}while (curr != head);

		return count;
	}


}
