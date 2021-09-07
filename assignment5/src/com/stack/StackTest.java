package com.stack;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class StackTest {

	@Test
	void testStackIsEmpty() {
		StackImplUsingLinkedList stack = new StackImplUsingLinkedList();
		assertTrue(stack.isEmpty());
	}
	@Test
	void testStackIsFull() {
		StackImplUsingLinkedList stack = new StackImplUsingLinkedList();
		assertFalse(stack.isFull());
	}
	@Test
	void testStackPushOneElement() {
		StackImplUsingLinkedList stack = new StackImplUsingLinkedList();
		assertTrue(stack.isEmpty());
		stack.push(10);
		assertArrayEquals(new int[] {10},stack.peek());
	}
	@Test
	void testStackPushTwoElement() {
		StackImplUsingLinkedList stack = new StackImplUsingLinkedList();
		assertTrue(stack.isEmpty());
		stack.push(10);
		stack.push(20);
		System.out.println(Arrays.toString(stack.peek()));
		assertArrayEquals(new int[] {20,10},stack.peek());
	}
	@Test
	void testStackPushManyElement() {
		StackImplUsingLinkedList stack = new StackImplUsingLinkedList();
		assertTrue(stack.isEmpty());
		for(int i = 0;i<20;i++)
			stack.push(i);
		int[] items = stack.peek();
		assertTrue(items.length == 20 && items[19]==0&& items[0] == 19);
	}
	@Test
	void testStackPopOneElement() {
		StackImplUsingLinkedList stack = new StackImplUsingLinkedList();
		stack.push(10);
		stack.pop();
		assertTrue(stack.isEmpty());
		}
	@Test
	void testStackPopManyElement() {
		StackImplUsingLinkedList stack = new StackImplUsingLinkedList();
		for(int i = 0;i<20;i++)
			stack.push(i);
		for(int i = 19;i>10;i--)
			stack.pop();
		assertFalse(stack.isEmpty());

	}
	

}
