package genericTrees;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;;
public class TakeInput {
	
	public static TreeNode<Integer> takeInput(){
		
		Scanner s=new Scanner(System.in);
		
		Queue<TreeNode<Integer>> pendingNodes=new LinkedList<>();
		
		System.out.println("Enter the root data:");
		
		int rootdata=s.nextInt();
		
		if(rootdata==-1) {
			return null;
		}
		
		TreeNode<Integer>root=new TreeNode<Integer>(rootdata);
		pendingNodes.add(root);
		
		while(!pendingNodes.isEmpty()) {
			
			TreeNode<Integer> front=pendingNodes.poll();
			
			System.out.println("Enter the number of children for:" +front.data);
			int numChild=s.nextInt();
			
			for(int i=0;i<numChild;i++) {
				
				System.out.println("Enter the "+i+"th child data for:"+front.data);
				int childData=s.nextInt();
				
				TreeNode<Integer> childNode=new TreeNode<Integer>(childData);
				front.children.add(childNode);
				
				pendingNodes.add(childNode);
				
				}
		}
		return root;
	}

	
	public static void printTree(TreeNode<Integer> root) {
		//not a base case,it's a edge case
		if(root==null) {
			return;
		}
		System.out.print(root.data+": ");
		
		for(int i=0; i<root.children.size(); i++) {
			System.out.print(root.children.get(i).data+" ");
		}
		System.out.println();
		
		for(int i=0; i<root.children.size();i++) {
			
			//TreeNode<Integer> child=root.children.get(i);
			//printTree(child);
			printTree(root.children.get(i));
		}
		
	}
	public static void main(String[] args) {
		TreeNode<Integer> root=takeInput();
		printTree(root);

	}

}
