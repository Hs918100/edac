package assingment10;

import java.util.Arrays;

public class BubbleSort {
	//sort the given data
	//{32,21,4,3,21,5,7,4,1,0};
	public void sort(int data[]) {
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
	

}
