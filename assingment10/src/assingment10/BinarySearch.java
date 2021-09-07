package assingment10;

public class BinarySearch {
	private int start;
	private int end;
	private int[] data;
	public BinarySearch(int data[]) {
		this.data = data;
		start = 0;
		end = data.length-1;
	}
	public boolean search(int element) {
		return searchHelper(data,element,start,end);
	}
private boolean searchHelper(int data[],int element,int start,int end) {
	if(start > end)
		return false;//element not in the array
	int mid = (start+end)/2;//to search in half array
	if(data[mid] == element)//found element
		return true;
	else if(data[mid] > element)//visit leftmost arr
		return searchHelper(data,element,0,mid-1);
	else//visit right half
		return searchHelper(data,element,mid+1,end);
}
}
