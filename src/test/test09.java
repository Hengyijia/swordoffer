package test;

import java.util.Stack;

public class test09 {

	public static class MList<T>{
		private Stack<T> stack1 = new Stack<>();
		private Stack<T> stack2 = new Stack<>();
		public void appendTail(T t) {
			stack1.add(t);
		}
		public T deteleHead() {
			if(stack2.isEmpty()) {
				while(!stack1.isEmpty()) {
					stack2.push(stack2.pop());
				}
			}
			if(stack2.isEmpty()) {
				throw new RuntimeException("No more element.");
			}
			return stack2.pop();
		}
 	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
