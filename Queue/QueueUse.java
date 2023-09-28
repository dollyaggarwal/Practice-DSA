package queues;

public class QueueUse {

	public static void main(String[] args) {
		
		//QueueUsingArray q=new QueueUsingArray(3);
		QueueUsingLL<Integer> ll=new QueueUsingLL<>();
		int data[]= {10,20,30,40,50};
		for(int elem:data) {
		
			//q.enqueue(elem);
			ll.enqueue(elem);
		}
		//System.out.println(q.size());
		//System.out.println(q.rear());
		
//		while(!q.isEmpty()) {
			
		while(!ll.isEmpty()) {
		
		try {
			
//			System.out.println(q.dequeue());
			System.out.println(ll.dequeue());
		}
		catch (QueueEmptyException e) {
				}
	
		}
		}

}
