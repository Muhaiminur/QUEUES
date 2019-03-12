package queues;

public class QueueTester {

    public static void main(String[] args) {
        //System.out.println("======= PRINTING QUEUE ARRAY=======");
        //ArrayQueue abir=new ArrayQueue();
        System.out.println("======= PRINTING QUEUE LIST=======");
        ListQueue abir = new ListQueue();
        
        // The number of items in the queue
        System.out.println("======= PRINTING QUEUE SIZE=======");
        System.out.println(abir.size());
        
        // Returns true if the queue is empty
        System.out.println("======= PRINTING QUEUE EMPTY=======");
        System.out.println(abir.isEmpty());
        
        // Adds the new item on the back of the queue, throwing the 
        // QueueOverflowException if the queue is at maximum capacity. It
        // does not throw an exception for an "unbounded" queue, which 
        // dynamically adjusts capacity as needed.
        System.out.println("======= PRINTING QUEUE AFTER ENQUEUE=======");
        abir.enqueue("A");
        abir.enqueue("B");
        abir.enqueue("I");
        abir.enqueue("R");
        System.out.println("======= PRINTING QUEUE SIZE=======");
        System.out.println(abir.size());
        System.out.println("======= PRINTING QUEUE EMPTY=======");
        System.out.println(abir.isEmpty());
        System.out.println("======= PRINTING QUEUE ENQUEUE PUSH AGIAN=======");
        abir.enqueue("2");
        abir.enqueue("9");
        System.out.println("======= PRINTING QUEUE SIZE=======");
        System.out.println(abir.size());
        
        // Removes the item in the front of the queue, throwing the 
        // QueueUnderflowException if the queue is empty.
        System.out.println("=======QUEUE DEQUEUE=======");
        System.out.println(abir.dequeue());
        System.out.println("======= PRINTING QUEUE SIZE AFTER DEQUEUE=======");
        System.out.println(abir.size());
        
        // Peeks at the item in the front of the queue, throwing 
        // QueueUnderflowException if the queue is empty.
        System.out.println("======= PRINTING QUEUE PEEK=======");
        System.out.println(abir.peek());
        
        // Returns a textual representation of items in the queue, in the
        // format "[ x y z ]", where x and z are items in the front and
        // back of the queue respectively.
        System.out.println("======= PRINTING QUEUE TO STRING=======");
        System.out.println(abir.toString());
        
        System.out.println("======= PRINTING FROM TO ARRAY=======");
        Object[] a = abir.toArray();
        for (int c = 0; c < a.length; c++) {
            System.out.println(a[c]);
        }
        // Searches for the given item in the queue, returning the
        // offset from the front of the queue if item is found, or -1 
        // otherwise.
        System.out.println("======= PRINTING SEARCH B=======");
        System.out.println(abir.search("B"));
    }
}
