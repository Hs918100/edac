package com.stack;

public class StackImplUsingLinkedList implements StackIntf{
	private SinglyListNode top;
	public StackImplUsingLinkedList() {
		top = null;
	}
@Override
	public void push(int elem) {
	//creating a new singly list node
	SinglyListNode newNode = new SinglyListNode(elem);
	// attaching the newnode next to top 
	//adding in front
	newNode.next = top;
	//now top will point to the newNode
	top = newNode;
	}
	@Override
	public int pop() {
		if(isEmpty()) {
			System.out.println("stack is empty!!!");
			return -1;}
		int data =top.data;//retriving the data
		//making top point to next element
		top = top.next;
		return data;
	}
	@Override
	public boolean isEmpty() {
		if(top == null)
			return true;
		return false;
	}
	@Override
	public boolean isFull() {
		//Growable stack
		return false;
	}
	@Override
	public int[] peek() {
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
		SinglyListNode curr = top;

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

	

	public int GetNodeCount() {
		int count = 0;
		// Set current to fist node of list.
		SinglyListNode curr = top;

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
