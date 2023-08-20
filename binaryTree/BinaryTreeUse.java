package binaryTree;

import java.util.Scanner;

public class BinaryTreeUse {
	
	
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
		
	public static BinaryTreeNode<Integer> takeInput() {
		System.out.print("Enter root data");
		Scanner s= new Scanner(System.in);
		int rootData=s.nextInt();
		if(rootData==-1) {
			return null;
		}
		
		BinaryTreeNode<Integer> root =new BinaryTreeNode<Integer> (rootData);
		BinaryTreeNode<Integer> leftChild=takeInput();
		BinaryTreeNode<Integer> rightChild=takeInput();
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
	
	public static void printTree(BinaryTreeNode<Integer> root) {
		if(root==null)
			return ;
		System.out.println(root.data);
		printTree(root.left);
		printTree(root.right);
		}
	
	public static int numNodes(BinaryTreeNode<Integer> root) {
		 if(root==null)
			 return 0;
		 int leftNodeCount=numNodes(root.left);
		 int rightNodeCount=numNodes(root.right);
		 return 1+leftNodeCount+rightNodeCount;
	}
	
	    public static void main(String[] args){
	        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);

	        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
	        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);
	        root.left = rootLeft;
	        root.right= rootRight;

	        BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<Integer>(4);
	        BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<Integer>(5);

	        rootLeft.right= twoRight;
	        rootRight.left= threeLeft;
	    //  BinaryTreeNode<Integer>root=takeInput();
	        BinaryTreeNode<Integer>root1=takeInputBetter(true,0,true);
	        printTreeDetailed(root1);
	        System.out.println("number of nodes are :"+numNodes(root1));
	        

	    }
	}

