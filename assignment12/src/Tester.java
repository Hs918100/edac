import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tester {

	@Test
	void testHeapSortPostiveInput() {
		int data[] = {32,21,4,3,21,5,7,4,1,0};
		SortAlgos bs = new SortAlgos();
		int expected[] = {0,1,3,4,4,5,7,21,21,32};
		bs.HeapSort(data);
		assertArrayEquals(expected,data );
	}
	@Test
	void testHeapSortNegativeInput() {
		int data[] = {-32,-21,-4,-3,-21,-5,-7,-4,-1,0};
		SortAlgos bs = new SortAlgos();
		int expected[] = {-32,-21,-21,-7,-5,-4,-4,-3,-1,0};
		bs.HeapSort(data);
		assertArrayEquals(expected,data );
	}
	@Test
	void testHeapSortPostiveNegativeInput() {
		int data[] = {32,21,4,-3,-21,5,-7,4,1,0};
		SortAlgos bs = new SortAlgos();
		int expected[] = {-21,-7,-3,0,1,4,4,5,21,32};
		bs.HeapSort(data);
		assertArrayEquals(expected,data );
	}
	@Test
	void testHeapSortDuplicateValuePosInput() {
		int data[] = {2,1,3,2,1,3,2,1,3,2,1,3,2,1,3};
		SortAlgos bs = new SortAlgos();
		int expected[] = {1,1,1,1,1,2,2,2,2,2,3,3,3,3,3};
		bs.HeapSort(data);
		assertArrayEquals(expected,data );
	}
	@Test
	void testHeapSortDuplicateValueNegInput() {
		int data[] = {-2,-1,-3,-2,-1,-3,-2,-1,-3,-2,-1,-3,-2,-1,-3};
		SortAlgos bs = new SortAlgos();
		int expected[] = {-3,-3,-3,-3,-3,-2,-2,-2,-2,-2,-1,-1,-1,-1,-1};
		bs.(data);
		assertArrayEquals(expected,data );
	}

}
