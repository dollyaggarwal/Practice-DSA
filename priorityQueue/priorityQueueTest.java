package priorityQueue;

public class priorityQueueTest{

    public static void main(String[] args) throws PriorityQueueException {

        Priority_Queue<String> pq= new Priority_Queue<String>();
        pq.insert("abc", 13);
        pq.insert("def", 15);
        pq.insert("ghi", 90);
        pq.insert("jkl", 140);
        pq.insert("mno", 180);

        while(!pq.isEmpty()){
            System.out.println(pq.getMin());
            pq.removeMin();
        }

    }
}
