package binaryTree;

import java.util.Scanner;

public class DepthOfNode {
	public static BinaryTreeNode<Integer> takeInputBetter(boolean isRoot, int parentData, boolean isLeft){
		if(isRoot)
		System.out.print("Enter root data :");
		else {
			if(isLeft)
				System.out.println("Enter left child of " + parentData);
			else
				System.out.println("Enter right child of "+parentData);
			
		}
		Scanner s= new Scanner(System.in);
		int rootData=s.nextInt();
		if(rootData==-1) {
			return null;
		}
		
		BinaryTreeNode<Integer> root =new BinaryTreeNode<Integer> (rootData);
		BinaryTreeNode<Integer> leftChild=takeInputBetter(false,rootData,true);
		BinaryTreeNode<Integer> rightChild=takeInputBetter(false,rootData,false);
		root.left=leftChild;
		root.right=rightChild;
		return root;	
	}
	public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
		if(root==null)
			return ;
		
			System.out.print(root.data+":");
		
		if(root.left!=null)
			System.out.print("L"+root.left.data+",");
		if(root.right!=null)
			System.out.print("R"+root.right.data);
			System.out.println();
		
			printTreeDetailed(root.left);
			printTreeDetailed(root.right);
		}
	public static void printAtDepthK(BinaryTreeNode<Integer>root, int k) {
		if(root==null)
			return;
		if(k==0) {
			System.out.println("node a depth K is : "+root.data);
			return;
		}
		printAtDepthK(root.left,k-1);
		printAtDepthK(root.right,k-1);
		
	}
	 public static void main(String[] args){
		 
		   
        BinaryTreeNode<Integer>root=takeInputBetter(true,0,true);
        printTreeDetailed(root);
        printAtDepthK(root,2);
    }
}
