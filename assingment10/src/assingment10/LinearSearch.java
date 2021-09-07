package assingment10;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
private List<Integer> myList;
public LinearSearch() {
	myList = new ArrayList<Integer>();
}
public void populateList(int[] data) {
	for(int i =0;i<data.length ;i++)
		myList.add(data[i]);
}
//finds element in the list
public boolean findElement(int element) {
	for(int i = 0 ;i <myList.size();i++) {
		if(element == myList.get(i))
			return true;
	}
	return false;
}
}
