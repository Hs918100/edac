package com.app;

public class CircularQueue implements QueueIntf {
	private int size;
	private int[] queue;
	private int front,rear;
	
	public CircularQueue(int size) {
		queue = new int[size];
		this.size = size;
		front = rear = -1;
	}
	@Override
	public int[] peek() {
		return queue;
	}

	

	@Override
	public void addQ(int elem) {
		if(isFull()) {
			System.out.println("Queue is Full!!!!");
		}
		else {
			if(front == -1 && rear == -1)
				front = rear = 0;//first element
			else if(rear == size-1 && front !=0)
				rear = 0;//rear is at the last elem
			else
				rear = (rear+1) %size;//% to make it circular
			queue[rear] = elem;//setting the value
		}
			
		
	}
	@Override
	public int deleteQ() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		else {
			int item = queue[front]; //getting the front item
			if(front==rear)//queue has become empty 
				front = rear = -1;
			else if(front == size-1) //last item
				front = 0;
			else
				front = front +1; //increase front by one
			return item;
		}
		
		
	}
	@Override
	public boolean isEmpty() {
		if(front == -1)
			return true;
		return false;
	}
	@Override
	public boolean isFull() {
		if((rear+1)%size == front)
			return true;
		return false;
	}
	

}
