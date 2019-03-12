package ADVANCED;
public class LinearArrayQueue implements Queue {
    private Object[] data;      // The array container
    private int      size;      // The number of items in the queue
    int f=-1;
    int r=-1;

    // Default initial capacity, which may then dynamically change
    private static final int DEF_INIT_CAPACITY = 100;

    public LinearArrayQueue() {
        data = new Object[DEF_INIT_CAPACITY];
        size = 0;
    }
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
      }else if(f==-1){
        f++;
        r++;
        data[r]=o;
        size++;
      }else{
        r++;
        data[r]=o;
        size++;
        
      }
    }
    public Object dequeue() throws QueueUnderflowException{
      if(size==0){
        throw new QueueUnderflowException();
      }else if(size==1){
        Object temp=data[f];
        data[f]=null;
        f=r=-1;
        size--;
        return temp;
      }else{
        Object temp=data[f];
        data[f]=null;
        f++;
        size--;
        return temp;
      }
    }
    public Object peek() throws QueueUnderflowException{
      if(size==data.length||f==-1){
        throw new QueueUnderflowException();
      }else{
        return data[f];
      }
    }
    public String toString(){
      String str=" ";
      for(int c=f;c<=r;c++){
        str=str+data[c]+" ";
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
      for(int c=data.length-1;c>=0;c--){
        if(data[c]==o){
          return c;
        }
      }
      return -1;
    }
}