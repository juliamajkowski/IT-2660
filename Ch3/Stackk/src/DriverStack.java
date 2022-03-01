public class DriverStack

{
     public static void main(String args[])
     {
          Stack s=new Stack(3);
          Listing l1=new Listing("a","b","c");
          
          s.push(l1);
          System.out.println("Top element : \n"+s.peek());
          System.out.println("Current stack elements :");
          s.showAll();         
          s.isEmpty();
          s.isFull();
          s.pop();
          s.emptyStack();
     }
}
