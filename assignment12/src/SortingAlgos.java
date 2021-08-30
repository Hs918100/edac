import java.util.Arrays;

public class SortingAlgos implements SortingIntf {
	private void Merge(int[] elements, int start1, int end1,
			int start2, int end2) {
		int[] result = new int [(end1 - start1 + 1) + (end2 - start2 + 1)];
		int resultCount = 0;

		System.out.println("In Merge [" + start1 + ", " + end1 + "] ["
				+ start2 + ", " + end2 + "]");

		// Set i to fist element of elements1
		int i = start1;
		// Set j to first element of elements2
		int j = start2;

		// while (i < size of elements1) and (j < size of elements2)
		while ((i <= end1) && (j <= end2)) {
			// if ith element < jth element
			if (elements[i] < elements[j]) {
				// Append i'th element to result
				result[resultCount++] = elements[i];
				// Move i to next element
				++i;
			} else {
				// jth element is smaller than ith element
				// Append jth element to result
				result[resultCount++] = elements[j];
				// Move j to next element
				++j;
			}
		}

		// Copy remaining elements from group that is still having some left, to result.
		while (i <= end1) {
			// Append ith element to result.
			result[resultCount++] = elements[i];
			// Move i the next element
			++i;
		}
		while (j <= end2) {
			// Append jth element to result.
			result[resultCount++] = elements[j];
			// Move j to next element
			++j;
		}

		// Copy merged data from result into elements
		for (i = 0; i < resultCount; ++i) {
			elements[start1 + i] = result[i];
		}
	}

	private void MergeSortHelper(int[] elements, int start, int end) {
		System.out.println("In MergeSortHelper [" + start + ", " + end + "]");
		// if Size of elements is 1 then STOP
		if ((end - start) == 0) {
			return;
		}

		// Divide the elements into two groups and sort them.
		int mid = (start + end) / 2;
		MergeSortHelper(elements, start, mid);
		MergeSortHelper(elements, mid + 1, end);

		// Merge the two sorted groups.
		Merge(elements, start, mid, mid + 1, end);
	}

	@Override
	public void MergeSort(int[] elements) {
		MergeSortHelper(elements, 0, elements.length - 1);
	}
	public void HeapSort(int[] elements) {
		/*Heap Sort Algorithm for sorting in increasing order: 
			1. Build a max heap from the input data. 
			2. At this point, the largest item is stored at the root of the heap. Replace it with the last item of the heap followed by reducing the size of heap by 1. Finally, heapify the root of the tree. 
			3. Repeat step 2 while the size of the heap is greater than 1.*/
		// heap sort
		int size = elements.length;
		for(int i = size/2 -1 ; i >= 0 ;i--)
		
			maxHeapify(elements,i,size); // building heap from the data
		//sorting using heap
		for(int i = size-1 ; i > 0; i--) {
			int temp = elements[0];
			elements[0] = elements[i];
			elements[i] = temp;
			
			maxHeapify(elements, 0, i);
		}

			


	}
	private void maxHeapify(int [] elements,int root,int size) {
		/*
		 * How to build the heap? Heapify procedure can be applied to a node only if its
		 * children nodes are heapified. So the heapification must be performed in the
		 * bottom-up order. Lets understand with the help of an example:
		 */
		int largest = root;
		int lchild = 2 * root + 1;
		int rchild = 2 * root + 2;
		//if left child is larger than root
		if(lchild < size && elements[lchild] > elements[largest])
			largest = lchild;
		//if right child is larger than root
		if(rchild < size && elements[rchild] > elements[largest])
			largest = rchild;
		
		//if largest is not root
		if(largest != root) {
			int temp = elements[root];
			elements[root] = elements[largest];
			elements[largest] = temp;
			//recursively heapify the sub-tree
			maxHeapify(elements, largest, size);
		}
	}
}
