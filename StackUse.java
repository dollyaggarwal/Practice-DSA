package stacks;

public class StackUse {

	        public static void main(String[] args) throws StackFullException, StackEmptyException {

	            //StackUsingArray stack = new StackUsingArray(20);
	        	
	        	StackUsingLL<Integer> stack = new StackUsingLL<>();
	            int arr[]={5,1,2,4,6};
	    for(int i=0;i< arr.length;i++){
	        stack.push(arr[i]);
	    }
	    while(!stack.isEmpty()){
	        System.out.println(stack.pop());
	    }
	    //stack.pop();
	        }

	}


