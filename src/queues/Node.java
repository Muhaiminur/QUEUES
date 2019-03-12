package queues;
public class Node{
  Object element=null;
  Node next=null;
  Node(Object o,Node n){
    element=o;
    next=n;
  }
}