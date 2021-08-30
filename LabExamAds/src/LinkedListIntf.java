
public interface LinkedListIntf {
	 // The function adds the given element as the first element in the linked list.
	 public void AddAtFront(int element);
	// The function adds the given element at the specified position (position is 1 based, i.e., first position in
	 // list is 1) in the linked list.
	  // For example: If list contain elements - 10 5 20
	  // Function call AddElementAtPosition(30, 1) will add element 30 at position 1 (first position). So, the
	 //resultant list will be - 30 10 5 20
	  // If list contain elements - 10 5 20
	  // Function call AddElementAtPosition(30, 5) will add element 30 at last position (as given position is
	 //bigger than size of list). So, the resultant list will be - 10 5 20 30
	  // If list contain elements - 10 5 20
	  // Function call AddElementAtPosition(30, 2) will add element 30 at position 2. So, the resultant list will
	 //be - 10 30 5 20
	  // If list is empty, function call AddElementAtPosition(30, 2) will add element 30 at position 1. So, the
	 //resultant list will be - 30 
	 public void AddElementAtPosition(int element, int position);
	// The function will return all elements in the list by doing forward traversal.
	 public int[] GetAllElements();
	// The function will return all elements in the list by doing backward/reverse traversal.
	 public int[] GetAllElementsInReverse();
	 // The function will delete all occurance of elements in the list.
	 public void DeleteAll(int element); 
	 
}
