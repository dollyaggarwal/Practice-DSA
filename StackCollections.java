package stacks;
import java.util.Stack;
public class StackCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>stack=new Stack<>();
		int arr[]= {4,2,1,7,6};
		for(int elem:arr) {
			stack.push(elem);
		}
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		 
//		stack.push(10);
//		System.out.println(stack.size());
//		System.out.println(stack.peek());
//		System.out.println(stack.pop());
//		System.out.println(stack.isEmpty());
	        
//	        stack.push(5);
//	        stack.push(10);
//	        stack.push(15);
//	        System.out.print(stack.pop()+stack.size());
		
//		 for(int i=0;i<10;i++)
//	        {
//	            stack.push(i*2);
//	        }
//	        System.out.print(stack.peek());
//	        
//	        
//	        
//	        while(stack.isEmpty())
//	        {
//	            stack.push(10);
//	        }
//	        System.out.print(stack.pop()+" "+stack.size());
	}

}
