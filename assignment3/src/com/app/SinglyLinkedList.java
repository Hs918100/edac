package com.app;

public class SinglyLinkedList implements LinkedListIntf {
	private SinglyListNode head;//ref to list

	public SinglyLinkedList() {
		head = null;//setting head to null
	}

	@Override
	public void addAtFront(int element) {
		//getting new node to add to list
		SinglyListNode newNode = new SinglyListNode(element);
		newNode.next = head;//newNode.next->head
		head = newNode;//newnode is head now
	}

	@Override
	//without using tail
	public void addAtRear(int element) {
		if(head == null)//first element
			head = new SinglyListNode(element);//head is gonna point the element
		else {
			SinglyListNode curr = head; //starting point
			
			//find the last element
			
			while (curr.next != null) {
				curr = curr.next;
			}
			//now curr is pointing at last element
			//setting the element at last
			curr.next = new SinglyListNode(element);
		}
	}

	@Override
	public int[] getAllElements() {
		int[] listElements;
/*
		if (head == null) {
			listElements = new int[0];
			return listElements;
		}
*/
		listElements = new int[GetNodeCount()];
		int i = 0;
		SinglyListNode curr = head;
//filling the array with the elements
		while (curr != null) {
			listElements[i] = curr.data;
			++i;
			curr = curr.next;
		}

		return listElements;
	}
	//getting the size of the list
	public int GetNodeCount() {
		int count = 0;
		SinglyListNode curr = head;

		// Algo: While current is not empty.
		while (curr != null) {
			++count;
			curr = curr.next;
		}

		return count;
	}
}
