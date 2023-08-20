package binaryTree;

import java.util.Scanner;
public class LargestData {
	
	
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


	 public static int largest(BinaryTreeNode<Integer> root){
	        if(root==null){
	            return -1;
	        }
	        int largestLeft= largest(root.left);
	        int largestRight= largest(root.right);
	        return Math.max(root.data, Math.max(largestLeft, largestRight));
	    }
	 public static void main(String[] args){
		 
	   
	        BinaryTreeNode<Integer>root=takeInputBetter(true,0,true);
	        
	        System.out.println("largest data node is :"+largest(root));
	        

	    }

}
