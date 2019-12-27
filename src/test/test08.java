package test;

public class test08 {
	public static class BinaryTreeNode{
		int value;
		BinaryTreeNode leftNode;
		BinaryTreeNode rightNode;
		BinaryTreeNode parentNode;
		public BinaryTreeNode(int data) {
			this.value = data;
		}
	}
	public static int getNext(BinaryTreeNode pNode) {
		if(pNode == null) {
			return 0;
		}
		if(pNode.rightNode != null) {
			BinaryTreeNode node1 =null;
			node1 = pNode.rightNode;
			while(node1.leftNode != null) {
				node1 = node1.leftNode;
			}
			return node1.value;
		}else if(pNode.parentNode != null && pNode.parentNode.leftNode == pNode) {
			return pNode.parentNode.value;
		}else if(pNode.parentNode != null && pNode.parentNode.rightNode == pNode) {
			BinaryTreeNode node2 =null;
			node2 = pNode.parentNode;
			while(node2 != null) {
				if(node2.parentNode.leftNode == pNode) {
					return node2.parentNode.value;
				}
				node2 = node2.parentNode;
			}
		}
		//return null;
		return 0;
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode b1 = new BinaryTreeNode(1);
		BinaryTreeNode b2 = new BinaryTreeNode(2);
		BinaryTreeNode b3 = new BinaryTreeNode(3);
		BinaryTreeNode b4 = new BinaryTreeNode(4);
		BinaryTreeNode b5 = new BinaryTreeNode(5);
		BinaryTreeNode b6 = new BinaryTreeNode(6);
		BinaryTreeNode b7 = new BinaryTreeNode(7);
		BinaryTreeNode b8 = new BinaryTreeNode(8);
		b1.leftNode = b2;
		b1.rightNode = b3;
		b2.leftNode = b4;
		b4.rightNode = b7;
		b3.leftNode = b5;
		b3.rightNode = b6;
		b6.leftNode = b8;
		
		System.out.println(getNext(b7));
	}

}
