package test;

import java.util.Stack;

public class test05 {
/**
     * 输入个链表的头结点，从尾到头反过来打印出每个结点的值
     * 使用栈的方式进行
  *
  * @param root 链表头结点
  */
	public static class ListNode{
		int value;
		ListNode nxt;
	}
	/*利用栈先进后出的特性 */
	public static void printListInverselyUsingIteration(ListNode root) {
		Stack<ListNode> stack = new Stack<>();
		while(root!=null) {
			stack.push(root);
			root=root.nxt;
		}
		ListNode tmp;
		while(!stack.isEmpty()) {
			tmp = stack.pop();
			System.out.println(tmp.value + "");
		}
	}
	/*利用递归的性质*/
	public static void printListInverselyUsingRecursion(ListNode root) {
		if(root!=null) {
			printListInverselyUsingRecursion(root.nxt);
			System.out.println(root.value + "");
		}
	}
	public static void main(String[] args) {
		ListNode root = new ListNode();
		root.value = 1;
		root.nxt = new ListNode();
		root.nxt.value =3;
		root.nxt.nxt = new ListNode();
		root.nxt.nxt.value =5;
		root.nxt.nxt.nxt = new ListNode();
		root.nxt.nxt.nxt.value =7;
		
		printListInverselyUsingIteration(root);
		System.out.println();
		printListInverselyUsingRecursion(root);
	}
}
