package com.app;
public class SinglyLinkedList implements LinkedListIntf {
	private SinglyListNode head;
	//tail pointer
	private SinglyListNode tail;

	public SinglyLinkedList() {
		head = null;
		tail = null;
	}
	@Override
	public void AddAtFront(int element) {
		// Make space for new element, say newNode.
		// Store element in newNode's data.
		SinglyListNode newNode = new SinglyListNode(element);
		
		// Set newNode's next to head.
		newNode.next = head;
		// if it is the first element point the tail also
		if(head == null)
			tail = newNode;

		// Set head to newNode.
		head = newNode;
	}

	@Override
	public void AddAtRear(int element) {
		//using tail to add at the last
		if(head == null)//first element
			AddAtFront(element);
		else {
			SinglyListNode newNode = new SinglyListNode(element);
			tail.next = newNode;
			tail = newNode; // updating tail
		}
	}

	@Override
	public int[] GetAllElements() {
		int[] listElements;
/*
		if (head == null) {
			listElements = new int[0];
			return listElements;
		}
*/
		listElements = new int[GetNodeCount()];
		int i = 0;
		// Set current to fist node of list.
		SinglyListNode curr = head;

		// while (current is not empty) do
		while (curr != null) {
			// Process current node.
			listElements[i] = curr.data;
			++i;

			// Set current to current node's next.
			curr = curr.next;
		}

		return listElements;
	}

	@Override
	public void Delete(int element) {
		// Set current to fist node of list.
		SinglyListNode curr = head;
		
		// Set previous to empty.
		SinglyListNode prev = null;

		// while (current is not empty) do
		while (curr != null) {
			// if current node's data is element then
			if (curr.data == element) {
				// end the loop.
				break;
			}
			// Set previous to current node.
			prev = curr;
			// Set current to current node's next
			curr = curr.next;
		}

		// if current node is empty then
		if (curr == null) {
			// Stop
			return;
		}

		// if current node is the first node then
		if (curr == head) {
			// Set head to current node's next
			head = curr.next;
			if(head == null)
				tail = null; // updating tail also list is empty now
			// Stop
			return;
		}

		// Set previous node's next to current node's next.
		prev.next = curr.next;
		if(curr.next == null)//last element
			tail = prev; //making the tail point to the last element
	}

	public int GetNodeCount() {
		int count = 0;
		// Set current to fist node of list.
		SinglyListNode curr = head;

		// while (current is not empty) do
		while (curr != null) {
			// Process current node.
			++count;

			// Set current to current node's next.
			curr = curr.next;
		}

		return count;
	}
}
