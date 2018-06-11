package br.com.desafio.binarytree;

public class BinaryTreeMain {
	
	public static void main(String[] args) 
	{
		BinaryTree binaryTree = new BinaryTree();
		create(binaryTree);
		binaryTree.show();
	}
	
	private static void create(BinaryTree binaryTree) 
	{
		binaryTree.add(56);
		binaryTree.add(13);
		binaryTree.add(25);
		binaryTree.add(8);
		binaryTree.add(11);
		binaryTree.add(96);
		
	}
}
