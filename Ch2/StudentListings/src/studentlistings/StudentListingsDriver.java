package studentlistings;
public class StudentListingsDriver{
    public static void main(String[] args){
       Node info =  new Node();
       info.input();
       System.out.println(info.toString());
       System.out.println(info.deepCopy());
       int test=info.compareTo("Julia");
       if (test == 0){
           System.out.print("True");
       } else{
         System.out.print("False");   
       }
       
       
    }
} 
