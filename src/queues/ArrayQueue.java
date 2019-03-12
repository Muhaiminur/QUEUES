package queues;
public class ArrayQueue{
  private Object[] data=new Object[10];      // The array container
  private int      front=0;     // The index of the front item
  private int      size=0;      // The number of items in the queue
  private int      r=(front+size)%data.length;
  // The number of items in the queue
  public int size(){
    return size;
  }
  // Returns true if the queue is empty
  public boolean isEmpty(){
    if(size<=0){
      return true;
    }else{
      return false;
    }
  }
  // Adds the new item on the back of the queue, throwing the 
  // QueueOverflowException if the queue is at maximum capacity. It
  // does not throw an exception for an "unbounded" queue, which 
  // dynamically adjusts capacity as needed.
  public void enqueue(Object o){
    if(size==data.length){
      System.out.println("Agee Resize kre");
    }else{
      data[r]=o;
      size++;
      r=(r+1)%data.length;
    }
  }
  // Removes the item in the front of the queue, throwing the 
  // QueueUnderflowException if the queue is empty.
  public Object dequeue(){
    Object temp=null;
    if(size==0){
      System.out.println("Parum na"+size);
    }else{
      temp=data[front];
      data[front]=null;
      size--;
      front=(front+1)%data.length;
    }
    return temp;
  }
  // Peeks at the item in the front of the queue, throwing 
  // QueueUnderflowException if the queue is empty.
  public Object peek(){
    Object temp=null;
    if(size==0){
      System.out.println("Parum na"+size);
    }else{
      temp=data[front];
    }
    return temp;
  }
  // Returns a textual representation of items in the queue, in the
  // format "[ x y z ]", where x and z are items in the front and
  // back of the queue respectively.
  public String toString(){
    String s="[";
    for(int c=front;c<size;c++){
      s=s+data[c];
    }
    return s+"]";
  }
  // Returns an array with items in the queue, with the item in the
  // front of the queue in the first slot, and back in the last slot.
  public Object[] toArray(){
    Object [] s=new Object[size];
    int d=0;
    for(int c=0;c<size;c++){
      s[d]=data[c];
      d++;
    }
    return s;
  }
  // Searches for the given item in the queue, returning the
  // offset from the front of the queue if item is found, or -1 
  // otherwise.
  public int search(Object o){
    int count=front;
    for(int c=0;c<size;c++){
      if(data[c]==o){
        return count;
      }
      count++;
    }
    return -1;
  }
}