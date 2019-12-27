package test;

import java.util.Stack;

public class test05 {
/**
     * ����������ͷ��㣬��β��ͷ��������ӡ��ÿ������ֵ
     * ʹ��ջ�ķ�ʽ����
  *
  * @param root ����ͷ���
  */
	public static class ListNode{
		int value;
		ListNode nxt;
	}
	/*����ջ�Ƚ���������� */
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
	/*���õݹ������*/
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
