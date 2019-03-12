package ADVANCED;
public class LinearArrayQueueTester{
  public static void main(String[]args){
    LinearArrayQueue abir=new LinearArrayQueue();
    try{
      System.out.println("======= PRINTING QUEUE ARRAY=======");

            System.out.println("======= PRINTING QUEUE EMPTY=======");
            System.out.println(abir.isEmpty());

            System.out.println("======= ENQUEUE 66/77/88/99=======");
            abir.enqueue(66);
            abir.enqueue(77);
            abir.enqueue(88);
            abir.enqueue(99);
            System.out.println("======= AFTER ENQUEUE=======");
            System.out.println(abir.toString());

            System.out.println("======= PRINTING QUEUE EMPTY=======");
            System.out.println(abir.isEmpty());

            System.out.println("======= PRINTING QUEUE SIZE=======");
            System.out.println(abir.size());

            System.out.println("=======QUEUE DEQUEUE=======");
            System.out.println(abir.dequeue());
            System.out.println("======= PRINTING QUEUE SIZE AFTER DEQUEUE=======");
            System.out.println(abir.size());
            System.out.println("======= AFTER DEQUEUE=======");
            System.out.println(abir.toString());

            System.out.println("======= PRINTING QUEUE PEEK=======");
            System.out.println(abir.peek());

            System.out.println("======= PRINTING SEARCH B=======");
            System.out.println(abir.search("B"));

            System.out.println("======= PRINTING SEARCH 88 =======");
            System.out.println(abir.search(88));
    }catch(Exception e){
    }
  }
}