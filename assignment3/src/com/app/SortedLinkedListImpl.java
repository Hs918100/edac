package com.app;

public class SortedLinkedListImpl implements SortedLinkedListIntf {
private SinglyListNode head;

 public SortedLinkedListImpl() {
		head = null;//set head to null
	}
	@Override
	public void insert(int element) {
		//first element
		if(head == null)
			head = new SinglyListNode(element);
		else if(head.data >= element) {
			SinglyListNode newNode = new SinglyListNode(element);
			//attaching the node to the front
			newNode.next = head; 
			head = newNode;
		}
		else {
			SinglyListNode curr = head;//starting point
			SinglyListNode prev = null; //to hold the prev element
			//finding the correct position to fit the element
			while(curr.next != null && curr.data < element) {
				prev = curr; 
				curr = curr.next;
			}
			SinglyListNode newNode = new SinglyListNode(element);
			if(curr.next == null && curr.data < element)//when our element is biggest
				curr.next = newNode;
			else { //element has to be stored in the middle
				prev.next = newNode;
				newNode.next = curr;
			}
		}

	}

	@Override
	public int[] getAllElements() {
			int[] listElements;

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
		private int GetNodeCount() {
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
