package com.app;
public interface StackIntf {
	//add element to the stack
	public void push(int elem);
	//remove element from the stack
	public int pop();
	//checks if stack is empty
	public boolean isEmpty();
	//checks if stack is full
	public boolean isFull();
	public int[] peek();
}
