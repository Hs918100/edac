package assingment11;

import java.util.Arrays;

public class SortAlgos {
private SinglyListNode sortedHead;
	//BubbleSort
	public void bubbleSort(int data[]) {
		for(int i = 0 ; i<data.length ;i++) {
			for(int j = 0 ;j<data.length-1 ;j++) {
				if(data[j]>data[j+1]) {
					//swapping values 
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
		}
		
	}
	public void selectionSort(int data[]) {
		for(int i = 0; i<data.length ;i++) {
			int minIdx = i ;//managing index of smallest value
			int minValue = data[i];//value of data[i] to find the smallest value against it
			for(int j = i+1; j<data.length ;j++) {
				if(minValue > data[j]) { //find bigger value than smallest index value
					minIdx = j;
					minValue = data[j];//updating the value 
				}
			
			}
			//swap the values 
			int temp = data[i];
			data[i] = data[minIdx];
			data[minIdx] = temp;
			
		}
		
	}
	
	public void insertionSort(int data[]) {
		//traverse the whole array
		for(int i = 1 ;i <data.length ; i++) {
			int key = data[i];//current element
			int j = i-1;//prev element
			//find the position of curr eleme
			//compare it with all elements below the curr index i-1,i-2,....
			while(j>=0 && key < data[j]) {
				data[j+1] = data[j];
				j = j-1;
				
			}
			
			data[j+1] = key;
		}
	}
//	for linked list
	public SinglyListNode insertionSort(SinglyListNode head) {
		SinglyListNode curr = head;
        // Traverse the given linked list and insert every
        // node to sorted
        while (curr != null)
        {
            // Store next for next iteration
        	SinglyListNode next = curr.next;
            // insert current in sorted linked list
            sortedInsert(curr);
            // Update current
            curr = next;
        }
        return sortedHead;
	}
	private void sortedInsert(SinglyListNode node) {
		//firstElement or smaller element
		if(sortedHead == null || sortedHead.data>=node.data) {
			 	node.next = sortedHead;
	            sortedHead = node;
		}
		//bigger element
		else {
			SinglyListNode curr = sortedHead;
			 while (curr.next != null && curr.next.data < node.data)
	            {
	                curr = curr.next;
	            }
	            node.next = curr.next;
	            curr.next = node;
	        }
	}

	public void quickSort(int data[]) {
		//start 0 end last element of arr
		int start = 0; int end = data.length-1;
		quickSortHelper(data,start,end);
	}
	private void quickSortHelper(int[] data,int start,int end) {
		//do it untill arrays has 1 element
		if(start < end) { 
			//finding the partition index 
			int pi = partition(data, start, end);
			//sorting the parted arrays recursively
			quickSortHelper(data, start, pi-1);
			quickSortHelper(data, pi+1, end);
		}
	}
	private int partition(int []data,int start,int end) {
		int pivot = data[end]; //choosing last element as pivot
		int pIndex = start; //start is our pindex
		//traversing over the whole array
		for(int i = start ; i < end;i++) {
			//if element is less than the pivot swap it with pivot index
			
			if(data[i] <= pivot) {
				swap(data,i,pIndex);
				pIndex++; // increase the pivot index
			}
		}
		//swapping the pIndex element with the last element (which is our pivot)
		swap(data,end,pIndex);
		return pIndex;
	}
	private void swap(int []data,int pos1,int pos2) {
		int temp = data[pos1];
		data[pos1] = data[pos2];
		data[pos2] = temp;
	}
}
