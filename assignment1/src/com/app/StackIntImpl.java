package com.app;


public class StackIntImpl implements StackIntf {
	private int[] stack;//stack using arrays
	private int pos = -1;
	private int size;
	public StackIntImpl(int size) {
		
		stack = new int[size];
		this.size = size;
	}
	
	@Override
	public void push(int elem) {
		if(isFull())
			System.out.println("Stack is full!!!!!");
			
		else
			//adding the item
			stack[++pos] = elem;

	}

	@Override
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty !!!!");
			return -1;
		}
		else
			return stack[pos--];
	}

	@Override
	public boolean isEmpty() {
		if(pos == -1)
			return true;
		return false;
	}

	@Override
	public boolean isFull() {
		if(pos == size-1)
			return true;
		return false;
	}
	@Override
	public int[] peek() {
		return stack;
	}

}
