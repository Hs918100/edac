
public class BinarySearchTree implements BinarySearchTreeIntf {
	private BinaryTreeNode root;

	public BinarySearchTree() {
		root = null;
	}
	
	private BinaryTreeNode InsertHelper(BinaryTreeNode root,int element) {
		
		if(root == null)//first element
			{root = new BinaryTreeNode(element);
			return root;
			}
		else if(element > root.data) //right subtree
		{
			root.rChild = InsertHelper(root.rChild,element);
		}
		else {
			root.lChild = InsertHelper(root.lChild,element);//left subtree
		}
		return root;
	}
	@Override
	public void Insert(int element) {
		root = InsertHelper(root,element);
	}
	private BinaryTreeNode nextSuccessor(BinaryTreeNode root) {
		//if there is no left child means it is the successor
		if(root.lChild == null)
			return root;
		//keep visiting the left nodes
		return nextSuccessor(root.lChild);
	}
	private BinaryTreeNode DeleteHelper(BinaryTreeNode root,int element) {
		if(root == null)//empty tree
			return null;
		if(root.data == element)
		{//deleting node which has no child
			if(root.lChild == null && root.rChild == null) {
			root = null;
			return root;
			}
			//if it has left child replace it with left
			else if(root.rChild ==null) {
				return root.lChild;
			}
			//both children are present
			else
			{
				//finding successor
				BinaryTreeNode delNode = nextSuccessor(root.rChild);
				root.data = delNode.data;
				root.rChild =  DeleteHelper(root.rChild,root.data);
				return root;
			}
		}
		else if(root.data > element)//visit left subtree
			root.lChild = DeleteHelper(root.lChild,element);
		else //visit right subtree
			root.rChild = DeleteHelper(root.rChild,element);
		return root;
	}
	@Override
	public void Delete(int element) {
		root = DeleteHelper(root,element);
	}
	private boolean SearchHelper(BinaryTreeNode root,int element) {
		if(root == null)
			return false;
		if(root.data == element)//found
			return true;
		else if(root.data > element)
			return SearchHelper(root.lChild,element);
		else
			return SearchHelper(root.rChild,element);
	}
	@Override
	public boolean Search(int element) {
		return SearchHelper(root,element);
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
	
	public int GetNodesCount() {
		return GetNodesCountHelper(root);
	}

}
