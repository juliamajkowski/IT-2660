public class Listing{
     private String one;
     private String two;
     private String three;
     public Listing(){
          one=" ";
          two=" ";
          three =" ";      
     }
     public Listing(String o,String t, String th){
          one=o;
          two=t;
          three =th;      
     }
     public String toString(){
          return ( one + "\n" + two + "\n" + three+ "\n");
     }
     public Listing deepCopy(){
          Listing clone=new Listing(one,two,three);
          return clone;
     }   
}