package queues;
public class ListQueue{
  private Node head=null;          // Reference to the front of the queue
  private int  size=0;          // The number of items in the queue
  private Node tail=head;
  public int size(){
    return size;
  }
  public boolean isEmpty(){
    if(head==null){
      return true;
    }
    return false;
  }
  public void enqueue(Object o){
    Node mn=new Node(o,null);
    if(size==0){
      tail=mn;
      head=mn;
      size++;
    }else{
      tail.next=mn;
      tail=tail.next;
      size++;
    }
  }
  public Object dequeue(){
    Object temp;
    if(size==1){
      temp=head.element;
      head=tail=null;
      size--;
      return temp;
    }else{
      temp=head.element;
      head=head.next;
      size--;
      return temp;
    }
  }
  public Object peek(){
    if(size>=0){
      return head.element;
    }else{
      return null;
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