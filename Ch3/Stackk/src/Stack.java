public class Stack

{
     private Listing[] data;
     private int top;
     private int size;
     public Stack(){
          top=-1;
          size=100;
          data=new Listing[100];
     }
     public Stack(int n){
          top=-1;
          size=n;
          data=new Listing[n];
     }
     public boolean push(Listing newNode){
          if(isFull()){
              return false;
          } else{
              top=top+1;
              data[top]=newNode.deepCopy();
              return true;
          }
     }
     public Listing pop(){
          int topLocation;
          if(isEmpty()){
              return null;
          }else{
              topLocation=top;
              top=top-1;
              return data[topLocation];
          }
     }
     public void showAll(){
          for(int i=top;i>=0;i--){
              System.out.println(data[i].toString());
          }
     }
     public void emptyStack(){
          top=-1;
     }
     public boolean isEmpty(){
          if(top==-1){
              return true;
          }else{
              return false;
          }
     }
     public boolean isFull(){
          if(top==size-1){
              return true;
          }else{
              return false;
          }
     }
     public Listing peek(){
          if(isEmpty()){
              System.out.println("Stack is Empty");
              return null;
          }
          else{
              return data[top];
          }
     }
}