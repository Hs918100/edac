package com.app;

public class QueueIntImpl implements QueueIntf {
	private int size;
	private int[] queue;
	private int front,rear;
	
	public QueueIntImpl(int size) {
		queue = new int[size];
		this.size = size;
		front = rear = 0;
	}
	@Override
	public int[] peek() {
		return queue;
	}

	

	@Override
	public void addQ(int elem) {
		if(isFull())
			System.out.println("Queue is full!!!!!");
		else
			queue[rear++] = elem;
		
	}
	@Override
	public int deleteQ() {
		if(isEmpty()) {
			System.out.println("No item in the queue!!!");
			return -1;
			}
		int res = queue[front];
		for (int i = 0; i < rear - 1; i++) {
            queue[i] = queue[i + 1];
        }

        // store 0 at rear indicating there's no element
        if (rear < size)
            queue[rear-1] = 0;
        if(rear == size)
        	queue[rear-1]=0;

        // decrement rear
        rear--;
        return res;
		
	}
	@Override
	public boolean isEmpty() {
		if(front == rear)
			return true;
		return false;
	}
	@Override
	public boolean isFull() {
		if(size == rear)
			return true;
		return false;
	}
	

}
