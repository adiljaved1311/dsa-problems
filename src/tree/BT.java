package tree;

class Node{
	int data;
	Node left,right;
}
class BST{
	Node root;	
	
	public void addNode(int num){
		    if (root == null) {
		    	Node node = new Node();
		    	node.data = num;
		    	node.left = null;
		    	node.right = null;
		    	root = node;
		    }
			Node prev = null;
		    Node pos = root;
			while(pos != null)
			{
				prev = pos;
				if(pos.data == num)
					return;
				else if(num > pos.data)
					pos = pos.right;
				else
					pos = pos.left;
			}
			Node node = new Node();
			node.data = num;
			if(node.data > prev.data)
				prev.right = node;
			else
				prev.left = node;
	}
	
	public void inOrederecurrsivetraverse(Node pos) 
	{
		if(pos != null)
		{
			inOrederecurrsivetraverse(pos.left);
			System.out.println(pos.data);
			inOrederecurrsivetraverse(pos.right);
		}
	}
	
	public void preOrderrecurrsivetraverse(Node pos)
	{
		if(pos != null)
		{
			System.out.println(pos.data);
			preOrderrecurrsivetraverse(pos.left);
			preOrderrecurrsivetraverse(pos.right);
		}
	}
	
	public void postOrderrecurrsivetraverse(Node pos)
	{
		if(pos != null)
		{
			postOrderrecurrsivetraverse(pos.left);
			postOrderrecurrsivetraverse(pos.right);
			System.out.println(pos.data);
		}
	}
	
	public boolean search(int num)
	{
			Node pos = root;
			while(pos != null)
			{
				if(num == pos.data)
					return true;
				else if(num > pos.data)
					pos = pos.right;
				else
					pos = pos.left;
			}
		return false;
	}
	
	public Node recurrsiveSearch(Node pos, int num) {
		if(pos == null)
			return null;
		if(pos.data == num)
			return pos;
		else if(num > pos.data)
			return recurrsiveSearch(pos.right,num);
		else
			return recurrsiveSearch(pos.left,num);
	}
}

public class BT {

	public static void main(String[] args) {
		BST bt = new BST();
        bt.addNode(20);
		bt.addNode(50);
		bt.addNode(10);
		bt.addNode(5);
		bt.addNode(2);
		//bt.preOrderrecurrsivetraverse(bt.root);
		//bt.inOrederecurrsivetraverse(bt.root);
		bt.postOrderrecurrsivetraverse(bt.root);
//		bt.addNode(10);
//		bt.addNode(15);
//		bt.addNode(5);
//		bt.addNode(2);
//		bt.addNode(6);
//		bt.addNode(30);
//		bt.addNode(60);
//		System.out.println(bt.root.data);      // 20
//		System.out.println(bt.root.left.data); // 10
//		System.out.println(bt.root.right.data); // 50
//		System.out.println(bt.root.left.left.data); // 5
//		System.out.println(bt.root.left.right.data); // 15
//		System.out.println(bt.root.left.left.left.data); // 2
//		System.out.println(bt.root.left.left.right.data); // 6
//		System.out.println(bt.root.right.left.data);  // 30
//		System.out.println(bt.root.right.right.data); // 60
//		System.out.println(bt.search(20));
//		System.out.println(bt.search(50));
//		System.out.println(bt.search(10));
//		System.out.println(bt.search(15));
//		System.out.println(bt.search(5));
//		System.out.println(bt.search(2));
//		System.out.println(bt.search(6));
//		System.out.println(bt.search(30));
//		System.out.println(bt.search(60));
//		System.out.println(bt.search(1));
//		System.out.println(bt.search(54));
		
	}
}
