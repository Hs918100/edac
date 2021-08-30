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
//	quickSort(arr[], low, high)
//	{
//	    if (low < high)
//	    {
//	        /* pi is partitioning index, arr[pi] is now
//	           at right place */
//	        pi = partition(arr, low, high);
//
//	        quickSort(arr, low, pi - 1);  // Before pi
//	        quickSort(arr, pi + 1, high); // After pi
//	    }
//	}
	public void quickSort(int data[]) {
		//start 0 end last element of arr
		int start = 0; int end = data.length-1;
		quickSortHelper(data,start,end);
	}
	private void quickSortHelper(int[] data,int start,int end) {
		if(start == end)
			return
				// Divide elements in two groups
				- Set pivote to first/start element
			int pivot = start;
			int left = start+1;
			int right = end;
			while (left <= right)
			{
				 // Find two elements pointed by left and right, which are incorrect.
				 while(left < pivot)
					 left++;
				 while (right>pivot)
					 right--;
				int temp = data[left];
				data[right] = data[left];
				data[left] = temp;
				}
				//Swap pivote and right elements
				int temp = data[pivot];
				data[pivot] = data[right];
				data[right] = data[pivot];
				if (start < (right - 1) )
				 quickSortHelper(data, start, right - 1);
				if (end > (right + 1))
				 quickSortHelper(data, right + 1, end);
	}
	private int partition(int []data,int start,int end) {
		int pivot = data[start];//choosing start as pivot
		int i = start;
		for(int j = start ; j<end ;j++) {
			if(data[j] < pivot) {
				i++;
				int temp = data[i];
				data[i] = data[j];
				data[j] = temp;
			}
		}
		
	}
//	partition (arr[], low, high)
//	{
//	    // pivot (Element to be placed at right position)
//	    pivot = arr[high];  
//	 
//	    i = (low - 1)  // Index of smaller element and indicates the 
//	                   // right position of pivot found so far
//
//	    for (j = low; j <= high- 1; j++)
//	    {
//	        // If current element is smaller than the pivot
//	        if (arr[j] < pivot)
//	        {
//	            i++;    // increment index of smaller element
//	            swap arr[i] and arr[j]
//	        }
//	    }
//	    swap arr[i + 1] and arr[high])
//	    return (i + 1)
//	}
}
