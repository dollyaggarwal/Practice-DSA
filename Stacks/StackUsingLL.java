package stacks;

//public class Node<T> {
//	public T data;
//	public Node<T> next;
//	    
//	    Node(T data){
//	        this.data=data;
//	        next=null;
//	    }
//
//}

public class StackUsingLL<T> {
	
 private Node<T> head;
private int size;
public StackUsingLL() {
	head=null;
	 size=0;
}
public int size() {
	return size;
}

public boolean isEmpty() {
	return size==0;
}
	

public void push(T elem) {
	

Node<T>newnode=new Node<>(elem);
newnode.next=head;
head=newnode;
size++;

}
public T top() throws StackEmptyException  {
	if(head==null) {
		throw new StackEmptyException();
	}
	return head.data;
}
	

public T pop() throws StackEmptyException {
	if(head==null) {
		throw new StackEmptyException();
	}
	T temp=head.data;
	head=head.next;
	size--;
	return temp;
}
}
