package com.app;

public class DoublySortedLinkedList implements SortedLinkedListIntf {
	private DoublyListNode head;
	private DoublyListNode tail;
	 
	 public DoublySortedLinkedList() {
		head = null;
		tail = null;
	}
	@Override
	public void Insert(int element) {
		DoublyListNode newNode = new DoublyListNode(element);
		//first element
		if (head == null)
		{
			
			head = newNode; //head -> element
			tail = newNode;//tail -> element
		}
		//if element has less or equal value to that of heads.
		else if(head.data >= element) {
			//setting the node to the front
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}else if(head == tail)//only one element in the list
			{
			head.next = newNode;
			newNode.prev = head;
			tail = newNode;
			}
		else {
			DoublyListNode curr = head;//starting point
			//finding the correct position to fit the element
			while(curr != null ) {
				if(curr.data > element)
					break;
				curr = curr.next;
			}
			if(curr == null )//last element
				{
					tail.next = newNode;//last element will be newNode lastE->newNode->null
					newNode.prev = tail; //lastE<- newNode
					tail = newNode; //setting the tail
				}
			else { //element has to be stored in the middle
				//prevE<-curr->nextE
				//prevE->NewNode->currE
				//prevE<-NewNode<-currE
				System.out.println(curr.prev);
				curr.prev.next = newNode; //fixing the element in the middle
				newNode.next = curr;
				
				newNode.prev = curr.prev;
				curr.prev = newNode;
			}
		}
	}
	
	
	
	//not asked to implement future work
	@Override
	public void Delete(int element) {
		// TODO Auto-generated method stub

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
		DoublyListNode curr = head;

		while (curr != null) {
			listElements[i] = curr.data;
			++i;
			curr = curr.next;
		}

		return listElements;
	}
	public int GetNodeCount() {
		int count = 0;
		DoublyListNode curr = head;

		// Algo: While current is not empty.
		while (curr != null) {
			++count;
			curr = curr.next;
		}

		return count;
	}

}
