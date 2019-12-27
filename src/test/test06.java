package test;

public class test06 {
	/**
     * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二节树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
     *
     * @param preorder 前序遍历
     * @param inorder  中序遍历
     * @return 树的根结点
     */	
	public static class BinaryTreeNode{
		int value;
		BinaryTreeNode left;
		BinaryTreeNode right;
	}

	public static BinaryTreeNode construct(int[] preorder,int[] inorder) {
		if(preorder == null || inorder == null || preorder.length != inorder.length || inorder.length<1) {
			return null;
		}
		return construct(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
	}
	
	public static BinaryTreeNode construct(int[] preorder,int ps,int pe,int[] inorder,int is,int ie) {
		if(ps>pe) {
			return null;
		}
		int value = preorder[ps];
		int index = is;
		while(index <=ie && inorder[index]!=value) {
			index++;
		}
		if(index > ie) {
			throw new RuntimeException("Invalid input");
		}
		
		BinaryTreeNode node = new BinaryTreeNode();
		node.value = value;
		
		node.left = construct(preorder,ps+1,ps+index-is,inorder,is,index-1);
		node.right = construct(preorder,ps+index-is+1,pe,inorder,index+1,ie);
		
		return node;
	}
	public static void printTree(BinaryTreeNode root) {
		if(root != null) {
			printTree(root.left);
			System.out.println(root.value);
			printTree(root.right);
		}
	}
	public static void test1() {
		int[] preorder= {1,2,4,7,3,5,6,8};
		int[] inorder= {4,7,2,1,5,3,8,6};
		BinaryTreeNode root  = construct(preorder,inorder);
		printTree(root);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
	}
}


