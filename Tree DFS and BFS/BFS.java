package treeSearch;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
//广度优先    Breadth First Search    利用队列
	public void bianli(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node temp = queue.poll();
			if(temp.getLeft() != null) {
				queue.add(temp.getLeft());
			}
			if(temp.getRight() != null) {
				queue.add(temp.getRight());
			}
			System.out.println(temp.getData());
		}
	}	
	
}
