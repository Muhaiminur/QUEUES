package ADVANCED;
public class ArrayQueue implements Queue {
    private Object[] data;      // The array container
    private int      front=0;     // The index of the front item
    private int      size=0;      // The number of items in the queue
    private int      r;
    
    // Default initial capacity, which may then dynamically change
    private static final int DEF_INIT_CAPACITY = 100;

    public ArrayQueue() {
        data = new Object[DEF_INIT_CAPACITY];
        front = 0;
        size = 0;
        r=(front + size)%data.length;
    }

    // The rest of the implementation goes here...
    public int size(){
      return size;
    }
    public boolean isEmpty(){
      if(size==0){
        return true;
      }
      return false;
    }
    public void enqueue(Object o) throws QueueOverflowException{
      if(size==data.length){
        throw new QueueOverflowException();
      }else{
        System.out.println(r);
        data[r]=o;
        size++;
        r=(r+1)%data.length;
      }
    }
    public Object dequeue() throws QueueUnderflowException{
      if(size==0){
        throw new QueueUnderflowException();
      }else{
        Object temp=data[front];
        data[front]=null;
        front=(front+1)%data.length;
        size--;
        return temp;
      }
    }
    public Object peek() throws QueueUnderflowException{
      if(size==0){
        throw new QueueUnderflowException();
      }else{
        return data[front];
      }
    }
    public String toString(){
      String str=" ";
      int  count=front;
      for(int c=front;c<r;c++){
        str=str+data[count]+" ";
        count=(count+1)%data.length;
      }
      return str;
    }
    public Object[] toArray(){
      Object [] s=new Object[size];
      int d=0;
      for(int c=0;c<size;c++){
        s[d]=data[c];
        d++;
      }
      return s;
    }
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