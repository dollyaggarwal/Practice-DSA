package binaryTree;
import java.util.Scanner;

public class IsBST {
	
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
	
	
	 public static int maximum(BinaryTreeNode<Integer> root){
	        if(root==null){
	            return Integer.MIN_VALUE;
	        }
	        int maximumLeft= maximum(root.left);
	        int maximumRight= maximum(root.right);
	        return Math.max(root.data, Math.max( maximumLeft, maximumRight));
	    }
	 
	 public static int minimum(BinaryTreeNode<Integer> root){
	        if(root==null){
	            return Integer.MAX_VALUE;
	        }
	        int minimunLeft= minimum(root.left);
	        int minimumRight= minimum(root.right);
	        return Math.min(root.data, Math.min(minimunLeft,minimumRight));
	    }
	
	 public static boolean isBST(BinaryTreeNode<Integer> root){
         if(root==null){
             return true;
         }
         int leftMax= maximum(root.left);
         
         if(leftMax >= root.data){
             return false;
         }
         
         int rightMin= minimum(root.right);
         
         if(rightMin < root.data){
             return false;
         }
         boolean isLeftBST= isBST(root.left);
         boolean isRightBST= isBST(root.right);
         return isLeftBST && isRightBST;

     }
	 
	 public static IsBSTReturn isBST2(BinaryTreeNode<Integer>root) {
		 if(root==null) {
			 IsBSTReturn ans=new IsBSTReturn(Integer.MAX_VALUE,Integer.MIN_VALUE,true);
			 return ans;
		 }
		 IsBSTReturn leftAns=isBST2(root.left);
		 IsBSTReturn rightAns=isBST2(root.right);
		 int min=Math.min(root.data,Math.min(leftAns.min,rightAns.min));
		 int max=Math.max(root.data,Math.max(leftAns.max,rightAns.max));
		 boolean isBST=true;
		 if(leftAns.max>=root.data)
			 isBST=false;
		 if(rightAns.min< root.data)
			 isBST=false;
		 
		 if(!leftAns.isBST)
			 isBST=false;
		 if(!rightAns.isBST)
			 isBST=false;
		 
		 IsBSTReturn ans=new IsBSTReturn(min,max,isBST);
		 return ans;
		  
		 
	 }

	 public static boolean isBST3(BinaryTreeNode<Integer> root, int minRange, int maxRange) { 
		 if(root==null)
			 return true;
	 if(root.data<minRange || root.data>maxRange)
		 return false;
	 boolean isLeftWithinRange=isBST3(root.left, minRange, root.data-1);
	 boolean isRightWithinRange=isBST3(root.right, root.data,maxRange);
	 
	 return isLeftWithinRange && isRightWithinRange;
	 }
	 
	 
	 public static void main(String[] args){
		    
	        BinaryTreeNode<Integer>root=takeInputBetter(true,0,true);
	        
	        printTreeDetailed(root);
	        //System.out.println(isBST(root));
	        
	       // IsBSTReturn ans=isBST2(root);
	       // System.out.println(ans.min + " "+ ans.max + " " + ans.isBST);
	        
	        System.out.print(isBST3(root, Integer.MAX_VALUE,Integer.MIN_VALUE));
	       
	    }
}
