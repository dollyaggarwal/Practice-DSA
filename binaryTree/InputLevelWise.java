package binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class InputLevelWise {
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
	
	
	 public static BinaryTreeNode<Integer> takeinputLevelWise(){
         Scanner s= new Scanner(System.in);
         System.out.println("Enter root data:");
         int rootData= s.nextInt();

         if(rootData==-1)
        	 return null;

         BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(rootData);
         Queue<BinaryTreeNode<Integer>> pendingChildren= new LinkedList<BinaryTreeNode<Integer>>();
         pendingChildren.add(root);

         while(!pendingChildren.isEmpty()){
             BinaryTreeNode<Integer> front= pendingChildren.poll();
             System.out.println("Enter left child of "+ front.data);
             int left= s.nextInt();
             if(left!=-1){
                  BinaryTreeNode<Integer> leftChild= new BinaryTreeNode<Integer>(left);
                  front.left= leftChild;
                  pendingChildren.add(leftChild);
             }

             System.out.println("Enter right child of "+ front.data);
             int right= s.nextInt();
             if(right!=-1){
                     BinaryTreeNode<Integer> rightChild= new BinaryTreeNode<Integer>(right);
                     front.right= rightChild;
                     pendingChildren.add(rightChild);
             }
         }
         return root;
     }
	 public static void main(String[] args){
	        BinaryTreeNode<Integer> root = takeinputLevelWise();
	        printTreeDetailed(root);

	 }
}
