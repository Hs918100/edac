package com.app;

public interface QueueIntf {
	//add item to queue
	public void addQ(int elem);
	//remove item from queue
	public int deleteQ();
	//checks if queue is empty
	public boolean isEmpty();
	//checks if queue is full
	public boolean isFull();
	public int[] peek();
}
