package binaryTree;

public class BSTUse {
	public static void main(String[] args) {
		BST b=new BST();
		b.insert(5);
		b.insert(2);
		b.insert(7);
		b.insert(1);
		b.insert(3);
		b.insert(6);
		b.insert(8);
		
		
		System.out.println(b.isPresent(1));
		System.out.println(b.deleteData(2));
		System.out.println(b.isPresent(15));
		b.printTree();
		
	}

}
