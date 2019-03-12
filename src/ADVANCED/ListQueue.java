package ADVANCED;
public class ListQueue implements Queue {
    private Node head;          // Reference to the front of the queue
    private int  size;          // The number of items in the queue
    private Node tail;

    public ListQueue() {
        head = null;
        size = 0;
        tail=head;
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
      if(size<0){
        throw new QueueOverflowException();
      }else if(size==0){
        Node temp=new Node(o,null);
        tail=temp;
        head=temp;
        size++;
      }else{
        Node temp=new Node(o,null);
        tail.next=temp;
        tail=tail.next;
        size++;
      }
    }
    public Object dequeue() throws QueueUnderflowException{
      if(size==0){
        throw new QueueUnderflowException();
      }else if(size==1){
        Object temp=tail.element;
        head=tail=null;
        size--;
        return temp;
      }else{
        Object temp=head.element;
        head.element=null;
        head=head.next;
        size--;
        return temp;
      }
    }
    public Object peek() throws QueueUnderflowException{
      if(size<0||size==-1){
        throw new QueueUnderflowException();
      }else{
        return head.element;
      }
    }
    public String toString(){
      String str=" ";
      Node n=head;
      for(int c=0;c<size;c++){
        str=str+n.element+" ";
        n=n.next;
      }
      return str;
    }
    public Object[] toArray(){
      Object [] s=new Object[size];
      int d=0;
      Node n=head;
      for(int c=0;c<size;c++){
        s[d]=n.element;
        n=n.next;
        d++;
      }
      return s;
    }
    public int search(Object o){
      int c=0;
      for(Node n=head;n!=null;n=n.next,c++){
        if (n.element.equals(o)){
          return c;
        }
      }
      return -1;
    }
}