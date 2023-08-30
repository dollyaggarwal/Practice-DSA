package queues;

public class QueueUsingArray {
	int data[];
	int front;
	int rear;
	int size;
	public QueueUsingArray() {
		data=new int[5];
		front=-1;
		rear=-1;
	}
	public QueueUsingArray(int capacity) {
		data=new int[capacity];
		front=-1;
		rear=-1;
	}
	public int size() {
		return size;
	}
	
	private void doubleCapacity() {
		int temp[]=data;
		
		data=new int[2*temp.length];
		
		int index=0;
		
		for(int i=front; i< temp.length; i++) {
			data[index++]=temp[i];
		}
		for(int i=0; i < front; i++) {
			data[index++]=temp[i];
		}
		front=0;
		rear=temp.length-1;
	}
	public boolean isEmpty()
	{
		return size==0;
	}
	public void enqueue(int elem) //throws QueueFullException
	{
		
		if(size==data.length) {
//			throw new QueueFullException();
			doubleCapacity();
		}
		if(size==0) {
			
			front++;
		}
//			rear++;
//			if(rear==data.length) {
//				rear=0;
//			}
		rear=(rear+1) % data.length;
			data[rear]=elem;
			size++;
		
	}
	public int dequeue()throws QueueEmptyException {
		if(size==0) {
			throw new QueueEmptyException();
		}
		int temp=data[front];
//		front++;
//		if(front==data.length) {
//			front=0;
//		}
		
		front=(front+1) % data.length;
		size--;
		if(size==0) {
			front=-1;
			rear=-1;
		}
		return temp;
		
	}
	public int front()throws  QueueEmptyException{
		
		if(size==0) {
			throw new QueueEmptyException();
		}
		
		return data[front];
	}
	public int rear() {
		return rear;
	}
}
