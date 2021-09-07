package tester;
import com.app.CircularQueue;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.Test;

class CircularQueueTester {

	@Test
	void testForEmptyInitially() {
		CircularQueue queue = new CircularQueue(3);
		assertTrue(queue.isEmpty());
	}
	@Test
	void testForFullInitially() {
		CircularQueue queue = new CircularQueue(3);
		assertFalse(queue.isFull());
	}
	@Test
	void testEnqueUntilFull() {
		CircularQueue queue = new CircularQueue(3);
		queue.addQ(1);
		queue.addQ(2);
		queue.addQ(3);
		assertTrue(queue.isFull());
	}
	@Test
	void testEnqueDequeAndValidateValue() {
		CircularQueue queue = new CircularQueue(1);
		int element = 10;
		queue.addQ(element);
		assertTrue(queue.deleteQ() == element);
	}
	@Test
	void testEnqueDequeMultipleValues() {
		CircularQueue queue = new CircularQueue(10);
		queue.addQ(10);
		queue.addQ(20);
		
		queue.addQ(250);
		queue.deleteQ();
		queue.deleteQ();
		assertFalse(queue.isEmpty());
		
	}
	@Test
	void testEnqueDequeMultiple2() {
		CircularQueue queue = new CircularQueue(10);
		queue.addQ(10);
		queue.addQ(20);
		
		queue.addQ(250);
		queue.deleteQ();
		queue.deleteQ();
		
		assertTrue(queue.deleteQ()==250);
		
	}
	
}
