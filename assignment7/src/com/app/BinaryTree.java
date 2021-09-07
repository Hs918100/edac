package com.app;

import java.util.Arrays;

public class BinaryTree implements BinaryTreeIntf {
	BinaryTreeNode root;

	public BinaryTree() {
		root = null;
	}

	private void PreOrderHelper(BinaryTreeNode root,int[] arr,int[] pos) {
		// if root is empty then Stop
		if (root == null) {
			return;
		}
		// Process root node's data.and storing the data into array
		arr[pos[0]] = root.data;
		pos[0] +=1; //using array for pos int value passed by value so new stack new copy
		// if root node's left child exists then
		if (root.lChild != null) {
			// PreOrder(root's left child)
			PreOrderHelper(root.lChild,arr,pos);
		}

		// if root node's right child exists then
		if (root.rChild != null) {
			// PreOrder(root's right child)
			PreOrderHelper(root.rChild,arr,pos);
		}
		return;

	}

	@Override
	public int[] PreOrder() {
		int[] resArr = new int[GetNodesCount()];
		//using array for pos int value passed by value so new stack new copy
		int[] pos = new int[1];
		pos[0]=0;
		PreOrderHelper(root,resArr,pos);
		return resArr;
	}

	public int[] BuildTreeForPreOrder() {
		int[] element = new int[4];
		element[0] = 1;
		element[1] = 2;
		element[2] = 4;
		element[3] = 3;

		root = new BinaryTreeNode(1);
		root.lChild = new BinaryTreeNode(2);
		root.rChild = new BinaryTreeNode(3);
		root.lChild.lChild = new BinaryTreeNode(4);

		return element;
	}
	public int[] BuildTreeForFrequency() {
		int[] element = new int[4];
		element[0] = 1;
		element[1] = 2;
		element[2] = 4;
		element[3] = 3;

		root = new BinaryTreeNode(2);
		root.lChild = new BinaryTreeNode(2);
		root.rChild = new BinaryTreeNode(3);
		root.lChild.lChild = new BinaryTreeNode(3);

		return element;
	}
	private void PostOrderHelper(BinaryTreeNode root,int[] arr,int[] pos) {
		// if root is empty then Stop
		if (root == null) {
			return;
		}
		
		if (root.lChild != null) {
			// PostOrder(root's left child)
			PostOrderHelper(root.lChild,arr,pos);
		}

		// if root node's right child exists then
		if (root.rChild != null) {
			// PostOrder(root's right child)
			PostOrderHelper(root.rChild,arr,pos);
		}
		// Process root node's data.and storing the data into array
				arr[pos[0]] = root.data;
				pos[0] +=1; //using array for pos int value passed by value so new stack new copy
				// if root node's left child exists then

	}

	@Override
	public int[] PostOrder() {
		int[] resArr = new int[GetNodesCount()];
		//using array for pos int value passed by value so new stack new copy
		int[] pos = new int[1];
		pos[0]=0;
		PostOrderHelper(root,resArr,pos);
		return resArr;
	}
	private void InOrderHelper(BinaryTreeNode root,int[] arr,int[] pos) {
		// if root is empty then Stop
		
		if (root == null) {
			return;
		}
		
		if (root.lChild != null) {
			// PreOrder(root's left child)
			InOrderHelper(root.lChild,arr,pos);
		}
		// Process root node's data.and storing the data into array
				arr[pos[0]] = root.data;
				pos[0] +=1; //using array for pos int value passed by value so new stack new copy
				// if root node's left child exists then
		// if root node's right child exists then
		if (root.rChild != null) {
			// PreOrder(root's right child)
			InOrderHelper(root.rChild,arr,pos);
		}
		return;

	}
	@Override
	public int[] InOrder() {
		int[] resArr = new int[GetNodesCount()];
		//using array for pos int value passed by value so new stack new copy
		int[] pos = new int[1];
		pos[0]=0;
		InOrderHelper(root,resArr,pos);
		return resArr;
	}
	private int GetNodesCountHelper(BinaryTreeNode root) {
		//base condition
				if (root == null) {
					return 0;
				}
				//recursive call to get the number of nodes of left subtree + right subtree
				return 1+GetNodesCountHelper(root.lChild)
				+GetNodesCountHelper(root.rChild);
	}
	@Override
	public int GetNodesCount() {
		return GetNodesCountHelper(root);
	}
	private int HeightHelper(BinaryTreeNode root) {
		//base case
				if(root == null)
					return 0;
				//recursive call
				return 1+Math.max(HeightHelper(root.lChild),HeightHelper(root.rChild));
	}
	@Override
	public int Height() {
		return HeightHelper(root);
	}
	private int FindFrequencyHelper(BinaryTreeNode root,int element) {
		int count = 0;//to store the freq
		// if root is empty then Stop
			
				if (root == null) {
					return 0;
				}
				if(root.data == element)
					count ++;//elem found inc count
				
				if (root.lChild != null) {
					// counting in left
					count += FindFrequencyHelper(root.lChild,element);
				}
	
				if (root.rChild != null) {
					// counting in right
					count += FindFrequencyHelper(root.rChild,element);
				}
		return count;
	}
	
	@Override
	public int FindFrequency(int element) {
		
		return FindFrequencyHelper(root, element);
	}
	private int CountLeafNodeHelper(BinaryTreeNode root) {
		if(root == null)//empty tree
			return 0;
		if(root.lChild == null && root.rChild == null) {
			return 1;
		}
		return CountLeafNodeHelper(root.lChild)+CountLeafNodeHelper(root.rChild);
	}
	@Override
	public int CountLeafNodes() {
		
		return CountLeafNodeHelper(root);
	}
	//for each node make its left its right
	private int MakeMirrorHelper(BinaryTreeNode root) {
		//empty tree
		if(root == null)
			return -1;
		//temp node to swap values
		BinaryTreeNode temp = root.lChild;
		root.lChild = root.rChild;
		root.rChild = temp;
		if(root.lChild != null)
			MakeMirrorHelper(root.lChild);
		if(root.rChild != null)
			MakeMirrorHelper(root.rChild);
		return 1;
	}
	@Override
	public int MakeMirror() {
		
		return MakeMirrorHelper(root);
	}
}
