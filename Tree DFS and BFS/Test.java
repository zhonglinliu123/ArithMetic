package treeSearch;

public class Test {
	public static void main(String[] args) {
		Node root = new Node("1");
		root.setLeft(new Node("2"));
		root.setRight(new Node("3"));
		root.getLeft().setLeft(new Node("4"));
		root.getLeft().setRight(new Node("5"));
		root.getRight().setLeft(new Node("6"));
		root.getRight().setRight(new Node("7"));
		root.getLeft().getLeft().setLeft(new Node("8"));
		root.getLeft().getLeft().setRight(new Node("9"));
		root.getLeft().getRight().setLeft(new Node("10"));
		root.getLeft().getRight().setRight(new Node("11"));
		root.getRight().getLeft().setLeft(new Node("12"));
		root.getRight().getLeft().setRight(new Node("13"));
		root.getRight().getRight().setLeft(new Node("14"));
		root.getRight().getRight().setRight(new Node("15"));
		
		BFS bfs = new BFS();
//		bfs.bianli(root);
		
		DFS dfs = new DFS();
//		dfs.bianli(root);
		dfs.bianli_1(root);
	}
}
