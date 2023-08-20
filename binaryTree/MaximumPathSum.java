package binaryTree;

import java.util.Scanner;

public class MaximumPathSum {
	
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
	
	public static int maxPathSum(BinaryTreeNode<Integer> root) {
		int maxvalue[]=new int[1];
		maxvalue[0]=Integer.MIN_VALUE;
		maxPathDown(root,maxvalue);
		return maxvalue[0];
		
	}
	private static int maxPathDown(BinaryTreeNode<Integer> root, int [] maxvalue) {
		if(root==null)
			return 0;
			 
		int left=Math.max(0, maxPathDown(root.left,maxvalue));
		int right=Math.max(0,maxPathDown(root.right,maxvalue));
		maxvalue[0]=Math.max(maxvalue[0],left+right+ root.data);
		
		return Math.max(left,right)+root.data;
		
		
	}
	 public static void main(String[] args){
		 
		   
	        BinaryTreeNode<Integer>root=takeInputBetter(true,0,true);
	        System.out.println(maxPathSum(root));
	        
	        
	    }

}
