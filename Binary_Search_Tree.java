
class Node {
	Node left;
	Node right;
	int data;

	public Node(int item) {
		data = item;
		left = null;
		right = null;
	}
}

class BST {
	Node root;

	void insertNewNode(int data) {		//Seperate method just so we can send root in parameter.
		root = insert(root, data);
	}

	Node insert(Node root, int data) {
		if (root == null) {
			root = new Node(data);
			return root;
		}
		if (data < root.data) {
			root.left = insert(root.left, data);
		} else if (data > root.data) {
			root.right = insert(root.right, data);
		}
		return root;
	}

	void inorder() {
		inorderRec(root);
	}

	void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.print(root.data + " ");
			inorderRec(root.right);
		} else
			return;
	}

	void preorder() {
		preorderRec(root);
	}

	void preorderRec(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
			preorderRec(root.left);
			preorderRec(root.right);
		}
	}

	void postorder() {
		postorderRec(root);
	}

	void postorderRec(Node root) {
		if (root != null) {
			postorderRec(root.left);
			postorderRec(root.right);
			System.out.print(root.data + " ");
		}
	}

	void search(int key) {
		searchTree(root, key);
	}

	void searchTree(Node root, int key) {
		boolean flag = false;
		if (root == null)
			return;
		while (root != null) {
			if (key == root.data) {
				System.out.println("\n" + key + " Found");
				flag = true;
				break;
			} else if (key < root.data) {
				root = root.left;
			} else if (key > root.data) {
				root = root.right;
			}
		}
		if (flag == false) {
			System.out.println("\n" + key + " Not Found");
		}
	}

	void delete(int key) {
		root = deleteRec(key, root);
	}

	Node deleteRec(int key, Node root) {
		
		if(root==null)
			return null;
		if(key<root.data)
			root.left=deleteRec(key,root.left);
		else if(key>root.data)
			root.right=deleteRec(key,root.right);
		else
		{
			if(root.left==null && root.right==null)			//Case 1: No child node
				return null;
			if(root.left==null)					//Case 2: One child node
				return root.right;
			else if(root.right==null)
				return root.left;
										//Case 3: Two child nodes
			root.data=minNode(root.right);				//Finding inorder successor, that is the smallest key in the right subtree.
			root.right=deleteRec(root.data,root.right);		//Deleting the inorder successor, passing the smallest element.
		}
		return root;							// After all the recursive calls in stack the original root is returned
	}
	int minNode(Node root)
	{
		int min=root.data;
		while(root.left!=null)
		{
			min=root.left.data;
			root=root.left;
		}
		return min;
	}
}

public class Binary_Search_Tree {
	public static void main(String args[]) {
		BST bst = new BST();

		bst.insertNewNode(100);
		bst.insertNewNode(20);
		bst.insertNewNode(200);
		bst.insertNewNode(10);
		bst.insertNewNode(30);
		bst.insertNewNode(150);
		bst.insertNewNode(300);
		bst.insertNewNode(15);

		System.out.println("Preorder");
		bst.preorder();
		System.out.println("\nInorder");
		bst.inorder();
		System.out.println("\nPostorder");
		bst.postorder();

		bst.search(30);

		bst.delete(30);
		System.out.println("\nInorder");
		bst.inorder();
	}
}
