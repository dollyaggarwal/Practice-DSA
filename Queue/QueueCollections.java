package queues;
import java.util.LinkedList;//it implements queue interface
import java.util.Queue;//it is an interface
import java.util.Stack;
public class QueueCollections {
	
public static void main(String[] args) {
	Queue<Integer> queue=new LinkedList<>();
//	queue.add(10);
//	queue.add(20);
//	System.out.println(queue.size());
//	System.out.println(queue.peek());//element() also gives front of queue
//	System.out.println(queue.poll()); // remove() also removes front element of queue
//	System.out.println(queue.size());
	
//	 for(int i=1;i<5;i++)
//     {
//         queue.add(10+i);
//     }
//     System.out.print(queue.poll()+" "+queue.size());
	
	 Stack<Integer> s=new Stack<Integer>();
     queue.add(5);
     queue.add(10);
     s.push(10);
     s.push(20);
     System.out.print(queue.peek()+s.pop());
}
}
