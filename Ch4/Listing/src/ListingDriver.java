public class ListingDriver {

    public static void main(String[] args) {
       Listing info =  new Listing();
       info.input();
       System.out.println(info.toString());
       System.out.println(info.deepCopy());
       int test=info.compareTo("julia");
       if (test == 0){
           System.out.print("True");
       } else{
         System.out.print("False");   
       }
    }
    
}
