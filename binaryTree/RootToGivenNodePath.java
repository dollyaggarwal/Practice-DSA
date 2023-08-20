package binaryTree;

import java.util.ArrayList;
import java.util.Scanner;

public class RootToGivenNodePath {
	
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
	
//	public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root , int x) {
//		ArrayList<Integer> arr=new ArrayList<>();
//		if(root==null)
//			return arr;
//		getPath(root,x,arr);
//		return arr;
//	}
//	public static boolean getPathHelper(BinaryTreeNode<Integer>root, int x, ArrayList<Integer> arr) {
//		if(root==null)
//			return false;
//		
//		arr.add(root.data);
//		if(root.data==x)
//			return true;
////		if(getPath(root.left , x , arr) || getPath(root.right, x, arr)) {
////			return true;
////		}	
//		boolean left=getPathHelper(root.left , x , arr);
//		boolean right=getPathHelper(root.right , x , arr);
//		if(left || right)
//			return true;
//			arr.remove(arr.size()-1);
//			return false;
//		}
//	
//Alternative approach
	
//	public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root ,int x) {
//		
//		ArrayList<Integer> arr=new ArrayList<>();
//		if(root==null)
//			return arr;
//		if(root.data==x) {
//			arr.add(root.data);
//			return arr;
//		}
//		ArrayList<Integer>leftpath=getPath(root.left, x);
//		
//		if(!leftpath.isEmpty()) {
//			leftpath.add(root.data);
//			return leftpath;
//		}
//		ArrayList<Integer>rightpath=getPath(root.right, x);
//		
//		if(!rightpath.isEmpty()) {
//			rightpath.add(root.data);
//			return rightpath;
//		}
//		return arr;
//		
//			
//	}
	
	//Alternative approach
	
public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root ,int x) {
		
		
		if(root==null)
			return null;
		if(root.data==x) {
			ArrayList<Integer> arr=new ArrayList<>();
			arr.add(root.data);
			return arr;
		}
		ArrayList<Integer>leftpath=getPath(root.left, x);
		
		if(leftpath!=null) {
			leftpath.add(root.data);
			return leftpath;
		}
		ArrayList<Integer>rightpath=getPath(root.right, x);
		
		if(rightpath!=null) {
			rightpath.add(root.data);
			return rightpath;
		}
		return null;
		
			
	}
	
public static void main(String[] args){
	 
	   
    BinaryTreeNode<Integer>root=takeInputBetter(true,0,true);
    System.out.println(getPath(root,18));
    

}
}
