package treeSearch;

import java.util.Stack;

public class DFS {
//深度优先  Depth First Search
	// 利用栈
	public void bianli(Node root) {
		//先将右节点压栈  再将左节点压栈  ， 出栈则左在右前面
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		while(!stack.isEmpty()) {
			Node temp = stack.pop();
			if(temp.getRight() != null) {
				stack.push(temp.getRight());
			}
			if(temp.getLeft() != null) {
				stack.push(temp.getLeft());
			}
			System.out.println(temp.getData());
		}
	}
	// 递归    先序、中序、后序都是深度优先
	public void bianli_1(Node root) {
		if(root != null) {
			System.out.println(root.getData());
			bianli_1(root.getLeft());
			bianli_1(root.getRight());
		}
	}
}
