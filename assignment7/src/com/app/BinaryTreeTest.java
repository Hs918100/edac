package com.app;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class BinaryTreeTest {
	@Test
	void testPreOrder() {
		BinaryTree bt = new BinaryTree();
		int[] element = bt.BuildTreeForPreOrder();
		int[] traversalResult = bt.PreOrder();
		
		assertArrayEquals(element, traversalResult);
	}
	@Test
	void testInOrder() {
		BinaryTree bt = new BinaryTree();
		int[] element = bt.BuildTreeForPreOrder();
		int[] traversalResult = bt.InOrder();
		System.out.println(Arrays.toString(traversalResult));
		assertArrayEquals(new int[] {4,2,1,3}, traversalResult);
	}
	@Test
	void testPostOrder() {
		BinaryTree bt = new BinaryTree();
		int[] element = bt.BuildTreeForPreOrder();
		int[] traversalResult = bt.PostOrder();
		
		assertArrayEquals(new int[] {4,2,3,1}, traversalResult);
	}
	@Test
	void testHeightOfEmptyTree() {
		BinaryTree bt = new BinaryTree();
		assertTrue(bt.Height()==0);
	}
	@Test
	void testHeightOfTree() {
		BinaryTree bt = new BinaryTree();
		int[] element = bt.BuildTreeForPreOrder();
		assertTrue(bt.Height()==3);
	}
	@Test
	void testGetNodesCounttOfEmptyTree() {
		BinaryTree bt = new BinaryTree();
		assertTrue(bt.GetNodesCount()==0);
	}
	@Test
	void testGetNodesCountOfTree() {
		BinaryTree bt = new BinaryTree();
		int[] element = bt.BuildTreeForPreOrder();
		assertTrue(bt.GetNodesCount()==4);
	}
	@Test
	void testCountLeafNodeTree() {
		BinaryTree bt = new BinaryTree();
		int[] element = bt.BuildTreeForPreOrder();
		assertTrue(bt.CountLeafNodes()==2);
	}
	@Test
	void testFindFrequencyTree() {
		BinaryTree bt = new BinaryTree();
		int[] element = bt.BuildTreeForFrequency();
		assertTrue(bt.FindFrequency(2)==2);
		assertTrue(bt.FindFrequency(3)==2);
	}
	@Test
	void testMakeMirrorTree() {
		BinaryTree bt = new BinaryTree();
		int[] element = bt.BuildTreeForFrequency();
		bt.MakeMirror();
		int[] traversalResult = bt.PostOrder();
		
		assertArrayEquals(new int[] {3,3,2,2}, traversalResult);
	}
	@Test
	void testMakeMirrorTree2() {
		BinaryTree bt = new BinaryTree();
		int[] element = bt.BuildTreeForPreOrder();
		bt.MakeMirror();
		int[] traversalResult = bt.PreOrder();
		
		assertArrayEquals(new int[] {1,3,2,4}, traversalResult);
	}

}
