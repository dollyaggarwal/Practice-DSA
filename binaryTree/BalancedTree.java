package binaryTree;

import java.util.Scanner;

public class BalancedTree {
	
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
	
//	public static int height(BinaryTreeNode<Integer> root) {
//		if(root==null)
//			return 0;
//		int leftHeight=height(root.left);
//		int rightHeight=height(root.right);
//		return 1+Math.max(leftHeight, rightHeight);
//	}
	
	  //bad time complexity Worst case:- O(n^2), avg case:- O(nlogn)
	
//	public static boolean isBalancedTree( BinaryTreeNode<Integer> root) {
//		if(root==null)
//			return true;
//		int leftHeight=height(root.left);
//		int rightHeight=height(root.right);
//		if(Math.abs(leftHeight-rightHeight)>1)
//			return false;
//		 boolean isLeftBalanced=isBalancedTree(root.left);
//		 boolean isRightBalanced=isBalancedTree(root.right);
//		 return isLeftBalanced && isRightBalanced;
//		
//	}
	
	 //Better time complexity O(n).
    public static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root){
        if(root==null){
          int height= 0;
          boolean isBal= true;
          BalancedTreeReturn ans= new BalancedTreeReturn();
          ans.height= height;
          ans.isBalanced= isBal;
          return ans;
        }
        BalancedTreeReturn leftOutput= isBalancedBetter(root.left);
        BalancedTreeReturn rightOutput= isBalancedBetter(root.right);
        boolean isBal= true;
        int height=1+Math.max(leftOutput.height, rightOutput.height);

        if(Math.abs(leftOutput.height-rightOutput.height)>1){
          isBal= false;
        }
        if(!leftOutput.isBalanced || !rightOutput.isBalanced){
          isBal=false;
        }
        BalancedTreeReturn ans= new BalancedTreeReturn();
        ans.height= height;
        ans.isBalanced= isBal;
        return ans;
    }
    public static boolean isBalancedTreeBetter1( BinaryTreeNode<Integer> root) {
    	
    	return height(root)!=-1;
    }
    public static int height(BinaryTreeNode<Integer> root) {
		if(root==null)
			return 0;
		
		int leftHeight=height(root.left);
		
		if(leftHeight==-1)
			return -1;
		
		int rightHeight=height(root.right);
		
		if(rightHeight==-1)
			return -1;
		
		if(Math.abs(leftHeight-rightHeight)>1)
			return -1;
		
		return 1+Math.max(leftHeight, rightHeight);
	}
	
    


	 public static void main(String[] args){
		 
		   
	        BinaryTreeNode<Integer>root=takeInputBetter(true,0,true);
	        
	     //  System.out.println("Is Balanced:"+isBalancedTree(root));
	        
	        BalancedTreeReturn ans= isBalancedBetter(root);
	        
	        System.out.println("is balanced: "+ ans.isBalanced);


	        
	        
	    }
}
