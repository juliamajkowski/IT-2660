public class DriverStack

{

     public static void main(String args[])
     {
          Stack s=new Stack(3);
          Listing l1=new Listing("a","b","c");
          Listing l2=new Listing("d","e","f");
          Listing l3=new Listing("g","h","i");
          Listing l4=new Listing("j","k","l");
          
          s.push(l1);
          System.out.println("Top element : \n"+s.peek());
          System.out.println("Current stack elements :");
          s.showAll();
          s.isEmpty();
          s.isFull();
          s.pop();          
          s.push(l1);
          s.push(l2);          
          s.push(l3);         
          System.out.println("Top element : \n"+s.peek());
          System.out.println("Current stack elements :");
          s.showAll();
          s.expand();
          s.push(l4);
          System.out.println("Current stack elements :");
          s.showAll();
          s.emptyStack();
     }
}
