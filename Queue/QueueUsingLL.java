package queues;

public class QueueUsingLL<T>{
	
Node <T> front;
Node<T> rear;
int size;

public int getSize() { 
	//Implement the getSize() function
	return size;
}


public boolean isEmpty() { 
	//Implement the isEmpty() function
	return size==0;
}


public void enqueue(T data) {
	//Implement the enqueue(element) function
	Node<T> eq=new Node<T>(data);
	if(front==null){
		front=eq;
		rear=eq;
	}else {
		rear.next=eq;
	rear=rear.next; //rear=eq;
	}
	size++;
}
	

public T dequeue() throws QueueEmptyException {
	//Implement the dequeue() function
	if(front==null)
		throw new QueueEmptyException();
	
	T temp=front.data;
	front=front.next;
	if(front==null) {
		rear=null;
	}
	size--;
	return temp;
}


public T front() throws QueueEmptyException {
	//Implement the front() function
	if(front==null)
	throw new QueueEmptyException();
	
	return front.data;
}
}
