
public class DoublyLinkedList implements LinkedListIntf{
	private DoublyLinkedNode head;
	private DoublyLinkedNode tail;
	private int size;
	
	public DoublyLinkedList() {
		head = null;
		tail = null;
		size  = 0;
	}
	@Override
	public void AddAtFront(int element) {
		//creating newNode
		DoublyLinkedNode newNode = new DoublyLinkedNode(element);
		//if list is empty set the head and tail to it
		if(head == null && tail == null) {
			head = newNode;
			tail = newNode;
			size++;
		}
		else {
			//newNode will point to the element which head points to
			newNode.next = head;
			head.prev = newNode;
			head = newNode;//adjusting the head
			size++; //inc the size of the list
		}
		
	}
	private void addAtLast(int element) {
		//creating newNode
				DoublyLinkedNode newNode = new DoublyLinkedNode(element);
				//if list is empty set the head and tail to it
				if(head == null && tail == null) {
					head = newNode;
					tail = newNode;
					size++;
				}
				else {
					//newNode will point to the element which tail points to
					newNode.prev = tail;
					tail.next = newNode;
					tail = newNode;//adjusting the head
					size++;
				}
		
	}

	@Override
	public void AddElementAtPosition(int element, int position) {
		if(position == 1 || position <= 0)//adding in the first position
			AddAtFront(element);
		else if(position > size) //when position exceed the size of curr list size add the element in the last
			addAtLast(element);
		//adding the element in the middle
		else {
			int i = 1;
			DoublyLinkedNode curr = head;
			//creating newNode
			DoublyLinkedNode newNode = new DoublyLinkedNode(element);
			//finding the node 
			while(i != position)
			{
				curr = curr.next;
				i++;
			}
			//changing pointers
			newNode.next = curr;
			newNode.prev = curr.prev;
			curr.prev.next = newNode;
			curr.prev = newNode;
			size++;
		}
		
		
	}

	@Override
	public int[] GetAllElements() {
		int result[] = new int[size];
		int count = 0;
		DoublyLinkedNode curr = head;
		while(curr != null) {
			result[count++] = curr.data;
			curr = curr.next;
		}
		return result;
	}

	@Override
	public int[] GetAllElementsInReverse() {
		int result[] = new int[size];
		int count = 0;
		DoublyLinkedNode curr = tail;
		while(curr != null) {
			result[count++] = curr.data;
			curr = curr.prev;
		}
		return result;
	}

	@Override
	public void DeleteAll(int element) {
		DoublyLinkedNode curr = head;
		//traverse the whole list
		while(curr != null) {
			DoublyLinkedNode next = curr.next;
			DoublyLinkedNode prev = curr.prev;
			// if curr node has the data delete it
			if(curr.data == element) {
				if(size == 1)//only one element in the list
				{
					head = null;
					tail = null;
				}
				else if(prev == null && next != null)//this is the head node
				{
					head = next;//setting head to the next nod
					next.prev = null; //setting the prev to null
				}
				else if(prev != null && next == null)//tail node
				{
					tail = prev;
					prev.next = null;
				}
				else {//node is in the middle
					next.prev = prev;
					prev.next = next;
				}
				
				size--;
			}
			curr = next;
			
		}
	}

}
